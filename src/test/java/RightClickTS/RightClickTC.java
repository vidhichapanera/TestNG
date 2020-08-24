package RightClickTS;

import CommonPO.BaseTest;
import DoubleClick.DoubleClickPO;
import RightClick.RightClickPO;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RightClickTC extends BaseTest {

    public int flag = 1;

    public RightClickTC() {
    }

    public RightClickTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
        flag = Flag;
    }

    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for Right click on button
     * created on : 22-05-2020
     */
    @Test(priority = 0, description="Invalid Login Scenario with wrong username and password.")
    public void RightClickTestCase() {

        RightClickPO rightClickPO = new RightClickPO(driver);

        //Step-1 : Click on Right Click
        Assert.assertTrue(rightClickPO.RightClickOnButton(), "right click on button");

    }

}
