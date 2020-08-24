package Alert;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class excel {

    public WebDriver driver;

    public excel(){}
    public HSSFWorkbook workbook;
    public HSSFSheet sheet;
    public HSSFCell cell;

    @Test
    public void test1() throws IOException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        this.driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://executeautomation.com/demosite/Login.html");

        FileInputStream finput = new FileInputStream("D:\\Book1.xlsx");

        // Load he workbook.
       workbook = new HSSFWorkbook(finput);

        // Load the sheet in which data is stored.
        sheet= workbook.getSheetAt(0);

        for(int i=1; i==sheet.getLastRowNum(); i++)
        {
            // Import data for Email.
            cell = sheet.getRow(i).getCell(1);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys(cell.getStringCellValue());

            // Import data for password.
            cell = sheet.getRow(i).getCell(2);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(cell.getStringCellValue());
        }
}
}
