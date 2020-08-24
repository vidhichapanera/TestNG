package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class captcha {

    public WebDriver driver;

    public captcha() {
    }


    @Test
    public void test1() throws IOException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        this.driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://captcha.com/demos/features/captcha-demo.aspx");

        String captchaVal = JOptionPane.showInputDialog("Retype the CAPTCHA code from the image");
        //Type the entered captcha to the text box
        driver.findElement(By.id("CaptchaCodeTextBox")).sendKeys(captchaVal);


        /*String capchavalue = driver.findElement(By.xpath("//img[@id='c_captchademo_samplecaptcha_CaptchaImage']")).getText();
        System.out.println(capchavalue);
        int firstinteger= Integer.parseInt(capchavalue.substring(0, 2));
        int secondinteger= Integer.parseInt(capchavalue.substring(5, 6));
        int calc= firstinteger+secondinteger;
        String final_value= String.valueOf(calc);
        driver.findElement(By.xpath("//input[@id='CaptchaCodeTextBox']")).sendKeys(final_value);*/



        
    }
}