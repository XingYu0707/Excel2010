package excel.client;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Connectsql.JDBCana;
import Connectsql.JDBCsql;
import common.Common;
import excel.ReadExcel;
import excel.vo.Analy;
import excel.vo.Student;
import excel.vo.export;

/**
 * @author Hongten
 * @created 2014-5-21
 */
public class Client {

	public static void addJdbc(String username, String enddate,
			String myFileFileName) throws IOException, ParseException {
		/*int age;
		int updateage;*/
		Common.Name();
		// String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		// String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
		String excelexport2010 = Common.STUDENT_INFO_XLSX_export_PATH;

		// read the 2010 excel
		// List<export> list2 = new
		// ReadExcel().readexport("G:/apache-tomcat-7.0.57/webapps/Quality/upload/"+myFileFileName);
		List<export> list2 = new ReadExcel()
				.readexport("F:/java/j2ee/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Excel2010/upload/"
						+ myFileFileName);
		if (list2 != null) {
			/*
			 * for (export ex : list2) {
			 * 
			 * age = excel.method.Method.daysBetween(ex.getCreat(), enddate);
			 * updateage = excel.method.Method.daysBetween(ex.getUpdate(),
			 * enddate); JDBCsql.adddata(ex.getQid(), ex.getQuestionNum(),
			 * ex.getState(), ex.getProject(), ex.getTrack(), ex.getPriority(),
			 * ex.getTheme(), ex.getAssign(), ex.getCategory(), ex.getTarget(),
			 * ex.getAuthor(), ex.getStart(), ex.getFindate(), ex.getComplete(),
			 * ex.getExpected(), ex.getParetask(), ex.getCreat(),
			 * ex.getUpdate(), ex.getOriginalreq(), ex.getTestnum(),
			 * ex.getTest(), ex.getSoftver(), ex.getHardver(), ex.getRequdate(),
			 * ex.getResult(), ex.getLifeform(), ex.getProbability(),
			 * ex.getProbabtype(), ex.getBugbar(), ex.getReappear(),
			 * ex.getRecover(), ex.getSolution(), ex.getCause(),
			 * ex.getSolvemed(), ex.getModel(), ex.getStage(), ex.getProsour(),
			 * ex.getTestsug(), ex.getDescribe(), username, enddate, age,
			 * updateage); System.out.println("QuestionNum : " +
			 * ex.getQuestionNum() + "    id:  " + ex.getQid() + "   ָ�ɸ�:   " +
			 * ex.getAssign() + "  ״̬��   " + ex.getState() +
			 * "              ���⣺  " + ex.getTheme() + "              ��ɶȣ�  " +
			 * ex.getComplete() + "              ��ʼʱ�䣺  " + ex.getStart() +
			 * "              ����ʱ�䣺  " + ex.getFindate() +
			 * "              Ҫ����ɣ�  " + ex.getRequdate()); }
			 */
			System.out.println("list2.size()"+list2.get(41).getReappear());
				JDBCsql.adddata(list2, username, enddate);
			
		}
	}

	public static void adddatebug1(String username, String enddate)
			throws IOException, ParseException, SQLException {
		// Common.Name();
		// String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		// String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
		// read the 2010 excel
		List<Analy> bugthr = new ArrayList<Analy>();
		bugthr = JDBCana.sele1bug(username, enddate);
		if (bugthr != null) {
			JDBCana.addbug1(bugthr, username, enddate);
			/*for (Analy ex : bugthr) {
				JDBCana.addbug1(ex.getQid(), ex.getQuestionNum(),
						ex.getState(), ex.getProject(), ex.getTrack(),
						ex.getPriority(), ex.getTheme(), ex.getAssign(),
						ex.getCategory(), ex.getTarget(), ex.getAuthor(),
						ex.getStart(), ex.getFindate(), ex.getComplete(),
						ex.getExpected(), ex.getParetask(), ex.getCreat(),
						ex.getUpdate(), ex.getOriginalreq(), ex.getTestnum(),
						ex.getTest(), ex.getSoftver(), ex.getHardver(),
						ex.getRequdate(), ex.getResult(), ex.getLifeform(),
						ex.getProbability(), ex.getProbabtype(),
						ex.getBugbar(), ex.getReappear(), ex.getRecover(),
						ex.getSolution(), ex.getCause(), ex.getSolvemed(),
						ex.getModel(), ex.getStage(), ex.getProsour(),
						ex.getTestsug(), ex.getDescribe(), username, enddate,
						ex.getAge(), ex.getUpdateage());*/
				/*System.out.println("QuestionNum : " + ex.getQuestionNum()
						+ "    id:  " + ex.getQid() + "   ָ�ɸ�:   "
						+ ex.getAssign() + "  ״̬��   " + ex.getState()
						+ "              ���⣺  " + ex.getTheme()
						+ "              ��ɶȣ�  " + ex.getComplete()
						+ "              ��ʼʱ�䣺  " + ex.getStart()
						+ "              ����ʱ�䣺  " + ex.getFindate()
						+ "              Ҫ����ɣ�  " + ex.getRequdate());
			}*/
		}
	}

