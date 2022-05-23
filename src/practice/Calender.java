package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		// Step-1
		WebDriver driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();

		// step-3
		driver.get("https://jqueryui.com/datepicker/");

		// step=3a
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,300)");

		// step-4
		WebElement frame1 = driver.findElement(By.xpath("//*[@class='demo-frame']"));

		// step-5 switch to frame
		driver.switchTo().frame(frame1);

	}
}
