package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Bank {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");

		// Step-1

		WebDriver driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();

		// step-3
		driver.get("https://www.demo.guru99.com/V4/");

		WebElement userid = driver.findElement(By.xpath("//input[@name='uid']"));
		userid.sendKeys("mngr393600");
		Thread.sleep(4000);

		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("qepudap");
		Thread.sleep(4000);

		WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		login.click();

		Thread.sleep(8000);
		driver.close();

	}
}
