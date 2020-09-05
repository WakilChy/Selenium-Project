package inheritance;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import wrapper.Amzon_Before_AfterMethod;

public class Amazon_Iphone extends Amzon_Before_AfterMethod{
	
	@Test
	public void Iphone() {
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
		
	}
	

}
