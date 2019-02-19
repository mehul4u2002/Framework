package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {
	@Test
	public void test1() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.get("http://demosite.center//wordpress//wp-login.php");
	driver.findElement(By.id("user_login")).sendKeys("username");
	driver.findElement(By.id("user_pass")).sendKeys("password");
	driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
				
	Thread.sleep(5000);	
	driver.quit();
	}
}
