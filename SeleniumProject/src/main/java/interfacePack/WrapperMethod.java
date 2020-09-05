package interfacePack;

public interface WrapperMethod {
	
	//Login
		public void launchBrowser(String url);
	
	//Enter
		public void enterById(String locatorValue,String data);
		public void enterByName(String locatorValue,String data);
		public void enterByClassName(String locatorValue,String data);
		public void enterByLinktext(String locatorValue,String data);
		public void enterByPartialLinktext(String locatorValue,String data);
		public void enterByXpath(String locatorValue,String data);
	
	//Click
		public void clickById(String locatorValue);
		public void clickByName(String locatorValue);
		public void clickByClassName(String locatorValue);
		public void clickByLinktext(String locatorValue);
		public void clickByPartialLinktext(String locatorValue);
		public void clickByXpath(String locatorValue);
	
		
	//DropDrown VisualText
		public void selectVesibleTexById(String locatorValue,String data);
		public void selectVesibleTexByName(String locatorValue,String data);
		public void selectVesibleTexByClassName(String locatorValue,String data);
		public void selectVesibleTexByLinktext(String locatorValue,String data);
		public void selectVesibleTexByPartialLinktext(String locatorValue,String data);
		public void selectVesibleTexByXpath(String locatorValue,String data);
		
		
		
	//DropDrown Index
		public void selectIndexById(String locatorValue,int data);
		public void selectIndexByName(String locatorValue,int data);
		public void selectIndexByClassName(String locatorValue,int data);
		public void selectIndexByLinktext(String locatorValue,int data);
		public void selectIndexByPartialLinktext(String locatorValue,int data);
		public void selectIndexByXpath(String locatorValue,int data);
	
		
	//DropDrown Value
		public void selectValueById(String locatorValue,String data);
		public void selectValueByName(String locatorValue,String data);
		public void selectValueByClassName(String locatorValue,String data);
		public void selectValueByLinktext(String locatorValue,String data);
		public void selectValueByPartialLinktext(String locatorValue,String data);
		public void selectValueByXpath(String locatorValue,String data);
		
	//GetText
		public void getTextbtId(String locatorValue);
		
		
	//Verify Text
		public void verifyTextById(String locatorValue,String data);
		

		//Get 
	public void getTitel();
	
			
		
		
		
	//Close Browser
		public void closeBrowse();
		
		
		
		
		
		
	
	
}
