package Scroll;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPO {

    public WebDriver driver;

    public FormPO(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * @author Vidhi chapanera
     * all Xpath for Change Right Click Testcases
     * created on : 22-05-2020
     */
    public By type = By.cssSelector("input#userName");



    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to right click on button
     * created on : 22-05-2020
     */
    public boolean RightClickOnButton() {
        try {

            Thread.sleep(6000);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("document.getElementById(‘username').value=vidhi");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
