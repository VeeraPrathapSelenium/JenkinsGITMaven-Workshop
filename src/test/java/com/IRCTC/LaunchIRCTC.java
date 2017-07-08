package com.IRCTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchIRCTC {
	
	
	
	@Test
	public static void launchBrowser()
	{
		WebDriver driver =new FirefoxDriver();
		
		driver.navigate().to("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.manage().window().maximize();
		
	}
	
	
	

}
