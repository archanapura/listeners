package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {

    public WebDriver driver1;
    public EventFiringWebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;
    public WebEventListener listener;

    @BeforeSuite(groups = {"smoke"})
    public void configure() {
        extent = new ExtentReports();
        ExtentHtmlReporter spark = new ExtentHtmlReporter("target/Spark.html");
        spark.setAppendExisting(true);
        extent.attachReporter(spark);
        
    }

    @BeforeClass(groups = {"smoke"})
    public void openBrowser(){
     System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    driver1=new ChromeDriver();
    driver=new EventFiringWebDriver(driver1);
  listener =new WebEventListener();
    driver.register(listener);
        driver.get("http://www.amazon.in/");
}

    @AfterClass(groups = {"smoke"})
    public void closeBrowser()
    {
        driver.close();
    }

    @AfterSuite(groups = {"smoke"})
    public void closeResources()
    {
        extent.flush();
    }

    @DataProvider(name="data1")
    public Object[][] dataread()
    {
        return new Object[][]{{"u1","p1"},{"u2","p2"},{"u3","p3"}};
    }
}
