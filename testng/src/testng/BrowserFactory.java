package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	  
	static WebDriver driver;
	
	public static WebDriver Startbrowser(String browsername,String url){
		if(browsername.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "F:\\work space\\jars\\geckodriver-v0.17.0-win64\\geckodriver.exe");
			driver =new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}

}
