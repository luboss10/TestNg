package Class3;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {    //write onTest and they will come up so you can generate

        System.out.println("starting the execution test: "+ result.getName());}
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Taking the screenshot of the test having the name: "+result.getName());}
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failed the execution test with the name: "+result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped the execution with the name: "+result.getName());
    }



}
