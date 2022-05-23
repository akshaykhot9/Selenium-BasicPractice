package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver driver;

	@BeforeClass
	public void testCase1() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		// Step-1
		driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();

		// step-3
		driver.get("https://demoqa.com/buttons");

	}

	@Test
	public void testCase() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "ToolsQA");

	}
}
