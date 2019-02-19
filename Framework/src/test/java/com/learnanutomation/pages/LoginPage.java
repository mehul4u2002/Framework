package com.learnanutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="Email") WebElement username;
	@FindBy(id="Password") WebElement password;
	@FindBy(id="btnLogin") WebElement loginBtn;
	
	public void loginToCRM(String usernameApplication,String passwordApplication)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		username.sendKeys(usernameApplication);
		password.sendKeys(passwordApplication);
		loginBtn.click();
	}
}
