package mavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WAKIL\\Downloads\\chromedriver//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://testing-ground.scraping.pro/login"); //launching the specified URL
		
		//WebElement link;   // Link click
		//link=driver.findElement(By.linkText("About"));
		//link.click();
				
		WebElement username=driver.findElement(By.name("usr")); //.sendKeys("Admin"); 
		WebElement password=driver.findElement(By.id("pwd"));  // .sendKeys("12345");
				
		username.sendKeys("admin"); //driver.findElement(By.className("CwaK9")).click();
		password.sendKeys("12345"); //driver.findElement(By.name("password")).sendKeys("PASSWORD",Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[3]")).click(); 
		
		
		//Display result 
		
		String actualUrl="http://testing-ground.scraping.pro/login";	
				
		String expectedUrl= driver.getCurrentUrl(); 
		
		if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
		System.out.println("Test passed");
		} 
		else { System.out.println("Test failed"); }
		
		driver.close();
		
	}

}
