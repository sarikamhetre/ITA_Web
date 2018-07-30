package com.ita.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	
	public 	ContactList()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateusername(String userName)
	{
		driver.findElement(By.xpath("//small[contains(@text,'"+userName+"']"));
		return userName;		
	}
	
	public void createContact()
	{ 
		logo.click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		 
		 
		//Wait till the element is not visible
		 
		WebElement newContact=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main']/top-filter/div/ul/li[5]/button/text()")));
		
		
		newContact.click();
	
	
		NameField.sendKeys("Sanikaa");
		PhoneField.sendKeys("8768768");
		SaveButton.click();
		
	}
	
	
	
	
}
