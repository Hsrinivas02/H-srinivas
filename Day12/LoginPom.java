package day12assesment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {

	WebDriver driver;
	String url;
	String username;
	String password;
	public LoginPom(WebDriver driver) throws IOException {
		this.driver= driver;
		PageFactory.initElements(driver, this);
        FileInputStream fis =new FileInputStream("./src/main/java/day12assesment/commondata.properties");
        Properties p1 = new Properties();
        p1.load(fis);
        this.url = p1.getProperty("url");
        this.username = p1.getProperty("username");
        this.password = p1.getProperty("password");
	}
	// Locate username field
	@FindBy(xpath = "//input[@name=\"username\"]")
	private WebElement un;
	// Locate password field
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement pwd;
	// Locate login button
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement lgbutton;
	// Click login button
	public void getLgbutton() {
		lgbutton.click();
	}
	// Enter username
	public void getUn() {
		un.sendKeys(username);
	}
	// Enter password
	public void getPwd() {
		pwd.sendKeys(password);
	}
	// Return application URL
	public String getUrl() {
		return url;
	}
}
