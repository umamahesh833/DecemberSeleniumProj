package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDisplayPage {
	
	public ProductDisplayPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	WebDriver driver;
	
	By AddToCart = By.xpath("//button[text()='ADD TO CART']");
	By NavCart = By.xpath("//div[@id='shopping_cart_container']/a");
	
	
	public void ClickAddToCart() {
		driver.findElement(AddToCart).click();
	}
	
	public void NavCartpage() {
		driver.findElement(NavCart).click();
	}

}
