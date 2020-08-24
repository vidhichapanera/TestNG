package ScrollTS;

import CommonPO.BaseTest;
import Scroll.FormPO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormTC extends BaseTest {

    public FormTC() {
    }

    public FormTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
    }

    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for scroll down
     * created on : 22-05-2020
     */
    @Test
    public void doubleClickTestCase() {

        FormPO form = new FormPO(driver);

        //Step-1 : scroll down
        Assert.assertTrue(form.RightClickOnButton(), "scroll down");

    }
}


