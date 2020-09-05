package interfacePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethod{
	
	public ChromeDriver driver;
	
	public void launchBrowser(String url) {
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 83.0.4103.39\\chromedriver.exe");
				driver=new ChromeDriver();
		
				
		//Launch the browser 
				driver.get(url);
				
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	

	public void enterById(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);
	}
	public void enterByName(String locatorValue, String data) {
		driver.findElementByName(locatorValue).sendKeys(data);
	}
	public void enterByClassName(String locatorValue, String data) {
		driver.findElementByClassName(locatorValue).sendKeys(data);
	}
	public void enterByLinktext(String locatorValue, String data) {
		driver.findElementByLinkText(locatorValue).sendKeys(data);
	}
	public void enterByPartialLinktext(String locatorValue, String data) {
		driver.findElementByPartialLinkText(locatorValue).sendKeys(data);
	}
	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);
	}

	
	public void clickById(String locatorValue) {
		driver.findElementById(locatorValue).click();;
	}
	public void clickByName(String locatorValue) {
		driver.findElementByName(locatorValue).click();;
	}
	public void clickByClassName(String locatorValue) {
		driver.findElementByClassName(locatorValue).click();;	
	}
	public void clickByLinktext(String locatorValue) {
		driver.findElementByLinkText(locatorValue).click();;
	}
	public void clickByPartialLinktext(String locatorValue) {
		driver.findElementByPartialLinkText(locatorValue).click();;	
	}
	public void clickByXpath(String locatorValue) {
		driver.findElementByXPath(locatorValue).click();;
	}



	public void selectVesibleTexById(String locatorValue, String data) {
		WebElement src = driver.findElementById(locatorValue);
		Select dd = new Select(src);
		dd.selectByVisibleText(data);	
		
	}
	public void selectVesibleTexByName(String locatorValue, String data) {
		WebElement src = driver.findElementByName(locatorValue);
		Select dd = new Select(src);
		dd.selectByVisibleText(data);	
		
	}
	public void selectVesibleTexByClassName(String locatorValue, String data) {
		WebElement src = driver.findElementByClassName(locatorValue);
				Select dd = new Select(src);
				dd.selectByVisibleText(data);	
		
	}
	public void selectVesibleTexByLinktext(String locatorValue, String data) {
		WebElement src = driver.findElementByLinkText(locatorValue);
				Select dd = new Select(src);
				dd.selectByVisibleText(data);	
		
	}
	public void selectVesibleTexByPartialLinktext(String locatorValue, String data) {
		WebElement src = driver.findElementByPartialLinkText(locatorValue);
		Select dd = new Select(src);
		dd.selectByVisibleText(data);	
		
	}
	public void selectVesibleTexByXpath(String locatorValue, String data) {
		WebElement src = driver.findElementByXPath(locatorValue);
		Select dd = new Select(src);
		dd.selectByVisibleText(data);	
		
	}

	
	
	public void selectIndexById(String locatorValue, int data) {
		WebElement src = driver.findElementById(locatorValue);
		Select dd = new Select(src);
		dd.selectByIndex(data);	
		
	}
	public void selectIndexByName(String locatorValue, int data) {
		WebElement src = driver.findElementByName(locatorValue);
		Select dd = new Select(src);
		dd.selectByIndex(data);	
		
	}
	public void selectIndexByClassName(String locatorValue, int data) {
		WebElement src = driver.findElementByClassName(locatorValue);
		Select dd = new Select(src);
		dd.selectByIndex(data);	
		
	}
	public void selectIndexByLinktext(String locatorValue, int data) {
		WebElement src = driver.findElementByLinkText(locatorValue);
		Select dd = new Select(src);
		dd.selectByIndex(data);	
		
	}
	public void selectIndexByPartialLinktext(String locatorValue, int data) {
		WebElement src = driver.findElementByPartialLinkText(locatorValue);
		Select dd = new Select(src);
		dd.selectByIndex(data);	
		
	}
	public void selectIndexByXpath(String locatorValue, int data) {
		WebElement src = driver.findElementByXPath(locatorValue);
		Select dd = new Select(src);
		dd.selectByIndex(data);	
		
	}


	
	
	
	public void selectValueById(String locatorValue, String data) {
		WebElement src = driver.findElement(By.id(locatorValue));
		Select dd = new Select(src);
		dd.selectByVisibleText(data);	
		
	}

	public void selectValueByName(String locatorValue, String data) {
		WebElement src = driver.findElementByName(locatorValue);
		Select dd = new Select(src);
		dd.selectByVisibleText(data);
		
	}

	public void selectValueByClassName(String locatorValue, String data) {
		WebElement src = driver.findElementByClassName(locatorValue);
		Select dd = new Select(src);
		dd.selectByVisibleText(data);
		
	}

	public void selectValueByLinktext(String locatorValue, String data) {
		WebElement src = driver.findElementByLinkText(locatorValue);
		Select dd = new Select(src);
		dd.selectByVisibleText(data);
		
	}

	public void selectValueByPartialLinktext(String locatorValue, String data) {
		WebElement src = driver.findElementByPartialLinkText(locatorValue);
		Select dd = new Select(src);
		dd.selectByVisibleText(data);
	}

	public void selectValueByXpath(String locatorValue, String data) {
		WebElement src = driver.findElementByXPath(locatorValue);
		Select dd = new Select(src);
		dd.selectByVisibleText(data);
		
	}


	
	
	public void getTextbtId(String locatorValue) {
		String text = driver.findElementById(locatorValue).getText();
	}

	
	public void verifyTextById(String locatorValue, String data) {
		String pageTitle1 = driver.findElementById(locatorValue).getText();
		
		if(pageTitle1.contains(data))
		{
			System.out.println(" Title matched ");
		}
		else
		{
			System.out.println(" Title Not matched ");
		}
		
	}


	public void closeBrowse() {
		driver.close();
		
	}



	
	
	public void getTitel() {
		String title = driver.getTitle();
		System.out.println(title);
	}




	

}
