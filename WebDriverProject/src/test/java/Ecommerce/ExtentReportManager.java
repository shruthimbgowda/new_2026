package Ecommerce;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	// Reporter objects
	public ExtentSparkReporter sparkReporter;   // UI of the reports
	public ExtentReports extent;                // Populate common info on the report
	public ExtentTest test;                     // Create test case entries in the report and update status of the test methods


	public void onStart(ITestContext context) {

	    // Create report file path
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/report1/report2.html");

	    // Configure report settings
	    sparkReporter.config().setDocumentTitle("Automation Report");   // Report title
	    sparkReporter.config().setReportName("Testing");     // Report name
	    sparkReporter.config().setTheme(Theme.DARK);                    // Theme style

	    // Attach reporter to ExtentReports
	    extent = new ExtentReports();
	    extent.attachReporter(sparkReporter);  // combines the spark report and extent report together

	    // Add system/environment information
	    extent.setSystemInfo("Computer Name", "localhost");
	    extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("Tester Name", "Shruthi");
	    extent.setSystemInfo("OS", "Windows 10");
	    extent.setSystemInfo("Browser Name", "Chrome");
	}
	
	public void onTestSuccess(ITestResult result) {

	    test = extent.createTest(result.getName()); // create a new entry in the report
	    test.log(Status.PASS, "Test case PASSED is:" + result.getName()); // update status p/f/s

	}

	public void onTestFailure(ITestResult result) {

	    test = extent.createTest(result.getName());
	    test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
	    test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable()); // will return the error message displayed on the console window

	}
	
	public void onTestSkipped(ITestResult result) {

	    test = extent.createTest(result.getName());
	    test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());

	}
	


	public void onFinish(ITestContext context) {

	    extent.flush();         // will update the whole thing in the report

	}
}
