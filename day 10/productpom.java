package DAY10ASSESMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpom {
	WebDriver driver;

	public productpom(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']/ancestor::div[@class=\"inventory_item_label\"]/following-sibling::div/descendant::button")
	private WebElement addcart;

	public void getAddcart() {
		 addcart.click();;
	}
	
	@FindBy(id="shopping_cart_container")
	private WebElement cartclick;

	public void getCartclick() {
		 cartclick.click();
	}
	
	
	
}
