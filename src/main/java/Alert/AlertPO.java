package Alert;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPO {

    public WebDriver driver;

    public AlertPO(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @author Vidhi chapanera
     * all Xpath for Alert Testcases
     * created on : 22-05-2020
     */
    public By single_xpath = By.xpath("//button[@class='btn btn-default']");
    public By con_xpath = By.xpath("//button[@onclick='myConfirmFunction()']");
    public By promt_xpath = By.xpath("//button[@onclick='myPromptFunction()']");



    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to click on single alertbox
     * created on : 22-05-2020
     */
    public boolean clickOnSingleAlertBox() {
        try {
            WebElement button = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(single_xpath));
            button.click();
            Thread.sleep(3000);
            Alert alert = driver.switchTo().alert();
            alert.accept();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to click on confirm alertbox
     * created on : 22-05-2020
     */
    public boolean clickOnConfirmAlertBox() {
        try {
            WebElement button = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(con_xpath));
            button.click();
            Thread.sleep(3000);
            Alert alert = driver.switchTo().alert();
            alert.dismiss();

            return true;
        } catch (Exception e) {
            return false;
        }
    }


    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to click on prompt alertbox
     * created on : 22-05-2020
     */
    public boolean clickOnPromptAlertBox() {
        try {
            WebElement button = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(promt_xpath));
            button.click();
            Thread.sleep(3000);
            Thread.sleep(3000);
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("Vidhi");
            alert.accept();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
