package com.ita.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ita.base.TestBase;

public class WelcomePage extends TestBase {

	@FindBy(xpath ="//a[contains(@href,'/login/')]")
WebElement loginButton;
	
	public WelcomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage LoginClick()
	{
		loginButton.click();
		return new LoginPage();
	}
	
	
	
}
