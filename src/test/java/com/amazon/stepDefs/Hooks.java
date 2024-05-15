package com.amazon.stepDefs;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {


    @Before
    public void setup(){
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // System.out.println("This is coming from before");
    }
//    public class ReCaptcha_click {
    // incase CAPTCHA  would appear
//
//        public static void main(String[] args) {
//
//            System.setProperty("webdriver.chrome.driver", "C:\\Utility\\BrowserDrivers\\chromedriver.exe");
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("start-maximized");
//            options.addArguments("disable-infobars");
//            options.addArguments("--disable-extensions");
//            WebDriver driver = new ChromeDriver(options);
//            driver.get("https://rsps100.com/vote/760");
//            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
//            new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();
//        }
//    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
        BrowserUtils.waitFor(5);
      //  System.out.println("This is coming from after");
    }

}
