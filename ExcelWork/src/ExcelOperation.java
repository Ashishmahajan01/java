import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {

	public static void main(String[] args) {
		System.out.println(ReadExcel("Sheet1", 1, 0));
		WriteExcel("Sheet1", 1, 2, "Select * from ashish");
	}

	public static String ReadExcel(String sheetName, int rowNum, int colNum) {
		String data = "";
		try {
			FileInputStream fis = new FileInputStream("D:\\Book1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(colNum);
			data = c.getStringCellValue();

		} catch (Exception e) {
			System.out.println("Read Excel Catch block");
			e.printStackTrace();
		}

		return data;
	}

	public static void WriteExcel(String sheetName, int rowNum, int colNum, String modifdata) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Book1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.createCell(colNum);
			c.setCellValue(modifdata);
			FileOutputStream fio = new FileOutputStream("D:\\Book1.xlsx");
			wb.write(fio);
			System.out.println("Success");

		} catch (Exception e) {
			System.out.println("Write Excel Catch block");
			e.printStackTrace();
		}

	}

}
