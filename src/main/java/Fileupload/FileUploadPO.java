package Fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPO {


    public WebDriver driver;

    public FileUploadPO(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @author Vidhi chapanera
     * all Xpath for File Upload Testcases
     * created on : 24-05-2020
     */
    public By btn_xpath = By.cssSelector("input#uploadFile");


    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to File Upload
     * created on : 24-05-2020
     */
    public boolean fileUpload() {
        try {

            WebElement e = new WebDriverWait(driver,60).
                    until(ExpectedConditions.visibilityOfElementLocated(btn_xpath));
           /* e.click();
            Thread.sleep(300);
            e.sendKeys("D:\\selenium-server-standalone-3.141.59.jar");
            Thread.sleep(2000);*/

            Thread.sleep(2000);
            //((RemoteWebElement) e).setFileDetector(new LocalFileDetector());
           // e.sendKeys("D:\\selenium-server-standalone-3.141.59.jar");
            e.click();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
