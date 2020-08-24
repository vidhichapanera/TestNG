package Scroll;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class ScrollPO {

    public WebDriver driver;

    public ScrollPO(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * @author Vidhi chapanera
     * all Xpath for Change Scroll Testcases
     * created on : 22-05-2020
     */

    public By btn_xpath = By.xpath("//a[contains(text(),'TestNG Popular Posts')]");
    @FindBy(id = "//a[contains(text(),'Demo Website!')]")
    WebElement text;


    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to scroll down
     * created on : 22-05-2020
     */
    public boolean scrolldown()  {
        try {
            Thread.sleep(2000);

            PageFactory.initElements(driver,this);
            text.click();

            //Using Robot class
            Robot robot =new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

            // Using Actions class
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN).perform();

            //Using java script Executor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1000)");

            WebElement button = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(btn_xpath));
            button.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
