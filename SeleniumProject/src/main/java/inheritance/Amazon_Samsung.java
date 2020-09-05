package inheritance;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import wrapper.Amzon_Before_AfterMethod;

public class Amazon_Samsung extends Amzon_Before_AfterMethod{
	@Test
	public void Samsung() {
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Samsung");
		driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
		

		
	}

}
