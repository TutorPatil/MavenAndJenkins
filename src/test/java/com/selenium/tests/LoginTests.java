package com.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.base.BaseClass;
import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;

public class LoginTests extends BaseClass{
	
	
	@Test
	public static void login_001()
	{
		
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.setUserName("admin");
		loginpage.setPassword("manager");
		
		HomePage homepage = loginpage.clickOkButton(driver);
		
		boolean result = homepage.logoutLinkDispay();
		
		Assert.assertTrue(result, "Could not login to Actitime application");
		 
		homepage.cickLogoutLink();
		
		
	}
	
	
	@Test
	public static void login_002()
	{
		
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.setUserName("admin");
		loginpage.setPassword("manager");
		
		HomePage homepage = loginpage.clickOkButton(driver);
		
		boolean result = homepage.logoutLinkDispay();
		
		Assert.assertTrue(result, "Could not login to Actitime application");
		 
		homepage.cickLogoutLink();
		
		
	}

}
