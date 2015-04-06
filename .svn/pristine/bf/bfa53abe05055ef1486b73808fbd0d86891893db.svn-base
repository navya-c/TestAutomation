package com.onelogin.pages;

//import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	WebDriver driver;
	
	public LoginPage(WebDriver d)
	{
		//Page Decoration
		PageFactory.initElements(d,this);
		this.driver=d;
	}
	
	//Onelogin @FindBy(id="email")
	@FindBy(id="username")
	private WebElement Usernametextbox;
	
	
	//Onelogin @FindBy(id="password")
	@FindBy(id="password")
	private WebElement Passwordtextbox;
   
	//OneLogin @FindBy(id="login")
	@FindBy(id="Login")
	private WebElement Loginbutton;
	
	//LogOut
	
	//Onelogin @FindBy(css="li[class='dropdown']")
	@FindBy(id="userNavLabel")
	private WebElement DropdownClick;
	
	//OneLogin @FindBy(linkText="Log Out")
	@FindBy(css="a[title='Logout']")
	private WebElement LogoutClick;
	
	public void LoginExcelian(String username,String password)
	{
		Usernametextbox.sendKeys(username);
		Passwordtextbox.sendKeys(password);
		Loginbutton.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	}
	
	public void LogOutExcelian()
	{
		DropdownClick.click();
		LogoutClick.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
	}
	
	
	
}
