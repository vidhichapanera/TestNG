package ChangeDefaultDirectoryTS;

import ChangDefaultDirectory.ChangeDefaultDirectoryPO;
import CommonPO.BaseTest;
import DoubleClick.DoubleClickPO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeDefaultDirectoryTC extends BaseTest {

    public ChangeDefaultDirectoryTC() { }

    public ChangeDefaultDirectoryTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
    }


    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for Change default Download directory
     * created on : 22-05-2020
     */
    @Test()
    public void ChangeDefaultDownloadDirectory() {

        ChangeDefaultDirectoryPO changeDefaultDirectoryPO = new ChangeDefaultDirectoryPO(driver);

        //Step-1 : click on download button
        Assert.assertTrue(changeDefaultDirectoryPO.changeDefaultDownloadDirectory(), "click on download button");

    }


}
