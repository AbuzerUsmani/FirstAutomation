package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		Initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void validateTitleTest()
	{
		String title = loginPage.validateTitle();
		Assert.assertEquals(title, "Rediffmail");
	}
	
	@Test(priority=2)
	public void validateLogoTest()
	{
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
