package utilClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportBuilder {
    public static ExtentReports extentReports=new ExtentReports();
    public static ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("Extentreport.html");
    public void addConfigValIntoReport(){
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setReportName("Report Name");
        extentSparkReporter.config().setDocumentTitle("Document Title");
        extentReports.attachReporter(extentSparkReporter);
    }
    public void addInforReport(String inforValue, String reportName){
        //add information into report
        extentReports.createTest(reportName)
                .info(inforValue);
    }
    public void flushReportVal(){
        extentReports.flush();
    }
}
