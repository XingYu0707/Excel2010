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

	// username����������װ�û���
	private String username;

	// myFile����������װ�ϴ����ļ�
	private File myFile;

	// myFileContentType����������װ�ϴ��ļ�������
	private String myFileContentType;

	// myFileFileName����������װ�ϴ��ļ����ļ���
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

	// ���usernameֵ
	public String getUsername() {
		return username;
	}

	// ����usernameֵ
	public void setUsername(String username) {
		this.username = username;
	}

	// ���myFileֵ
	public File getMyFile() {
		return myFile;
	}

	// ����myFileֵ
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	// ���myFileContentTypeֵ
	public String getMyFileContentType() {
		return myFileContentType;
	}

	// ����myFileContentTypeֵ
	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	// ���myFileFileNameֵ
	public String getMyFileFileName() {
		return myFileFileName;
	}

	// ����myFileFileNameֵ
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
			System.out.println(fou  + "    " + two + "   " + two1+"  nian="+year+"  �·�="+month+"   ����="+day);
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
			jump = "���ϴ���׺Ϊ��xlsx�����ļ�";
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

			jump = "��Ǹ�����ϴ���׺Ϊ��xlsx�����ļ�";
			return "input";
		}
		if (username.equals("") || enddata.equals("")) {
			jump = "��������ȷ���û�������ֹ����";
			return "input";
		}
		if (judge(enddata) == false) {
			jump = "��������ȷ�Ľ�ֹ����(xxxx-xx-xx),�Ҳ��ɺ���ĸ��";
			return "input";
		}
		if (judge1(enddata)==false) {
			jump = "��������ȷ�������ա�";
			return "input";
		}
		if(JDBCsql.checknamedate(username, enddata)==true){
			jump = "��ֹ�����Ѵ�����ͬ���û���";
			return "input";
		}
		Request re = new Request();
		// ����myFile����һ���ļ�������
		InputStream is = new FileInputStream(myFile);
		System.out.println("myfile" + myFile);

		// �����ϴ��ļ�Ŀ¼
		String uploadPath = ServletActionContext.getServletContext()
				.getRealPath("/upload/");
		// String uploadPath =
		// SevletActionContext.getServletContext().getRealPath("/")+"/upload/";
		// ����Ŀ���ļ�
		File toFile = new File(uploadPath, this.getMyFileFileName());

		// ����һ�������
		OutputStream os = new FileOutputStream(toFile);

		// ���û���
		byte[] buffer = new byte[1024];

		int length = 0;

		// ��ȡmyFile�ļ������toFile�ļ���
		while ((length = is.read(buffer)) > 0) {
			os.write(buffer, 0, length);
		}
		List list = new ArrayList();
		list.add(username);
		list.add(enddata);
		list.add(myFileFileName);
		excel.method.Method.setsesslist(list);
		System.out.println("�ϴ��û�" + username);
		System.out.println("�ϴ��ļ���" + myFileFileName);
		System.out.println("�ϴ��ļ�����" + myFileContentType);
		System.out.println("�ϴ��ļ���ַ" + uploadPath);
		System.out.println("��ʼ����" + startdata);
		System.out.println("��ֹ����" + enddata);
		jump = "�ļ��ɹ���ȡ";
		// �ر�������
		is.close();

		// �ر������
		os.close();
		return SUCCESS;
		}
	
	
	
	
	
	public String read() throws Exception {
		
		username=excel.method.Method.getsesslist().get(0).toString();
		enddata=excel.method.Method.getsesslist().get(1).toString();
		myFileFileName=excel.method.Method.getsesslist().get(2).toString();
		excel.client.Client.addJdbc(username, enddata,myFileFileName);
		System.out.println("�ѽ���read");
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
		System.out.println("��ȡsession��ֵ��"
				+ excel.method.Method.getsesslist().get(0) + "  "
				+ excel.method.Method.getsesslist().get(1));
		return "read";
		
	}

	public static void main(String[] args) throws IOException, ParseException {
		//System.out.println(judge("2015-88-08"));
		System.out.println(judge1("2015-01-01"));
	}

}
