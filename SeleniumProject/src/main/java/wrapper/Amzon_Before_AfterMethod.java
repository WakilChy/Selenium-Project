package wrapper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Amzon_Before_AfterMethod {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32 83.0.4103.39\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
	}
	
	
	
	
	@AfterMethod
	public void Close() {
		driver.close();
	}
		
		
	
}
