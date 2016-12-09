package excel.client;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jfree.data.time.Week;

import Connectsql.Connect;
import Connectsql.JDBClife;
import Connectsql.JDBCperson;
import Connectsql.JDBCshow;
import excel.method.Method;
import excel.vo.*
;public class Clientshow {
	public static int opennum;
	public static int closenum;
	public static int allnum;
	public static int weekopennum;
	public static int weekclosenum;
	
	public static double opennumDI;
	public static double closenumDI;
	public static double allnumDI;
	public static double weekopennumDI;
	public static double weekclosenumDI;
	
	public static int bug4allnum;
	public static int bug4closenum;
	public static int bug4opennum;
	public static int bug4weekopennum;
	public static int bug4weekclosenum;
	
	public static int bug3allnum;
	public static int bug3closenum;
	public static int bug3opennum;
	public static int bug3weekopennum;
	public static int bug3weekclosenum;
	
	public static int bug2allnum;
	public static int bug2closenum;
	public static int bug2opennum;
	public static int bug2weekopennum;
	public static int bug2weekclosenum;
	
	public static int bug1allnum;
	public static int bug1closenum;
	public static int bug1opennum;
	public static int bug1weekopennum;
	public static int bug1weekclosenum;
	
	public static int bug4allnumDI;
	public static int bug4closenumDI;
	public static int bug4opennumDI;
	public static int bug4weekopennumDI;
	public static int bug4weekclosenumDI;
	
	public static int bug3allnumDI;
	public static int bug3closenumDI;
	public static int bug3opennumDI;
	public static int bug3weekopennumDI;
	public static int bug3weekclosenumDI;
	
	public static int bug2allnumDI;
	public static int bug2closenumDI;
	public static int bug2opennumDI;
	public static int bug2weekopennumDI;
	public static int bug2weekclosenumDI;
	
	public static double bug1allnumDI;
	public static double bug1closenumDI;
	public static double bug1opennumDI;
	public static double bug1weekopennumDI;
	public static double bug1weekclosenumDI;
	
	public static String project;
	
	public static  int bugnew3;
	public static  int bugnew2;
	public static  int bugnew1;
	public static  int bugnew4;
	
	public static int bugfix3;
	public static int bugfix2;
	public static int bugfix1;
	public static int bugfix4;
	
	
	public static int bugold3;
	public static int bugold2;
	public static int bugold1;
	public static int bugold4;
	
	public static int bugother3;
	public static int bugother2;
	public static int bugother1;
	public static int bugother4;
	
	public static int bug4all;
	public static int bug3all;
	public static int bug2all;
	public static int bug1all;
	public static List<Assign> list2;
	public static String name;
	public static String date;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<Assign> getList2() {
		return list2;
	}
	public void setList2(List<Assign> list2) {
		this.list2 = list2;
	}
	public int getBug4all() {
		return bug4all;
	}
	public void setBug4all(int bug4all) {
		this.bug4all = bug4all;
	}
	public int getBug3all() {
		return bug3all;
	}
	public void setBug3all(int bug3all) {
		this.bug3all = bug3all;
	}
	public int getBug2all() {
		return bug2all;
	}
	public void setBug2all(int bug2all) {
		this.bug2all = bug2all;
	}
	public int getBug1all() {
		return bug1all;
	}
	public void setBug1all(int bug1all) {
		this.bug1all = bug1all;
	}
	public int getBugother3() {
		return bugother3;
	}
	public void setBugother3(int bugother3) {
		this.bugother3 = bugother3;
	}
	public int getBugother2() {
		return bugother2;
	}
	public void setBugother2(int bugother2) {
		this.bugother2 = bugother2;
	}
	public int getBugother1() {
		return bugother1;
	}
	public void setBugother1(int bugother1) {
		this.bugother1 = bugother1;
	}
	public int getBugother4() {
		return bugother4;
	}
	public void setBugother4(int bugother4) {
		this.bugother4 = bugother4;
	}
	public int getBugold3() {
		return bugold3;
	}
	public void setBugold3(int bugold3) {
		this.bugold3 = bugold3;
	}
	public int getBugold2() {
		return bugold2;
	}
	public void setBugold2(int bugold2) {
		this.bugold2 = bugold2;
	}
	public int getBugold1() {
		return bugold1;
	}
	public void setBugold1(int bugold1) {
		this.bugold1 = bugold1;
	}
	public int getBugold4() {
		return bugold4;
	}
	public void setBugold4(int bugold4) {
		this.bugold4 = bugold4;
	}
	public int getBugfix3() {
		return bugfix3;
	}
	public void setBugfix3(int bugfix3) {
		this.bugfix3 = bugfix3;
	}
	public int getBugfix2() {
		return bugfix2;
	}
	public void setBugfix2(int bugfix2) {
		this.bugfix2 = bugfix2;
	}
	public int getBugfix1() {
		return bugfix1;
	}
	public void setBugfix1(int bugfix1) {
		this.bugfix1 = bugfix1;
	}
	public int getBugfix4() {
		return bugfix4;
	}
	public void setBugfix4(int bugfix4) {
		this.bugfix4 = bugfix4;
	}
	
	public int getBugnew4() {
		return bugnew4;
	}
	public void setBugnew4(int bugnew4) {
		this.bugnew4 = bugnew4;
	}
	public int getBugnew3() {
		return bugnew3;
	}
	public void setBugnew3(int bugnew3) {
		this.bugnew3 = bugnew3;
	}
	public int getBugnew2() {
		return bugnew2;
	}
	public void setBugnew2(int bugnew2) {
		this.bugnew2 = bugnew2;
	}
	public int getBugnew1() {
		return bugnew1;
	}
	public void setBugnew1(int bugnew1) {
		this.bugnew1 = bugnew1;
	}

	
	
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public double getOpennumDI() {
		return opennumDI;
	}
	public void setOpennumDI(double opennumDI) {
		this.opennumDI = opennumDI;
	}
	public double getClosenumDI() {
		return closenumDI;
	}
	public void setClosenumDI(double closenumDI) {
		this.closenumDI = closenumDI;
	}
	public double getAllnumDI() {
		return allnumDI;
	}
	public void setAllnumDI(double allnumDI) {
		this.allnumDI = allnumDI;
	}
	public double getWeekopennumDI() {
		return weekopennumDI;
	}
	public void setWeekopennumDI(double weekopennumDI) {
		this.weekopennumDI = weekopennumDI;
	}
	public double getWeekclosenumDI() {
		return weekclosenumDI;
	}
	public void setWeekclosenumDI(double weekclosenumDI) {
		this.weekclosenumDI = weekclosenumDI;
	}
	public double getBug1allnumDI() {
		return bug1allnumDI;
	}
	public void setBug1allnumDI(double bug1allnumDI) {
		this.bug1allnumDI = bug1allnumDI;
	}
	public double getBug1closenumDI() {
		return bug1closenumDI;
	}
	public void setBug1closenumDI(double bug1closenumDI) {
		this.bug1closenumDI = bug1closenumDI;
	}
	public double getBug1opennumDI() {
		return bug1opennumDI;
	}
	public void setBug1opennumDI(double bug1opennumDI) {
		this.bug1opennumDI = bug1opennumDI;
	}
	public double getBug1weekopennumDI() {
		return bug1weekopennumDI;
	}
	public void setBug1weekopennumDI(double bug1weekopennumDI) {
		this.bug1weekopennumDI = bug1weekopennumDI;
	}
	public double getBug1weekclosenumDI() {
		return bug1weekclosenumDI;
	}
	public void setBug1weekclosenumDI(double bug1weekclosenumDI) {
		this.bug1weekclosenumDI = bug1weekclosenumDI;
	}
	public int getBug4allnumDI() {
		return bug4allnumDI;
	}
	public void setBug4allnumDI(int bug4allnumDI) {
		this.bug4allnumDI = bug4allnumDI;
	}
	public int getBug4closenumDI() {
		return bug4closenumDI;
	}
	public void setBug4closenumDI(int bug4closenumDI) {
		this.bug4closenumDI = bug4closenumDI;
	}
	public int getBug4opennumDI() {
		return bug4opennumDI;
	}
	public void setBug4opennumDI(int bug4opennumDI) {
		this.bug4opennumDI = bug4opennumDI;
	}
	public int getBug4weekopennumDI() {
		return bug4weekopennumDI;
	}
	public void setBug4weekopennumDI(int bug4weekopennumDI) {
		this.bug4weekopennumDI = bug4weekopennumDI;
	}
	public int getBug4weekclosenumDI() {
		return bug4weekclosenumDI;
	}
	public void setBug4weekclosenumDI(int bug4weekclosenumDI) {
		this.bug4weekclosenumDI = bug4weekclosenumDI;
	}
	public int getBug3allnumDI() {
		return bug3allnumDI;
	}
	public void setBug3allnumDI(int bug3allnumDI) {
		this.bug3allnumDI = bug3allnumDI;
	}
	public int getBug3closenumDI() {
		return bug3closenumDI;
	}
	public void setBug3closenumDI(int bug3closenumDI) {
		this.bug3closenumDI = bug3closenumDI;
	}
	public int getBug3opennumDI() {
		return bug3opennumDI;
	}
	public void setBug3opennumDI(int bug3opennumDI) {
		this.bug3opennumDI = bug3opennumDI;
	}
	public int getBug3weekopennumDI() {
		return bug3weekopennumDI;
	}
	public void setBug3weekopennumDI(int bug3weekopennumDI) {
		this.bug3weekopennumDI = bug3weekopennumDI;
	}
	public int getBug3weekclosenumDI() {
		return bug3weekclosenumDI;
	}
	public void setBug3weekclosenumDI(int bug3weekclosenumDI) {
		this.bug3weekclosenumDI = bug3weekclosenumDI;
	}
	public int getBug2allnumDI() {
		return bug2allnumDI;
	}
	public void setBug2allnumDI(int bug2allnumDI) {
		this.bug2allnumDI = bug2allnumDI;
	}
	public int getBug2closenumDI() {
		return bug2closenumDI;
	}
	public void setBug2closenumDI(int bug2closenumDI) {
		this.bug2closenumDI = bug2closenumDI;
	}
	public int getBug2opennumDI() {
		return bug2opennumDI;
	}
	public void setBug2opennumDI(int bug2opennumDI) {
		this.bug2opennumDI = bug2opennumDI;
	}
	public int getBug2weekopennumDI() {
		return bug2weekopennumDI;
	}
	public void setBug2weekopennumDI(int bug2weekopennumDI) {
		this.bug2weekopennumDI = bug2weekopennumDI;
	}
	public int getBug2weekclosenumDI() {
		return bug2weekclosenumDI;
	}
	public void setBug2weekclosenumDI(int bug2weekclosenumDI) {
		this.bug2weekclosenumDI = bug2weekclosenumDI;
	}
	
	public int getBug1allnum() {
		return bug1allnum;
	}
	public void setBug1allnum(int bug1allnum) {
		this.bug1allnum = bug1allnum;
	}
	public int getBug1closenum() {
		return bug1closenum;
	}
	public void setBug1closenum(int bug1closenum) {
		this.bug1closenum = bug1closenum;
	}
	public int getBug1opennum() {
		return bug1opennum;
	}
	public void setBug1opennum(int bug1opennum) {
		this.bug1opennum = bug1opennum;
	}
	public int getBug1weekopennum() {
		return bug1weekopennum;
	}
	public void setBug1weekopennum(int bug1weekopennum) {
		this.bug1weekopennum = bug1weekopennum;
	}
	public int getBug1weekclosenum() {
		return bug1weekclosenum;
	}
	public void setBug1weekclosenum(int bug1weekclosenum) {
		this.bug1weekclosenum = bug1weekclosenum;
	}
	public int getBug2allnum() {
		return bug2allnum;
	}
	public void setBug2allnum(int bug2allnum) {
		this.bug2allnum = bug2allnum;
	}
	public int getBug2closenum() {
		return bug2closenum;
	}
	public void setBug2closenum(int bug2closenum) {
		this.bug2closenum = bug2closenum;
	}
	public int getBug2opennum() {
		return bug2opennum;
	}
	public void setBug2opennum(int bug2opennum) {
		this.bug2opennum = bug2opennum;
	}
	public int getBug2weekopennum() {
		return bug2weekopennum;
	}
	public void setBug2weekopennum(int bug2weekopennum) {
		this.bug2weekopennum = bug2weekopennum;
	}
	public int getBug2weekclosenum() {
		return bug2weekclosenum;
	}
	public void setBug2weekclosenum(int bug2weekclosenum) {
		this.bug2weekclosenum = bug2weekclosenum;
	}
	public int getBug3allnum() {
		return bug3allnum;
	}
	public void setBug3allnum(int bug3allnum) {
		this.bug3allnum = bug3allnum;
	}
	public int getBug3closenum() {
		return bug3closenum;
	}
	public void setBug3closenum(int bug3closenum) {
		this.bug3closenum = bug3closenum;
	}
	public int getBug3opennum() {
		return bug3opennum;
	}
	public void setBug3opennum(int bug3opennum) {
		this.bug3opennum = bug3opennum;
	}
	public int getBug3weekopennum() {
		return bug3weekopennum;
	}
	public void setBug3weekopennum(int bug3weekopennum) {
		this.bug3weekopennum = bug3weekopennum;
	}
	public int getBug3weekclosenum() {
		return bug3weekclosenum;
	}
	public void setBug3weekclosenum(int bug3weekclosenum) {
		this.bug3weekclosenum = bug3weekclosenum;
	}
	public int getBug4weekclosenum() {
		return bug4weekclosenum;
	}
	public void setBug4weekclosenum(int bug4weekclosenum) {
		this.bug4weekclosenum = bug4weekclosenum;
	}
	public int getBug4weekopennum() {
		return bug4weekopennum;
	}
	public void setBug4weekopennum(int bug4weekopennum) {
		this.bug4weekopennum = bug4weekopennum;
	}
	public int getBug4opennum() {
		return bug4opennum;
	}
	public void setBug4opennum(int bug4opennum) {
		this.bug4opennum = bug4opennum;
	}
	public int getBug4closenum() {
		return bug4closenum;
	}
	public void setBug4closenum(int bug4closenum) {
		this.bug4closenum = bug4closenum;
	}
	public int getBug4allnum() {
		return bug4allnum;
	}
	public void setBug4allnum(int bug4allnum) {
		this.bug4allnum = bug4allnum;
	}
	public int getWeekclosenum() {
		return weekclosenum;
	}
	public void setWeekclosenum(int weekclosenum) {
		this.weekclosenum = weekclosenum;
	}
	public int getWeekopennum() {
		return weekopennum;
	}
	public void setWeekopennum(int weekopennum) {
		this.weekopennum = weekopennum;
	}
	public int getAllnum() {
		return allnum;
	}
	public void setAllnum(int allnum) {
		this.allnum = allnum;
	}
	public int getClosenum() {
		return closenum;
	}
	public void setClosenum(int closenum) {
		this.closenum = closenum;
	}
	public int getOpennum() {
		return opennum;
	}
	public void setOpennum(int opennum) {
		this.opennum = opennum;
	}
	public static String jump() throws SQLException {
		list2=new ArrayList<Assign>();
		name=(String)excel.method.Method.getsesslist().get(0);
		date=(String)excel.method.Method.getsesslist().get(1);
		opennum=JDBCshow.checkopennum(name,date);
		closenum=JDBCshow.checkclosenum(name,date);
		allnum=JDBCshow.checkallnum(name, date);
		weekopennum=JDBCshow.checkweekopennum(name, date);
		weekclosenum=JDBCshow.checkweekclosenum(name, date);
		
		
		bug4allnum=JDBCshow.checkbug4allnum(name, date);
		bug4closenum=JDBCshow.checkbug4closenum(name, date);
		bug4opennum=JDBCshow.checkbug4opennum(name, date);
		bug4weekopennum=JDBCshow.checkbug4weekopennum(name, date);
		bug4weekclosenum=JDBCshow.checkbug4weekclosenum(name, date);
		bug4allnumDI=bug4allnum*10;
		bug4closenumDI=bug4closenum*10;
		bug4opennumDI=bug4opennum*10;
		bug4weekopennumDI=bug4weekopennum*10;
		bug4weekclosenumDI=bug4weekclosenum*10;
		
		
		
		
		bug3allnum=JDBCshow.checkbug3allnum(name, date);
		bug3closenum=JDBCshow.checkbug3closenum(name, date);
		bug3opennum=JDBCshow.checkbug3opennum(name, date);
		bug3weekopennum=JDBCshow.checkbug3weekopennum(name, date);
		bug3weekclosenum=JDBCshow.checkbug3weekclosenum(name, date);
		bug3allnumDI=bug3allnum*5;
		bug3closenumDI=bug3closenum*5;
		bug3opennumDI=bug3opennum*5;
		bug3weekopennumDI=bug3weekopennum*5;
		bug3weekclosenumDI=bug3weekclosenum*5;
		
		
		
		
		bug2allnum=JDBCshow.checkbug2allnum(name, date);
		bug2closenum=JDBCshow.checkbug2closenum(name, date);
		bug2opennum=JDBCshow.checkbug2opennum(name, date);
		bug2weekopennum=JDBCshow.checkbug2weekopennum(name, date);
		bug2weekclosenum=JDBCshow.checkbug2weekclosenum(name, date);
		bug2allnumDI=bug2allnum;
		bug2closenumDI=bug2closenum;
		bug2opennumDI=bug2opennum;
		bug2weekopennumDI=bug2weekopennum;
		bug2weekclosenumDI=bug2weekclosenum;		
		
		
		bug1allnum=JDBCshow.checkbug1allnum(name, date);
		bug1closenum=JDBCshow.checkbug1closenum(name, date);
		bug1opennum=JDBCshow.checkbug1opennum(name, date);
		bug1weekopennum=JDBCshow.checkbug1weekopennum(name, date);
		bug1weekclosenum=JDBCshow.checkbug1weekclosenum(name, date);
		
		bug1allnumDI=Dou((double)bug1allnum * 0.1);
		bug1closenumDI=Dou((double)bug1closenum*0.1);
		bug1opennumDI=Dou((double)bug1opennum*0.1);
		bug1weekopennumDI=Dou((double)bug1weekopennum*0.1);
		bug1weekclosenumDI=Dou((double)bug1weekclosenum*0.1);
		
		opennumDI=bug1opennumDI+(double)bug2opennumDI+(double)bug3opennumDI+(double)bug4opennumDI;
		weekclosenumDI=bug1weekclosenumDI+(double)bug2weekclosenumDI+(double)bug3weekclosenumDI+(double)bug4weekclosenumDI;
		weekopennumDI=bug1weekopennumDI+(double)bug2weekopennumDI+(double)bug3weekopennumDI+(double)bug4weekopennumDI;
		closenumDI=bug1closenumDI+(double)bug2closenumDI+(double)bug3closenumDI+(double)bug4closenumDI;
		allnumDI=bug1allnumDI+(double)bug2allnumDI+(double)bug3allnumDI+(double)bug4allnumDI;
		project=JDBCshow.checkproject(name, date);
		System.out.println(bug1weekclosenum+"   "+(double)bug2weekclosenumDI+"   "+(double)bug3weekclosenumDI+"   "+(double)bug4weekclosenumDI);
		
        bugnew1=JDBClife.checknew1(name, date);
        bugnew2=JDBClife.checknew2(name, date);
        bugnew3=JDBClife.checknew3(name, date);
        bugnew4=JDBClife.checknew4(name, date);
       // bugnewnull=JDBClife.checknewnull(name, date);
        
        bugfix1=JDBClife.checkFix1(name, date);
        bugfix2=JDBClife.checkFix2(name, date);
        bugfix3=JDBClife.checkFix3(name, date);
        bugfix4=JDBClife.checkFix4(name, date);
       // bugfixnull=JDBClife.checkFixnull(name, date);

        bugold1=JDBClife.checkold1(name, date);
        bugold2=JDBClife.checkold2(name, date);
        bugold3=JDBClife.checkold3(name, date);
        bugold4=JDBClife.checkold4(name, date);
        
        bugother1=JDBClife.checkOther1(name, date);
        bugother2=JDBClife.checkOther2(name, date);
        bugother3=JDBClife.checkOther3(name, date);
        bugother4=JDBClife.checkOther4(name, date);
        
        bug1all=bugnew1+bugfix1+bugold1+bugother1;
        bug2all=bugnew2+bugfix2+bugold2+bugother2;
        bug3all=bugnew3+bugfix3+bugold3+bugother3;
        bug4all=bugnew4+bugfix4+bugold4+bugother4;
      
        list2=JDBCperson.checkopennum(name, date);
        System.out.println(Method.getsesslist().get(0).toString()+"  "+Method.getsesslist().get(1).toString());
        List list = new ArrayList();
		list.add(name);
		list.add(date);
        Method.setsesslist(list);
		return "jump";
	}
	
	public static double Dou(double d){
		java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00");
		String str=df.format(d);
		double dou =Double.parseDouble(str);
		return dou;
	}
}
