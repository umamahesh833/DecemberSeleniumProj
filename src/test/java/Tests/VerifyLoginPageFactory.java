package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import PagesWithPageFactory.AllProductsNew;
import PagesWithPageFactory.LoginNew;

public class VerifyLoginPageFactory {

	public static void main(String[] args) {
		
		
		BaseClass ObjBase = new BaseClass();
		WebDriver driver = ObjBase.LaunchApp("edge", "https://www.saucedemo.com/index.html");
		
		
		//Initilize the webelements		
		LoginNew ObjLogin = PageFactory.initElements(driver, LoginNew.class);		
		
		ObjLogin.EnterUsername();
		ObjLogin.Enterpassword();
		ObjLogin.ClickLoginButton();
		
		AllProductsNew PageAllPrds = PageFactory.initElements(driver, AllProductsNew.class);
		PageAllPrds.verifyAZelementDisplay();

	}

}
