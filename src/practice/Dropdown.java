package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		// Step-5 use of select class
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select sel = new Select(dropdown);

		sel.selectByVisibleText("Option3");
		sel.selectByIndex(0);

		List<WebElement> option = sel.getOptions();

		for (WebElement el1 : option) {

			System.out.println(el1.getText());
		}

		WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkBox.click();

		Thread.sleep(3000);
		driver.close();
	}

}
