package excel.method;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class Method {
	/** 
     * ������������֮���������� 
     * @param smdate ��С��ʱ��
     * @param bdate  �ϴ��ʱ��
     * @return �������
	 * @throws ParseException 
     */  
    public static int daysBetween(Date smdate,Date bdate) throws ParseException  
    {  
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    	smdate=sdf.parse(sdf.format(smdate));
    	bdate=sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();  
        cal.setTime(smdate);  
        long time1 = cal.getTimeInMillis();               
        cal.setTime(bdate);  
        long time2 = cal.getTimeInMillis();       
        long between_days=(time2-time1)/(1000*3600*24);
          
       return Integer.parseInt(String.valueOf(between_days));         
    }  
    /**
	*�ַ��������ڸ�ʽ�ļ���
	*/
	    public static int daysBetween(String smdate,String bdate) throws ParseException{
	    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	        Calendar cal = Calendar.getInstance();  
	        cal.setTime(sdf.parse(smdate));  
	        long time1 = cal.getTimeInMillis();               
	        cal.setTime(sdf.parse(bdate));  
	        long time2 = cal.getTimeInMillis();       
	        /*if (time1>time2) {
				return -1;
			}*/
	        long between_days=(time2-time1)/(1000*3600*24);
	          
	       return Integer.parseInt(String.valueOf(between_days));   
	    }
    public static String getStringDateShort(String Bigdata) {

   	 Bigdata=Bigdata.replaceAll("��", "-");
   	 Bigdata=Bigdata.replaceAll("��", "-");
   	 Bigdata=Bigdata.replaceAll("��", "");
   	 //System.out.println(Bigdata);
   	 return Bigdata;
   	
   	}
    public static void setsess(String name1) {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("name", name1);
		System.out.println("�ղ�д��session��ֵΪ��" + name1);
	}

	public static String getsess() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String b = (String) session.getAttribute("name");
		System.out.println("�Ѹ�ֵ��bΪ��" + b);
		return b;
	}
	public static void setsesslist(List list) {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("name", list);
		System.out.println("�ղ�д��session��ֵΪ��" + list);
	}

	public static List getsesslist() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		List listsess1 = new ArrayList<>(); 
		listsess1 =(List) session.getAttribute("name");
		System.out.println("�Ѹ�ֵ��bΪ��" + listsess1.get(0)+" "+listsess1.get(1));
		return listsess1;
	}
	
	public static String nowdate(){
		Date dt=new Date();//�������Ҫ��ʽ,��ֱ����dt,dt���ǵ�ǰϵͳʱ��
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//������ʾ��ʽ
		String nowTime="";
		nowTime= df.format(dt);//��DateFormat��format()������dt�л�ȡ����yyyy/MM/dd HH:mm:ss��ʽ��ʾ
		return nowTime;
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(nowdate());
	}
}
