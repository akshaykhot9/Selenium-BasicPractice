package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir") + "//DataStore.xlsx";

		File file = new File(path);

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		String values = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(values);
		wb.close();

	}

}
