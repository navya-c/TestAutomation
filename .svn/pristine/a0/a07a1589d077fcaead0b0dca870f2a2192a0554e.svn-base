package com.onelogin.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage extends LoginPage
{
	
	public EnterTimeTrackPage(WebDriver d)
	{
		super(d);
		PageFactory.initElements(d, this);
		this.driver=d;
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	}
	
}
