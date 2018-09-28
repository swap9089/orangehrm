package datdriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class datadriven {
	@DataProvider(name = "data")
	public static String[][] driven() throws Exception {

		File src = new File("./file/ENCORE_SCENARIO_HOSPITAL_RANKING_MEDISOLVE_NONPOC.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xs = new XSSFWorkbook(fis);
		XSSFSheet sheet = xs.getSheetAt(0);
		int row = sheet.getLastRowNum();
		int col=sheet.getRow(row).getLastCellNum();

		for (int i = 0; i < row; i++) {
			String st1="";
			String st2="";
			for (int j = 0; j < col; j++) {
				st1=		sheet.getRow(i).getCell(j).getStringCellValue();
				  st2 =sheet.getRow(i).getCell(j).getStringCellValue();

			}
			return new String[][] {{st1,st2 } } ;

		}
		xs.close();

		
return driven();
	}

}
