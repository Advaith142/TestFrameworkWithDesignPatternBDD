package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.TestRunner;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getExtentInstance(){
        ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter("test-output/ExtentReport.html");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("AutomationTest Report");
        htmlReporter.config().setReportName("Selenium Test Result");
        htmlReporter.config().setTimeStampFormat("YYYY_MM_DD_hh_mm_ss");

        return extent= new ExtentReports();
    }




}
