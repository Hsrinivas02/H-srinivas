package day12assesment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class recruiterPagePom {
	WebDriver driver;
	public recruiterPagePom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	// Locate the Vacancies link
	@FindBy(xpath = "//a[text()=\"Vacancies\"]")
	private WebElement vacancyLink;
	// Click the Vacancies link
	public void getvacancyLink() {
		vacancyLink.click();
	}
	// Locate the Add button
	@FindBy(xpath = "//button[normalize-space()=\"Add\"]")
	private WebElement addLink;
	// Click the Add button
	public void getAddLink() {
		addLink.click();
	}


}
