package Connectsql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBClife {
	public static int checknew4(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and lifeform = 'NEW' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,new4 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checknew3(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and lifeform = 'NEW' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,new3 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checknew2(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and lifeform = 'NEW' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,new2= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checknew1(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and lifeform = 'NEW' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,new1= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checknewnull(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='"+name+"' and date='"+date+"' and lifeform = 'NEW' and bugbar=''";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,newnull = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	
	
	
	
	
	
	public static int checkFix4(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and lifeform = 'BUGFIX' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,FIX4 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkFix3(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and lifeform = 'BUGFIX' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,FIX3 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkFix2(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and lifeform = 'BUGFIX' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,FIX2= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkFix1(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and lifeform = 'BUGFIX' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,FIX1= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkFixnull(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='"+name+"' and date='"+date+"' and lifeform = 'BUGFIX' and bugbar=''";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,Fixnull = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	
	
	
	
	//Other
	public static int checkOther4(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and lifeform = 'Other' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,Other4 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkOther3(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and lifeform = 'Other' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,Other3 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkOther2(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and lifeform = 'Other' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,Other2= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkOther1(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and lifeform = 'Other' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,OLD1= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkOthernull(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='"+name+"' and date='"+date+"' and lifeform = 'Other' and bugbar='' and state !='已关闭'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,Fixnull = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	
	
	
	//OLD
		public static int checkold4(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and lifeform = 'OLD' and state !='已关闭'";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("数据存在,OLD4 = " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
		public static int checkold3(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and lifeform = 'OLD' and state !='已关闭'";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("数据存在,OLD3 = " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
		public static int checkold2(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and lifeform = 'OLD' and state !='已关闭'";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("数据存在,OLD2= " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
		public static int checkold1(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and lifeform = 'OLD' and state !='已关闭'";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("数据存在,OLD1= " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
		public static int checkOLDnull(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from openbug where name='"+name+"' and date='"+date+"' and lifeform = 'OLD' and bugbar=''";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("数据存在,Fixnull = " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
}
