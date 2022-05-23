package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/");

		driver.manage().window().maximize();

		String actual = driver.getTitle();
		String expected = "Linked In";

		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getPageSource());

		Thread.sleep(8000);

		driver.close();

	}
}
