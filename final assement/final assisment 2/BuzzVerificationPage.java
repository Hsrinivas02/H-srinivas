package Last_Assesment_Task_2.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuzzVerificationPage {

    WebDriver driver;

    public BuzzVerificationPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyPost(String value) {

        By post = By.xpath(
                "//p[normalize-space()='" + value + "']"
        );

        return driver.findElement(post).isDisplayed();
    }
}