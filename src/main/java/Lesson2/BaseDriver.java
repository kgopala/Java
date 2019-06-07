package Lesson2;

        import org.openqa.selenium.*;
        import org.openqa.selenium.firefox.*;

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
        _driver.navigate().to("https://www.mychamberlain.com");
    }
    public static void openWebPage(String url){
        _driver.navigate().to("https://www.myqbusiness.com");
    }

}
