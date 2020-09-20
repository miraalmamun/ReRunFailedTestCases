package failedTestListener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyIRetryAnnalyzer2 implements IRetryAnalyzer{

	int intCount = 1;
	int maxCount = 3;
	
	public boolean retry(ITestResult result) {
		
		
		if(intCount<=maxCount)
		{
			
			System.out.println("Retrying "+result.getName()+" again and the count is "+intCount);
			intCount++;
			return true;
		}
		
	
		return false;
	}

}
