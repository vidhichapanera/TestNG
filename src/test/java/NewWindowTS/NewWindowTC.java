package NewWindowTS;

import CommonPO.BaseTest;
import NewWindow.NewWindowPO;
import RightClick.RightClickPO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewWindowTC extends BaseTest {

    public int flag = 1;

    public NewWindowTC() {
    }

    public NewWindowTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
        flag = Flag;
    }

    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for switch to new window
     * created on : 22-05-2020
     */
    @Test
    public void switchToNewWindowTestCase() {

        NewWindowPO newWindowPO = new NewWindowPO(driver);

        //Step-1 : click the button and switch in to new window
        Assert.assertTrue(newWindowPO.clickOnButton(), "click the button and switch in to new window");

    }

}
