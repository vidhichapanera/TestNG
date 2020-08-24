package NewWindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class NewWindowPO {

    public WebDriver driver;

    public NewWindowPO(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @author Vidhi chapanera
     * all Xpath for Change New Window Testcases
     * created on : 22-05-2020
     */
    public By newWin_xpath = By.xpath("//input[@value='Open a new window']");
    public By icon_xpath = By.id("searchicon");



    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to click on button
     * created on : 22-05-2020
     */
    public boolean clickOnButton() {
        try {
            WebElement button = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(newWin_xpath));
            button.click();

            ArrayList<String> win1 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(win1.get(1));

            Thread.sleep(2000);
            WebElement btn = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(icon_xpath));
            btn.click();

            Thread.sleep(2000);
            ArrayList<String> win2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(win2.get(0));
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
