package com.onelogin.tests;

//import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

//import com.onelogin.pages.EnterTimeTrackPage;
import com.onelogin.pages.LoginPage;

public class LoginTest extends LaunchBrowserTest
{
	
  @Test
  public void TestLogin() 
  {
	  String username = excellib.getExcelData("Login",1,0);
	  String password = excellib.getExcelData("Login",1,1);
	 
	  LoginPage lp = new LoginPage(driver);
	  lp.LoginExcelian(username, password);
	  
	 // EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
	  //ettp.LogOutExcelian();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	  
  }
  
}
