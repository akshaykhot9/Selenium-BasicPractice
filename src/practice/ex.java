package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());

		WebElement FName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FName.sendKeys("AKSHAY");
		Thread.sleep(8000);

		WebElement LName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LName.sendKeys("KHOT");
		Thread.sleep(8000);
		

		WebElement Email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.sendKeys("AKSHAYKHOT@GMAIL.COM");
		Thread.sleep(8000);

		WebElement LEmail = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		LEmail.sendKeys("AK!@1234567");
		Thread.sleep(8000);

		driver.close();
		Thread.sleep(4000);
		

	}

}
