package Last_Assesment_Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


//1.Navigate to demoAppsQspiders draganddrop multiple page
//2.drag and drop the accessories accordingly.
//        3.Click on Place order button.
//4.Verify that order is placed.
public class Task3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=3");

        WebElement lapsrc1=driver.findElement(By.id("dragElement1"));
        WebElement lapsrc2=driver.findElement(By.id("dragElement3"));
        WebElement mbsrc1=driver.findElement(By.id("dragElement2"));
        WebElement mbsrc2=driver.findElement(By.id("dragElement4"));


        WebElement laptrg=driver.findElement(By.id("dropZone1"));
        WebElement mbtrg=driver.findElement(By.id("dropZone2"));


        Actions act=new Actions(driver);
        // Mobile Cover, Mobile Charger -> Mobile Accessories
        act.keyDown(Keys.CONTROL)
                .click(lapsrc1)
                .click(lapsrc2)
                .keyUp(Keys.CONTROL)
                .perform();

        // draging to Mobile Accessories
        act.clickAndHold(lapsrc1)
                .moveToElement(laptrg)
                .release()
                .perform();
        Thread.sleep(2000);


        act.keyDown(Keys.CONTROL)
                .click(mbsrc1)
                .click(mbsrc2)
                .keyUp(Keys.CONTROL)
                .perform();

        // draging to Mobile Accessories
        act.clickAndHold(mbsrc1)
                .moveToElement(mbtrg)
                .release()
                .perform();



    }
}
