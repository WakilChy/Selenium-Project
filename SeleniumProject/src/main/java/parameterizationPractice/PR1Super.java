package parameterizationPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class PR1Super {
	
	//Make it public 
		public ChromeDriver driver;
		
		@Parameters({"url","uname","pwd"})
	
	
		@BeforeMethod
		public void lounchBrowse(String url,String uname,String pwd) {
		
	//Driver Setup	
				System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32 83.0.4103.39/chromedriver.exe");
				driver=new ChromeDriver();
		
	//Lunch browser 
				driver.get(url);
	//Maximize window 
				driver.manage().window().maximize();
				
	//Login
				driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(uname);
				driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pwd);
				driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
		
			}
		
		
		@AfterMethod
		public void closeBrowser() {
			driver.close();
			}
		
		
		@DataProvider
		public String[][] dataprovide() throws IOException {	
			
			
			PR1ReadExcel exldata=new PR1ReadExcel();
			return exldata.excelMethod();
			
			
			
			}
			
			
			

}
