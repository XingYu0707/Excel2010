package Connectsql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.List;

import org.junit.Test;

import excel.vo.export;

public class JDBCsql {
	private static Object String;

	public static boolean check(String username) throws SQLException {
		System.out.println(username);
		String sql = "select * from test where tes='" + username + "'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {

			if (rs.next()) {
				System.out.println("数据存在");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("不存在");
		con.close();
		return false;

	}

	public static boolean checknamedate(String username, String date) throws SQLException {
		System.out.println(username);
		String sql = "select * from sourcedata where name='" + username + "' and date='" + date + "'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {

			if (rs.next()) {
				System.out.println("数据存在");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("不存在");
		con.close();
		return false;

	}

	/*
	 * public static void adddata(int qid, String questionNum, String state,
	 * String project, String track, String priority, String theme, String
	 * assign, String category, String target, String author, String start,
	 * String findate, String complete, String expected, String paretask, String
	 * creat, String update, String originalreq, String testnum, String test,
	 * String softver, String hardver, String requdate, String result, String
	 * lifeform, String probability, String probabtype, String bugbar, String
	 * reappear, String recover, String solution, String cause, String solvemed,
	 * String model, String stage, String prosour, String testsug,String
	 * describe,String name,String date,int age,int updateage) {
	 * 
	 * String sql =
	 * "insert into sourcedata (qid,questionNum,state,project,track,priority,theme,assign,category,target,author,start,findate,complete,expected,paretask,creat,updated,originalreq,testnum,test,softver,hardver,requdate,result,lifeform,probability,probabtype,bugbar,reappear,recover,solution,cause,solvemed,model,stage,prosour,testsug,described,name,date,age,updateage) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
	 * ; PreparedStatement stme = null; Connection con =
	 * Connect.getConnection(); try { stme = con.prepareStatement(sql);
	 * 
	 * stme.setInt(1, qid); stme.setString(2, questionNum); stme.setString(3,
	 * state); stme.setString(4, project); stme.setString(5, track);
	 * stme.setString(6, priority); stme.setString(7, theme); stme.setString(8,
	 * assign); stme.setString(9, category); stme.setString(10, target);
	 * stme.setString(11, author); stme.setString(12, start); stme.setString(13,
	 * findate); stme.setString(14, complete); stme.setString(15, expected);
	 * stme.setString(16, paretask); stme.setString(17, creat);
	 * stme.setString(18, update); stme.setString(19, originalreq);
	 * stme.setString(20, testnum); stme.setString(21, test); stme.setString(22,
	 * softver); stme.setString(23, hardver); stme.setString(24, requdate);
	 * stme.setString(25, result); stme.setString(26, lifeform);
	 * stme.setString(27, probability); stme.setString(28, probabtype);
	 * stme.setString(29, bugbar); stme.setString(30, reappear);
	 * stme.setString(31, recover); stme.setString(32, solution);
	 * stme.setString(33, cause); stme.setString(34, solvemed);
	 * stme.setString(35, model); stme.setString(36, stage); stme.setString(37,
	 * prosour); stme.setString(38, testsug); stme.setString(39, describe);
	 * stme.setString(40, name); stme.setString(41, date); stme.setInt(42, age);
	 * stme.setInt(43, updateage); stme.execute(); stme.close(); con.close(); }
	 * catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace();
	 * 
	 * } System.out.println("已执行adddata"); }
	 */
	public static void adddata(List<export> list2, String name, String date) throws ParseException {
		/*String sql1 = "insert into sourcedata (qid,questionNum,state,project,track,priority,theme,assign,category,target,author,start,findate,complete,expected,paretask,creat,updated,originalreq,testnum,test,softver,hardver,requdate,result,lifeform,probability,probabtype,bugbar,reappear,recover,solution,cause,solvemed,model,stage,prosour,testsug,described,name,date,age,updateage) values (" + list2.get(0).getQid() + ",'" + list2.get(0).getQuestionNum() + "','" + list2.get(0).getState() + "','" + list2.get(0).getProject() + "','" + list2.get(0).getTrack() + "','" + list2.get(0).getPriority() + "','" + list2.get(0).getTheme() + "','" + list2.get(0).getAssign() + "','" + list2.get(0).getCategory() + "','" + list2.get(0).getTarget() + "','" + list2.get(0).getAuthor() + "','" + list2.get(0).getStart() + "','" + list2.get(0).getFindate() + "','" + list2.get(0).getComplete() + "','" + list2.get(0).getExpected() + "','" + list2.get(0).getParetask() + "','" + list2.get(0).getCreat() + "','"
				+ list2.get(0).getUpdate() + "','" + list2.get(0).getOriginalreq() + "','" + list2.get(0).getTestnum() + "','" + list2.get(0).getTest() + "','" + list2.get(0).getSoftver() + "','" + list2.get(0).getHardver() + "','" + list2.get(0).getRequdate() + "','" + list2.get(0).getResult() + "','" + list2.get(0).getLifeform() + "','" + list2.get(0).getProbability() + "','" + list2.get(0).getProbabtype() + "','" + list2.get(0).getBugbar() + "','" + list2.get(0).getReappear() + "','" + list2.get(0).getRecover() + "','" + list2.get(0).getSolution() + "','" + list2.get(0).getCause() + "','" + list2.get(0).getSolvemed() + "','" + list2.get(0).getModel() + "','" + list2.get(0).getStage() + "','" + list2.get(0).getProsour() + "','" + list2.get(0).getTestsug() + "','" + list2.get(0).getDescribe() + "','" + name + "','" + date + "'," + 1 + "," + 2 + ")";
		*/
		System.out.println("adddatalist2.size()"+list2.get(43).getReappear()+list2.size());
		int age;
		int updateage;
		System.out.println("name:" + name + "   date:" + date+"    list2"+list2.size());
		for (int j = 0; j < list2.size(); j = j + 10) {
			String sql = "insert into sourcedata (qid,questionNum,state,project,track,priority,theme,assign,category,target,author,start,findate,complete,expected,paretask,creat,updated,testnum,originalreq,requdate,area,softver,hardver,lifeform,probability,probabtype,bugbar,result,reappear,recover,solution,cause,solvemed,model,stage,prosour,testsug,funmod,described,name,date,age,updateage) values ";
			
			int j1 = j + 10;
			if (j1 < list2.size() && list2.size() > 10) {
				for (int i = j; i < j + 10; i = i + 1) {
				
					age = excel.method.Method.daysBetween(list2.get(i).getCreat(), date);
					updateage = excel.method.Method.daysBetween(list2.get(i).getUpdate(), date);
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + age + "," + updateage + "),";
					sql = sql + V;
					// System.out.println("AND i+" + i);
				}
				System.out.println("j= "+j);
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				//System.out.println("sql="+sql);
				// System.out.println(sql);
				PreparedStatement sta = null;
				Connection con = Connect.getConnection();
				ResultSet rs = null;
				try {
					// System.out.println("sql1="+sql);
					sta = con.prepareStatement(sql);
					System.out.println("sql.length()"+sql.length()+sql.contains("#"));
					if(sql.contains("#")|sql.contains("\r"))
					{
						String s = "";
						sql=sql.replace("#", s);
						//System.out.println(sql);
					}
					sta.execute();
					sta.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(sql);
					
				}
			}
			if (j1 >= list2.size() || list2.size() <= 10) {
				for (int i = j; i < list2.size(); i = i + 1) {
					age = excel.method.Method.daysBetween(list2.get(i).getCreat(), date);
					updateage = excel.method.Method.daysBetween(list2.get(i).getUpdate(), date);
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + age + "," + updateage + "),";
					sql = sql + V;
					// System.out.println("TWO if AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql.substring(0, 10));
				PreparedStatement sta = null;
				Connection con = Connect.getConnection();
				ResultSet rs = null;
				try {
					// System.out.println("sql1="+sql);
					sta = con.prepareStatement(sql);
					sta.execute();
					sta.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("j= "+j);
			}
			System.out.println("已执行j1"+j1+"    ");
		}
		System.out.println("已执行adddata");
	}

	public void seleage() throws SQLException, ParseException {
		String creat = null;
		String updated = null;
		// TODO Auto-generated method stub
		Connection con = Connect.getConnection();
		Statement stmt = null;
		ResultSet rs;
		String sql = "select creat,updated from sourcedata";
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			creat = rs.getString("creat");
			updated = rs.getString("updated");
			int day = excel.method.Method.daysBetween(creat, updated);
			System.out.println(creat + "    " + updated + "   问题年龄（天）： " + day);
		}
		rs.close();
		stmt.close();
		con.close();

	}

	public static void main(String[] args) throws SQLException {
		System.out.println(check("wwww"));
		/*
		 * adddata(1, "questionNum", "state", "project", "track", "priority",
		 * "theme", "assign", "category", "target", "author", "start",
		 * "findate", "complete", "expected", "paretask", "creat", "update",
		 * "originalreq", "testnum", "test", "softver", "hardver", "requdate",
		 * "result", "lifeform", "probability", "probabtype", "bugbar",
		 * "reappear", "recover", "solution", "cause", "solvemed", "model",
		 * "stage", "prosour", "testsug", "describe","張興宇","20150104",1);
		 */
	}
}
