package ScreeneShort;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try_Catch_block {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 83.0.4103.39\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//Launch the browser 
		driver.get("http://www.leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Input UserName & password
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click login 
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click(); 
		
		
		
		try {
			//Click CRM/SFA
			driver.findElement(By.linkText("CRM/SFA1")).click(); //wrong "CRM/SFA1"
			
			
			
			
			System.out.println("Successfully enter the contract information");
		} catch (Exception e) {
			System.out.println("e info :"+e);
			
			System.err.println("Error contracts information");
			e.printStackTrace();
			System.out.println("e.getMassage : "+e.getMessage());
		}
		
		
		
		
		//Create Lead
				driver.findElement(By.linkText("Create Lead")).click();
		
		driver.close();

	}

}
