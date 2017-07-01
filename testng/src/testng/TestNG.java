package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNG{

	@Test(priority=1)
	public void validations() throws InterruptedException{
	WebDriver driver=BrowserFactory.Startbrowser("firefox", "https://cityxfer.com/");
	CityxferSignup city=PageFactory.initElements(driver, CityxferSignup.class);
	boolean is_valid=city.Singnup();
	Assert.assertEquals(is_valid, true);
	
	
	
	
	}
	
	@Test(priority=2,dependsOnMethods={"validations"})
	public void gmaillogin() throws InterruptedException{
		WebDriver driver=BrowserFactory.Startbrowser("firefox", "https://www.google.com/gmail/about/");
		gmailpages gmail=PageFactory.initElements(driver, gmailpages.class);
		gmail.gmaillogin();
		gmail.openmail();		
	}
	
}
