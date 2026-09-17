package DAY10ASSESMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class finishpom {
	WebDriver driver;

	public finishpom(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(id="finish")
	private WebElement finish;

	public void  getFinish() {
		 finish.click();
	}
	
	
}
