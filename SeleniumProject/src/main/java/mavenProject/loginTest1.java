package mavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WAKIL\\Downloads\\chromedriver//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://testing-ground.scraping.pro/login"); //launching the specified URL
		
		//WebElement link;   // Link click
		//link=driver.findElement(By.linkText("About"));
		//link.click();
		
				
		WebElement username=driver.findElement(By.id("usr")); 
		WebElement password=driver.findElement(By.id("pwd")); 
		WebElement login=driver.findElement(By.xpath("//*[@id=\"case_login\"]/form/input[3]")); 
		
				
		username.sendKeys("Admin"); password.sendKeys("12345"); 
		login.click(); String actualUrl="http://testing-ground.scraping.pro/login";
		
		String expectedUrl= driver.getCurrentUrl(); if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
		System.out.println("Test passed"); } else { System.out.println("Test failed"); }
		
		
	}

}
