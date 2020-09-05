package parameterization;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class IntegateDProvExcel_1_Sup {
public WebDriver driver;
	
	
	@Parameters({"url","uname","pwd"})
	
	@BeforeMethod
	public void excelBMethod(String url,String uname,String pwd) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32 83.0.4103.39/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		//Login
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		} //End BeforeMethod
	
	
	@AfterMethod
	public void excelAMethod() {
		driver.close();
	}
	
	
	@DataProvider
	public String[][] getData() throws IOException {
		
		IntegateDProvExcel_1_Exl rExcel=new IntegateDProvExcel_1_Exl();
		return rExcel.IntegrateExcel();
			
		
	}
	
}
