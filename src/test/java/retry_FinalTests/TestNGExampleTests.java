package retry_FinalTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExampleTests {
	WebDriver driver;
	String baseURL = "https://www.linkedin.com/";

	@BeforeMethod
	public void setup() {
		//driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "logs\\firefox.log");
		FirefoxOptions options = new FirefoxOptions();
		// options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		FirefoxProfile prof = new FirefoxProfile();// new profile
		prof.setPreference("dom.webnotifications.enabled", false);
		options.setProfile(prof);
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		
		
		
	}

	@Test(priority=1)
	public void verifyLoginPageText() throws Exception {
		driver.navigate().to(baseURL);
		System.out.println("Verify login page test started");
		//Thread.sleep(5000);
		//WebElement element = driver.findElement(By.xpath("//*[@id='linkedin-logo']"));
		//Thread.sleep(5000);
		//String headerText = element.getText();
		//System.out.println("Text----- "+headerText);
		//Assert.assertEquals(headerText, "Get started – it’s free.");
		
		Assert.fail("Forced to fail");
	}

	@Test(priority=2)
	public void verifyForgotPasswordPage() {
		driver.navigate().to("https://cnn.com");
		System.out.println("Verify Forgot password page test started");
		//WebElement element = driver.findElement(By.linkText("Forgot your password?"));
		//element.click();
		//WebElement pageTextElement = driver.findElement(By.cssSelector(".flow-login-content>fieldset>h1"));
		//String pageText = pageTextElement.getText();
		
		//Assert.assertEquals(pageText, "Wrong text");
		//Assert.assertEquals(pageText, "Change your password");
		
		
		Assert.assertEquals("Mir", "Mir");
	}
	
	
	
	@AfterMethod
	public void quitt()
	{
		driver.quit();
	}
	
	
	
	
	
	
}