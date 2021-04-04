package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Configfile.ReadConfigfile;
import Pages.AllProducts;
import Pages.LoginPage;

public class VerifyLogin {

	@Test
	public void TestLogin() throws Exception {
		ReadConfigfile ObjFile = new ReadConfigfile();
		
		
		String Username = ObjFile.CaptureVlauesFromPropertie("Environment");
		String BrswrName = ObjFile.CaptureVlauesFromPropertie("browser");
		String Url = ObjFile.CaptureVlauesFromPropertie("QaUrl");
		
		System.out.println(Username);

		
		BaseClass ObjBase = new BaseClass();
		
		
		
		WebDriver driver = ObjBase.LaunchApp(BrswrName, Url);
		

		LoginPage ObjLoginPage = new LoginPage(driver);
		ObjLoginPage.EnterUsername();
		ObjLoginPage.EnterPassword();
		ObjLoginPage.ClickLogin();
		
		AllProducts ObjAllPrds = new AllProducts(driver);
		if(!ObjAllPrds.VerifyAZelementDisplay()) {
			Assert.fail();
		}
		
		ObjBase.CloseApp();
	}
	

				


}
