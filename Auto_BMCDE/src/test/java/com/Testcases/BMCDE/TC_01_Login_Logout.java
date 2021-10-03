package com.Testcases.BMCDE;

import org.testng.annotations.Test;

import com.config.BMCDE.StartBrowser;
import com.utility.BMCDE.CommonFunctions;

public class TC_01_Login_Logout extends StartBrowser {
	
	@Test
	public void Login_Test() throws Exception
	{
		CommonFunctions cfs = new CommonFunctions();
		cfs.Signin();	
	}
	@Test
	public void Logout_Test() throws Exception
	{
		CommonFunctions cfs = new CommonFunctions();
		cfs.Signout();	
	}

}