	public static void adddatebug2(String username, String enddate)
			throws IOException, ParseException, SQLException {
		// Common.Name();
		// String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		// String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
		// read the 2010 excel
		List<Analy> bugthr = new ArrayList<Analy>();
		bugthr = JDBCana.sele2bug(username, enddate);
		if (bugthr != null) {
			JDBCana.addbug2(bugthr, username, enddate);
			/*for (Analy ex : bugthr) {
				JDBCana.addbug2(ex.getQid(), ex.getQuestionNum(),
						ex.getState(), ex.getProject(), ex.getTrack(),
						ex.getPriority(), ex.getTheme(), ex.getAssign(),
						ex.getCategory(), ex.getTarget(), ex.getAuthor(),
						ex.getStart(), ex.getFindate(), ex.getComplete(),
						ex.getExpected(), ex.getParetask(), ex.getCreat(),
						ex.getUpdate(), ex.getOriginalreq(), ex.getTestnum(),
						ex.getTest(), ex.getSoftver(), ex.getHardver(),
						ex.getRequdate(), ex.getResult(), ex.getLifeform(),
						ex.getProbability(), ex.getProbabtype(),
						ex.getBugbar(), ex.getReappear(), ex.getRecover(),
						ex.getSolution(), ex.getCause(), ex.getSolvemed(),
						ex.getModel(), ex.getStage(), ex.getProsour(),
						ex.getTestsug(), ex.getDescribe(), username, enddate,
						ex.getAge(), ex.getUpdateage());
				System.out.println("QuestionNum : " + ex.getQuestionNum()
						+ "    id:  " + ex.getQid() + "   ָ�ɸ�:   "
						+ ex.getAssign() + "  ״̬��   " + ex.getState()
						+ "              ���⣺  " + ex.getTheme()
						+ "              ��ɶȣ�  " + ex.getComplete()
						+ "              ��ʼʱ�䣺  " + ex.getStart()
						+ "              ����ʱ�䣺  " + ex.getFindate()
						+ "              Ҫ����ɣ�  " + ex.getRequdate());
			}*/
		}
	}

	public static void adddatebug3(String username, String enddate)
			throws IOException, ParseException, SQLException {
		// Common.Name();
		// String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		// String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
		// read the 2010 excel
		List<Analy> bugthr = new ArrayList<Analy>();
		bugthr = JDBCana.sele3bug(username, enddate);
		if (bugthr != null) {
			JDBCana.addbug3(bugthr, username, enddate);
			/*for (Analy ex : bugthr) {
				JDBCana.addbug3(ex.getQid(), ex.getQuestionNum(),
						ex.getState(), ex.getProject(), ex.getTrack(),
						ex.getPriority(), ex.getTheme(), ex.getAssign(),
						ex.getCategory(), ex.getTarget(), ex.getAuthor(),
						ex.getStart(), ex.getFindate(), ex.getComplete(),
						ex.getExpected(), ex.getParetask(), ex.getCreat(),
						ex.getUpdate(), ex.getOriginalreq(), ex.getTestnum(),
						ex.getTest(), ex.getSoftver(), ex.getHardver(),
						ex.getRequdate(), ex.getResult(), ex.getLifeform(),
						ex.getProbability(), ex.getProbabtype(),
						ex.getBugbar(), ex.getReappear(), ex.getRecover(),
						ex.getSolution(), ex.getCause(), ex.getSolvemed(),
						ex.getModel(), ex.getStage(), ex.getProsour(),
						ex.getTestsug(), ex.getDescribe(), username, enddate,
						ex.getAge(), ex.getUpdateage());
				System.out.println("QuestionNum : " + ex.getQuestionNum()
						+ "    id:  " + ex.getQid() + "   ָ�ɸ�:   "
						+ ex.getAssign() + "  ״̬��   " + ex.getState()
						+ "              ���⣺  " + ex.getTheme()
						+ "              ��ɶȣ�  " + ex.getComplete()
						+ "              ��ʼʱ�䣺  " + ex.getStart()
						+ "              ����ʱ�䣺  " + ex.getFindate()
						+ "              Ҫ����ɣ�  " + ex.getRequdate());
			}*/
		}
	}

