package PomUtilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmRecruitmentPage {

	WebDriver driver;

	public OrangeHrmRecruitmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addButton;
	
	
	@FindBy(xpath = "(//div[text()='-- Select --'])[2]")
	private WebElement vacancyCheck;
	@FindBy(xpath = "(//div[text()='-- Select --'])[2]")
	private WebElement managerClick;
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/descendant::span[text()='Test User']")
	private WebElement manager;
	@FindBy(xpath = "(//div[text()='-- Select --'])[2]")
	private WebElement statusClick;
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/descendant::span[text()='Application Initiated']")
	private WebElement status;
	@FindBy(css = "[placeholder='Type for hints...']")
	private WebElement cn;
	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement search;
	@FindBy(xpath ="//div[@class='oxd-table-body']/descendant::div[text()='anusha jade shiva']")
	private WebElement RecordFound;
	public void getAddButton() {
		addButton.click();
	}
	
	public void getVacancyCheck() {
		vacancyCheck.click();
	}
	
	public void getHiremanagerClick()
	{
		managerClick.click();
	}
	public void getHiremanagerSelect()
	{
		manager.click();
	}
	public void getStatusClick()
	{
		statusClick.click();
	}
	public void getStatus()
	{
		status.click();
	}
	public void getCandidateName(String value) throws InterruptedException {
	 cn.sendKeys(value);
	 Thread.sleep(3000);
	 cn.sendKeys(Keys.DOWN,Keys.ENTER);
	}
	public void getSearch() {
		search.click();
	}
	public void getRecordFound(String value ) {
		String rf = RecordFound.getText();
		if(rf.equals(value))
		{
			System.out.println("Record found");
		}
		else
		{
			System.out.println("record not found");
		}
	}
	
	
	
	
	
	

}
