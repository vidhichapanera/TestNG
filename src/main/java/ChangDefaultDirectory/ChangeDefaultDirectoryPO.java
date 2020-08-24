package ChangDefaultDirectory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ChangeDefaultDirectoryPO {

    public WebDriver driver;

    public ChangeDefaultDirectoryPO(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @author Vidhi chapanera
     * all Xpath for Change Default download Directory Testcases
     * created on : 22-05-2020
     */
    public By link_xpath = By.xpath("//a[@href='https://selenium-release.storage.googleapis.com/3.141/selenium-java-3.141.59.zip']");


    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to change default download directory
     * created on : 22-05-2020
     */
    public boolean changeDefaultDownloadDirectory() {
        try {
            boolean flag = false;
            //System.out.println(options.getExperimentalOption("prefs"));
            WebElement dlink = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(link_xpath));
            dlink.click();
            File tempFile = new File("D:\\Download\\selenium-java-3.141.59.zip");
            while (true) {
                if (tempFile.exists()) {
                    flag = true;
                    break;
                }
                Thread.sleep(1000);
            }
            return flag;
        } catch (Exception e) {
            return false;
        }
    }

}
