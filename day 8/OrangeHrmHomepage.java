package PomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmHomepage {
  WebDriver driver;

  public OrangeHrmHomepage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements( driver,this);
  }
  @FindBy(xpath = "//span[text()='Recruitment']")
  private WebElement Recuritment;

  public void getRecuritment() {
	Recuritment.click();
  }
  
  
}
