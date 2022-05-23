package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
	public static void main(String[] args) throws InterruptedException {
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

		// step-6 -Action frame element
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();

		// step-7-select month
		while (true) {

			String monthTitle = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			System.out.println(monthTitle);

			if (!monthTitle.equalsIgnoreCase("May 2020")) {

				driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
			} else {

				break;
			}

		}

		int no = 17;
		// step-8 select date
		driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='" + no + "']"))
				.click();

		Thread.sleep(8000);
		driver.close();

	}

}
