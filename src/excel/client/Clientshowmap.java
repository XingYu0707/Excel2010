package excel.client;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import Connectsql.*;
import excel.method.*;

public class Clientshowmap {
	public static String project;
	public static String image;
	public static String imageage;
    public static String imagename;
	public static String realpath;
    
    
	public String getRealpath() {
		return realpath;
	}

	public void setRealpath(String realpath) {
		this.realpath = realpath;
	}

	public String getImagename() {
		return imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	public String getImageage() {
		return imageage;
	}

	public void setImageage(String imageage) {
		this.imageage = imageage;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public static String showpie() throws SQLException {
		System.out.println("�ѽ���showpie()");
		List list = new ArrayList();
		list = Method.getsesslist();
		String name;
		String date;
		name = list.get(0).toString();
		date = list.get(1).toString();
		project = JDBCshow.checkproject(name, date);
		imagename = name+date+project;
		//realpath=ServletActionContext.getServletContext().getRealPath("/upload")+"//";
		/*image = "upload/" +name+date+project
				+ "ȱ��ͳ��.png";
		imageage = "upload/" +name+date+ project
				+ "��������ͳ��.png";*/
		image = "F:/java/j2ee/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Excel2010/upload/" +name+date+project
				+ "ȱ��ͳ��.png";
		imageage = "F:/java/j2ee/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Excel2010/upload/" +name+date+ project
				+ "��������ͳ��.png";
		
		System.out.println(image);
		System.out.println(imageage);
		excel.chart.chatpie.makePieChart(name,date,"����", "����", "һ��", "��ʾ",
				JDBCshow.checkbug4opennum(name, date),
				JDBCshow.checkbug3opennum(name, date),
				JDBCshow.checkbug2opennum(name, date),
				JDBCshow.checkbug1opennum(name, date), project, "ȱ�ݵȼ�");
		excel.chart.chatpie.makePieChartage(name,date,"1-10��", "11-30��", "31-60��",
				"61-90��", "91-150��", "151������", JDBCage.checkage010(name, date),
				JDBCage.checkage1130(name, date),
				JDBCage.checkage3160(name, date),
				JDBCage.checkage6190(name, date),
				JDBCage.checkage91150(name, date),
				JDBCage.checkage151(name, date), project, "ʣ����������");
		return "showpie";
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		showpie();

	}

}
