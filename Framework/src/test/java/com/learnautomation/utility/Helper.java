package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	// Screenshot, alerts,frames,windows,Sync isuue,javascript
	
	public static String captureScreenshot(WebDriver driver)
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screnShotPath=System.getProperty("user.dir")+"/Screenshots/FreeCS5_"+getCurrentDateTime()+".png";
		try {
			FileHandler.copy(src, new File(screnShotPath));
			System.out.println("Screenshot captured..");
		} 
		catch (IOException e) {
			System.out.println("Unable to capture Screenshot.."+e.getMessage());
		}
		return screnShotPath;
		
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date  currentDate= new Date();	
		
		return customFormat.format(currentDate);
	}
	

}
