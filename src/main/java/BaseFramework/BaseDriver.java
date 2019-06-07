package BaseFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseDriver {
    //Class Variable
    private static WebDriver _driver;

    public static void main(String[] args) {
        //Instantiate firefox driver with custom options
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette" , true);
        _driver = new FirefoxDriver(options);

        //Use firefox driver to open a webpage
       // String str = "https://premium-pp.myqservices.com/account/login";

        openWebPage("https://premium-pp.myqservices.com/account/login");

        enterText(By.xpath("//input[@id='Email']"), "myqkrishnav5pp+AD1@gmail.com" , "Entering Username");

        enterText(By.xpath("//input[@id='Password']"), "Test123@" , "Entering Password");

        clickOnObject(By.xpath("//input[@id='btnContinue']"), "Clicking Authenticate Button");

    }

    public static void openWebPage(String url){
     GlobalReporter.reportInfo("Navigating to: " +url);
       // GlobalReporter.reportWarning(url);
       _driver.navigate().to(url);
    }

    public static void enterText(By objectIdentifier, String text, String testMessage){

        WebElement element = _driver.findElement(objectIdentifier);
        element.sendKeys(text);
        GlobalReporter.reportSuccess(testMessage);
    }

    public static void clickOnObject(By objectIdentifier, String testMessage){

        WebElement element = _driver.findElement(objectIdentifier);
        element.click();
        GlobalReporter.reportSuccess(testMessage);
    }
}
