package interfacePack;

import org.testng.annotations.Test;

public class TC001_login extends GenericWrapper {
	
	@Test
	public void loginTC001() {
		//url
				launchBrowser("http://www.leaftaps.com/opentaps/control/login");
				
		//User&Pwd	
				enterByXpath("//input[@id=\"username\"]", "demosalesmanager");
				enterById("password", "crmsfa");
				clickByXpath("//input[@type=\"submit\"]");				
				clickByLinktext("CRM/SFA");
		
		
				
		
		
		
	}
	

}
