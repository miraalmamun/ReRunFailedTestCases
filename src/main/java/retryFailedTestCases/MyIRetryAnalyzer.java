package retryFailedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyIRetryAnalyzer implements IRetryAnalyzer {

	int counter = 0;
	int retryLimit = 3;

	public boolean retry(ITestResult result) {
		if (counter < retryLimit) {
			System.out.println(counter);
			counter++;
			return true;
		}
		return false;
	}
}
