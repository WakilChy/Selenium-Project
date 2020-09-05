package inheritance;



import org.openqa.selenium.By;
import org.testng.annotations.Test;
import wrapper.Demo1_Befor_After_Method;

public class Demo1_Leaftaps extends Demo1_Befor_After_Method{

	@Test
	public void leafDemo(){

		
		//Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create Lead
		driver.findElement(By.linkText("Create Lead")).click();	

		
	}

}
