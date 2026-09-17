package DAY10ASSESMENT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.testng.annotations.Test;

public class sauceexecuter extends sauceBaseclass {
	@Test
	
	public void loginTest() throws IOException, InterruptedException {
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
			System.out.println("product is displayed");
		}else {
			System.out.println("product is not displayed");
		}
		productpom pp= new productpom(driver);
		pp.getAddcart();
		Thread.sleep(3000);
		pp.getCartclick();
		Thread.sleep(3000);
		
		
		cartpom cp=new cartpom(driver);
		if(cp.getProduct().isDisplayed()) {
			System.out.println("sauce backpack is displayed");
		}else {
			System.out.println("sauce backnot displayed");
		}
		cp.getCheckout();
		Thread.sleep(3000);
		FileInputStream f= new FileInputStream("./src/main/java/DAY10ASSESMENT/config.properties");
		Properties ps=new Properties();
		ps.load(f);
		
		System.out.println(ps.getProperty("firstname"));
		System.out.println(ps.getProperty("lastname"));
		System.out.println(ps.getProperty("zipcode"));
		
		String firstname = (ps.getProperty("firstname"));
		String lastname = (ps.getProperty("lastname"));
		String zipcode = (ps.getProperty("zipcode"));
		
		checkoutpom cp1=new checkoutpom(driver);
		cp1.getFirstname().sendKeys(firstname);
		Thread.sleep(3000);
		cp1.getLastname().sendKeys(lastname);
		Thread.sleep(3000);
		cp1.getPostalcode().sendKeys(zipcode);
		Thread.sleep(3000);
		cp1.getContinu();
		Thread.sleep(3000);
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")){
			System.out.println(" the Checkout: Overview page is displayed.");
		}else {
			System.out.println("the Checkout page  Overview page is not displayed");
		}
		
	}
	@Test
	public void oderPalcementTest() throws IOException, InterruptedException {
		
		productpom pp= new productpom(driver);	
		Thread.sleep(3000);
		pp.getCartclick();
		Thread.sleep(3000);
			
		cartpom cp=new cartpom(driver);
		cp.getCheckout();
		Thread.sleep(3000);
		FileInputStream f= new FileInputStream("./src/main/java/DAY10ASSESMENT/config.properties");
		Properties ps=new Properties();
		ps.load(f);
		

		
		String firstname = (ps.getProperty("firstname"));
		String lastname = (ps.getProperty("lastname"));
		String zipcode = (ps.getProperty("zipcode"));
		
		checkoutpom cp1=new checkoutpom(driver);
		cp1.getFirstname().sendKeys(firstname);
		Thread.sleep(3000);
		cp1.getLastname().sendKeys(lastname);
		Thread.sleep(3000);
		cp1.getPostalcode().sendKeys(zipcode);
		Thread.sleep(3000);
		cp1.getContinu();
		Thread.sleep(3000);
		
		finishpom fp =new finishpom(driver);
				fp.getFinish();
				Thread.sleep(3000);
				
				verificationpom ver=new verificationpom(driver);
				if(ver.getVerify().isDisplayed()) {
					System.out.println("displayed");
				}
				else {
					System.out.println("not displayed");
				}
		
	}
}
