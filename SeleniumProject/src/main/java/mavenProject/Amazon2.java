package mavenProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon2 {

	//public static void main(String[] args) {
	@Test
	public void amazon2() {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 83.0.4103.39//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");  //Navigate to https
		driver.manage().window().maximize();    //Max window 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //wait time
		
		
		//Amazon Devices from DropDown selection 
		WebElement adrop = driver.findElement(By.id("searchDropdownBox"));
		Select dd=new Select(adrop);
		dd.selectByVisibleText("Cell Phones & Accessories");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone xs"); // write search for  iphone 		
		driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();      //& search
		
		//DropDown selection 
		WebElement featuredDrop = driver.findElement(By.xpath("//select[@id=\"s-result-sort-select\"]"));
		Select fdd=new Select(featuredDrop);
		fdd.selectByVisibleText("Price: High to Low");
		
		//Mouse overOn
		WebElement signIn = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(signIn).perform();
		
		
		
		
		//Close 
		driver.close();
		
	}

}
