package com.ita.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ita.base.TestBase;

public class ImportContacts extends TestBase {
	
	@FindBy(xpath="//input[contains(@id,'import-data-file')]")
	WebElement ChooseFile;
	
	@FindBy(xpath="//button[contains(@id,'submit')]")
	WebElement UploadB;
	
	@FindBy(xpath="/html/body/div[2]/app/main/importdata/div/nav/div[2]/i")
	WebElement burgerIcon;
	@FindBy(xpath="//a[contains(@href,'/user')]")
	WebElement Home;

	public 	ImportContacts()
	{
		PageFactory.initElements(driver, this);
	}

	public void Home()
	{
		burgerIcon.click();
		Home.click();
	}
	
	public void ChooseFile()
	{
		ChooseFile.sendKeys("/Users/sarika/Desktop/workspace/ITAWEB/src/main/java/com/ita/testdata/saru.xlsx");
		
	UploadB.click();
	}
}
