package Connectsql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCage {
	public static int checkage010(String name, String date) throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='" + name
				+ "' and date='" + date
				+ "' and state != '已关闭' and age between 0 and 10";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,checkage010= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}

	public static int checkage1130(String name, String date)
			throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='" + name
				+ "' and date='" + date
				+ "' and state != '已关闭' and age between 11 and 30";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,checkage1130= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}

	public static int checkage3160(String name, String date)
			throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='" + name
				+ "' and date='" + date
				+ "' and state != '已关闭' and age between 31 and 60";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,bug2weekopennum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}

	public static int checkage6190(String name, String date)
			throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='" + name
				+ "' and date='" + date
				+ "' and state != '已关闭' and age between 61 and 90";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,checkage6190= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}

	public static int checkage91150(String name, String date)
			throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='" + name
				+ "' and date='" + date
				+ "' and state != '已关闭' and age between 91 and 150";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,bug2weekopennum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}

	public static int checkage151(String name, String date) throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='" + name
				+ "' and date='" + date + "' and state != '已关闭' and age >= 151";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("数据存在,bug2weekopennum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String name = "zzd";
		String date = "2015-01-09";
		checkage010(name, date);
		checkage1130(name, date);
		checkage3160(name, date);
		checkage6190(name, date);
		checkage91150(name, date);
		checkage151(name, date);
	}

}
