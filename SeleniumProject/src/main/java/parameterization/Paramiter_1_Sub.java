package parameterization;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Paramiter_1_Sub extends DataProvider_1_SuperClass{
	

	@Test
	public void dataprovider() {
		
		//String cName,String fName,String lName
		
	//Create Lead
	driver.findElement(By.linkText("Create Lead")).click();

	
	
	}
}
