import BaseFramework.*;
import BaseFramework.GlobalReporter;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test_01 {

    @BeforeTest
    public void setUp(){
        GlobalReporter.reportInfo("Starting Test Case");
    }

    @AfterTest
    public void cleanUp()
    {
        BaseDriver_2.getDriver().quit();
        if (GlobalReporter.get_currentTestState() == TestState.Failure)
        {
         GlobalReporter.reportInfo("Failing Test Case based on final outcome");
            Assert.fail();
        }
    }


    @Test
    public final void test01_Chrome(){

        BaseDriver_2.selectDriverType(DriverType.Chrome);

        BaseDriver_2.openWebPage("https://premium-pp.myqservices.com/account/login");

        BaseDriver_2.enterText(By.xpath("//input[@id='Email']"), "myqkrishnav5pp+AD1@gmail.com" , "Entering Username");

        BaseDriver_2.enterText(By.xpath("//input[@id='Password']"), "Test123@" , "Entering Password");

        BaseDriver_2.clickOnObject(By.xpath("//input[@id='btnContinue']"), "Clicking Authenticate Button");
    }

    @Test
    public final void test01_Firefox(){

        BaseDriver_2.selectDriverType(DriverType.Firefox);

        BaseDriver_2.openWebPage("https://premium-pp.myqservices.com/account/login");

        BaseDriver_2.enterText(By.xpath("//input[@id='Email']"), "myqkrishnav5pp+AD1@gmail.com" , "Entering Username");

        BaseDriver_2.enterText(By.xpath("//input[@id='Password']"), "Test123@" , "Entering Password");

        BaseDriver_2.clickOnObject(By.xpath("//input[@id='btnContinue']"), "Clicking Authenticate Button");
    }
}
