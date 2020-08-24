package DropDownTS;

import CommonPO.BaseTest;
import DropDown.DropDownPO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTC extends BaseTest {

    public int flag = 1;

    public DropDownTC() {
    }

    public DropDownTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
        flag = Flag;
    }


    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for drop down
     * created on : 22-05-2020
     */
    @Test
    public void DropDownTestCase() {
        DropDownPO dropDownPO = new DropDownPO(driver);

        //Step-1: Select Value From DropDow
        Assert.assertTrue(dropDownPO.selectValueFromDropDwon(), "Select Value From DropDow");

    }
}