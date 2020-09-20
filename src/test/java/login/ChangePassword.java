package login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePassword {
	
	@Test(retryAnalyzer = failedTestListener.MyIRetryAnnalyzer2.class)
	public void change1()
	{
		Assert.fail("Forcely failed");
	}
	@Test
	public void change2()
	{
		Assert.assertEquals(true, true);
	}
	@Test
	public void change3()
	{
		Assert.assertEquals(true, true);
	}
	@Test
	public void change4()
	{
		Assert.assertEquals(true, true);
	}

}
