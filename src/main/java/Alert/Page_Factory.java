package Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Page_Factory {

    public WebDriver driver;

    public Page_Factory() {
    }

    @FindBy(how = How.XPATH, using = "//input[@aria-label='Search']")
    WebElement search;


    /**
     * @throws IOException
     * @author Vidhi chapanera
     * created on 7 July 2020
     */
    @Test
    public void test1() throws IOException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        this.driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com/ ");

        PageFactory.initElements(driver,this);
        search.sendKeys("What is pagefactory");
    }

    @AfterMethod
    public void teardown(){
        this.driver.quit();
    }
}
