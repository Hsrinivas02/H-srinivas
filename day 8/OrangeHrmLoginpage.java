package PomUtilities;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLoginpage {

	WebDriver driver;

	public OrangeHrmLoginpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css = "[name='username']")
	private WebElement user;
	
	@FindBy(css = "[type='password']")
	private WebElement pass;
	
	@FindBy(css = "[type='submit']")
	private WebElement submit;

	public void getUser(String value) {
		user.sendKeys(value);
	}

	public void getPass(String value) {
		pass.sendKeys(value);
	}

	public void getSubmit() {
		submit.click();
	}
	
	
	
}
