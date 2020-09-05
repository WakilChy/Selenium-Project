package mavenProject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class testselenium {
	 
   public static void main(String[] args) {

	//Setting system properties of ChromeDriver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\WAKIL\\Downloads\\chromedriver//chromedriver.exe");

	//Creating an object of ChromeDriver
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	//Deleting all the cookies
	driver.manage().deleteAllCookies();

	//Specifyeing pageLoadTimeout and Implicit wait
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//launching the specified URL
	driver.get("https://www.google.com/");

	//Locating the elements using name locator for the text box
	driver.findElement(By.name("q")).sendKeys("Youtube");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);


	//name locator for google search button
	//WebElement searchIcon = driver.findElement(By.name("btnK"));
	//searchIcon.click();


	//Click on the Submit button
	//driver.findElement(By.id("submit")).click();
 
 
	//Closing the browser
	driver.quit();
}
}