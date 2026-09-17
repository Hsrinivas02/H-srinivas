package DAY10ASSESMENT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class sauceBaseclass {
	WebDriver driver=null;
@BeforeSuite
public void bs() {
	System.out.println("establish database connection");
}
@BeforeTest
public void bt() {
	System.out.println("pre-conditions");
}

@BeforeClass
public void bc() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println("browser is launched");
}

@BeforeMethod
public void bm() throws IOException, InterruptedException {
	FileInputStream f= new FileInputStream("./src/main/java/DAY10ASSESMENT/config.properties");
	Properties p = new Properties();
	p.load(f);
	
	System.out.println(p.getProperty("browser"));
	System.out.println(p.getProperty("url"));
	System.out.println(p.getProperty("username"));
	System.out.println(p.getProperty("password"));
	
	String browser = (p.getProperty("browser"));
    String url = (p.getProperty("url"));
    String username = (p.getProperty("username"));
    String password = (p.getProperty("password"));
	
    driver.get(url);
    loginpom l=new loginpom(driver);
    Thread.sleep(3000);
    l.getUsername().sendKeys("standard_user");
    Thread.sleep(3000);
    l.getPassword().sendKeys("secret_sauce");
    Thread.sleep(3000);
    l.getLoginbutton().click();
    
}
}
