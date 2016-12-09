package excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import common.Common;
import excel.util.Util;
import excel.vo.Student;
import excel.vo.export;

/**
 * @author Hongten
 * @created 2014-5-20
 */
public class ReadExcel {

	/**
	 * read the Excel file
	 * 
	 * @param path
	 *            the path of the Excel file
	 * @return
	 * @throws IOException
	 *             判断是否是excel
	 * @throws ParseException 
	 */
	public List<Student> readExcel(String path) throws IOException, ParseException {
		if (path == null || Common.EMPTY.equals(path)) {
			return null;
		} else {
			String postfix = Util.getPostfix(path);// 获取后缀
			if (!Common.EMPTY.equals(postfix)) {
				if (Common.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
					return readXls(path);
				} else if (Common.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
					return readXlsx(path);
				}
			} else {
				System.out.println(path + Common.NOT_EXCEL_FILE);
			}
		}
		return null;
	}
	public List<export> readExcelexport(String path) throws IOException, ParseException {
		if (path == null || Common.EMPTY.equals(path)) {
			return null;
		} else {
			String postfix = Util.getPostfix(path);// 获取后缀
			if (!Common.EMPTY.equals(postfix)) {
				if (Common.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {//没有实现
					return readexport(path);//没有实现
				} else if (Common.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
					return readexport(path);
				}
			} else {
				System.out.println(path + Common.NOT_EXCEL_FILE);
			}
		}
		return null;
	}
	/**
	 * Read the Excel 2010
	 * 
	 * @param path
	 *            the path of the excel file
	 * @return
	 * @throws IOException
	 */
	public List<Student> readXlsx(String path) throws IOException {
		System.out.println(Common.PROCESSING + path);
		InputStream is = new FileInputStream(path);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
		Student student = null;
		List<Student> list = new ArrayList<Student>();
		// Read the Sheet
		for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
			XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
			if (xssfSheet == null) {
				continue;
			}
			// Read the Row
			for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
				XSSFRow xssfRow = xssfSheet.getRow(rowNum);
				if (xssfRow != null) {
					student = new Student();
					XSSFCell no = xssfRow.getCell(0);
					XSSFCell name = xssfRow.getCell(1);
					XSSFCell age = xssfRow.getCell(2);
					XSSFCell score = xssfRow.getCell(3);
					student.setNo(getValue(no));
					student.setName(getValue(name));
					student.setAge(getValue(age));
					student.setScore(Float.valueOf(getValue(score)));
					list.add(student);
				}
			}
		}
		return list;
	}

	/**
	 * Read the Excel 2003-2007
	 * 
	 * @param path
	 *            the path of the Excel
	 * @return
	 * @throws IOException
	 * @throws ParseException 
	 */
	public List<Student> readXls(String path) throws IOException, ParseException {
		System.out.println(Common.PROCESSING + path);
		InputStream is = new FileInputStream(path);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);// 创建新的excel
		Student student = null;
		List<Student> list = new ArrayList<Student>();
		// Read the Sheet
		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			System.out
					.println("sheet数为：   " + hssfWorkbook.getNumberOfSheets());
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);// 创建sheet
			if (hssfSheet == null) {
				continue;
			}
			// Read the Row
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				System.out.println("行数为：   " + hssfSheet.getLastRowNum());// 行数从0开始计算
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				// System.out.println("第一行为：  "+hssfSheet.getRow(0).getFirstCellNum());
				if (hssfRow != null) {
					student = new Student();
					HSSFCell no = hssfRow.getCell(0);
					HSSFCell name = hssfRow.getCell(1);
					HSSFCell age = hssfRow.getCell(2);
					HSSFCell score = hssfRow.getCell(3);
					//System.out.println("age.getCellType:  " + Strtodate(getdata(age)));
					student.setNo(getValue(no));
					student.setName(getValue(name));
					student.setAge(getValue(age));
					student.setScore(Float.valueOf(getValue(score)));
					list.add(student);
				}
			}
		}
		return list;
	}
	/**
	 * Read the Excel 2010
	 * 
	 * @param path
	 *            the path of the excel file
	 * @return
	 * @throws IOException
	 */
	public List<export> readexport(String path) throws IOException {
		System.out.println(Common.PROCESSING + "-_-"+path);
		InputStream is = new FileInputStream(path);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
		System.out.println("List<export> list");
		export ex = null;
		List<export> list = new ArrayList<export>();
		// Read the Sheet
		System.out.println("List<export> list"+list);
		for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
			XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
			if (xssfSheet == null) {
				continue;
			}
			// Read the Row
			System.out.println("ceshi---------");
			for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
				XSSFRow xssfRow = xssfSheet.getRow(rowNum);
				if (xssfRow != null) {
					ex = new export();
					XSSFCell questionNum = xssfRow.getCell(0);
					XSSFCell state = xssfRow.getCell(1);
					XSSFCell project = xssfRow.getCell(2);
					XSSFCell track = xssfRow.getCell(3);
					XSSFCell priority = xssfRow.getCell(4);
					XSSFCell theme = xssfRow.getCell(5);
					XSSFCell assign = xssfRow.getCell(6);
					//System.out.println(getValue(assign)+"....."+String.valueOf(xssfRow.getCell(7)));
					XSSFCell category = null;
					category=xssfRow.getCell(7);
					XSSFCell target = xssfRow.getCell(8);
					XSSFCell author = xssfRow.getCell(9);
					XSSFCell start = xssfRow.getCell(10);
					XSSFCell findate = xssfRow.getCell(11);
					XSSFCell complete = xssfRow.getCell(12);
					XSSFCell expected = xssfRow.getCell(13);
					XSSFCell paretask = xssfRow.getCell(14);
					XSSFCell creat = xssfRow.getCell(15);
					XSSFCell update = xssfRow.getCell(16);
					XSSFCell testnum = xssfRow.getCell(17);
					XSSFCell originalreq = xssfRow.getCell(18);
					XSSFCell requdate = xssfRow.getCell(19);
					XSSFCell area = xssfRow.getCell(20);
					XSSFCell softver = xssfRow.getCell(21);
					XSSFCell hardver = xssfRow.getCell(22);					
					XSSFCell lifeform = xssfRow.getCell(23);
					XSSFCell probability = xssfRow.getCell(24);
					XSSFCell probabtype = xssfRow.getCell(25);
					XSSFCell bugbar = xssfRow.getCell(26);
					XSSFCell result = xssfRow.getCell(27);
					XSSFCell reappear = xssfRow.getCell(28);
					XSSFCell recover = xssfRow.getCell(29);
					XSSFCell solution = xssfRow.getCell(30);
					XSSFCell cause = xssfRow.getCell(31);
					XSSFCell solvemed = xssfRow.getCell(32);
					XSSFCell model = xssfRow.getCell(33);
					XSSFCell stage = xssfRow.getCell(34);
					XSSFCell prosour = xssfRow.getCell(35);
					XSSFCell testsug = xssfRow.getCell(36);
					XSSFCell funmod = xssfRow.getCell(37);
					XSSFCell describe = xssfRow.getCell(38);
					
					ex.setQid(rowNum);
					ex.setQuestionNum(getValue(questionNum).substring(0, getValue(questionNum).indexOf(".")));
					ex.setState(getValue(state));
					ex.setProject(getValue(project));
					ex.setTrack(getValue(track));
					ex.setPriority(getValue(priority));
					ex.setTheme(getValue(theme));
					ex.setAssign(getValue(assign));
					ex.setCategory(getValue(category));
					ex.setTarget(getValue(target));
					ex.setAuthor(getValue(author));
					ex.setStart(getdataX(start));
					ex.setFindate(getdataX(findate));
					ex.setComplete(getValue(complete).substring(0, getValue(complete).indexOf(".")));
					ex.setExpected(getValue(expected));
					ex.setParetask(getValue(paretask));
					ex.setCreat(excel.method.Method.getStringDateShort(getValue(creat).substring(0,11)));
					ex.setUpdate(excel.method.Method.getStringDateShort(getValue(update).substring(0, 11)));
					ex.setTestnum(getValue(testnum));
					ex.setOriginalreq(getValue(originalreq));
					ex.setRequdate(getdataX(requdate));
					ex.setArea(getValue(area));
					ex.setSoftver(getValue(softver));
					ex.setHardver(getValue(hardver));					
					ex.setLifeform(getValue(lifeform));
					ex.setProbability(getValue(probability));
					ex.setProbabtype(getValue(probabtype));
					ex.setBugbar(getValue(bugbar));
					ex.setResult(getValue(result));
					ex.setReappear(getValue(reappear));
					ex.setRecover(getValue(recover));
					/*ex.setSolution(getValue(solution));
					ex.setCause(getValue(cause));
					ex.setSolvemed(getValue(solvemed));*/
					ex.setSolution("solution");
					ex.setCause("getValue(cause)");
					ex.setSolvemed("getValue(solvemed)");
					ex.setModel(getValue(model));
					ex.setStage(getValue(stage));
					ex.setProsour(getValue(prosour));
					ex.setTestsug(getValue(testsug));
					ex.setFunmod(getValue(funmod));
					//ex.setDescribe(getValue(describe));
					ex.setDescribe("getValue(describe)");
					
					list.add(ex);
				}
			}
		}
		return list;
	}
	@SuppressWarnings("static-access")
	private String getValue(XSSFCell xssfRow) {
		//System.out.println(xssfRow.getCellType()+"  :  "+xssfRow);
		if(xssfRow != null){
		if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
			return String.valueOf(xssfRow.getBooleanCellValue());
		} else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
			return String.valueOf(xssfRow.getNumericCellValue());
		} else {
			return String.valueOf(xssfRow.getStringCellValue());
		}
		}else {
			return " ";
		}
	}

	@SuppressWarnings("static-access")
	private String getValue(HSSFCell hssfCell) {
		if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(hssfCell.getBooleanCellValue());
		} else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
			return String.valueOf(hssfCell.getNumericCellValue());
		} else {
			return String.valueOf(hssfCell.getStringCellValue());
		}
	}

	private static String getdataH(HSSFCell hassCell) {

		String date = null;
		if (0 == hassCell.getCellType()) {

			// 判断是否为日期类型

			if (HSSFDateUtil.isCellDateFormatted(hassCell)) {
				// 用于转化为日期格式

				Date d = hassCell.getDateCellValue();

				DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");

				date = formater.format(d);

			} else {

				// 用于格式化数字，只保留数字的整数部分

				DecimalFormat df = new DecimalFormat("########");

				date = df.format(hassCell.getNumericCellValue());

			}
		}
		return date;
	}
	private static String getdataX(XSSFCell xssfcell) {

		String date = null;
		if(xssfcell != null){
		if (0 == xssfcell.getCellType()) {

			// 判断是否为日期类型

			if (HSSFDateUtil.isCellDateFormatted(xssfcell)) {
				// 用于转化为日期格式

				Date d = xssfcell.getDateCellValue();

				DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");

				date = formater.format(d);

			} else {

				// 用于格式化数字，只保留数字的整数部分

				DecimalFormat df = new DecimalFormat("########");

				date = df.format(xssfcell.getNumericCellValue());

			}
		}}
		return date;
	}
	private static Date Strtodate(String str) throws ParseException {
		//SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sim.parse(str);
		return d;

	}
}
