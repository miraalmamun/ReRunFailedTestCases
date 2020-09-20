package cart;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddItemsOnCart {
	
	@Test(retryAnalyzer = retryFailedTestCases.MyIRetryAnalyzer.class)
	public void addMaxItems()
	{
		Assert.assertEquals(2, 2);
	}
	
	@Test(retryAnalyzer = retryFailedTestCases.MyIRetryAnalyzer.class)
	public void addMinItems()
	{
		Assert.fail("This is failed");
	}
	
	@Test(retryAnalyzer = retryFailedTestCases.MyIRetryAnalyzer.class)
	public void addOneItems()
	{
		Assert.assertEquals("Mir", "Mamun");
	}
	

}
