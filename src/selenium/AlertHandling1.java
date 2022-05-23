package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");

		WebElement AlertBtn = driver.findElement(By.id("alertbtn"));
		AlertBtn.click();
		Thread.sleep(4000);

		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(4000);

		WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));
		Name.sendKeys("AKSHAY");
		Thread.sleep(4000);

		WebElement ConfirmBtn = driver.findElement(By.id("confirmbtn"));
		ConfirmBtn.click();
		Thread.sleep(4000);

		Alert al1 = driver.switchTo().alert();
		String message = al1.getText();

		System.out.println(message);

		if (message.contains("Akshay")) {
			System.out.println(message);
			System.out.println("Test Case Passed");
			al1.accept();
		}

		else {
			System.out.println("Test Case Failed");
			al.dismiss();
		}

		Thread.sleep(8000);
		driver.close();

	}
}
