package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805943%7Ce%7Cfacebook%20signup%7C&placement=&creative=550525805943&keyword=facebook%20signup&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-321689134300%26loc_physical_ms%3D9062085%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAvaGRBhBlEiwAiY-yMFZgptUGYyffGjEPbbcNYXk_g073vAg8qTESoem1E3_s4NKcgrf8FxoCgRYQAvD_BwE");

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		String title = driver.getTitle();
		System.out.println(title);
		String actual = "Sign up for Facebook | Facebook";

		if (title.equals(actual)) {
			System.out.println("TC Pass- Page Title Found");
		} else {
			System.out.println("TC Fail- Page Title not Found");
		}

		WebElement FirstName = driver.findElement(By.xpath("//input[@type='text']"));
		FirstName.sendKeys("Akshay");

		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Khot");

		WebElement Mobno = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Mobno.sendKeys("9876543210");

		WebElement Pass = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		Pass.sendKeys("Akshay@1233456");

		WebElement BirthDate = driver.findElement(By.xpath("//*[@name='birthday_day']"));
		BirthDate.sendKeys("15");

		WebElement BirthMonth = driver.findElement(By.xpath("//select[@id='month']"));
		BirthMonth.sendKeys("June");

		WebElement BirthYear = driver.findElement(By.xpath("//select[@title='Year']"));
		BirthYear.sendKeys("1990");

		WebElement Gender = driver.findElement(By.xpath("//input[@value='2']"));
		Gender.click();

		WebElement SubmitInfo = driver.findElement(By.xpath("//button[@name='websubmit']"));
		SubmitInfo.click();

		System.out.println("SignUp Sucessfully");
		// button[@type='submit']

		// input[@id='u_0_l_mD']

		Thread.sleep(4000);
		driver.close();

	}
}
