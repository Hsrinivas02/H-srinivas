package Last_Assesment_Task_2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzPage {

    WebDriver driver;

    public BuzzPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Buzz']")
    private WebElement buzzbtn;

    @FindBy(xpath = "//textarea[@placeholder=\"What's on your mind?\"]")
    private WebElement MindText;

    @FindBy(xpath = "//button[@type='submit' and contains(@class,'oxd-button--main')]")
    private WebElement postbtn;

    public void clickBuzz() {
        buzzbtn.click();
    }

    public void enterMindText(String value) {
        MindText.sendKeys(value);
    }

    public void clickPost() {
        postbtn.click();
    }
}