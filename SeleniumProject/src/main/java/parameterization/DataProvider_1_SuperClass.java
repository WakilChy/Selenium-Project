package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class DataProvider_1_SuperClass {
	public WebDriver driver;
	
	
	@Parameters({"url","uname","pwd"})
	
	@BeforeMethod
	public void excelBMethod(String url,String uname,String pwd) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32 83.0.4103.39/chromedriver.exe");
		driver=new ChromeDriver();
		
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
	public String[][] getData() {
		String [][] data=new String[3][3];
		
		data[0][0]="AAA";
		data[0][1]="A";
		data[0][2]="Ahmed";
		
		data[1][0]="CCC";
		data[1][1]="B";
		data[1][2]="Ali";
		
		data[2][0]="KKK";
		data[2][1]="D";
		data[2][2]="Hussain";
		
		
		
		return data;
	}
	

}
