package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Demo1_Befor_After_Method {
	public WebDriver driver;
	@Parameters({"url","uname","pwd"})
	
	
	@BeforeMethod
	public void leafDemoBefore(String url,String uname,String pwd) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 83.0.4103.39\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		//Launch the browser 
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Input UserName & password
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		//Click login 
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
	}
	
	
	@AfterMethod
	public void leafDemoAfterMethod() {
		driver.quit();
	}

}
