package day12assesment;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyInfoPom {
	
	WebDriver driver;
	public MyInfoPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locate the first name field
	@FindBy(xpath= "//input[@name=\"firstName\"]")
	private WebElement fname;
	// Get the updated first name
	public String getFname() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.attributeToBeNotEmpty(fname, "value"));
	    return fname.getDomProperty("value");
	}
	// Enter the first name
	public void getFname(String fn) throws InterruptedException {
		Thread.sleep(1500);
		fname.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	    fname.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(1500);
	    fname.sendKeys(fn);
		Thread.sleep(1500);
	}
	// Locate the last name field
	@FindBy(xpath= "//input[@name=\"lastName\"]")
	private WebElement Lname;
	// Get the updated last name
	public String getLname() {
	    return Lname.getDomProperty("value");
	}
	// Enter the last name
	public void getLname(String fn) throws InterruptedException {
		Thread.sleep(1500);
		Lname.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Lname.sendKeys(Keys.BACK_SPACE);
		Lname.sendKeys(fn);
		Thread.sleep(1500);
	}
	// Locate the employee ID field
	@FindBy(xpath= "//label[text()=\"Employee Id\"]/parent::div/following-sibling::div/child::input")
	private WebElement empId;
	// Enter the employee ID
	public void getempId(String empid) throws InterruptedException {
		Thread.sleep(1500);
		empId.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		empId.sendKeys(Keys.BACK_SPACE);
		empId.sendKeys(empid);
		Thread.sleep(1500);
	}
	// Locate the Save button
	@FindBy(xpath= "(//button[normalize-space()=\"Save\"])[1]")
	private WebElement savebtn;
	// Click the Save button
	public void getSaveBtn() throws InterruptedException {
		savebtn.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
}
