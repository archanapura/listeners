package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

import java.util.Date;

public class TestNGListeners  extends BaseTest implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

        test= extent.createTest(result.getName());
        System.out.println("Started test"+ result.getName());
        long yourEpochTime = result.getStartMillis();
        Date d = new Date(yourEpochTime * 1000);
        System.out.println("Started test"+ d);

    }

    @Override
    public void onFinish(ITestContext context) {


        System.out.println("Test finished"+ context.getName());
        System.out.println("Test finished"+ context.getStartDate());


    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.INFO,"Success");

        System.out.println("On success"+result.getName()+result.getStatus());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName()+" is skipped due to "+result.getSkipCausedBy());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+" failed due to"+result.getThrowable());

    }

}
