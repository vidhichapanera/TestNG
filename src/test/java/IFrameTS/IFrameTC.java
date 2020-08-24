package IFrameTS;

import CommonPO.BaseTest;
import DropDown.DropDownPO;
import IFrame.IFramePO;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameTC extends BaseTest {

    public int flag = 1;

    public IFrameTC() {
    }

    public IFrameTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
        flag = Flag;
    }


    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for iframe
     * created on : 22-05-2020
     */
    @Test
    public void iFrameTestCase() {
        IFramePO framePO = new IFramePO(driver);

        //Step-1 : get size of iframe
        Assert.assertTrue(framePO.getSizeOfIframe(), "get size of iframe");

        //Step-2 : Switch to iframe
        Assert.assertTrue(framePO.switchToIFrame(), "Switch to Iframe");

    }
}
