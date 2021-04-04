package PagesWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginNew {
	

	
	
	@FindBy(id ="user-name") 
	WebElement UserName;
	
	@FindBy(xpath ="//input[@id='password']") 
	WebElement password;
	
	@FindBy(xpath ="//input[@id='login-button']") 
	WebElement LoginButton;
	
	
	
	
	
	public void EnterUsername() {
		
		UserName.sendKeys("locked_out_user");
	}
	
	public void Enterpassword() {
		
		password.sendKeys("secret_sauce");
	}
	
	public void ClickLoginButton() {
		
		LoginButton.click();
	}

}
