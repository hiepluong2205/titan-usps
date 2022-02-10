package io.github.hiepluong2205.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PowerDriver {
    // https://github.com/hiepluong2205/HelloGraphWalker/blob/master/src/main/java/org/hluong/utils/Helper.java
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions actions;

    //  private static final Logger log = LoggerFactory.getLogger(TestModelParsingRuleManagement.class);
    private PowerDriver() {
    }

    public static WebDriver getDriver() {
        if (driver != null) {
            //do nothing
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), 30);
    }

    public static Actions getActions() {
        return new Actions(getDriver());
    }

    public void findElementByID(String id) {
    }

    public void findElementByXPath(String xpath) {
    }

//  public List<WebElement> findElementsByXPath(String xpath) {}
}
