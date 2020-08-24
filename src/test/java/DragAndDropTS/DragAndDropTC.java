package DragAndDropTS;

import CommonPO.BaseTest;
import DragAndDrop.DragAndDropPO;
import NewTab.NewTabPO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTC extends BaseTest {

    public int flag = 1;

    static int numberOfObjects =0;

    public DragAndDropTC() {
    }

    {
        numberOfObjects+=1;
    }

    public DragAndDropTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
        flag = Flag;
    }

    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for drag and drop
     * created on : 22-05-2020
     */
    @Test
    public void DragAndDropTestCase() {

        DragAndDropPO dragAndDropPO = new DragAndDropPO(driver);

        //Step-1 : drag abd drop
        Assert.assertTrue(dragAndDropPO.DragAndDrop(), "drag and drop");
        System.out.println(DragAndDropTC.numberOfObjects);

    }
}
