package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	
	
	//Constructor
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		System.out.println("Constructor executing");
	}
	
	
	By Username = By.id("user-name");
	By Password = By.xpath("//input[@id='password']");
	By Login = By.xpath("//input[@id=\"login-button\"]");
	
	
	
	
	
	
	public void EnterUsername() {
		driver.findElement(Username).sendKeys("standard_user");

	}
	
	public void EnterPassword() {
		driver.findElement(Password).sendKeys("secret_sauce");
	}
	
	public void ClickLogin() {
		driver.findElement(Login).click();
	}
	
	
	
	

}
