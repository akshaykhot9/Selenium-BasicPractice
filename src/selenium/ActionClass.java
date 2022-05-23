package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");

		// Step-1
		WebDriver driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();

		// step-3
		driver.get("https://vctcpune.com/selenium/practice.html");

		// step=3a
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		// js.executeScript("window.open()");

		// step-4
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();

		// step-5 action class
		Actions act = new Actions(driver);

		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_UP).build().perform();

	}

}
