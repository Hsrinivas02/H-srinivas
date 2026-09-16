package PomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmCandidatesPage {

	WebDriver driver;

	public OrangeHrmCandidatesPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css = "[name='firstName']")
	private WebElement fn;
	@FindBy(css = "[name='middleName']")
	private WebElement mn;
	@FindBy(css = "[name='lastName']")
	private WebElement ln;
    @FindBy(xpath = "//div[text()='-- Select --']")
    private WebElement vacancyClick;
    @FindBy(xpath = "//div[@class='oxd-select-option']/child::span[text()='Payroll Administrator']")
    private WebElement vacancySelect;
    @FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
    private WebElement email;
    @FindBy(xpath = "(//input[@placeholder='Type here'])[2]")
    private WebElement phoneNo;
    @FindBy(xpath = "//div[text()='Browse']")
    private WebElement fileBrowse;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement file;
    @FindBy(xpath = "//button[text()=' Save ']")
    private WebElement save;
	@FindBy(xpath = "//a[text()='Candidates']")
	private WebElement candidates;
	
	public void getFn(String value) {
		fn.sendKeys(value);;
	}
	public void getMn(String value) {
		mn.sendKeys(value);;
	}
	public void getLn(String value) {
		ln.sendKeys(value);
	}
	public void getVacancyClick() {
		vacancyClick.click();
	}
	public void getVacancySelect() {
	   vacancySelect.click();
	}
	public void getEmail(String value) {
		email.sendKeys(value);
	}
	public void getPhoneNo(String value) {
		 phoneNo.sendKeys(value);
	}
	
   public void getFileBrowse() {
		fileBrowse.click();
	}
	public void getFile(String path) {
		file.sendKeys(path);
	}
   
	public void getSave() {
		save.click();
	}
	
	public void getCandidates() {
		candidates.click();
	}
}
