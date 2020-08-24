package CommonPO;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseTest {
        public WebDriver driver;
        public BaseTest() { }

        /**
         * @author Vidhi chapanera
         * created on : 22-05-2020
         */
        @Parameters({"browserName", "url"})
        @BeforeMethod
        public void beforeSuite(String browserName,String url) throws Exception {
            getDriver(browserName);
            //driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(url);
        }


        /**
         * @author Vidhi chapanera
         * created on : 22-05-2020
         */
        @AfterMethod
        public void afterMethod(ITestResult result) {
            this.driver.quit();

        }

        /**
         * @author Vidhi chapanera
         * created on : 22-05-2020
         */
        public WebDriver getDriver(String browserName) throws Exception {
            try {
                if (browserName.equalsIgnoreCase("chrome")) {
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
                    Map<String, Object> prefs = new HashMap<String, Object>();
                    prefs.put("download.default_directory", "D:\\Download");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--start-maximized");
                    //options.setExperimentalOption("prefs", prefs);
                    this.driver = new ChromeDriver(options);
                } else if (browserName.equalsIgnoreCase("firefox")) {
                    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
                    this.driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                } else if (browserName.equalsIgnoreCase("ie")) {
                    System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
                    this.driver = new InternetExplorerDriver();
                } else {
                    System.out.println("Kindly Provide Proper Browser Name: It's supports only chrome,firefox and IE");
                }
                return driver;
            } catch (Exception e) {
                throw e;
            }
        }
}
