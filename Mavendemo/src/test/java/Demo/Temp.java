package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Temp {
	
	@Test
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\DemoMaven\\Mavendemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}

}
