package com.utility.BMCDE;

import org.openqa.selenium.WebDriver;

import com.BMCDE.windcmds.ActionDriver;
import com.config.BMCDE.StartBrowser;
import com.objectrepository.BMCDE.LoginPage;

public class CommonFunctions {
	public WebDriver driver;
	
	public ActionDriver aDriver;
	public  CommonFunctions()
	{
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	
	}
	public void Signin() throws Exception
	{
	 StartBrowser.childTest = StartBrowser.parentTest.createNode("Login on HomePage");
	 aDriver.navigateToApplication("https://staging.bookmycde.com/");
	 aDriver.click(LoginPage.signinbutton, "SignIn button");
	 aDriver.type(LoginPage.txtemail, "sumit.wattamwar@healthpole.com", "emailText Field");
	 aDriver.type(LoginPage.txtpasswword, "ssw1234", "Password Text Field");
	 aDriver.click(LoginPage.showeye, "Show Password Button");
	 aDriver.click(LoginPage.hideeye, "Hide Password Button");
	 aDriver.click(LoginPage.submitbutton, "SubmitButton");
	}
	public void Signout() throws Exception
	{
	 StartBrowser.childTest = StartBrowser.parentTest.createNode("Login on HomePage");
	 aDriver.navigateToApplication("https://staging.bookmycde.com/");
	 aDriver.click(LoginPage.signinbutton, "email");
	 aDriver.type(LoginPage.txtemail, "sumit.wattamwar@healthpole.com", "Email Text Field");
	 aDriver.type(LoginPage.txtpasswword, "ssw1234", "Password Text Field");
	 aDriver.click(LoginPage.showeye, "Show Button");
	 aDriver.click(LoginPage.hideeye, "Show Button");
	 aDriver.click(LoginPage.submitbutton, "Submit Button");
	 Thread.sleep(2000);
	 aDriver.click(LoginPage.profilebutton, "Profile Button");
	 aDriver.click(LoginPage.signoutbutton, "Signout Button");
	}
	
	
	
}
