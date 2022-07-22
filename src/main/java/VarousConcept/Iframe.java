package VarousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	WebDriver driver;

	@Before
	public void lauchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void login() {
         driver.switchTo().frame("packageListFrame");
		By javawt = By.linkText("java.awt");
		driver.findElement(javawt).click();
		
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		
		
//		By composite = By.xpath("//span[normalize-space()='Composite']");
		By composite = By.linkText("Composite");
		driver.findElement(composite).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("classFrame");
		
		By instance_method = By.linkText("CompositeContext");
		driver.findElement(instance_method).click();
		
		
		
		
		
		
		

		
	}


}
