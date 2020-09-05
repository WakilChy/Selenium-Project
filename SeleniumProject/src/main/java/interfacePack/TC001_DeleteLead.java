package interfacePack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC001_DeleteLead extends GenericWrapper {
	
	@Test
	public void tcdelete() {
		launchBrowser("http://www.leaftaps.com/opentaps/control/login");
		enterByXpath("//input[@id=\"username\"]", "demosalesmanager");
		enterById("password", "crmsfa");
		clickByXpath("//input[@type=\"submit\"]");
		clickByLinktext("CRM/SFA");
		
		
		
		//Click Lead
		driver.findElement(By.xpath("//a[text()=\"Leads\"]")).click();
		
		//Find Lead
		clickByLinktext("Find Leads");
		
		
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
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		getTitel();
		
		
		
		
	}

}
