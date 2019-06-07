package BaseFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver_2 {
    //Class Variable
    private static WebDriver _driver;

    private static DriverType _currentDriverType = DriverType.Chrome;

    public static void selectDriverType(DriverType type){
        _currentDriverType = type;
    }

    private static void instantiateFirefoxDriver(){

        //Instantiate firefox driver with custom options
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette" , true);
        _driver = new FirefoxDriver(options);
    }

    private static void instantiateChromeDriver(){

     System.setProperty("webdriver.chrome.driver" , "C:\\Selenium\\chromedriver.exe");
     _driver = new ChromeDriver();
    }

    public static WebDriver getDriver(){


        if (_driver == null)
        {
            switch (_currentDriverType)
            {
                case Firefox: {
                    instantiateFirefoxDriver();
                    break;
                }

                case Chrome: {
                    instantiateChromeDriver();
                    break;
                }
                default:{
                    instantiateChromeDriver();
                }
            }
        }

        return _driver;
    }

    public static void delayTestExecution(float seconds){
        long millis = (long) (seconds * 1000);
        try{
            Thread.sleep(millis);

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void openWebPage(String url){
     GlobalReporter.reportInfo("Navigating to: " +url);
       // GlobalReporter.reportWarning(url);
       getDriver().navigate().to(url);
    }

    public static void enterText(By objectIdentifier, String text, String testMessage){

        WebElement element = getDriver().findElement(objectIdentifier);
        element.sendKeys(text);
        GlobalReporter.reportSuccess(testMessage);
    }

    public static void clickOnObject(By objectIdentifier, String testMessage){

        WebElement element = getDriver().findElement(objectIdentifier);
        element.click();
        GlobalReporter.reportSuccess(testMessage);
    }
}
