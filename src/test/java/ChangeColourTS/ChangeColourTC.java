package ChangeColourTS;

import ChangDefaultDirectory.ChangeDefaultDirectoryPO;
import ChangeColour.ChangeColourPO;
import CommonPO.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeColourTC extends BaseTest
{

    public ChangeColourTC() { }

    public ChangeColourTC(WebDriver passDriver) {
        driver = passDriver;
    }


    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for verify Change color
     * created on : 22-05-2020
     */
    @Test()
    public void verifyChangeColor() {

        ChangeColourPO changeColourPO = new ChangeColourPO(driver);

        //Step-1 : click on download button
        Assert.assertTrue(changeColourPO.verifyChangeColor(), "click on download button");

    }


}
