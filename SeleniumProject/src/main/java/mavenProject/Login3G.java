package mavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login3G {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 83.0.4103.39//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Amazon");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphoneX");
		driver.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.partialLinkText("Sellers")).click();
		
		
		
		
		driver.close();
		
		

	}

}
