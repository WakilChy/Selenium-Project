package mavenProject;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleTestD {
	
	
		  private WebDriver driver;
		  private Map<String, Object> vars;
		  JavascriptExecutor js;
		  @Before
		  public void setUp() {
		    driver = new ChromeDriver();
		    js = (JavascriptExecutor) driver;
		    vars = new HashMap<String, Object>();
		  }
		  @After
		  public void tearDown() {
		    driver.quit();
		  }
		  @Test
		  public void login1() {
		    driver.get("https://www.google.com/");
		    driver.manage().window().setSize(new Dimension(817, 735));
		    driver.findElement(By.name("q")).click();
		    driver.findElement(By.name("q")).sendKeys("youtube");
		    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		    driver.close();
		  }
		}



