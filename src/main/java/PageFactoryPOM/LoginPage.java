package PageFactoryPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	//Constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_user;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_pass;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	
	//Action Methods
	
		public void setUsername(String user)
		{
			txt_user.sendKeys(user);
			
		}
		
		public void setPass(String pass) 
		{
			txt_pass.sendKeys(pass);
		}
		
		public void setBtn()
		{
			btn_login.click();
		}
	
	
}
