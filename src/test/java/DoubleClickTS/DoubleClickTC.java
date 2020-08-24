package DoubleClickTS;

import Alert.AlertPO;
import CommonPO.BaseTest;
import DoubleClick.DoubleClickPO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickTC extends BaseTest {

    public int flag = 1;

    public DoubleClickTC() {
    }

    public DoubleClickTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
        flag = Flag;
    }


    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for double click
     * created on : 22-05-2020
     */
    @Test
    public void doubleClickTestCase() {

        DoubleClickPO doubleClickPO = new DoubleClickPO(driver);

        //Step-1 : Click on Double Click
        Assert.assertTrue(doubleClickPO.doubleClickonButton(), "Click on Double Click");

    }

}