	public static void adddatebug4(String username, String enddate)
			throws IOException, ParseException, SQLException {
		// Common.Name();
		// String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		// String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
		// read the 2010 excel
		List<Analy> bugthr = new ArrayList<Analy>();
		bugthr = JDBCana.sele4bug(username, enddate);
		if (bugthr != null) {
			JDBCana.addbug4(bugthr, username, enddate);
			/*for (Analy ex : bugthr) {
				JDBCana.addbug4(ex.getQid(), ex.getQuestionNum(),
						ex.getState(), ex.getProject(), ex.getTrack(),
						ex.getPriority(), ex.getTheme(), ex.getAssign(),
						ex.getCategory(), ex.getTarget(), ex.getAuthor(),
						ex.getStart(), ex.getFindate(), ex.getComplete(),
						ex.getExpected(), ex.getParetask(), ex.getCreat(),
						ex.getUpdate(), ex.getOriginalreq(), ex.getTestnum(),
						ex.getTest(), ex.getSoftver(), ex.getHardver(),
						ex.getRequdate(), ex.getResult(), ex.getLifeform(),
						ex.getProbability(), ex.getProbabtype(),
						ex.getBugbar(), ex.getReappear(), ex.getRecover(),
						ex.getSolution(), ex.getCause(), ex.getSolvemed(),
						ex.getModel(), ex.getStage(), ex.getProsour(),
						ex.getTestsug(), ex.getDescribe(), username, enddate,
						ex.getAge(), ex.getUpdateage());
				System.out.println("QuestionNum : " + ex.getQuestionNum()
						+ "    id:  " + ex.getQid() + "   ָ�ɸ�:   "
						+ ex.getAssign() + "  ״̬��   " + ex.getState()
						+ "              ���⣺  " + ex.getTheme()
						+ "              ��ɶȣ�  " + ex.getComplete()
						+ "              ��ʼʱ�䣺  " + ex.getStart()
						+ "              ����ʱ�䣺  " + ex.getFindate()
						+ "              Ҫ����ɣ�  " + ex.getRequdate());
			}*/
		}
	}

	public static void addopen(String username, String enddate)
			throws IOException, ParseException, SQLException {
		// Common.Name();
		// String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		// String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
		// read the 2010 excel
		List<Analy> bugthr = new ArrayList<Analy>();
		bugthr = JDBCana.seleopenbug(username, enddate);
		if (bugthr != null) {
			JDBCana.addopenbug(bugthr, username, enddate);
			/*for (Analy ex : bugthr) {
				JDBCana.addopenbug(ex.getQid(), ex.getQuestionNum(),
						ex.getState(), ex.getProject(), ex.getTrack(),
						ex.getPriority(), ex.getTheme(), ex.getAssign(),
						ex.getCategory(), ex.getTarget(), ex.getAuthor(),
						ex.getStart(), ex.getFindate(), ex.getComplete(),
						ex.getExpected(), ex.getParetask(), ex.getCreat(),
						ex.getUpdate(), ex.getOriginalreq(), ex.getTestnum(),
						ex.getTest(), ex.getSoftver(), ex.getHardver(),
						ex.getRequdate(), ex.getResult(), ex.getLifeform(),
						ex.getProbability(), ex.getProbabtype(),
						ex.getBugbar(), ex.getReappear(), ex.getRecover(),
						ex.getSolution(), ex.getCause(), ex.getSolvemed(),
						ex.getModel(), ex.getStage(), ex.getProsour(),
						ex.getTestsug(), ex.getDescribe(), username, enddate,
						ex.getAge(), ex.getUpdateage());
				System.out.println("QuestionNum : " + ex.getQuestionNum()
						+ "    id:  " + ex.getQid() + "   ָ�ɸ�:   "
						+ ex.getAssign() + "  ״̬��   " + ex.getState()
						+ "              ���⣺  " + ex.getTheme()
						+ "              ��ɶȣ�  " + ex.getComplete()
						+ "              ��ʼʱ�䣺  " + ex.getStart()
						+ "              ����ʱ�䣺  " + ex.getFindate()
						+ "              Ҫ����ɣ�  " + ex.getRequdate());
			}*/
		}
	}

