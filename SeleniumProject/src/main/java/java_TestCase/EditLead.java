package java_TestCase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		
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
			driver.findElement(By.xpath("//a[text()=\"Leads\"]")).click();
			
			//Find Lead 
			driver.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
			
			//Enter First Name
			driver.findElement(By.xpath("//input[@id=\"ext-gen248\"]")).sendKeys("Hema");
			
			//Click Find Leads button
			driver.findElement(By.xpath("//button[@id=\"ext-gen334\"]")).click();
			
			Thread.sleep(2000);
			
			//Click Fist Resulting Lead
			WebElement LeadID = driver.findElement(By.xpath("//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a"));
			System.out.println(LeadID);
			LeadID.click();
			
			
			

			//Verify title
			String pageTitle1 = driver.findElement(By.xpath("//div[@id=\"sectionHeaderTitle_leads\"]")).getText();
			
			if(pageTitle1.contains("View Lead"))
			{
				System.out.println(" Title matched ");
			}
			else
			{
				System.out.println(" Title Not matched ");
			}
			
			//Click Edit	
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			
			//Change Company Name
			driver.findElement(By.xpath("//input[@id=\"updateLeadForm_companyName\"]")).clear();
			driver.findElement(By.xpath("//input[@id=\"updateLeadForm_companyName\"]")).sendKeys("CTS");
			
			//Click Update
			driver.findElement(By.xpath("(//input[@name=\"submitButton\"])[1]")).click();
			
			
			//Confirm the changed name appears
			String companyTitle2 = driver.findElement(By.xpath("//span[@id=\"viewLead_companyName_sp\"]")).getText();
			System.out.println("Company Title  :  "+companyTitle2);
			
			if (companyTitle2.contains("CTS")) {
				System.out.println("  Company Name Match  ");
			}
			else {
				System.err.println(" Company Name Not Match ");
			}
			
		


	}

}
