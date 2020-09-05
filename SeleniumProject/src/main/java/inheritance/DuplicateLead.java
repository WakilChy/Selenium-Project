package inheritance;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import wrapper.Leaftaps_Before_AfterMethod;

public class DuplicateLead extends Leaftaps_Before_AfterMethod {
	
	@Test
	public void dublicateLead() {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElement(By.xpath("(//a[@class=\"x-tab-right\"]/em)[3]")).click();
		
		
		//Enter Email
		driver.findElement(By.xpath("//input[@name=\"emailAddress\"]")).sendKeys("abc@gmail.com");
		
		
		//Click find lead
		driver.findElement(By.xpath("(//td[@class=\"x-btn-center\"]/em)[7]")).click();
		
		//Capture name of the fast resulting lead
		String name1 = driver.findElement(By.xpath("(//a[@class=\"linktext\"])[6]")).getText();
		System.out.println("Name1 is : "+name1);
		
		
		//Click fast resulting lead
		driver.findElement(By.linkText("10088")).click(); // ID change everyTime
			
		
		//Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		
		//Verify the title as Duplicate Lead
		String duplTitle = driver.getTitle();
		System.out.println("Page Titel is  :"+ duplTitle);
		
		if (duplTitle.contains("Duplicate")) {
			System.out.println("  Your are on right page");	
		} else {
			System.out.println("  Find correct page ");
		}
		
		//Click create Lead
		driver.findElement(By.xpath("//input[@value=\"Create Lead\"]")).click();
		
		
		//Confirm the Duplicate name as capture
		String name2 = driver.findElement(By.xpath("//span[@id=\"viewLead_firstName_sp\"]")).getText();
		System.out.println("Name2 is : "+name2);
		
		
		if (name1.equals(name2)) {
			System.out.println("  Name Match");
		} else {
			System.out.println("Not Match");
		}
		
		
		
	}

}
