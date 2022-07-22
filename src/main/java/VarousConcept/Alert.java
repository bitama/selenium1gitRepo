package VarousConcept;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert {
	WebDriver driver;

	@Before
	public void lauchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi?mobilelogin=1");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void login() {

		By SING_LOCATOR = By.xpath("//input[@title='Sign in']");
		driver.findElement(SING_LOCATOR).click();
		String alertString = driver.switchTo().alert().getText();
		System.out.println(alertString);
		driver.switchTo().alert().accept();
		
		
		

		
	}

}
