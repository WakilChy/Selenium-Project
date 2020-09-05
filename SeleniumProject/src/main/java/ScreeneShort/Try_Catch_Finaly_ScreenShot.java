package ScreeneShort;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Try_Catch_Finaly_ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 83.0.4103.39\\chromedriver.exe");
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
		
		//Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		//Enter Company Name
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("ABC/TCS");
		
		//F & L Name
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		
		//Choose Source
		WebElement DropD1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select1=new Select(DropD1);
		select1.selectByVisibleText("Website");
		
		//Title 
		driver.findElement(By.xpath("//input[@name=\"generalProfTitle\"]")).sendKeys("Mr");
		
		//Industry 
		WebElement DropD2 = driver.findElement(By.xpath("//select[@name=\"industryEnumId\"]"));
		Select select2=new Select(DropD2);
		select2.selectByVisibleText("Computer Software");
		
		//Ownership
		WebElement DropD3 = driver.findElement(By.xpath("//select[@id=\"createLeadForm_ownershipEnumId\"]"));
		Select select3=new Select(DropD3);
		select3.selectByVisibleText("Partnership");
	
		//Description 
		driver.findElement(By.xpath("//textarea[@id=\"createLeadForm_description\"]")).sendKeys("TCS");
		
		//Country Code
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryPhoneCountryCode\"]")).sendKeys("1");
		
		//Area code
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryPhoneAreaCode\"]")).sendKeys("234");
		
		//Enter Extension
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryPhoneExtension\"]")).sendKeys("123");
		
		//Dept
		driver.findElement(By.xpath("//input[@name=\"departmentName\"]")).sendKeys("MKT");
		
		//Currency 
		WebElement DropD4 = driver.findElement(By.xpath("//select[@id=\"createLeadForm_currencyUomId\"]"));
		Select select4=new Select(DropD4);
		select4.selectByVisibleText("BDT - Bangladesh Taka");
		
		//Employees 
		driver.findElement(By.xpath("//input[@name=\"numberEmployees\"]")).sendKeys("100");
		
		//Address
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_generalToName\"]")).sendKeys("House 010");
		driver.findElement(By.xpath("(//input[@class=\"inputBox\"])[24]")).sendKeys("City city");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("1234");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("2345");
		
		WebElement DropD6 = driver.findElement(By.xpath("//select[@id=\"createLeadForm_generalStateProvinceGeoId\"]"));
		Select select6=new Select(DropD6);
		select6.selectByVisibleText("New York");
		
		
		//Marketing Campaign
		WebElement DropD5 = driver.findElement(By.xpath("//select[@id=\"createLeadForm_marketingCampaignId\"]"));
		Select select5=new Select(DropD5);
		select5.selectByVisibleText("Automobile");
		
		//Phone & Email
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryPhoneNumber\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("abc@gmail.com");
		
		//Lead create 
		//driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		
		///SnapShot
		File screenSource = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./SnapImage/Image1.png");
		FileUtils.copyFile(screenSource, dest);
		
		
		driver.quit();

	}

}
