package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMDemo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement LoginId = driver.findElement(By.cssSelector("#txtUsername"));
		LoginId.clear();
		LoginId.sendKeys("Admin");
		Thread.sleep(4000);

		WebElement Pass = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		Pass.clear();
		Pass.sendKeys("admin123");
		Thread.sleep(4000);

		WebElement Button = driver.findElement(By.id("btnLogin"));
		Button.click();

		// WebElement Button = driver.findElement(By.id("btnLogin"));
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("argument[0].click();", Button);

		Thread.sleep(4000);
		driver.close();
	}

}
