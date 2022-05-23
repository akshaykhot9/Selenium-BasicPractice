package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
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
		js.executeScript("window.scrollBy(0,600)");

		WebElement Name = driver.findElement(By.xpath("//input[@name='enter-name']"));
		Name.sendKeys("AKSHAY");

		WebElement AlertBtn = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		AlertBtn.click();

		Alert al = driver.switchTo().alert();
		String message = al.getText();
		al.accept();
		System.out.println(message);

		Thread.sleep(4000);
		driver.close();

	}

}
