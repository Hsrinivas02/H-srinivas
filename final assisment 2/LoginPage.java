package Last_Assesment_Task_2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement passWord;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;

    @FindBy(className = "oxd-userdropdown-tab")
    private WebElement profile;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logout;


    public void enterUserName(String value) {
        userName.sendKeys(value);
    }

    public void enterPassword(String value) {
        passWord.sendKeys(value);
    }

    public void clickLogin() {
        loginBtn.click();
    }

    public void logout() {
        profile.click();
        logout.click();
    }
}