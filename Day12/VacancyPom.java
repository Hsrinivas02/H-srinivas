package day12assesment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacancyPom {
	WebDriver driver;
	public VacancyPom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locate the Vacancy Name input field
	@FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	private WebElement VacancyName;
	// Return the Vacancy Name element
	public WebElement getVacancyName() {
		return VacancyName;
	}
	// Locate the Job Title dropdown
	@FindBy(xpath = "//div[@class=\"oxd-select-text oxd-select-text--active\"]")
	private WebElement JobTi;
	// Click the Job Title dropdown
	public void getJobTi() {
		JobTi.click();;
	}
	// Locate the Software Engineer option
	@FindBy(xpath = "//span[text()=\"Software Engineer\"]")
	private WebElement JobTittle;
	// Select Software Engineer from the dropdown
	public void getJobTittle() throws InterruptedException {
		JobTittle.click();
		Thread.sleep(1500);
	}
	// Locate the Description text area
	@FindBy(xpath = "//textarea[@placeholder=\"Type description here\"]")
	private WebElement Des;
	// Enter the vacancy description
	public void getDes(String des) throws InterruptedException {
		Des.sendKeys(des);
		Thread.sleep(1500);
	}
	// Locate the HR Manager input field
	@FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
	private WebElement hRm;
	// Enter the HR Manager name and wait for suggestions
	public void gethRm(String hrm) throws InterruptedException {
		hRm.sendKeys(hrm);
		Thread.sleep(3000);
	}
	// Locate the Number of Positions input field
	@FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/descendant::div[@class=\"oxd-input-group__label-wrapper\"]/following-sibling::div/input)[2]")
	private WebElement noofpositions;
	// Enter the number of positions
	public void getnoofp() {
		noofpositions.sendKeys("20");
	}
	// Locate the Save button
	@FindBy(xpath = "//button[normalize-space()=\"Save\"]")
	private WebElement savebtn;
	// Click the Save button
	public void getsavebtn() {
		savebtn.click();
	}
	
}
