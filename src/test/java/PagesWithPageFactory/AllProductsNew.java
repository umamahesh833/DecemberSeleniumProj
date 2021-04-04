package PagesWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Reporting.report;

public class AllProductsNew {
	report Objrep = new report();
	
	//with out page factory
	By AZelemtent = By.xpath("//select[@class='product_sort_container']");
	
	
	
	//with page factory
	@FindBy(xpath = "//select[@class='product_sort_container']") 
	WebElement AZelement;
	
	
	public void verifyAZelementDisplay() {

		if(AZelement.isDisplayed()) {
			Objrep.Reporter("Login is successfull");
		}else {
			Objrep.Reporter("Login is not successfull");
		}
		
	}

}
