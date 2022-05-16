package Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepo.Login;

public class Temp {
	
	public static WebDriver driver;
	
	
	public void sendkeys(WebElement e, WebDriver driver, int t, String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(t));
		wait.until(ExpectedConditions.visibilityOf(e));
		e.sendKeys(value);
	}
	
	public void click(WebElement e, WebDriver driver, int t)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(t));
		wait.until(ExpectedConditions.visibilityOf(e));
		e.click();
	}
	
	@Test
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\DemoMaven\\Mavendemo\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	
	@Test
	public void login()
	{
		Login l1 = new Login();
		
		sendkeys(l1.uname(driver), driver, 5, "standard_user");
		sendkeys(l1.pwd(driver), driver, 5, "secret_sauce");
		click(l1.lbtn(driver), driver, 5);
		
	}
	
	@Test
	public void close()
	{
		driver.close();
		System.out.println("Completed");
	}
	

}
