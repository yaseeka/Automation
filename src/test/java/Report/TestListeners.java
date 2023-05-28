package Report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestListeners  implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        String testResult="";
        if(result.getStatus()==1){
            testResult="Pass";

        }
        String text ="Test name :" + result.getMethod().getMethodName() +"....Test status is:  " + testResult + "\r\n";
        BufferedWriter output=null;

            try {
                File file =new File("Test_Result.txt");
                output=new BufferedWriter(new FileWriter(file,true));
                output.write(text);
                output.write("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            finally {
                if(output !=null){
                    try {
                        output.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }


    }
    @Override
    public void onTestFailure(ITestResult result) {
    }
    @Override
    public void onTestSkipped(ITestResult result) {
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }
    @Override
    public void onStart(ITestContext context) {
    }
    @Override
    public void onFinish(ITestContext context) {
    }

}
