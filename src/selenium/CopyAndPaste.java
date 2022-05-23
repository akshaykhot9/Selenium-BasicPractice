package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/text-box");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(4000);

		WebElement FullName = driver.findElement(By.id("userName"));
		FullName.sendKeys("Mr. AKSHAY SUBHASH KHOT");
		Thread.sleep(4000);

		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("akshaykhot123456@gmail.com");
		Thread.sleep(4000);

		WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		currentAddress.sendKeys("Amrutvel Housing Society,F.L.NO.500,Warje,Pune-411044");
		Thread.sleep(4000);

		// create the object of action class

		Actions act = new Actions(driver);

		// Select the current address using CTRL+A

		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();

		// copy the current address using CTRL+C

		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();

		// paste the current address to permanent address

		WebElement permenantAddress = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
		// act.moveToElement(permenantAddress).click();
		permenantAddress.click();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(4000);

		Thread.sleep(8000);
		driver.close();

	}

}
