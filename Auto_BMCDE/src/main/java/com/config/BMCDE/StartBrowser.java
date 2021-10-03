package com.config.BMCDE;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class StartBrowser {
public static WebDriver  driver;

public static ExtentReports extent;

public static ExtentTest parentTest; 
;
public static ExtentTest childTest;

static ExtentSparkReporter reporter;
String method;


@BeforeTest
public static void ExtentReprts()
{
	reporter = new ExtentSparkReporter("Reports/BMCDE_TestResults.html");
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	
}

@BeforeMethod
public static void methodName(Method method)
{
	parentTest = extent.createTest(method.getName());
}

  @BeforeClass
  public void SetUp()
  {
	  WebDriverManager.chromedriver().setup();
	  
	  driver =new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);	  
  }

 
  
  @AfterClass
  public void TearDown()
  {
	  driver.quit();
	  extent.flush();
  }

}
