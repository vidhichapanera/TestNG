package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class storeAllPageLocator {

    public WebDriver driver;


    public storeAllPageLocator() {
    }

    /**
     * @author Vidhi chapanera
     * created on 7 July 2020
     * @throws IOException
     */
    @Test
    public void test1() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        this.driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://hikevidhi_4103.hikeup.com/admin#!/general");

        Thread.sleep(3000);

        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys("vidhi@hikeup.com");
        driver.findElement(By.name("password")).sendKeys("#Test4196");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space(.)='Log in']")).click();
        Thread.sleep(20000);

        /*File file = new File("test.txt");
        file.createNewFile();*/

        List<WebElement> list = new WebDriverWait(driver,90)
               .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("input")));
        int i =1;
        String xpath = "";
        for (WebElement ty : list) {
           if (!ty.getAttribute("id").equals("")) {
                //System.out.println(i++ + " :" + ty.getAttribute("id"));
                xpath += (i++)+" : "+  "//input[@id="+ "'" +ty.getAttribute("id")+ "'" + "]" +"\n";
            }
        }
        System.out.println(xpath);

       /* FileWriter fw = new FileWriter("test.txt");
        fw.write(xpath);
        fw.close();*/
        driver.quit();




    }


}