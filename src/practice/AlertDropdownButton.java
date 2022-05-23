package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertDropdownButton {
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
		js.executeScript("window.scrollBy(0,300)");

		WebElement radio = driver.findElement(By.xpath("//input[@value='Radio1']"));
		radio.click();
		Thread.sleep(4000);

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Option2");
		Thread.sleep(4000);

		WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		checkBox.click();
		Thread.sleep(4000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)");
		Thread.sleep(4000);

		WebElement Name = driver.findElement(By.xpath("//input[@name='enter-name']"));
		Name.sendKeys("AKSHAY");
		Thread.sleep(4000);

		WebElement AlertBtn = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		AlertBtn.click();
		Thread.sleep(4000);

		Alert al = driver.switchTo().alert();
		String message = al.getText();
		al.accept();
		Thread.sleep(4000);
		System.out.println(message);

		Thread.sleep(4000);
		driver.close();

	}

}
