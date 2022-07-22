package VarousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	WebDriver driver;

	@Before
	public void lauchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.dell.com/en-us");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void login() {

		By PRODUCT_LOCATOR = By.xpath("//span[text()='Products']");
		By MONITOR_LOCATOR = By.xpath("//button[normalize-space()='Monitors']");
		By HOME_LOCATOR = By.xpath("//ul[@aria-label='Monitors']//a[@role='menuitem'][normalize-space()='For Home']");
		
		System.out.println(HOME_LOCATOR);
		
		
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(PRODUCT_LOCATOR)).build().perform();
		action.moveToElement(driver.findElement(MONITOR_LOCATOR)).build().perform();
		driver.findElement(HOME_LOCATOR).click();
		
		
		
		
		
		

	}

}
