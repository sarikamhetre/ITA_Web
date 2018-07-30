package com.ita.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ita.base.TestBase;

public class ContactList extends TestBase{
	

	//@FindBy(xpath="//*[@id='main']/top-filter/div/ul/li[5]/button/text()")
	//WebElement newContact;
	
	@FindBy(xpath="//input[contains(@placeholder,'Name...')]")
	WebElement NameField;
	
	@FindBy(xpath="//input[contains(@placeholder,'Phone 1...')]")
	WebElement PhoneField;
	
	@FindBy(xpath="//button[contains(@text,'Save')]")
	WebElement SaveButton;
	@FindBy(xpath="//img[contains(@alt,'InTouchApp')]")
	WebElement logo;
	
	@FindBy(xpath="//img[contains(@src, 'https://www.intouchapp.com/mugshot/key/1hii4wwbu9paeppxxxket0c1ja88yj7ri3nxr19772mvitez2c2k9ke6ky5mfhdw/')]")
	WebElement dropdown;
	
	@FindBy(xpath="//*[@id='settings']/div/div[2]/a[8]")
	WebElement logOut;
	
	@FindBy(xpath="//a[contains(@href,'/user/import/')]")
	WebElement impContacts;
	
	public 	ContactList()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateusername(String userName)
	{
		driver.findElement(By.xpath("//small[contains(@text,'"+userName+"']"));
		return userName;		
	}
	
	public void LogOut()
	{ 
		
		dropdown.click();
		logOut.click();
		
	}
	public ImportContacts impContacts()
	{
		dropdown.click();
		impContacts.click();
		return new ImportContacts();
	}
	
	
	
	
}
