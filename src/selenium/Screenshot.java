package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");

		// Step-1

		WebDriver driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();

		// step-3
		driver.get("https://vctcpune.com/selenium/practice.html");

		// step=3a
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,50)");

		// step-4 capture screen shots

		TakesScreenshot tss = (TakesScreenshot) driver;

		File captureScreen = tss.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumExc\\ScreenShot\\A1.png");

		FileHandler.copy(captureScreen, dest);

		Thread.sleep(8000);
		driver.close();

	}

}
