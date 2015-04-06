package com.onelogin.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.onelogin.libraries.ExcelLibrary;

public class LaunchBrowserTest 
{
	  WebDriver driver;
	  ExcelLibrary excellib;
	    
	  @BeforeClass
	  public void Launchbrowser()
	  {
		  //Launch browser
		  
		  excellib=new ExcelLibrary();
		  
		  String browser=excellib.getExcelData("Config",1,0); 
		  String url=excellib.getExcelData("Config",1,1);
	 
		  if(browser.equals("chrome"))
		  {
			 System.setProperty("webdriver.chrome.driver","C:\\navya\\Selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
		  }
		  driver.get(url);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	  }
	  
	  @AfterClass
	  public void Quit()
	  {
		 // driver.quit();
	  }
}
