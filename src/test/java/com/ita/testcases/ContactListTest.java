package com.ita.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ita.base.TestBase;
import com.ita.pages.ContactList;
import com.ita.pages.ImportContacts;
import com.ita.pages.LoginPage;
import com.ita.pages.LoginPassword;
import com.ita.pages.WelcomePage;




public class ContactListTest extends TestBase {
	WelcomePage welcome;
	LoginPage login;
	LoginPassword LP;
	ContactList CL;
	ImportContacts IC;
	public	ContactListTest()
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
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test(priority=1)
	public void ImpContactClickTest()
	{
		IC=CL.impContacts();
		IC.ChooseFile();
		IC.Home();
		
	}
	@Test(priority=2)
	public void LogOutTest()
	{
		CL.LogOut();
	}
	@AfterMethod
	public void clear()
	{
		driver.close();
	}
	
	
}
