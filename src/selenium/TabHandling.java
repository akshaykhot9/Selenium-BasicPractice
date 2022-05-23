package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		// Step=1
		WebDriver driver = new ChromeDriver();

		// Step=2
		driver.manage().window().maximize();

		// Step-3
		driver.get("https://vctcpune.com/selenium/practice.html");

		// Step-4
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

		// step-4-a findout parent window address
		String parentTab = driver.getWindowHandle();
		System.out.println(parentTab);

		// step-5
		WebElement tabButton = driver.findElement(By.xpath("//*[@id='opentab']"));

		tabButton.click();
		Thread.sleep(2000);

		// step-6 navigation between tabs
		Set<String> allTabs = driver.getWindowHandles();

		// step-7- navigate to child tab
		for (String tab : allTabs) {

			System.out.println(tab);

			if (!parentTab.equalsIgnoreCase(tab)) {

				driver.switchTo().window(tab);
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
			}

		}

		// step-8 navigate back to parent tab
		driver.switchTo().window(parentTab);
		System.out.println(driver.getTitle());

		Thread.sleep(8000);
		driver.quit();

	}

}
