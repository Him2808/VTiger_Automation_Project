package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementaion implements IRetryAnalyzer {
	
	int count=1;
	int retrycount=4;
	public boolean retry(ITestResult result) {
		while (count<retrycount) {
			count++;
			return true;
		}
		return false;
	}

}
