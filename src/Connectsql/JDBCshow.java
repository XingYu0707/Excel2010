package Connectsql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JDBCshow {

	public static int checkopennum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='"+name+"' and date='"+date+"'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,opennum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkclosenum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from closebug where name='"+name+"' and date='"+date+"'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,closebnum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkallnum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from sourcedata where name='"+name+"' and date='"+date+"'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,allnum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkweekopennum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from openbug where name='"+name+"' and date='"+date+"' and age between 0 and 6";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
			System.out.println(rs.getString("age"));
		}
		System.out.println(sql+"���ݴ���,weekopennum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkweekclosenum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from closebug where name='"+name+"' and date='"+date+"' and updateage between 0 and 6";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
			System.out.println(rs.getString("age"));
		}
		System.out.println(sql+"���ݴ���,weekclosenum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	
	
	
	//bug2
	public static int checkbug1allnum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,bug1allnum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkbug1closenum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and state = '�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,bug1closenum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkbug1weekopennum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and state != '�ѹر�' and age between 0 and 6";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,bug1weekopennum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkbug1weekclosenum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and state = '�ѹر�' and updateage between 0 and 6";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,bug1weekclosenum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkbug1opennum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfirst where name='"+name+"' and date='"+date+"' and state != '�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,bug1opennum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}

	
	
	
	//bug2
			public static int checkbug2allnum(String name,String date) throws SQLException {
				int i = 0;
				String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"'";
				Statement sta = null;
				Connection con = Connect.getConnection();
				ResultSet rs = null;
				sta = con.createStatement();
				rs = sta.executeQuery(sql);
				while (rs.next()) {
					i = i + 1;
				}
				System.out.println("���ݴ���,bug2allnum= " + i);
				rs.close();
				sta.close();
				con.close();
				return i;
			}
			public static int checkbug2closenum(String name,String date) throws SQLException {
				int i = 0;
				String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and state = '�ѹر�'";
				Statement sta = null;
				Connection con = Connect.getConnection();
				ResultSet rs = null;
				sta = con.createStatement();
				rs = sta.executeQuery(sql);
				while (rs.next()) {
					i = i + 1;
				}
				System.out.println("���ݴ���,bug2closenum= " + i);
				rs.close();
				sta.close();
				con.close();
				return i;
			}
			public static int checkbug2weekopennum(String name,String date) throws SQLException {
				int i = 0;
				String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and state != '�ѹر�' and age between 0 and 6";
				Statement sta = null;
				Connection con = Connect.getConnection();
				ResultSet rs = null;
				sta = con.createStatement();
				rs = sta.executeQuery(sql);
				while (rs.next()) {
					i = i + 1;
				}
				System.out.println("���ݴ���,bug2weekopennum= " + i);
				rs.close();
				sta.close();
				con.close();
				return i;
			}
			public static int checkbug2weekclosenum(String name,String date) throws SQLException {
				int i = 0;
				String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and state = '�ѹر�' and updateage between 0 and 6";
				Statement sta = null;
				Connection con = Connect.getConnection();
				ResultSet rs = null;
				sta = con.createStatement();
				rs = sta.executeQuery(sql);
				while (rs.next()) {
					i = i + 1;
				}
				System.out.println("���ݴ���,bug2weekclosenum= " + i);
				rs.close();
				sta.close();
				con.close();
				return i;
			}
			public static int checkbug2opennum(String name,String date) throws SQLException {
				int i = 0;
				String sql = "select * from bugsecond where name='"+name+"' and date='"+date+"' and state != '�ѹر�'";
				Statement sta = null;
				Connection con = Connect.getConnection();
				ResultSet rs = null;
				sta = con.createStatement();
				rs = sta.executeQuery(sql);
				while (rs.next()) {
					i = i + 1;
				}
				System.out.println("���ݴ���,bug2opennum= " + i);
				rs.close();
				sta.close();
				con.close();
				return i;
			}
		
	
	
	
	
	
	
	//bug3
		public static int checkbug3allnum(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugthree where name='"+name+"' and date='"+date+"'";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("���ݴ���,bug3allnum= " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
		public static int checkbug3closenum(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and state = '�ѹر�'";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("���ݴ���,bug3closenum= " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
		public static int checkbug3weekopennum(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and state != '�ѹر�' and age between 0 and 6";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("���ݴ���,bug3weekopennum= " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
		public static int checkbug3weekclosenum(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and state = '�ѹر�' and updateage between 0 and 6";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("���ݴ���,bug3weekclosenum= " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
		public static int checkbug3opennum(String name,String date) throws SQLException {
			int i = 0;
			String sql = "select * from bugthree where name='"+name+"' and date='"+date+"' and state != '�ѹر�'";
			Statement sta = null;
			Connection con = Connect.getConnection();
			ResultSet rs = null;
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				i = i + 1;
			}
			System.out.println("���ݴ���,bug3opennum= " + i);
			rs.close();
			sta.close();
			con.close();
			return i;
		}
	
	
	
	
	
	
	
	//bug4
	public static int checkbug4allnum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,bug4allnum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkbug4closenum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and state = '�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,bug4closenum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkbug4weekopennum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and state != '�ѹر�' and age between 0 and 6";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,bug4weekopennum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkbug4weekclosenum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and state = '�ѹر�' and updateage between 0 and 6";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,bug4weekclosenum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static int checkbug4opennum(String name,String date) throws SQLException {
		int i = 0;
		String sql = "select * from bugfourth where name='"+name+"' and date='"+date+"' and state != '�ѹر�'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		while (rs.next()) {
			i = i + 1;
		}
		System.out.println("���ݴ���,bug4opennum= " + i);
		rs.close();
		sta.close();
		con.close();
		return i;
	}
	public static String checkproject(String name,String date) throws SQLException {
		String S = "";
		String sql = "select project from bugfourth where name='"+name+"' and date='"+date+"'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);
		if (rs.next()) {
			S=rs.getString("project");
			System.out.println("��ĿΪ= " + S);
		}
		
		rs.close();
		sta.close();
		con.close();
		return S;
	}
}
