package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class gmailpages {

	WebDriver driver;

	public gmailpages(WebDriver driver){
		this.driver=driver;

	}

	@FindBy(xpath="html/body/nav/div/a[2]")
	WebElement btn_sigin;

	@FindBy(xpath=".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[1]")
	WebElement txt_username;

	@FindBy(xpath=".//*[@id='identifierNext']/content")
	WebElement btn_next;

	@FindBy(xpath=".//*[@id='password']/div[1]/div/div[1]/input")
	WebElement txt_pwd;

	@FindBy(xpath=".//*[@id='passwordNext']/content/span")
	WebElement btn_next2;

	@FindBy(xpath="//div[@class='ar6 T-I-J3 J-J5-Ji']")
	WebElement btn_gmailback;

	public void gmaillogin() throws InterruptedException{
		btn_sigin.click();
		txt_username.sendKeys("nunna2074");
		btn_next.click();
		Thread.sleep(1000);
		txt_pwd.sendKeys("ganga2074");
		btn_next2.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);



	}
	public void openmail(){
		List <WebElement> a= driver.findElements(By.xpath("//*[@class='yW']/span"));
		System.out.println("size" + a.size());
		for (int i = 0; i <a.size(); i++) {
			System.out.println(a.get(i).getText());
			if (a.get(i).getText().equalsIgnoreCase("Andy from Google")) //to click on a specific mail.
			{                                           
				a.get(i).click();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				btn_gmailback.click();

			}
		}
	}

}
