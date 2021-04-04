package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllProducts {
	
	WebDriver driver;

	
	public AllProducts(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	By AZelemtent = By.xpath("//select[@class='product_sort_container']");
	By product = By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']");
	
	
	public boolean VerifyAZelementDisplay() {		

		return driver.findElement(AZelemtent).isDisplayed();
	}
	
	
	public void clickOnproduct() {		

		driver.findElement(product).click();
	}
	
	
}
