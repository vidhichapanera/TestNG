package AlertTS;

import Alert.AlertPO;
import CommonPO.BaseTest;
import IFrame.IFramePO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTC extends BaseTest {

    public AlertTC() {
    }

    public AlertTC(WebDriver passDriver) {
        driver = passDriver;
    }


    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for Alert Box Demo
     * created on : 22-05-2020
     */
    @Test(description = "Alert Box Demo TestCase")
    public void AlertBoxDemoTestCase() {

        AlertPO alertPO = new AlertPO(driver);

        //Step-1 : handle Single AlertBox
        Assert.assertTrue(alertPO.clickOnSingleAlertBox(), "handle Single AlertBox");

    }


    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for Confirm Box Demo
     * created on : 22-05-2020
     */
    @Test(dependsOnMethods = "AlertBoxDemoTestCase", invocationCount = 3, enabled = true)
    public void confirmAlertBoxDemoTestCase() {
        AlertPO alertPO = new AlertPO(driver);

        //Step-1 : handle Confirm AlertBox
        Assert.assertTrue(alertPO.clickOnConfirmAlertBox(), "handle Confirm AlertBoc");
    }


    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for Prompt Box Demo
     * created on : 22-05-2020
     */
    @Test
    public void promptAlertBoxDemoTestCase() {
        AlertPO alertPO = new AlertPO(driver);

        //step-1 : handle Promt AlertBox
        Assert.assertTrue(alertPO.clickOnPromptAlertBox(), "handle Confirm AlertBoc");
    }
}
