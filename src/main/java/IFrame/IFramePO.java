package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class IFramePO {

    public WebDriver driver;

    public IFramePO(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @author Vidhi chapanera
     * all Xpath for Change iframe Testcases
     * created on : 22-05-2020
     */
    public By textbox_xpath = By.xpath("//input[@type='text']");


    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to get size of iframe
     * created on : 22-05-2020
     */
    public boolean getSizeOfIframe() {
        try {
            /*List<WebElement> iframe = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("IFrame")));
            System.out.println("The Total number of iframe count are : " + iframe.size());*/

            JavascriptExecutor exe = (JavascriptExecutor) driver;
            Integer framecount = Integer.parseInt(exe.executeScript("return window.length").toString());
            System.out.println("The Total number of iframe count are : "+ framecount);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to switch to frame
     * created on : 22-05-2020
     */
    public boolean switchToIFrame() {
        try {

            WebElement fm1 = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='IF2']")));
            driver.switchTo().frame(fm1);

            WebElement txt = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='sidebar']//li//a[contains(text(),'Selectable')]")));
            txt.click();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

