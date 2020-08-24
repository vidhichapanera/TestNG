package ListSizeTS;

import CommonPO.BaseTest;
import DropDown.DropDownPO;
import ListSize.ListSizePO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListSizeTC extends BaseTest {

    public int flag = 1;

    public ListSizeTC() {
    }

    public ListSizeTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
        flag = Flag;
    }


    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for list size test case
     * created on : 22-05-2020
     */
    @Test
    public void ListSizeTestcase() {
        ListSizePO listSizePO = new ListSizePO(driver);

        //Step-1 : get list of drop down
        Assert.assertTrue(listSizePO.getListOfDropDown(), "get Drop down list");
    }
}
