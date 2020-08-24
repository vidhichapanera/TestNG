package RightClick;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickPO {

    public WebDriver driver;

    public RightClickPO(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * @author Vidhi chapanera
     * all Xpath for Change Right Click Testcases
     * created on : 22-05-2020
     */
    public By rclick_xpath = By.xpath("//span[contains(text(),'right click me')]");
    public By paste_xpath = By.xpath("//span[contains(text(),'Paste')]//parent::li");



    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to right click on button
     * created on : 22-05-2020
     */
    @Step("right click on button")
    public boolean RightClickOnButton() {
        try {
            WebElement button = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(rclick_xpath));
            Actions actions = new Actions(driver);
            actions.contextClick(button).perform();
            Thread.sleep(7000);

            WebElement option = new WebDriverWait(driver,90)
                    .until(ExpectedConditions.visibilityOfElementLocated(paste_xpath));
            option.click();

            Alert alert = driver.switchTo().alert();
            alert.accept();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
