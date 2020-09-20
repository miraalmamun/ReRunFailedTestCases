package cart;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteItemsFromCart {
	
	
	@Test(retryAnalyzer = retryFailedTestCases.MyIRetryAnalyzer.class)
	public void deleteMaxItems()
	{
		Assert.assertEquals(2, 2);
	}
	
	@Test(retryAnalyzer = retryFailedTestCases.MyIRetryAnalyzer.class)
	public void deleteMinItems()
	{
		Assert.fail("This is failed");
	}
	
	@Test(retryAnalyzer = retryFailedTestCases.MyIRetryAnalyzer.class)
	public void deleteOneItems()
	{
		Assert.assertEquals("Mir", "Mamun");
	}

}
