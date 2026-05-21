package utilites;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportUtility {

public static ExtentReports report;

public static ExtentReports setupReport(){

ExtentSparkReporter spark =
new ExtentSparkReporter(
"./src/test/resources/reports/report.html");

report = new ExtentReports();

report.attachReporter(spark);

return report;

}

}