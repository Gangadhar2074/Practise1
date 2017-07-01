package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CityxferSignup{
	WebDriver driver;

	public CityxferSignup(WebDriver driver){
		this.driver=driver;
	}

	@FindBy(xpath=".//*[@id='userProf']/b/a")
	WebElement btn_signup;

	@FindBy(xpath=".//*[@id='register-btn']")
	WebElement btn_Register;

	@FindBy(xpath="//label[text()='Email:']/../input")
	WebElement txt_email;

	@FindBy(xpath="//input[@id='pwd1']")
	WebElement txt_pwd;

	@FindBy(xpath="//label[text()='Name:']/../input")
	WebElement txt_name;

	@FindBy(xpath="//label[text()='Mobile:']/../input")
	WebElement txt_mobile;

	@FindBy(xpath="//button[text()='Signup']")
	WebElement btn_Submit;

	public boolean Singnup() throws InterruptedException{
		btn_signup.click();
		btn_Register.click();
		txt_email.sendKeys("nunna.gangadhar@gmail.com");
		txt_pwd.sendKeys("nunna2074");
		txt_name.sendKeys("nunna");
		txt_mobile.sendKeys("7995418129");
		btn_Submit.click();
		WebElement[] ee= {txt_email,txt_pwd,txt_name,txt_mobile};
		boolean is_valid=validation(ee);
		
		return is_valid;
		
	}

	public boolean validation(WebElement[] ee){
		boolean is_valid=true;
           
			for(int i=0;i<ee.length;i++){


			JavascriptExecutor je=(JavascriptExecutor)driver;
			Boolean is_valid1 = (Boolean)je.executeScript("return arguments[0].checkValidity();", ee[i]);
			String message = (String)je.executeScript("return arguments[0].validationMessage;", ee[i]);

			if(is_valid1==false){
				System.out.println("invalid");
				System.out.println("message"+ message);
				is_valid=false;
			}
		}
		
			
		
		return is_valid;

	}
	
		
		
		
		
		
	}
	





