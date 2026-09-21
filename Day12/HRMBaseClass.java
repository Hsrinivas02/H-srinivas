package day12assesment;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class HRMBaseClass {

    WebDriver driver = null;

    @BeforeSuite
    public void BS() {
    	Reporter.log("--> Establish DB Connection",true);
    }

    @BeforeTest
    public void BT() {
    	Reporter.log("-->Pre-conditions",true);
    }

    @BeforeClass
    public void BC() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Reporter.log("-->Launching the Browser",true);
    }

    @BeforeMethod
    public void BM() throws IOException, InterruptedException {       
        LoginPom l = new LoginPom(driver);
        driver.get(l.getUrl());
        l.getUn();
        Thread.sleep(1000);
        l.getPwd();
        Thread.sleep(1000);
        l.getLgbutton();
        Reporter.log("-->Login Successfull",true);
    }
    @AfterMethod
    public void AM() throws InterruptedException {
    	LogOutPom lp =new LogOutPom(driver);
    	lp.getdropd();
    	Thread.sleep(1500);
    	lp.getlogout();
    	Reporter.log("-->Logged Out Successfully",true);
    }
    @AfterClass
    public void AC() throws InterruptedException{
    	Thread.sleep(3000);
    	Reporter.log("-->Closing the Browser",true);
    	driver.quit();
    	
    }
    @AfterTest 
    public void AT() {
    	Reporter.log("-->Post-Conditions",true);
    	
    }
    @AfterSuite
    public void AS() {
    	Reporter.log("-->Disconnect the DB Connection",true);
    }    
}
