package Connectsql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import excel.vo.Analy;
import excel.vo.export;

public class JDBCana {

	public static List<Analy> sele1bug(String name,String date) throws SQLException{
		List<Analy> list = new ArrayList<Analy>();
		// TODO Auto-generated method stub
		Connection con = Connect.getConnection();
		Statement stmt = null;
		ResultSet rs;		
		String sql = "select * from sourcedata where name ='"+name+"' and date ='"+date+"' and bugbar='提示问题'";
		System.out.println(sql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Analy exp=new Analy();
			exp.setQid(rs.getInt("qid"));
			exp.setQuestionNum(rs.getString("questionNum"));
			exp.setState(rs.getString("state"));
			exp.setProject(rs.getString("project"));
			exp.setTrack(rs.getString("track"));
			exp.setPriority(rs.getString("priority"));
			exp.setTheme(rs.getString("theme"));
			exp.setAssign(rs.getString("assign"));
			exp.setCategory(rs.getString("category"));
			exp.setTarget(rs.getString("target"));
			exp.setAuthor(rs.getString("author"));
			exp.setStart(rs.getString("start"));
			exp.setFindate(rs.getString("findate"));
			exp.setComplete(rs.getString("complete"));
			exp.setExpected(rs.getString("expected"));
			exp.setParetask(rs.getString("paretask"));
			exp.setCreat(rs.getString("creat"));
			exp.setUpdate(rs.getString("updated"));
			exp.setTestnum(rs.getString("testnum"));
			exp.setOriginalreq(rs.getString("originalreq"));
			exp.setRequdate(rs.getString("requdate"));
			exp.setArea(rs.getString("area"));
			exp.setSoftver(rs.getString("softver"));
			exp.setHardver(rs.getString("hardver"));			
			exp.setLifeform(rs.getString("lifeform"));
			exp.setProbability(rs.getString("probability"));
			exp.setProbabtype(rs.getString("probabtype"));
			exp.setBugbar(rs.getString("bugbar"));
			exp.setResult(rs.getString("result"));
			exp.setReappear(rs.getString("reappear"));
			exp.setRecover(rs.getString("recover"));
			exp.setSolution(rs.getString("solution"));
			exp.setCause(rs.getString("cause"));
			exp.setSolvemed(rs.getString("solvemed"));
			exp.setModel(rs.getString("model"));
			exp.setStage(rs.getString("stage"));
			exp.setProsour(rs.getString("prosour"));
			exp.setTestsug(rs.getString("testsug"));
			exp.setFunmod(rs.getString("funmod"));
			exp.setDescribe(rs.getString("described"));
			exp.setName(rs.getString("name"));
			exp.setDate(rs.getString("date"));
			exp.setAge(rs.getString("age"));
			exp.setUpdateage(rs.getString("updateage"));
			list.add(exp);
			
		}
		rs.close();
		stmt.close();
		con.close();
		 /*for (Analy ex : list) {
         	
             System.out.println("QuestionNum : "+ex.getQuestionNum()+"    id:  "+ex.getQid()+"   指派给:   "+ex.getAssign()+"  状态：   "+ex.getState()+"              主题：  "+ex.getTheme()+"              完成度：  "+ex.getComplete()+"              开始时间：  "+ex.getStart()+"              结束时间：  "+ex.getFindate()+"              要求完成：  "+ex.getRequdate()+"  "+ex.getName()+"    "+ex.getAge()+"   "+ex.getUpdateage());
         }*/
		 return list;
	}
	public static List<Analy> sele2bug(String name,String date) throws SQLException{
		List<Analy> list = new ArrayList<Analy>();
		// TODO Auto-generated method stub
		Connection con = Connect.getConnection();
		Statement stmt = null;
		ResultSet rs;		
		String sql = "select * from sourcedata where name ='"+name+"' and date ='"+date+"' and bugbar='一般问题'";
		System.out.println(sql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Analy exp=new Analy();
			exp.setQid(rs.getInt("qid"));
			exp.setQuestionNum(rs.getString("questionNum"));
			exp.setState(rs.getString("state"));
			exp.setProject(rs.getString("project"));
			exp.setTrack(rs.getString("track"));
			exp.setPriority(rs.getString("priority"));
			exp.setTheme(rs.getString("theme"));
			exp.setAssign(rs.getString("assign"));
			exp.setCategory(rs.getString("category"));
			exp.setTarget(rs.getString("target"));
			exp.setAuthor(rs.getString("author"));
			exp.setStart(rs.getString("start"));
			exp.setFindate(rs.getString("findate"));
			exp.setComplete(rs.getString("complete"));
			exp.setExpected(rs.getString("expected"));
			exp.setParetask(rs.getString("paretask"));
			exp.setCreat(rs.getString("creat"));
			exp.setUpdate(rs.getString("updated"));
			exp.setTestnum(rs.getString("testnum"));
			exp.setOriginalreq(rs.getString("originalreq"));
			exp.setRequdate(rs.getString("requdate"));
			exp.setArea(rs.getString("area"));
			exp.setSoftver(rs.getString("softver"));
			exp.setHardver(rs.getString("hardver"));			
			exp.setLifeform(rs.getString("lifeform"));
			exp.setProbability(rs.getString("probability"));
			exp.setProbabtype(rs.getString("probabtype"));
			exp.setBugbar(rs.getString("bugbar"));
			exp.setResult(rs.getString("result"));
			exp.setReappear(rs.getString("reappear"));
			exp.setRecover(rs.getString("recover"));
			exp.setSolution(rs.getString("solution"));
			exp.setCause(rs.getString("cause"));
			exp.setSolvemed(rs.getString("solvemed"));
			exp.setModel(rs.getString("model"));
			exp.setStage(rs.getString("stage"));
			exp.setProsour(rs.getString("prosour"));
			exp.setTestsug(rs.getString("testsug"));
			exp.setFunmod(rs.getString("funmod"));
			exp.setDescribe(rs.getString("described"));
			exp.setName(rs.getString("name"));
			exp.setDate(rs.getString("date"));
			exp.setAge(rs.getString("age"));
			exp.setUpdateage(rs.getString("updateage"));
			list.add(exp);
			
		}
		rs.close();
		stmt.close();
		con.close();
		/* for (Analy ex : list) {
         	
             System.out.println("QuestionNum : "+ex.getQuestionNum()+"    id:  "+ex.getQid()+"   指派给:   "+ex.getAssign()+"  状态：   "+ex.getState()+"              主题：  "+ex.getTheme()+"              完成度：  "+ex.getComplete()+"              开始时间：  "+ex.getStart()+"              结束时间：  "+ex.getFindate()+"              要求完成：  "+ex.getRequdate()+"  "+ex.getName()+"    "+ex.getAge()+"   "+ex.getUpdateage());
         }*/
		 return list;
	}
	public static List<Analy> sele3bug(String name,String date) throws SQLException{
		List<Analy> list = new ArrayList<Analy>();
		// TODO Auto-generated method stub
		Connection con = Connect.getConnection();
		Statement stmt = null;
		ResultSet rs;		
		String sql = "select * from sourcedata where name ='"+name+"' and date ='"+date+"' and bugbar='严重问题'";
		System.out.println(sql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Analy exp=new Analy();
			exp.setQid(rs.getInt("qid"));
			exp.setQuestionNum(rs.getString("questionNum"));
			exp.setState(rs.getString("state"));
			exp.setProject(rs.getString("project"));
			exp.setTrack(rs.getString("track"));
			exp.setPriority(rs.getString("priority"));
			exp.setTheme(rs.getString("theme"));
			exp.setAssign(rs.getString("assign"));
			exp.setCategory(rs.getString("category"));
			exp.setTarget(rs.getString("target"));
			exp.setAuthor(rs.getString("author"));
			exp.setStart(rs.getString("start"));
			exp.setFindate(rs.getString("findate"));
			exp.setComplete(rs.getString("complete"));
			exp.setExpected(rs.getString("expected"));
			exp.setParetask(rs.getString("paretask"));
			exp.setCreat(rs.getString("creat"));
			exp.setUpdate(rs.getString("updated"));
			exp.setTestnum(rs.getString("testnum"));
			exp.setOriginalreq(rs.getString("originalreq"));
			exp.setRequdate(rs.getString("requdate"));
			exp.setArea(rs.getString("area"));
			exp.setSoftver(rs.getString("softver"));
			exp.setHardver(rs.getString("hardver"));			
			exp.setLifeform(rs.getString("lifeform"));
			exp.setProbability(rs.getString("probability"));
			exp.setProbabtype(rs.getString("probabtype"));
			exp.setBugbar(rs.getString("bugbar"));
			exp.setResult(rs.getString("result"));
			exp.setReappear(rs.getString("reappear"));
			exp.setRecover(rs.getString("recover"));
			exp.setSolution(rs.getString("solution"));
			exp.setCause(rs.getString("cause"));
			exp.setSolvemed(rs.getString("solvemed"));
			exp.setModel(rs.getString("model"));
			exp.setStage(rs.getString("stage"));
			exp.setProsour(rs.getString("prosour"));
			exp.setTestsug(rs.getString("testsug"));
			exp.setFunmod(rs.getString("funmod"));
			exp.setDescribe(rs.getString("described"));
			exp.setName(rs.getString("name"));
			exp.setDate(rs.getString("date"));
			exp.setAge(rs.getString("age"));
			exp.setUpdateage(rs.getString("updateage"));
			list.add(exp);
			
		}
		rs.close();
		stmt.close();
		con.close();
		/* for (Analy ex : list) {
         	
             System.out.println("QuestionNum : "+ex.getQuestionNum()+"    id:  "+ex.getQid()+"   指派给:   "+ex.getAssign()+"  状态：   "+ex.getState()+"              主题：  "+ex.getTheme()+"              完成度：  "+ex.getComplete()+"              开始时间：  "+ex.getStart()+"              结束时间：  "+ex.getFindate()+"              要求完成：  "+ex.getRequdate()+"  "+ex.getName()+"    "+ex.getAge()+"   "+ex.getUpdateage());
         }*/
		 return list;
	}
	public static List<Analy> sele4bug(String name,String date) throws SQLException{
		List<Analy> list = new ArrayList<Analy>();
		// TODO Auto-generated method stub
		Connection con = Connect.getConnection();
		Statement stmt = null;
		ResultSet rs;		
		String sql = "select * from sourcedata where name ='"+name+"' and date ='"+date+"' and bugbar='致命问题'";
		System.out.println(sql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Analy exp=new Analy();
			exp.setQid(rs.getInt("qid"));
			exp.setQuestionNum(rs.getString("questionNum"));
			exp.setState(rs.getString("state"));
			exp.setProject(rs.getString("project"));
			exp.setTrack(rs.getString("track"));
			exp.setPriority(rs.getString("priority"));
			exp.setTheme(rs.getString("theme"));
			exp.setAssign(rs.getString("assign"));
			exp.setCategory(rs.getString("category"));
			exp.setTarget(rs.getString("target"));
			exp.setAuthor(rs.getString("author"));
			exp.setStart(rs.getString("start"));
			exp.setFindate(rs.getString("findate"));
			exp.setComplete(rs.getString("complete"));
			exp.setExpected(rs.getString("expected"));
			exp.setParetask(rs.getString("paretask"));
			exp.setCreat(rs.getString("creat"));
			exp.setUpdate(rs.getString("updated"));
			exp.setTestnum(rs.getString("testnum"));
			exp.setOriginalreq(rs.getString("originalreq"));
			exp.setRequdate(rs.getString("requdate"));
			exp.setArea(rs.getString("area"));
			exp.setSoftver(rs.getString("softver"));
			exp.setHardver(rs.getString("hardver"));			
			exp.setLifeform(rs.getString("lifeform"));
			exp.setProbability(rs.getString("probability"));
			exp.setProbabtype(rs.getString("probabtype"));
			exp.setBugbar(rs.getString("bugbar"));
			exp.setResult(rs.getString("result"));
			exp.setReappear(rs.getString("reappear"));
			exp.setRecover(rs.getString("recover"));
			exp.setSolution(rs.getString("solution"));
			exp.setCause(rs.getString("cause"));
			exp.setSolvemed(rs.getString("solvemed"));
			exp.setModel(rs.getString("model"));
			exp.setStage(rs.getString("stage"));
			exp.setProsour(rs.getString("prosour"));
			exp.setTestsug(rs.getString("testsug"));
			exp.setFunmod(rs.getString("funmod"));
			exp.setDescribe(rs.getString("described"));
			exp.setName(rs.getString("name"));
			exp.setDate(rs.getString("date"));
			exp.setAge(rs.getString("age"));
			exp.setUpdateage(rs.getString("updateage"));
			list.add(exp);
			
		}
		rs.close();
		stmt.close();
		con.close();
		/* for (Analy ex : list) {
         	
             System.out.println("QuestionNum : "+ex.getQuestionNum()+"    id:  "+ex.getQid()+"   指派给:   "+ex.getAssign()+"  状态：   "+ex.getState()+"              主题：  "+ex.getTheme()+"              完成度：  "+ex.getComplete()+"              开始时间：  "+ex.getStart()+"              结束时间：  "+ex.getFindate()+"              要求完成：  "+ex.getRequdate()+"  "+ex.getName()+"    "+ex.getAge()+"   "+ex.getUpdateage());
         }*/
		 return list;
	}
	public static List<Analy> seleopenbug(String name,String date) throws SQLException{
		List<Analy> list = new ArrayList<Analy>();
		// TODO Auto-generated method stub
		Connection con = Connect.getConnection();
		Statement stmt = null;
		ResultSet rs;		
		String sql = "select * from sourcedata where name ='"+name+"' and date ='"+date+"' and state!='已关闭'";
		System.out.println(sql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Analy exp=new Analy();
			exp.setQid(rs.getInt("qid"));
			exp.setQuestionNum(rs.getString("questionNum"));
			exp.setState(rs.getString("state"));
			exp.setProject(rs.getString("project"));
			exp.setTrack(rs.getString("track"));
			exp.setPriority(rs.getString("priority"));
			exp.setTheme(rs.getString("theme"));
			exp.setAssign(rs.getString("assign"));
			exp.setCategory(rs.getString("category"));
			exp.setTarget(rs.getString("target"));
			exp.setAuthor(rs.getString("author"));
			exp.setStart(rs.getString("start"));
			exp.setFindate(rs.getString("findate"));
			exp.setComplete(rs.getString("complete"));
			exp.setExpected(rs.getString("expected"));
			exp.setParetask(rs.getString("paretask"));
			exp.setCreat(rs.getString("creat"));
			exp.setUpdate(rs.getString("updated"));
			exp.setTestnum(rs.getString("testnum"));
			exp.setOriginalreq(rs.getString("originalreq"));
			exp.setRequdate(rs.getString("requdate"));
			exp.setArea(rs.getString("area"));
			exp.setSoftver(rs.getString("softver"));
			exp.setHardver(rs.getString("hardver"));			
			exp.setLifeform(rs.getString("lifeform"));
			exp.setProbability(rs.getString("probability"));
			exp.setProbabtype(rs.getString("probabtype"));
			exp.setBugbar(rs.getString("bugbar"));
			exp.setResult(rs.getString("result"));
			exp.setReappear(rs.getString("reappear"));
			exp.setRecover(rs.getString("recover"));
			exp.setSolution(rs.getString("solution"));
			exp.setCause(rs.getString("cause"));
			exp.setSolvemed(rs.getString("solvemed"));
			exp.setModel(rs.getString("model"));
			exp.setStage(rs.getString("stage"));
			exp.setProsour(rs.getString("prosour"));
			exp.setTestsug(rs.getString("testsug"));
			exp.setFunmod(rs.getString("funmod"));
			exp.setDescribe(rs.getString("described"));
			exp.setName(rs.getString("name"));
			exp.setDate(rs.getString("date"));
			exp.setAge(rs.getString("age"));
			exp.setUpdateage(rs.getString("updateage"));
			list.add(exp);
			
		}
		rs.close();
		stmt.close();
		con.close();
		/* for (Analy ex : list) {
         	
             System.out.println("QuestionNum : "+ex.getQuestionNum()+"    id:  "+ex.getQid()+"   指派给:   "+ex.getAssign()+"  状态：   "+ex.getState()+"              主题：  "+ex.getTheme()+"              完成度：  "+ex.getComplete()+"              开始时间：  "+ex.getStart()+"              结束时间：  "+ex.getFindate()+"              要求完成：  "+ex.getRequdate()+"  "+ex.getName()+"    "+ex.getAge()+"   "+ex.getUpdateage());
         }*/
		 return list;
	}
	public static List<Analy> seleclosebug(String name,String date) throws SQLException{
		List<Analy> list = new ArrayList<Analy>();
		// TODO Auto-generated method stub
		Connection con = Connect.getConnection();
		Statement stmt = null;
		ResultSet rs;		
		String sql = "select * from sourcedata where name ='"+name+"' and date ='"+date+"' and state='已关闭'";
		System.out.println(sql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Analy exp=new Analy();
			exp.setQid(rs.getInt("qid"));
			exp.setQuestionNum(rs.getString("questionNum"));
			exp.setState(rs.getString("state"));
			exp.setProject(rs.getString("project"));
			exp.setTrack(rs.getString("track"));
			exp.setPriority(rs.getString("priority"));
			exp.setTheme(rs.getString("theme"));
			exp.setAssign(rs.getString("assign"));
			exp.setCategory(rs.getString("category"));
			exp.setTarget(rs.getString("target"));
			exp.setAuthor(rs.getString("author"));
			exp.setStart(rs.getString("start"));
			exp.setFindate(rs.getString("findate"));
			exp.setComplete(rs.getString("complete"));
			exp.setExpected(rs.getString("expected"));
			exp.setParetask(rs.getString("paretask"));
			exp.setCreat(rs.getString("creat"));
			exp.setUpdate(rs.getString("updated"));
			exp.setTestnum(rs.getString("testnum"));
			exp.setOriginalreq(rs.getString("originalreq"));
			exp.setRequdate(rs.getString("requdate"));
			exp.setArea(rs.getString("area"));
			exp.setSoftver(rs.getString("softver"));
			exp.setHardver(rs.getString("hardver"));			
			exp.setLifeform(rs.getString("lifeform"));
			exp.setProbability(rs.getString("probability"));
			exp.setProbabtype(rs.getString("probabtype"));
			exp.setBugbar(rs.getString("bugbar"));
			exp.setResult(rs.getString("result"));
			exp.setReappear(rs.getString("reappear"));
			exp.setRecover(rs.getString("recover"));
			exp.setSolution(rs.getString("solution"));
			exp.setCause(rs.getString("cause"));
			exp.setSolvemed(rs.getString("solvemed"));
			exp.setModel(rs.getString("model"));
			exp.setStage(rs.getString("stage"));
			exp.setProsour(rs.getString("prosour"));
			exp.setTestsug(rs.getString("testsug"));
			exp.setFunmod(rs.getString("funmod"));
			exp.setDescribe(rs.getString("described"));
			exp.setName(rs.getString("name"));
			exp.setDate(rs.getString("date"));
			exp.setAge(rs.getString("age"));
			exp.setUpdateage(rs.getString("updateage"));
			list.add(exp);
			
		}
		rs.close();
		stmt.close();
		con.close();
		 /*for (Analy ex : list) {
         	
             System.out.println("QuestionNum : "+ex.getQuestionNum()+"    id:  "+ex.getQid()+"   指派给:   "+ex.getAssign()+"  状态：   "+ex.getState()+"              主题：  "+ex.getTheme()+"              完成度：  "+ex.getComplete()+"              开始时间：  "+ex.getStart()+"              结束时间：  "+ex.getFindate()+"              要求完成：  "+ex.getRequdate()+"  "+ex.getName()+"    "+ex.getAge()+"   "+ex.getUpdateage());
         }*/
		 return list;
	}
	public static void addbug1(List<Analy> list2, String name, String date) throws ParseException {
		System.out.println("name:" + name + "   date:" + date);
		for (int j = 0; j < list2.size(); j = j + 500) {
			String sql = "insert into bugfirst (qid,questionNum,state,project,track,priority,theme,assign,category,target,author,start,findate,complete,expected,paretask,creat,updated,testnum,originalreq,requdate,area,softver,hardver,lifeform,probability,probabtype,bugbar,result,reappear,recover,solution,cause,solvemed,model,stage,prosour,testsug,funmod,described,name,date,age,updateage) values ";
			int j1 = j + 500;
			if (j1 < list2.size() && list2.size() > 500) {
				for (int i = j; i < j + 500; i = i + 1) {
					// System.out.println("sql="+sql);
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql);
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
			}
			if (j1 >= list2.size() || list2.size() <= 500) {
				for (int i = j; i < list2.size(); i = i + 1) {
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("TWO if AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql.substring(0, 500));
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
			}
		}
		System.out.println("已执行adddata");
	}
	public static void addbug2(List<Analy> list2, String name, String date) throws ParseException {
		System.out.println("name:" + name + "   date:" + date);
		for (int j = 0; j < list2.size(); j = j + 500) {
			String sql = "insert into bugsecond (qid,questionNum,state,project,track,priority,theme,assign,category,target,author,start,findate,complete,expected,paretask,creat,updated,testnum,originalreq,requdate,area,softver,hardver,lifeform,probability,probabtype,bugbar,result,reappear,recover,solution,cause,solvemed,model,stage,prosour,testsug,funmod,described,name,date,age,updateage) values ";
			int j1 = j + 500;
			if (j1 < list2.size() && list2.size() > 500) {
				for (int i = j; i < j + 500; i = i + 1) {
					// System.out.println("sql="+sql);
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql);
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
			}
			if (j1 >= list2.size() || list2.size() <= 500) {
				for (int i = j; i < list2.size(); i = i + 1) {
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("TWO if AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql.substring(0, 500));
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
			}
		}
		System.out.println("已执行adddata");
	}
	public static void addbug3(List<Analy> list2, String name, String date) throws ParseException {
		System.out.println("name:" + name + "   date:" + date);
		for (int j = 0; j < list2.size(); j = j + 500) {
			String sql = "insert into bugthree (qid,questionNum,state,project,track,priority,theme,assign,category,target,author,start,findate,complete,expected,paretask,creat,updated,testnum,originalreq,requdate,area,softver,hardver,lifeform,probability,probabtype,bugbar,result,reappear,recover,solution,cause,solvemed,model,stage,prosour,testsug,funmod,described,name,date,age,updateage) values ";
			int j1 = j + 500;
			if (j1 < list2.size() && list2.size() > 500) {
				for (int i = j; i < j + 500; i = i + 1) {
					// System.out.println("sql="+sql);
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql);
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
			}
			if (j1 >= list2.size() || list2.size() <= 500) {
				for (int i = j; i < list2.size(); i = i + 1) {
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("TWO if AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql.substring(0, 500));
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
			}
		}
		System.out.println("已执行adddata");
	}
	public static void addbug4(List<Analy> list2, String name, String date) throws ParseException {
		System.out.println("name:" + name + "   date:" + date);
		for (int j = 0; j < list2.size(); j = j + 500) {
			String sql = "insert into bugfourth (qid,questionNum,state,project,track,priority,theme,assign,category,target,author,start,findate,complete,expected,paretask,creat,updated,testnum,originalreq,requdate,area,softver,hardver,lifeform,probability,probabtype,bugbar,result,reappear,recover,solution,cause,solvemed,model,stage,prosour,testsug,funmod,described,name,date,age,updateage) values ";
			int j1 = j + 500;
			if (j1 < list2.size() && list2.size() > 500) {
				for (int i = j; i < j + 500; i = i + 1) {
					// System.out.println("sql="+sql);
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql);
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
			}
			if (j1 >= list2.size() || list2.size() <= 500) {
				for (int i = j; i < list2.size(); i = i + 1) {
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("TWO if AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql.substring(0, 500));
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
			}
		}
		System.out.println("已执行adddata");
	}
	public static void addopenbug(List<Analy> list2, String name, String date) throws ParseException {
		System.out.println("name:" + name + "   date:" + date);
		for (int j = 0; j < list2.size(); j = j + 500) {
			String sql = "insert into openbug (qid,questionNum,state,project,track,priority,theme,assign,category,target,author,start,findate,complete,expected,paretask,creat,updated,testnum,originalreq,requdate,area,softver,hardver,lifeform,probability,probabtype,bugbar,result,reappear,recover,solution,cause,solvemed,model,stage,prosour,testsug,funmod,described,name,date,age,updateage) values ";
			int j1 = j + 500;
			if (j1 < list2.size() && list2.size() > 500) {
				for (int i = j; i < j + 500; i = i + 1) {
					// System.out.println("sql="+sql);
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql);
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
			}
			if (j1 >= list2.size() || list2.size() <= 500) {
				for (int i = j; i < list2.size(); i = i + 1) {
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("TWO if AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql.substring(0, 500));
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
			}
		}
		System.out.println("已执行adddata");
	}
	public static void addclosebug(List<Analy> list2, String name, String date) throws ParseException {
		System.out.println("name:" + name + "   date:" + date);
		for (int j = 0; j < list2.size(); j = j + 500) {
			String sql = "insert into closebug (qid,questionNum,state,project,track,priority,theme,assign,category,target,author,start,findate,complete,expected,paretask,creat,updated,testnum,originalreq,requdate,area,softver,hardver,lifeform,probability,probabtype,bugbar,result,reappear,recover,solution,cause,solvemed,model,stage,prosour,testsug,funmod,described,name,date,age,updateage) values ";
			int j1 = j + 500;
			if (j1 < list2.size() && list2.size() > 500) {
				for (int i = j; i < j + 500; i = i + 1) {
					// System.out.println("sql="+sql);
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql);
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
			}
			if (j1 >= list2.size() || list2.size() <= 500) {
				for (int i = j; i < list2.size(); i = i + 1) {
					String V = "(" + list2.get(i).getQid() + ",'" + list2.get(i).getQuestionNum() + "','" + list2.get(i).getState() + "','" + list2.get(i).getProject() + "','" + list2.get(i).getTrack() + "','" + list2.get(i).getPriority() + "','" + list2.get(i).getTheme() + "','" + list2.get(i).getAssign() + "','" + list2.get(i).getCategory() + "','" + list2.get(i).getTarget() + "','" + list2.get(i).getAuthor() + "','" + list2.get(i).getStart() + "','" + list2.get(i).getFindate() + "','" + list2.get(i).getComplete() + "','" + list2.get(i).getExpected() + "','" + list2.get(i).getParetask() + "','" + list2.get(i).getCreat() + "','" + list2.get(i).getUpdate() + "','" + list2.get(i).getTestnum()+ "','" +  list2.get(i).getOriginalreq() + "','" + list2.get(i).getRequdate() + "','"+ list2.get(i).getArea() + "','" + list2.get(i).getSoftver() + "','" + list2.get(i).getHardver() + "','"  + list2.get(i).getLifeform() + "','" + list2.get(i).getProbability() + "','" + list2.get(i).getProbabtype() + "','" + list2.get(i).getBugbar() + "','" + list2.get(i).getResult() + "','" + list2.get(i).getReappear() + "','" + list2.get(i).getRecover() + "','" + list2.get(i).getSolution() + "','" + list2.get(i).getCause() + "','" + list2.get(i).getSolvemed() + "','" + list2.get(i).getModel() + "','" + list2.get(i).getStage() + "','" + list2.get(i).getProsour() + "','" + list2.get(i).getTestsug() + "','"+ list2.get(i).getFunmod() +"','" + list2.get(i).getDescribe() + "','" + name + "','" + date + "'," + list2.get(i).getAge() + "," + list2.get(i).getUpdateage() + "),";
					sql = sql + V;
					// System.out.println("TWO if AND i+" + i);
				}
				// System.out.println(sql);
				sql = sql.substring(0, sql.lastIndexOf(","));
				// System.out.println(sql.substring(0, 500));
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
			}
		}
		System.out.println("已执行adddata");
	}
	
	/*public static void addopenbug(int qid, String questionNum, String state,
			String project, String track, String priority, String theme,
			String assign, String category, String target, String author,
			String start, String findate, String complete, String expected,
			String paretask, String creat, String update, String originalreq,
			String testnum, String test, String softver, String hardver,
			String requdate, String result, String lifeform, String probability,
			String probabtype, String bugbar, String reappear, String recover,
			String solution, String cause, String solvemed, String model,
			String stage, String prosour, String testsug,String describe,String name,String date,String age,String updateage) {

		String sql = "insert into openbug (qid,questionNum,state,project,track,priority,theme,assign,category,target,author,start,findate,complete,expected,paretask,creat,updated,originalreq,testnum,test,softver,hardver,requdate,result,lifeform,probability,probabtype,bugbar,reappear,recover,solution,cause,solvemed,model,stage,prosour,testsug,described,name,date,age,updateage) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stme = null;
		Connection con = Connect.getConnection();
		try {
			stme = con.prepareStatement(sql);

			stme.setInt(1, qid);
			stme.setString(2, questionNum);
			stme.setString(3, state);
			stme.setString(4, project);
			stme.setString(5, track);
			stme.setString(6, priority);
			stme.setString(7, theme);
			stme.setString(8, assign);
			stme.setString(9, category);
			stme.setString(10, target);
			stme.setString(11, author);
			stme.setString(12, start);
			stme.setString(13, findate);
			stme.setString(14, complete);
			stme.setString(15, expected);
			stme.setString(16, paretask);
			stme.setString(17, creat);
			stme.setString(18, update);
			stme.setString(19, originalreq);
			stme.setString(20, testnum);
			stme.setString(21, test);
			stme.setString(22, softver);
			stme.setString(23, hardver);
			stme.setString(24, requdate);
			stme.setString(25, result);
			stme.setString(26, lifeform);
			stme.setString(27, probability);
			stme.setString(28, probabtype);
			stme.setString(29, bugbar);
			stme.setString(30, reappear);
			stme.setString(31, recover);
			stme.setString(32, solution);
			stme.setString(33, cause);
			stme.setString(34, solvemed);
			stme.setString(35, model);
			stme.setString(36, stage);
			stme.setString(37, prosour);
			stme.setString(38, testsug);
			stme.setString(39, describe);			
			stme.setString(40, name);			
			stme.setString(41, date);			
			stme.setString(42, age);
			stme.setString(43, updateage);
			stme.execute();
			stme.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		System.out.println("已执行addopenbug");
	}public static void addclosebug(int qid, String questionNum, String state,
			String project, String track, String priority, String theme,
			String assign, String category, String target, String author,
			String start, String findate, String complete, String expected,
			String paretask, String creat, String update, String originalreq,
			String testnum, String test, String softver, String hardver,
			String requdate, String result, String lifeform, String probability,
			String probabtype, String bugbar, String reappear, String recover,
			String solution, String cause, String solvemed, String model,
			String stage, String prosour, String testsug,String describe,String name,String date,String age,String updateage) {

		String sql = "insert into closebug (qid,questionNum,state,project,track,priority,theme,assign,category,target,author,start,findate,complete,expected,paretask,creat,updated,originalreq,testnum,test,softver,hardver,requdate,result,lifeform,probability,probabtype,bugbar,reappear,recover,solution,cause,solvemed,model,stage,prosour,testsug,described,name,date,age,updateage) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stme = null;
		Connection con = Connect.getConnection();
		try {
			stme = con.prepareStatement(sql);

			stme.setInt(1, qid);
			stme.setString(2, questionNum);
			stme.setString(3, state);
			stme.setString(4, project);
			stme.setString(5, track);
			stme.setString(6, priority);
			stme.setString(7, theme);
			stme.setString(8, assign);
			stme.setString(9, category);
			stme.setString(10, target);
			stme.setString(11, author);
			stme.setString(12, start);
			stme.setString(13, findate);
			stme.setString(14, complete);
			stme.setString(15, expected);
			stme.setString(16, paretask);
			stme.setString(17, creat);
			stme.setString(18, update);
			stme.setString(19, originalreq);
			stme.setString(20, testnum);
			stme.setString(21, test);
			stme.setString(22, softver);
			stme.setString(23, hardver);
			stme.setString(24, requdate);
			stme.setString(25, result);
			stme.setString(26, lifeform);
			stme.setString(27, probability);
			stme.setString(28, probabtype);
			stme.setString(29, bugbar);
			stme.setString(30, reappear);
			stme.setString(31, recover);
			stme.setString(32, solution);
			stme.setString(33, cause);
			stme.setString(34, solvemed);
			stme.setString(35, model);
			stme.setString(36, stage);
			stme.setString(37, prosour);
			stme.setString(38, testsug);
			stme.setString(39, describe);			
			stme.setString(40, name);			
			stme.setString(41, date);			
			stme.setString(42, age);
			stme.setString(43, updateage);
			stme.execute();
			stme.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		System.out.println("已执行addclosebug");
	}*/
}
