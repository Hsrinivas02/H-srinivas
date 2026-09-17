package pom;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saaucek1 {

    WebDriver driver;

    public void launch() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void url() {

        driver.get("https://www.saucedemo.com/");
    }

    public void user() {

        driver.findElement(By.id("user-name"))
               .sendKeys("standard_user");
    }

    public void pass() {

        driver.findElement(By.id("password"))
               .sendKeys("secret_sauce");
    }

    public void login() {

        driver.findElement(By.id("login-button"))
               .click();
    }
    public void close() {
    	driver.quit();
    }
}