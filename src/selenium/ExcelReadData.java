package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReadData {
	public static String ReadData(int r, int c) throws IOException {

		String path = System.getProperty("user.dir") + "\\DataStoreLogin.xlsx";
		File file = new File(path);

		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String values = sheet.getRow(r).getCell(c).getStringCellValue();
		System.out.println(values);
		wb.close();

		return values;

	}

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// step-4-enter the user name
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(ReadData(0, 0));
		Thread.sleep(2000);

		// step-5 enter password
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(ReadData(0, 1));
		Thread.sleep(2000);

		// step-6 login button click
		WebElement button = driver.findElement(By.id("btnLogin"));
		button.click();
		Thread.sleep(3000);

		// step-7 get title of home page
		System.out.println(driver.getTitle());

		// step-8 log out
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='branding']/div[9]/ul/li[3]/a")).click();

		Thread.sleep(8000);

		driver.close();

	}
}
