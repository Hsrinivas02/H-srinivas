package day12assesment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {
	WebDriver driver;
	public HomePagePom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
		// Locate the Recruitment link
		@FindBy(xpath = "//span[text()='Recruitment']")
		private WebElement recruiterLink;
		// Click the Recruitment link
		public void getrecruiterLink() {
			recruiterLink.click();
		}
		// Locate the My Info link
		@FindBy(xpath = "//span[normalize-space()=\"My Info\"]")
		private WebElement MyInfoLink;
		// Click the My Info link
		public void getMyInfoLink() {
			MyInfoLink.click();
		}
	

}
