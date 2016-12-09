package Connectsql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBClife {
	public static int checknew4(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and lifeform = 'NEW' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,new4 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checknew3(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and lifeform = 'NEW' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,new3 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checknew2(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and lifeform = 'NEW' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,new2= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checknew1(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and lifeform = 'NEW' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,new1= " + i);
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
		System.out.println("���ݴ���,newnull = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	
	
	
	
	
	
	public static int checkFix4(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and lifeform = 'BUGFIX' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,FIX4 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkFix3(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and lifeform = 'BUGFIX' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,FIX3 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkFix2(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and lifeform = 'BUGFIX' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,FIX2= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkFix1(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and lifeform = 'BUGFIX' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,FIX1= " + i);
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
		System.out.println("���ݴ���,Fixnull = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	
	
	
	
	//Other
	public static int checkOther4(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and lifeform = 'Other' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,Other4 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkOther3(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and lifeform = 'Other' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,Other3 = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkOther2(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and lifeform = 'Other' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,Other2= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkOther1(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and lifeform = 'Other' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,OLD1= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkOthernull(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='"+name+"' and date='"+date+"' and lifeform = 'Other' and bugbar='' and state !='�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,Fixnull = " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	
	
	
	//OLD
		public static int checkold4(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and lifeform = 'OLD' and state !='�ѹر�'";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("���ݴ���,OLD4 = " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
		public static int checkold3(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and lifeform = 'OLD' and state !='�ѹر�'";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("���ݴ���,OLD3 = " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
		public static int checkold2(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and lifeform = 'OLD' and state !='�ѹر�'";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("���ݴ���,OLD2= " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
		public static int checkold1(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and lifeform = 'OLD' and state !='�ѹر�'";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("���ݴ���,OLD1= " + i);
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
			System.out.println("���ݴ���,Fixnull = " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
}
