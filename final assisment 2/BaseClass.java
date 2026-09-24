package Last_Assesment_Task_2;

import Last_Assesment_Task_2.pom.BuzzPage;
import Last_Assesment_Task_2.pom.BuzzVerificationPage;
import Last_Assesment_Task_2.pom.LoginPage;
import Last_Assesment_Task_2.utilities.PropertyUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

public class BaseClass {

    WebDriver driver;

    LoginPage loginPage;
    BuzzPage buzzPage;
    BuzzVerificationPage buzzVerificationPage;


    @BeforeClass
    public void beforeClass() throws IOException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(
                Duration.ofSeconds(10)
        );

        driver.get(
                PropertyUtility.getData("url")
        );

        System.out.println("Test Execution Started");
        System.out.println("Browser Launched");
    }


    @BeforeMethod
    public void setUp() throws IOException {

        loginPage = new LoginPage(driver);

        buzzPage = new BuzzPage(driver);

        buzzVerificationPage =
                new BuzzVerificationPage(driver);


        loginPage.enterUserName(
                PropertyUtility.getData("username")
        );

        loginPage.enterPassword(
                PropertyUtility.getData("password")
        );

        loginPage.clickLogin();

        System.out.println("Login Successful");
    }


    @AfterMethod
    public void tearDown() {

        loginPage.logout();

        System.out.println("Logout Successful");
    }


    @AfterClass
    public void afterClass() {

        driver.quit();

        System.out.println("Browser Closed");
        System.out.println("Test Execution Completed");
    }
}