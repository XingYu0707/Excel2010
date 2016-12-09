package Connectsql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import excel.vo.*;

public class JDBCperson {
	public static List<Assign> checkopennum(String name, String date)
			throws SQLException {
		int i = 0;
		List<Assign> list = new ArrayList<Assign>();
		Assign as = null;
		String sql = "select assign from openbug where name='" + name
				+ "' and date='" + date + "'";
		Statement sta = null;
		Connection con = Connect.getConnection();
		ResultSet rs = null;
		sta = con.createStatement();
		rs = sta.executeQuery(sql);

		while (rs.next()) {
			//System.out.println(rs.getString("assign"));
			as = new Assign();
			as.setAssign(rs.getString("assign"));
			as.setNum(1);
			list.add(as);
		}
		for (int n = 0; n < list.size(); n++) {
			for (int j = list.size() - 1; j > n; j--) {
				if (list.get(n).getAssign().equals(list.get(j).getAssign())) {
					//System.out.println(list.get(n).getAssign());
					as = new Assign();
					as.setAssign(list.get(n).getAssign());
					as.setNum(list.get(n).getNum() + 1);
					list.set(n, as);
					list.remove(j);

				} 
			}
		}
		
		for  ( int  p  =   0 ; p  <  list.size()  -   1 ; p ++ )  {     
			for  ( int  q  =  list.size()  -   1 ; q  >  p; q -- )  {    
				if  (list.get(p).getNum()<list.get(q).getNum())  {  
					Assign t=list.get(p);
					list.set(p, list.get(q));
					list.set(q, t);    
				}      
			}      
		}    
		// System.out.println("数据存在,opennum= " + i);
		rs.close();
		sta.close();
		con.close();
		return list;
	}

	public static void main(String[] args) throws SQLException {
		List<Assign> list1 = new ArrayList<Assign>();

		list1 = checkopennum("张兴宇jeremy", "2015-01-09");
		for (Assign ass : list1) {
			System.out.println("name=" + ass.getAssign() + "  num="
					+ ass.getNum());
		}
		// adddata(1, "questionNum", "state", "project", "track", "priority",
		// "theme", "assign", "category", "target", "author", "start",
		// "findate", "complete", "expected", "paretask", "creat", "update",
		// "originalreq", "testnum", "test", "softver", "hardver", "requdate",
		// "result", "lifeform", "probability", "probabtype", "bugbar",
		// "reappear", "recover", "solution", "cause", "solvemed", "model",
		// "stage", "prosour", "testsug", "describe","張興宇","20150104",1);
	}
}
