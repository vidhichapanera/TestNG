package FileUploadTS;

import ChangeColour.ChangeColourPO;
import CommonPO.BaseTest;
import Fileupload.FileUploadPO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class fileUploasTC extends BaseTest {

    public fileUploasTC() { }

    public fileUploasTC(WebDriver passDriver) {
        driver = passDriver;
    }


    /**
     * @author Vidhi chapanera
     * @discription This Test Case is for File upload
     * created on : 24-05-2020
     */
    @Test()
    public void fileUpload() {

        FileUploadPO fileUploadPO = new FileUploadPO(driver);

        //Step-1 : click on file upload
        Assert.assertTrue(fileUploadPO.fileUpload(), "click on file upload");

    }


}
