package inheritance;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.Leaftaps_Before_AfterMethod;

public class Create_Leaftaps extends Leaftaps_Before_AfterMethod {

	//public static void main(String[] args) {
	
	@Test
	public void demo1_Leaftaps() {
		
		
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
		
		//driver.quit();

		
	}

}
