package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoSites {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://raygun.com/blog/oop-concepts-java/");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		driver.get("https://www.guru99.com/java-oops-concept.html");
		Thread.sleep(4000);
		driver.close();

	}

}
