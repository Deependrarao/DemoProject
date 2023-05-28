package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download {
	WebDriver driver = null;

	public Download(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Logout']")
    WebElement logoutBtn;
	
	public Logoutpage clickLogout() {
		logoutBtn.click();
		return new Logoutpage(driver);
		
	}
}
