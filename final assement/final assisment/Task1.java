package Last_Assesment_Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demoapps.qspiders.com/ui/toggle/disabled?sublist=1");
        List<WebElement> toggles = driver.findElements(By.xpath("//input[@type='checkbox']"));

        JavascriptExecutor ex = (JavascriptExecutor) driver;
        // Enable all toggle buttons
        for (WebElement toggle : toggles) {

            ex.executeScript("arguments[0].removeAttribute('disabled');", toggle);
                           ex.executeScript("arguments[0].click();", toggle);
                           Thread.sleep(2000);
        }
       driver.findElement(By.id("togglers")).click();

        if(driver.findElement(By.xpath("//p[text()='Your Order has been successfully placed!']")).isDisplayed())
        {
            System.out.println("Order has been successfully placed!");
        }
        else {
            System.out.println("Not place");
        }

    }

}