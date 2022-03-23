package base;

import utils.Constants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;

public class BaseClass {

    public static WebDriver driver;
    //Extent Reports
    public ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;

/*    @BeforeTest
    public void beforeTestMethod(){

        //htmlReporter = new ExtentHtmlReporter(System.getProperty("usr.dir"+File.separator+"reports"+File.separator+"AutomationReport.html"));
        //htmlReporter.config().setEncoding("utf-8");
        //htmlReporter.config().setDocumentTitle("Automation Report");
        //htmlReporter.config().setReportName("Automation Test Results");
        //htmlReporter.config().setTheme(Theme.DARK);
        //extent = new ExtentReports();
        //extent.attachReporter(htmlReporter);
        //extent.setSystemInfo("Automation Tester","Prashanthi E");

    }*/

    @Parameters(value={"browserName"})
    @BeforeMethod
    public void beforeMethodMethod(String browserName, Method testMethod){
        //logger = extent.createTest(testMethod.getName());
        setUp(browserName);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));


        driver.get(Constants.url);
    }

    @AfterMethod
    public void afterMethodMethod(ITestResult result){
        /*if(result.getStatus()==ITestResult.SUCCESS){
            String methodName = result.getMethod().getMethodName();
            String logText="Test Case: "+methodName+" Passed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            //logger.log(Status.PASS,m);
        } else if(result.getStatus()==ITestResult.FAILURE){
            String methodName = result.getMethod().getMethodName();
            String logText="Test Case: "+methodName+" Failed";
            Markup m = MarkupHelper.createLabel(logText,ExtentColor.RED);
            //logger.log(Status.FAIL,m);
        }*/
        driver.quit();
    }

  /*  @AfterTest
    public void afterTestMethod(){
*//*        extent.flush();*//*
    }*/

    public void setUp(String browserName){
    if(browserName.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ File.separator+"drivers"+File.separator+"chromedriver.exe");
        driver = new ChromeDriver();
    }else if(browserName.equalsIgnoreCase("mozilla")){
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ File.separator+"drivers"+File.separator+"geckodriver.exe");
        driver = new FirefoxDriver();
    }else{
        //Default Case
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ File.separator+"drivers"+File.separator+"chromedriver.exe");
        driver = new ChromeDriver();
    }
    }
}
