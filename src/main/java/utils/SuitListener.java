package utils;
import base.BaseClass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class SuitListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        String fileName = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + iTestResult.getMethod().getMethodName();
        File f = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.FILE);

        //FileUtil.copyFile(f, new File(fileName + ".png"));
    }
}