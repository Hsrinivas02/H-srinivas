package DAY10ASSESMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutpom {
	WebDriver driver;

	public checkoutpom(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(id="first-name")
	private WebElement firstname;
	
	@FindBy(id="last-name")
	private WebElement lastname;
	
	@FindBy(id="postal-code")
	private WebElement postalcode ;
	
	@FindBy(id="continue")
	private WebElement continu;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPostalcode() {
		return postalcode;
	}

	public void getContinu() {
		 continu.click();;
	}
	
	
	
	
	
}
