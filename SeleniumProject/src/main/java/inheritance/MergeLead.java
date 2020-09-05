package inheritance;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import wrapper.Leaftaps_Before_AfterMethod;

public class MergeLead extends Leaftaps_Before_AfterMethod {
	
	@Test
	public void margeLead() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Merge Leads")).click();
		
		
		//Click the icon near from lead
		driver.findElement(By.xpath("//img[@alt=\"Lookup\"]")).click();
		
		//Parents Window ref
		String winParents = driver.getWindowHandle();
		
		//Move to new window
		
		 Set<String> allwin=driver.getWindowHandles();
		 System.out.println(allwin);
		 
		 for (String eachwin : allwin) {
			driver.switchTo().window(eachwin);
			System.out.println(driver.getTitle());
		}
		
		 //Enter Lead ID
		driver.findElement(By.xpath("//input[@id=\"ext-gen25\"]")).sendKeys("10071");
		
		//Click the find lead button
		driver.findElement(By.xpath("(//td[@class=\"x-btn-center\"])[1]")).click();
		
		
		String fstName = driver.findElement(By.linkText("fn")).getText();
		System.out.println(fstName);
		
		
		//click fast resulting lead
		driver.findElement(By.linkText("10071")).click();
		
		//switch back parents window
		driver.switchTo().window(winParents);
		
		//Click near to lead
		driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[2]")).click();
		
		
		
		
	}

}
