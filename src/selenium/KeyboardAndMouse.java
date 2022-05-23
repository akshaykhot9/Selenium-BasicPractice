package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		// Step-1
		WebDriver driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();

		// step-3
		driver.get("http://vctcpune.com/selenium/practice.html");

		// step=3a
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,300)");

		WebElement d = driver.findElement(By.id("dropdown-class-example"));
		d.click();

		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN);

	}

}
