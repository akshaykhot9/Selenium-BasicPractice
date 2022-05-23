package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/downloads/");

		driver.manage().window().maximize();
		Thread.sleep(4000);

		driver.manage().window().minimize();
		Thread.sleep(4000);

		driver.manage().window().maximize();
		Thread.sleep(4000);

		System.out.println(driver.getTitle());

		String title = driver.getTitle();
		System.out.println(title);
		String actual = "Downloads | Selenium";

		if (title.equals(actual)) {
			System.out.println("TC Pass- Page Title Found");
		} else {
			System.out.println("TC Fail- Page Title not Found");
		}

		Thread.sleep(8000);
		driver.close();
	}
}