	public static void addclose(String username, String enddate)
			throws IOException, ParseException, SQLException {
		// Common.Name();
		// String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		// String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
		// read the 2010 excel
		List<Analy> bugthr = new ArrayList<Analy>();
		bugthr = JDBCana.seleclosebug(username, enddate);
		if (bugthr != null) {
			JDBCana.addclosebug(bugthr, username, enddate);
			/*for (Analy ex : bugthr) {
				JDBCana.addclosebug(ex.getQid(), ex.getQuestionNum(),
						ex.getState(), ex.getProject(), ex.getTrack(),
						ex.getPriority(), ex.getTheme(), ex.getAssign(),
						ex.getCategory(), ex.getTarget(), ex.getAuthor(),
						ex.getStart(), ex.getFindate(), ex.getComplete(),
						ex.getExpected(), ex.getParetask(), ex.getCreat(),
						ex.getUpdate(), ex.getOriginalreq(), ex.getTestnum(),
						ex.getTest(), ex.getSoftver(), ex.getHardver(),
						ex.getRequdate(), ex.getResult(), ex.getLifeform(),
						ex.getProbability(), ex.getProbabtype(),
						ex.getBugbar(), ex.getReappear(), ex.getRecover(),
						ex.getSolution(), ex.getCause(), ex.getSolvemed(),
						ex.getModel(), ex.getStage(), ex.getProsour(),
						ex.getTestsug(), ex.getDescribe(), username, enddate,
						ex.getAge(), ex.getUpdateage());
				System.out.println("QuestionNum : " + ex.getQuestionNum()
						+ "    id:  " + ex.getQid() + "   ָ�ɸ�:   "
						+ ex.getAssign() + "  ״̬��   " + ex.getState()
						+ "              ���⣺  " + ex.getTheme()
						+ "              ��ɶȣ�  " + ex.getComplete()
						+ "              ��ʼʱ�䣺  " + ex.getStart()
						+ "              ����ʱ�䣺  " + ex.getFindate()
						+ "              Ҫ����ɣ�  " + ex.getRequdate());
			}*/
		}
	}

	public String index() {
		return "index";
	}

	public static void main(String[] args) throws IOException, ParseException {
		String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
		String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
		String excelexport2010 = Common.STUDENT_INFO_XLSX_export_PATH;
		/*
		 * // read the 2003-2007 excel List<Student> list = new
		 * ReadExcel().readExcel(excel2003_2007); if (list != null) { for
		 * (Student student : list) { System.out.println("No. : " +
		 * student.getNo() + ", name : " + student.getName() + ", age : " +
		 * student.getAge() + ", score : " + student.getScore()); } }
		 * System.out.println("======================================"); // read
		 * the 2010 excel List<Student> list1 = new
		 * ReadExcel().readExcel(excel2010); if (list1 != null) { for (Student
		 * student : list1) { System.out.println("No. : " + student.getNo() +
		 * ", name : " + student.getName() + ", age : " + student.getAge() +
		 * ", score : " + student.getScore()); } }
		 * 
		 * System.out.println("======================================");
		 */
		// read the 2010 excel
		List<export> list2 = new ReadExcel().readexport(excelexport2010);
		/*if (list2 != null) {
			for (export ex : list2) {
				JDBCsql.adddata(ex.getQid(), ex.getQuestionNum(),
						ex.getState(), ex.getProject(), ex.getTrack(),
						ex.getPriority(), ex.getTheme(), ex.getAssign(),
						ex.getCategory(), ex.getTarget(), ex.getAuthor(),
						ex.getStart(), ex.getFindate(), ex.getComplete(),
						ex.getExpected(), ex.getParetask(), ex.getCreat(),
						ex.getUpdate(), ex.getOriginalreq(), ex.getTestnum(),
						ex.getTest(), ex.getSoftver(), ex.getHardver(),
						ex.getRequdate(), ex.getResult(), ex.getLifeform(),
						ex.getProbability(), ex.getProbabtype(),
						ex.getBugbar(), ex.getReappear(), ex.getRecover(),
						ex.getSolution(), ex.getCause(), ex.getSolvemed(),
						ex.getModel(), ex.getStage(), ex.getProsour(),
						ex.getTestsug(), ex.getDescribe(), "name", "date", 1, 1);
				System.out.println("QuestionNum : " + ex.getQuestionNum()
						+ "    id:  " + ex.getQid() + "   ָ�ɸ�:   "
						+ ex.getAssign() + "  ״̬��   " + ex.getState()
						+ "              ���⣺  " + ex.getTheme()
						+ "              ��ɶȣ�  " + ex.getComplete()
						+ "              ��ʼʱ�䣺  " + ex.getStart()
						+ "              ����ʱ�䣺  " + ex.getFindate()
						+ "              Ҫ����ɣ�  " + ex.getRequdate());
			}
		}*/

	}
}
