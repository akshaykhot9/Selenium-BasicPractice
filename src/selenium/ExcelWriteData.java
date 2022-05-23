package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelWriteData {
	public static int rowValue = 3;

	public static void writeData(int r, int c, String s) throws IOException {
		String path = System.getProperty("user.dir") + "\\DataStore.xlsx";

		File file = new File(path);

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		sheet.createRow(r).createCell(c).setCellValue(s);

		FileOutputStream fos = new FileOutputStream(file);

		wb.write(fos);

		wb.close();

	}

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");

		// Step=1
		WebDriver driver = new ChromeDriver();

		// Step=2
		driver.manage().window().maximize();

		// Step-3
		driver.get("https://vctcpune.com/selenium/practice.html");

		// Step-4
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

		// step-5
		List<WebElement> data = driver.findElements(By.xpath("//*[@id='product']/tbody/tr/td[3]"));
		int col = 0;
		for (WebElement ele : data) {

			System.out.println(ele.getText());
			writeData(rowValue, col, ele.getText());
			rowValue++;
			Thread.sleep(2000);

		}
	}

}
