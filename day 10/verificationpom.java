package DAY10ASSESMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class verificationpom {
		WebDriver driver;

		public verificationpom(WebDriver driver) {
			this.driver=driver;
			
			PageFactory.initElements(driver,this);
			
			
		}
		@FindBy(xpath="//h2[text()='Thank you for your order!']")
		private WebElement verify;

		public WebElement getVerify() {
			return verify;
		}
		
		
}
