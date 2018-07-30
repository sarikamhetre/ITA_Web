package com.ita.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ita.base.TestBase;
import com.ita.pages.ContactList;
import com.ita.pages.LoginPage;
import com.ita.pages.LoginPassword;
import com.ita.pages.WelcomePage;



public class LoginPageTest extends TestBase {
	WelcomePage welcome;
	LoginPage login;
	LoginPassword LP;
	ContactList CL;
	
public	LoginPageTest()
{
	super();
}
@BeforeMethod
public void setUp()
{
	initialization();
	welcome= new WelcomePage();
	welcome.LoginClick();
	login= new LoginPage();
	login.Username(prop.getProperty("username"));
	LP=login.ContinueClick();
	LP.PasswordField(prop.getProperty("password"));
	CL=LP.LoginButton();
	
}

	@Test
	public void VerifyText()
	{
		System.out.println("happy");
		
	}
	

	
@AfterMethod
public void tearDown()
{
	driver.quit();
}
}

