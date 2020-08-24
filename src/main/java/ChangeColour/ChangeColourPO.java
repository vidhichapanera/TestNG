package ChangeColour;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;


public class ChangeColourPO {


    public WebDriver driver;

    public ChangeColourPO(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @author Vidhi chapanera
     * all Xpath for Change color Testcases
     * created on : 22-05-2020
     */
    public By btn_xpath = By.cssSelector("button#colorChange");


    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to veridy change color
     * created on : 22-05-2020
     */
    public boolean verifyChangeColor() {
        try {

            WebElement e = new WebDriverWait(driver,60).
                    until(ExpectedConditions.visibilityOfElementLocated(btn_xpath));
           e.click();
            String buttonTextColor = driver.findElement(By.cssSelector("button#colorChange")).getCssValue("color");
            System.out.println("Text color " + buttonTextColor);
            if (e.getCssValue("color").contains("rgba(255, 255, 255, 1)")){
                System.out.println("pass......!!!");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                // Code to copy the screenshot in the desired location
               // FileUtils.copyFile(scrFile, new File("D:\\google.jpg"));
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
