package com.ita.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ita.base.TestBase;
import com.ita.pages.WelcomePage;

public class WelcomePageTest extends TestBase{
	WelcomePage welcome;
public	WelcomePageTest()
{
	super();
}
@BeforeMethod
public void setUp()
{
	initialization();
	welcome= new WelcomePage();
}
	@Test
	public void loginButtonClickTest()
	{
		welcome.LoginClick();
		
	}

}
