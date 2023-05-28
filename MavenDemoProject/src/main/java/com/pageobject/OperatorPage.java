package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperatorPage {
	WebDriver driver=null;
	public OperatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='     Useful Links']")
	WebElement UsefulLinkBtn;
	
	public UsefulLink clickusefulLink() {
		UsefulLinkBtn.click();
		return new UsefulLink(driver);
	}

}
