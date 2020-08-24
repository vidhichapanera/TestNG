package ListSize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ListSizePO {

    public WebDriver driver;

    public ListSizePO(WebDriver driver) {
        this.driver=driver;
    }


    /**
     * @author Vidhi chapanera
     * all Xpath for Change list size Testcases
     * created on : 22-05-2020
     */
    public By dropDwn_Xpath = By.xpath("//select");
    public By dropDwnList_Xpath = By.xpath("//select//option");


    /**
     * @author Vidhi chapanera
     * @return boolean
     * @discription This method is used to get list of dropdown
     * created on : 22-05-2020
     */
    public boolean getListOfDropDown() {
        try {

            WebElement dpdn  = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfElementLocated(dropDwn_Xpath));
            dpdn.click();

            List<WebElement> list = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.presenceOfAllElementsLocatedBy(dropDwnList_Xpath));

            System.out.println(list.size());

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
