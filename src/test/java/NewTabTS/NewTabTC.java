package NewTabTS;

import CommonPO.BaseTest;
import NewTab.NewTabPO;
import NewWindow.NewWindowPO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTabTC extends BaseTest {

    public int flag = 1;

    public NewTabTC() {
    }

    public NewTabTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
        flag = Flag;
    }

    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for switch to new tab
     * created on : 22-05-2020
     */
    @Test
    public void switchToNewTabTestCase() {

        NewTabPO tabPO = new NewTabPO(driver);

        //Step-1 : click on button and switch in to new tab
        Assert.assertTrue(tabPO.clickOnButton(), "click on button and switch in to new tab");

    }

}
