package Last_Assesment_Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

//        1.Navigate to demoAppsQspiders slidder page
//        2.slide the bar till men cotton jacket and verify.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoapps.qspiders.com/ui/slider");
        WebElement ele=driver.findElement(By.id("slide"));
       Actions a=new Actions(driver);
      a.clickAndHold(ele).moveByOffset(200,0).release().perform();
        WebElement jacket=driver.findElement(By.xpath("//h3[contains(text(),'Mens Cotton Jacket')]"));
        System.out.println("Product: "+jacket.getText());



    }
}