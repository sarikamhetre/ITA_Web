package com.ita.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ita.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(className="card-title")
	WebElement loginWith;
	@FindBy(xpath="//input[contains(@placeholder,'Username')]")
	WebElement Username;
	@FindBy(xpath="//button[contains(@type,'submit')]")
	WebElement ContinueButton;
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String loginwithText()
	{
		return loginWith.getText();
	}
	public void Username(String un)
	{
		Username.sendKeys(un);
	}
	public LoginPassword ContinueClick()
	{
		ContinueButton.click();
		return new LoginPassword();
	}
}
