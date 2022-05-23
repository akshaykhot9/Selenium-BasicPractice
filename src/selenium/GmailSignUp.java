package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.manage().window().maximize();
		driver.getCurrentUrl();
		driver.manage().deleteAllCookies();

		WebElement FirstName = driver.findElement(By.id("firstName"));
		FirstName.sendKeys("Akshay");
		Thread.sleep(4000);

		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		LastName.sendKeys("Khot");
		Thread.sleep(4000);

		WebElement UserName = driver.findElement(By.xpath("//input[@id='username']"));
		UserName.sendKeys("blackdevil996093");
		Thread.sleep(4000);

		WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
		Pass.sendKeys("aksh@12345");
		Thread.sleep(4000);

		WebElement ConfPass = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		ConfPass.sendKeys("aksh@12345");
		Thread.sleep(4000);

		WebElement ShowPass = driver.findElement(By.xpath("//input[@type='checkbox']"));
		ShowPass.click();
		Thread.sleep(4000);

		WebElement NextPage = driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/div[3]"));
		NextPage.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", NextPage);

		System.out.println(driver.getTitle());

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.close();

	}

}
