package common;
public class Common {
	static String name;
	public static String Name() {
		String name=excel.method.Method.getsesslist().get(2).toString();
		System.out.println("name=="+name);
		return name;
	}
    public static final String OFFICE_EXCEL_2003_POSTFIX = "xls";
    public static final String OFFICE_EXCEL_2010_POSTFIX = "xlsx";

    public static final String EMPTY = "";
    public static final String POINT = ".";
    public static final String LIB_PATH = "G:/java/j2ee/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Excel2010/upload";
    public static final String STUDENT_INFO_XLS_PATH = LIB_PATH + "/"+Name();
    public static final String STUDENT_INFO_XLSX_PATH = LIB_PATH + "/"+Name();
    //public static final String STUDENT_INFO_XLSX_export_PATH = LIB_PATH + "/export" + POINT + OFFICE_EXCEL_2010_POSTFIX;
    public static String STUDENT_INFO_XLSX_export_PATH =  LIB_PATH+ "/"+Name();
    public static final String NOT_EXCEL_FILE = " : Not the Excel file!";
    public static final String PROCESSING = "Processing...";
    
    
}
