package retry;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RetryFailed {
	
	@Test(retryAnalyzer = retrymain.Retry.class )
	public void method1()
	{   
		Reporter.log("Strating Test",true);
		Assert.fail("Failed");
	}

	@Test
	public void method2()
	{
		
	}

	@Test
	public void method3()
	{
		
	}
}
