package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;	
		
	@FindBy(xpath="//a[@href='/login.do']")
	private WebElement logoutLink;
	
	
	public boolean logoutLinkDispay()
	{
		boolean isDisplayed = false;
		
		try {
			isDisplayed = logoutLink.isDisplayed();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		
		return isDisplayed;
	}
	
	public void cickLogoutLink()
	{
		logoutLink.click();
	}
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}
