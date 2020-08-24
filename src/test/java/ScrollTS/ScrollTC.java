package ScrollTS;

import CommonPO.BaseTest;
import DoubleClick.DoubleClickPO;
import Scroll.ScrollPO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static ScrollTS.v.Main;

public class ScrollTC extends BaseTest {
    public int flag = 1;

    public ScrollTC() {
    }

    public ScrollTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
        flag = Flag;
    }

    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for scroll down
     * created on : 22-05-2020
     */
    @Test
    public void doubleClickTestCase() {

        ScrollPO scrollPO = new ScrollPO(driver);

        //Step-1 : scroll down
        Assert.assertTrue(scrollPO.scrolldown(), "scroll down");
    }
}
