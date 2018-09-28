package newdd;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceld {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public exceld() throws Exception {
		String src = ".//file/ENCORE_SCENARIO_HOSPITAL_RANKING_MEDISOLVE_NONPOC.xlsx";
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
	}
	String getdata(int SheetNo, int rownum, int cellnum) {
		sheet = wb.getSheetAt(SheetNo);
		String data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		System.out.println("++++"+data);
		return data;
	}
	public int getrowcount(int sheetno) {
		int row = wb.getSheetAt(sheetno).getLastRowNum();
		row = row + 1;
		return row;
	}
	public int getcolcount(int sheetno) {
		int col = wb.getSheetAt(sheetno).getRow(0).getLastCellNum();
		return col;
	}
}