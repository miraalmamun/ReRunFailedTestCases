package extentReport;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent {

	ExtentReports reports;
	ExtentSparkReporter config2;
	ExtentTest log;

	@BeforeClass
	public void config() {
		reports = new ExtentReports();

		config2 = new ExtentSparkReporter("./ExtentReports/abc.html");
		config2.config().setDocumentTitle("Automation Test Result");
		config2.config().setTheme(Theme.STANDARD);
		config2.config().setEncoding("utf-8");
		reports.attachReporter(config2);

	}

	@Test
	public void test1() {
       
		log = reports.createTest("TEST1");
		log.log(Status.INFO, "Starting test");
		log.log(Status.PASS, "Test Passed");
		try {
			log.addScreenCaptureFromPath("C:\\Users\\Mir\\Downloads\\PageOne.jpg", "Adding picture");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@AfterMethod
	public void t2()
	{
		reports.flush();
	}

}





