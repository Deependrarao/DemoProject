package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	WebDriver driver = null;

	public Logoutpage(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
