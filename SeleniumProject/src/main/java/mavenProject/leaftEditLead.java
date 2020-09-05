package mavenProject;

//import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class leaftEditLead {
	
	@Test
	public void leaftLogin() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 83.0.4103.39\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
 
	driver.get("http://www.leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	

	driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.xpath("//a[text()=\"Leads\"]")).click();
	
	driver.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
	
	driver.findElement(By.xpath("//input[@id=\"ext-gen248\"]")).sendKeys("Hema");
	driver.findElement(By.xpath("//button[@id=\"ext-gen334\"]")).click();
	
	Thread.sleep(2000);
	
	WebElement LeadID = driver.findElement(By.xpath("//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a"));
	System.out.println(LeadID);
	LeadID.click();
	
	String PageTitle = driver.getTitle();
	System.out.println("Page Titel Is : "+PageTitle);
	
	
	if(PageTitle.contains("View"))
	{
		System.out.println(" Title matched ");
	}
	else
	{
		System.out.println(" Title Not matched ");
	}
	
	
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.xpath("//input[@id=\"updateLeadForm_companyName\"]")).sendKeys("CTS");
	driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
	
	
	driver.close();

	}

}
