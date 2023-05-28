package Login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilClass.ExtendReportBuilder;

public class extentReportUsageClass {
    ExtendReportBuilder extendReportBuilder=new ExtendReportBuilder();
    @BeforeClass
    public void preCondition(){
        extendReportBuilder.addConfigValIntoReport();
    }
    @Test
    public void testMethod(){
        System.out.println("Test method Tested");
        extendReportBuilder.addInforReport("TestPass","info Test method");
    }
    @AfterClass
    public void postCondition(){
        extendReportBuilder.flushReportVal();
    }

}
