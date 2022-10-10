package Firstpackage;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest
{
	 ExtentReports report= new ExtentReports();
	 ExtentSparkReporter spark = new ExtentSparkReporter("NewSPark.html");
	
	
  @Test
  public void f1() 
  {
	  
	  ExtentTest test= report.createTest("Launhc Broswer");
	  test.pass("passed");
	  test.log(Status.PASS, "I have passed");
	  
  }
  
  @Test
  public void f2() 
  {

	  ExtentTest test= report.createTest("Broswer");
	  //test.pass("passed");
	  test.log(Status.FAIL, "I have fAILED");
	 // Assert.assertTrue(false);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  
	  report.attachReporter(spark);
  }

  @AfterMethod
  public void afterMethod()
  {
	  report.flush();
	  
  }

}
