package VarousConcept;


import java.util.concurrent.TimeUnit;



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyBoardEvent {
	WebDriver driver;

	@Before
	public void lauchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void login() {

		By USERNAME_LOCATOR = By.xpath("//*[@id='username']");
		By PASSWORD_LOCATOR = By.xpath("//*[@id='password']");
		By LOGIN_LOCATOR = By.xpath("//*[@name='login']");
		By DASHBOARD_LOCATOR = By.xpath("//span[normalize-space()='Dashboard']");
		By TRANSACTION_LOCATOR = By.xpath("//span[normalize-space()='Transactions']");
		By NEW_DEPOSIT_LOCATOR = By.xpath("//a[normalize-space()='New Deposit']");
		By CHOOSE_ACOUNT = By.xpath("//select[@id='account']");
		By DESCRIPTION = By.xpath("//input[@id='description']");
		By AMOUNT = By.xpath("//input[@id='amount']");
		By SUBMIT = By.xpath("//button[@id='submit']");
		
		

		driver.findElement(USERNAME_LOCATOR).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_LOCATOR).sendKeys("abc123");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		

	}

}
