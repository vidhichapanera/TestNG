package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.ArrayList;

public class DragAndDropPO {

    public WebDriver driver;

    public DragAndDropPO(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @author Vidhi chapanera
     * all Xpath for Change drag and drop Testcases
     * created on : 22-05-2020
     */
    public By dragbutton_xpath = By.xpath("//a[contains(text(),'SALES')]");
    public By drpLocation_xpath = By.id("loan");


    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to perform Drag and drop
     * created on : 22-05-2020
     */
    public boolean DragAndDrop() {
        try {
            WebElement dragLocation = driver.findElement(dragbutton_xpath);

            WebElement dropLocation = driver.findElement(drpLocation_xpath);

            Actions actions = new Actions(driver);
            Action dragAndDrop = actions.clickAndHold(dragLocation)
                    .moveToElement(dropLocation)
                    .release(dropLocation)
                    .build();
            dragAndDrop.perform();
            Thread.sleep(2000);

          /*  //Element which needs to drag.
            WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));

            //Element on which need to drop.
            WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));

            //Using Action class for drag and drop.
            Actions act=new Actions(driver);

            //Dragged and dropped.
            act.dragAndDrop(From, To).build().perform();

            Thread.sleep(7000);*/
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
