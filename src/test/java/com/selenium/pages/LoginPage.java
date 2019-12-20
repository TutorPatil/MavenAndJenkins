package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	
	// Every page will have this constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

		
	}
	
	
	
	@FindBy(name="username")
	private WebElement userName;
	
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	
	
	@FindBy(id="loginButton")
	private WebElement okButton;
	
	
	public void setUserName(String userNameData)
	{
		userName.sendKeys(userNameData);		
	}
	
	public void setPassword(String passwordData)
	{
		password.sendKeys(passwordData);		
	}
	
	public HomePage clickOkButton(WebDriver  driver)
	{
		okButton.click();
		
		HomePage homepage = new HomePage(driver);		
		return homepage;
		
	}
	
	public void clickUsingActionClass()
	{
		Actions action = new Actions(driver);
		action.click(okButton);
		
	}
	
	

}
