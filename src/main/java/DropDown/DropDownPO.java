package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DropDownPO {

    public WebDriver driver;

    public DropDownPO(WebDriver driver) {
        this.driver=driver;
    }

    /**
     * @author Vidhi chapanera
     * all Xpath for Change drop down Testcases
     * created on : 22-05-2020
     */
    public By dropDwn_Xpath = By.xpath("//select");
    public By dropDwnList_Xpath = By.xpath("//select//option");



    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to select value from drop down
     * created on : 22-05-2020
     */
    public boolean selectValueFromDropDwon() {
        try {
            WebElement dpdn  = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(dropDwn_Xpath));

            Select select = new Select(dpdn);
            select.selectByIndex(3);
            select.selectByValue("k");
            System.out.println("pass >>>>>>>>>>>>>>>>>>>>>>.");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
