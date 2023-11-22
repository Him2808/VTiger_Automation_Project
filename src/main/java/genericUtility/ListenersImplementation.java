package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	ExtentTest test;
	ExtentReports reports;
	public void onTestStart(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test.log(Status.INFO, methodname+"execution start");
	}

	public void onTestSuccess(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test.log(Status.INFO, methodname+"execution pass");
	}

	public void onTestFailure(ITestResult result) {
		WebDriverUtility WUTIL=new WebDriverUtility();
		JavaUtility JUTIL=new JavaUtility();
		String methodname=result.getMethod().getMethodName()+JUTIL.getDateUsingCalendar();
		test.log(Status.FAIL, methodname+"is failed");
		test.log(Status.FAIL, result.getThrowable());
		
		try {
			
		String path=WUTIL.captureScreenShotMethod(BaseClass.driver, methodname);
		test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test.log(Status.SKIP, methodname+"is skipped");
		test.log(Status.SKIP, result.getThrowable()); //This getThrowable() will give you the exact status
	}

	public void onStart(ITestContext context) {
		//Basic Configuration
		ExtentSparkReporter htmlrepot=new ExtentSparkReporter(".\\extentReport\\report"
		                              +new JavaUtility().getDateUsingCalendar()+".html");
		htmlrepot.config().setDocumentTitle("Vtiger report");
		htmlrepot.config().setTheme(Theme.DARK);
		htmlrepot.config().setReportName("extent report");
		//Generate the report
		reports=new ExtentReports();
		reports.attachReporter(htmlrepot);
		reports.setSystemInfo("browser", "Chrome");
		reports.setSystemInfo("authorname", "himanshu");
		reports.setSystemInfo("paltform", "windows");
		reports.setSystemInfo("url", "https://localhost:8888/");
		reports.setSystemInfo("environment", "testing");
	}

	public void onFinish(ITestContext context) {
		reports.flush();
	}
}
