package java_TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver 85.0.4183.87\\chromedriver.exe");
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
		
		//Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Lead
		driver.findElementByLinkText("Leads").click();
		
		//Find Lead
		driver.findElementByLinkText("Find Leads").click();
		
		//Click Phone 
		driver.findElementByLinkText("Phone").click();
		
		//Enter Phone number
		driver.findElementByXPath("//input[@name=\"phoneNumber\"]").sendKeys("8489248900"); // create lead & Get a unique number
		
		//Click FindLeads
		driver.findElementByXPath("//button[text()=\"Find Leads\"]").click();
		
		//Capture Lead id 
		String textLeadId = driver.findElementByLinkText("10085").getText(); //Lead id will change every time 
		System.out.println("Captured Lead Id :"+textLeadId);
		
		//Click first resulting Lead
		driver.findElementByLinkText("10085").click(); //Lead id will change every time 
		
		
		//Click Delete
		//driver.findElementByLinkText("Delete").click();
		
		
		
		
		

	}

}
