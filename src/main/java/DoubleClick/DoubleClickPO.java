package DoubleClick;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickPO {

    public WebDriver driver;

    public DoubleClickPO(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @author Vidhi chapanera
     * all Xpath for  double click Testcases
     * created on : 22-05-2020
     */
    public By dclick_xpath = By.id("doubleClickBtn");




    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to double click on button
     * created on : 22-05-2020
     */
    public boolean doubleClickonButton() {
        try {
            WebElement button = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(dclick_xpath));
            Actions actions = new Actions(driver);
            actions.doubleClick(button).perform();
            Thread.sleep(3000);
            Alert alert = driver.switchTo().alert();
            alert.accept();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
