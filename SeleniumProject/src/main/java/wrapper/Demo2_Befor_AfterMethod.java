package wrapper;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class Demo2_Befor_AfterMethod  {
	
	//Driver on public
	public WebDriver driver;
	
	@Parameters({"url","uname","pwd"})
	
	@BeforeMethod
	public void beforeM(String url,String uname,String pwd) {
		
	//Driver call
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32 83.0.4103.39/chromedriver.exe");
	driver=new ChromeDriver();
	
	
	//Get Browse	
	//driver.get("http://www.leaftaps.com/opentaps/control/login");
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);	
	
	
	
	//Login
	//driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demosalesmanager");
	driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(uname);
	//driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	} //End BeforeMethod
	
		
	@AfterMethod
	public void afterM() {
		driver.close();
	}//End AfterMethod
	
	
	@DataProvider
	public String[][] getData() {
			
		String[][] data = new String[3][3];
		
		data[0][0]="AAA";
		data[0][1]="A";
		data[0][2]="Ahmed";
		
		data[1][0]="CCC";
		data[1][1]="B";
		data[1][2]="Ali";
		
		data[2][0]="KKK";
		data[2][1]="D";
		data[2][2]="Hussain";
		
		return data;
	}
	
	
	

}
