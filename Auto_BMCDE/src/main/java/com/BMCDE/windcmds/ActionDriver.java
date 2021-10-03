package com.BMCDE.windcmds;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.config.BMCDE.StartBrowser;

public class ActionDriver
{
	public WebDriver driver;
	public ActionDriver()
	{
		driver = StartBrowser.driver;
	}

	//Function to Navigate to URL
	public void navigateToApplication(String url)
	{
		try {
			driver.get(url);
			StartBrowser.childTest.pass("Successfully Visited to"+url);
		} catch (Exception e) {
			// TODO: handle exception
			StartBrowser.childTest.fail("Unable to access"+url,MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
			StartBrowser.childTest.info(e);
		}

	}

	//Function to perform click action on check box ,buttons,dropdown
	//@param locator get it from object repo
	//@elewName Name of element.
	//@throws exception
	public void click(By locator , String eleName) throws Exception
	{
		try {
			driver.findElement(locator).click();
			StartBrowser.childTest.pass("Successfully performed click action on :"+eleName);
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to perform click action on :"+eleName,MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	//To Verify and perform Type action working properly if not then give results in report
	
	public void type(By locator,String testdata ,String eleName) throws Exception
	{
		try {
			driver.findElement(locator).sendKeys(testdata);
			StartBrowser.childTest.pass("Successfully sent data :"+testdata+"to field:"+eleName);
		} catch (Exception e) {
			StartBrowser.childTest.fail("unable to send data :"+testdata+"to field:"+eleName,MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	//
	public String screenshot()
	{
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}

}
