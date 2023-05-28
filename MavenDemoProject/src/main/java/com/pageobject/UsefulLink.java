package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsefulLink {
    WebDriver driver = null;

	public UsefulLink(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Downloads']")
	WebElement downloadBtn;
	
	public Download clickDownloadBtn() {
		downloadBtn.click();
		return new Download(driver);
		
	}
    
}
