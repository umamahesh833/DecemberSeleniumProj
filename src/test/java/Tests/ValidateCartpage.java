package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.AllProducts;
import Pages.LoginPage;
import Pages.ProductDisplayPage;

public class ValidateCartpage {
	
		@Test
		public void ValidateCart() {
			//Launch the application
			BaseClass ObjBase = new BaseClass();
			WebDriver driver = ObjBase.LaunchApp("Edge", "https://www.saucedemo.com/index.html");
			
			LoginPage ObjLoinPage = new LoginPage(driver);		
			ObjLoinPage.EnterUsername();
			ObjLoinPage.EnterPassword();
			ObjLoinPage.ClickLogin();
			
			AllProducts ObjAllProducts = new AllProducts(driver);
			ObjAllProducts.clickOnproduct();
			
			ProductDisplayPage ObjPrdDisp = new ProductDisplayPage(driver);
			ObjPrdDisp.ClickAddToCart();
			ObjPrdDisp.NavCartpage();
			ObjBase.CloseApp();
		}

		


}
