package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.learnanutomation.pages.BaseClass;
import com.learnanutomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass{

	
	@Test(priority=1)
	public void  loginApp()
	{
		logger = report.createTest("Login To CS 5");
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		
		loginPage.loginToCRM(excel.getstringData("Login", 0, 0), excel.getstringData("Login", 0, 1));
		
		logger.pass("Login Done success..");
		
		//Helper.captureScreenshot(driver);
			
	}
	
	
	
}
