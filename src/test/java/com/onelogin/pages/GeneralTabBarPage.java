package com.onelogin.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GeneralTabBarPage 
{
	WebDriver driver;
	
	public GeneralTabBarPage(WebDriver d)
	{
		//Page Decoration
		PageFactory.initElements(driver, this);
		this.driver=d;
	}
	
	
	@FindBy(id="Contact_Tab")
	//@FindBy(css="a[title='Contacts Tab']")
	private WebElement ContactTab;

	
	public void ContactTabClick()
	{
		ContactTab.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	
	}

	
}
