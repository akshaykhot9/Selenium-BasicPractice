package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifySignUp {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spotify.com/in-en/signup");

		driver.manage().window().maximize();

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("blackdevil404@gmail.com");
		Thread.sleep(4000);

		WebElement ConfEmail = driver.findElement(By.xpath("//input[@id='confirm']"));
		ConfEmail.sendKeys("blackdevil404@gmail.com");
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

		WebElement Pass = driver.findElement(By.xpath("//input[@id='password']"));
		Pass.sendKeys("Blackdevil@404");
		Thread.sleep(4000);

		WebElement ProfileName = driver.findElement(By.xpath("//input[@id='displayname']"));
		ProfileName.sendKeys("Black Devil");
		Thread.sleep(4000);

		WebElement Year = driver.findElement(By.xpath("//input[@id='year']"));
		Year.sendKeys("1995");

		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Month.sendKeys("February");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)");

		WebElement Date = driver.findElement(By.xpath("//input[@id='day']"));
		Date.sendKeys("09");

		WebElement Gender = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div/form/fieldset/div/div[1]/label/span[1]"));
		Gender.click();
		Thread.sleep(4000);

		WebElement CheckBox = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div/form/div[6]/div/label/span[1]"));
		CheckBox.click();
		Thread.sleep(4000);

		// WebElement CheckBox1 =
		// driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div/form/div[7]/div/label/span[1]"));
		// CheckBox1.click();
		// Thread.sleep(4000);

		// WebElement CheckBox2 =
		// driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
		// CheckBox2.click();
		// Thread.sleep(4000);

		Thread.sleep(4000);
		driver.close();

	}
}
