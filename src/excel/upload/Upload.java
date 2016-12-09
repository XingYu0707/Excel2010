package excel.upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.apache.struts2.ServletActionContext;

import Connectsql.Connect;
import Connectsql.JDBCana;
import Connectsql.JDBCsql;

import com.opensymphony.xwork2.ActionSupport;

import excel.vo.Analy;

//public class UploadAction extends ActionSupport {
public class Upload extends ActionSupport {

	// username属性用来封装用户名
	private String username;

	// myFile属性用来封装上传的文件
	private File myFile;

	// myFileContentType属性用来封装上传文件的类型
	private String myFileContentType;

	// myFileFileName属性用来封装上传文件的文件名
	private String myFileFileName;

	private String startdata;
	private String enddata;
	public String jump;

	public String getJump() {
		return jump;
	}

	public void setJump(String jump) {
		this.jump = jump;
	}

	public String getStartdata() {
		return startdata;
	}

	public void setStartdata(String startdata) {
		this.startdata = startdata;
	}

	public String getEnddata() {
		return enddata;
	}

	public void setEnddata(String enddata) {
		this.enddata = enddata;
	}

	// 获得username值
	public String getUsername() {
		return username;
	}

	// 设置username值
	public void setUsername(String username) {
		this.username = username;
	}

	// 获得myFile值
	public File getMyFile() {
		return myFile;
	}

	// 设置myFile值
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	// 获得myFileContentType值
	public String getMyFileContentType() {
		return myFileContentType;
	}

	// 设置myFileContentType值
	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	// 获得myFileFileName值
	public String getMyFileFileName() {
		return myFileFileName;
	}

	// 设置myFileFileName值
	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public static boolean isNum(String str) {
		return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
	}

	public static boolean judge(String enddata) {

		if (enddata.length() == 10) {
			String fou = enddata.substring(0, 4);
			String heng = enddata.substring(4, 5);
			String two = enddata.substring(5, 7);
			String heng1 = enddata.substring(7, 8);
			String two1 = enddata.substring(8);
			if (isNum(fou) && isNum(two) && isNum(two) && heng.equals("-")
					&& heng1.equals("-")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
	public static boolean judge1(String enddata) {
			String fou = enddata.substring(0, 4);
			String two = enddata.substring(5, 7);
			String two1 = enddata.substring(8);
			int year=Integer.parseInt(fou);
			int month=Integer.parseInt(two);
			int day=Integer.parseInt(two1);
			//int num = Integer.parseInt("String");
			System.out.println(fou  + "    " + two + "   " + two1+"  nian="+year+"  月份="+month+"   日子="+day);
			if (year >=2010 && year<= 2016 && month>=01 && month<=12 && day>=01 && day<=31) {
				return true;
			} else {
				return false;
			}
		

	}
	public String execute() throws Exception {
		System.out.println("username: " + username + "    enddata: " + enddata
				+ "   myfile: " + myFile);

		if (myFile == null) {
			jump = "请上传后缀为‘xlsx’的文件";
			return "input";
		}
		myFileFileName=username+enddata+myFileFileName;
		System.out.println(myFileFileName.substring(myFileFileName
				.lastIndexOf(".") + 1));
		if (!myFileFileName.substring(myFileFileName.lastIndexOf(".") + 1)
				.equals("xlsx")
				/*&& !myFileFileName.substring(
						myFileFileName.lastIndexOf(".") + 1).equals("xls")*/
						) {

			jump = "抱歉，请上传后缀为‘xlsx’的文件";
			return "input";
		}
		if (username.equals("") || enddata.equals("")) {
			jump = "请输入正确的用户名、截止日期";
			return "input";
		}
		if (judge(enddata) == false) {
			jump = "请输入正确的截止日期(xxxx-xx-xx),且不可含字母。";
			return "input";
		}
		if (judge1(enddata)==false) {
			jump = "请输入正确的年月日。";
			return "input";
		}
		if(JDBCsql.checknamedate(username, enddata)==true){
			jump = "截止日期已创建相同的用户名";
			return "input";
		}
		Request re = new Request();
		// 基于myFile创建一个文件输入流
		InputStream is = new FileInputStream(myFile);
		System.out.println("myfile" + myFile);

		// 设置上传文件目录
		String uploadPath = ServletActionContext.getServletContext()
				.getRealPath("/upload/");
		// String uploadPath =
		// SevletActionContext.getServletContext().getRealPath("/")+"/upload/";
		// 设置目标文件
		File toFile = new File(uploadPath, this.getMyFileFileName());

		// 创建一个输出流
		OutputStream os = new FileOutputStream(toFile);

		// 设置缓存
		byte[] buffer = new byte[1024];

		int length = 0;

		// 读取myFile文件输出到toFile文件中
		while ((length = is.read(buffer)) > 0) {
			os.write(buffer, 0, length);
		}
		List list = new ArrayList();
		list.add(username);
		list.add(enddata);
		list.add(myFileFileName);
		excel.method.Method.setsesslist(list);
		System.out.println("上传用户" + username);
		System.out.println("上传文件名" + myFileFileName);
		System.out.println("上传文件类型" + myFileContentType);
		System.out.println("上传文件地址" + uploadPath);
		System.out.println("开始日期" + startdata);
		System.out.println("截止日期" + enddata);
		jump = "文件成功读取";
		// 关闭输入流
		is.close();

		// 关闭输出流
		os.close();
		return SUCCESS;
		}
	
	
	
	
	
	public String read() throws Exception {
		
		username=excel.method.Method.getsesslist().get(0).toString();
		enddata=excel.method.Method.getsesslist().get(1).toString();
		myFileFileName=excel.method.Method.getsesslist().get(2).toString();
		excel.client.Client.addJdbc(username, enddata,myFileFileName);
		System.out.println("已进入read");
		List list1 = new ArrayList();
		list1.add(username);
		list1.add(enddata);
		excel.client.Client.addopen(username, enddata);
		excel.client.Client.addclose(username, enddata);
		excel.client.Client.adddatebug1(username, enddata);
		excel.client.Client.adddatebug2(username, enddata);
		excel.client.Client.adddatebug3(username, enddata);
		excel.client.Client.adddatebug4(username, enddata);
		excel.method.Method.setsesslist(list1);
		System.out.println("读取session的值："
				+ excel.method.Method.getsesslist().get(0) + "  "
				+ excel.method.Method.getsesslist().get(1));
		return "read";
		
	}

	public static void main(String[] args) throws IOException, ParseException {
		//System.out.println(judge("2015-88-08"));
		System.out.println(judge1("2015-01-01"));
	}

}
