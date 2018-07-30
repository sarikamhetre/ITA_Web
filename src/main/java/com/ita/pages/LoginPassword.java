package com.ita.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ita.base.TestBase;

public class LoginPassword extends TestBase{
	@FindBy(xpath="//button[contains(@class,'btn btn-outline-primary btn-lg')]")
	WebElement LoginCheck;
	
	@FindBy(xpath="//input[contains(@id,'password')]")
	WebElement Password;
	public 	LoginPassword()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String LoginText()
	{
		return LoginCheck.getText();
	}
	
	public void PasswordField(String pwd)
	{
		Password.sendKeys(pwd);
		
	}
	
	public ContactList LoginButton()
	{
		LoginCheck.click();
		return new ContactList();
	}
	
}
