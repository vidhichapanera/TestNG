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
    public void test1() throws IOException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        this.driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/selenium-tutorials/scrolling-web-page-with-selenium-webdriver-using-java");

       File file = new File("test.txt");
       file.createNewFile();

        List<WebElement> list = new WebDriverWait(driver,90)
               .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("div")));
       int i =1;
       String xpath = "";
       for (WebElement ty : list) {
           if (!ty.getAttribute("class").equals("")) {
                //System.out.println(i++ + " :" + ty.getAttribute("id"));
                xpath += (i++)+" : "+  "//div[@class="+ "'" +ty.getAttribute("class")+ "'" + "]" +"\n";
            }
        }

        FileWriter fw = new FileWriter("test.txt");
        fw.write(xpath);
        fw.close();
       driver.quit();




    }


}