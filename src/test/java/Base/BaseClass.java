package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Reporting.report;

public class BaseClass {
	
	WebDriver Driver;
	
	report ObjRep = new report();

	public WebDriver LaunchApp(String sBrowser, String sURL) {
		
		if(sBrowser.toUpperCase().equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");		
			Driver = new ChromeDriver();
			ObjRep.Reporter("Chrome Browser Launched");
		}else if(sBrowser.toUpperCase().equals("EDGE")) {
			System.setProperty("webdriver.edge.driver", "C:\\SeleniumClass\\EdgeDriver\\msedgedriver.exe");
			Driver = new EdgeDriver();	
			ObjRep.Reporter("Edge Browser Launched");
		}	
	
		Driver.manage().window().maximize();
		//implicitwait
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		Driver.navigate().to(sURL);
		ObjRep.Reporter("Navigated to URL - "+sURL);
		return Driver;
	}
	
	
	
	public void AppLogin(String sUsername, String sPasswd) {
		//Login to SauseDemo Appication
		Driver.findElement(By.id("user-name")).sendKeys(sUsername);
		Driver.findElement(By.id("password")).sendKeys(sPasswd);
		Driver.findElement(By.id("login-button")).click();
		ObjRep.Reporter("App login with user name and pass - "+sUsername+" - "+sPasswd);
	}
	
	public void VerifyAppLogin() {
		WebElement sortcontainer = Driver.findElement(By.xpath("//div[@id='inventory_filter_container']/select"));
		if(sortcontainer.isDisplayed()) {
			ObjRep.Reporter("Application got successfully logged in");
		}else {
			ObjRep.Reporter("Application login was not successfully");
		}
	}
	
	
	public String SelectAProductAddToCart(String str) {
		WebElement TSHirt = Driver.findElement(By.xpath("//div[text()='"+str+"']"));
		String ProName = TSHirt.getText();
		TSHirt.click();
		ObjRep.Reporter("A product was selected");
		
		
		WebElement AddToCart = Driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		AddToCart.click();
		ObjRep.Reporter("Add to cart Button was clicked");
		
		
		return ProName;		
		
	}
	
	public void NavigatetoMycartPage() {
		WebElement MyCart = Driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
		MyCart.click();
		ObjRep.Reporter("Navigating to My cart page");
		
	}
	
	
	public String GetNameofProdctMyCart() {
		WebElement MyCartProduct = Driver.findElement(By.xpath("//div[@class='cart_item_label']/a/div"));
		String PrdNmeCart = MyCartProduct.getText();
		ObjRep.Reporter("Got the text of product in my carrt page :- "+PrdNmeCart);
		return PrdNmeCart;		
		
	}
	
	
	
	
	
	
	
	
	
	public void CloseApp() {
		//Login to SauseDemo Appication
		Driver.close();
		ObjRep.Reporter("Close application");
	}

}
