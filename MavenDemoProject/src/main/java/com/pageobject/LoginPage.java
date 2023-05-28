package com.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//Webelement and methods
//	public WebElement getUsername() {
//		return driver.findElement(By.id("email"));
//	}
//	
//	public WebElement getPassword() {
//		return driver.findElement(By.id("password"));
//	}
//	
//	public WebElement getLoginBtn() {
//		return driver.findElement(By.xpath("//button"));
//	}
//	
//	public void loginApplication(String uname,String pwd) {
//	getUsername().sendKeys(uname);
//	getPassword().sendKeys(pwd);
//	getLoginBtn().click();
//	}

	//When use page object model
    @FindBy(xpath="//a/b")
    WebElement textDisplay;
    
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement pwdFiled;
	
	@FindBy(xpath="//button")
	WebElement loginBtn;
	
	public DashBoardPage validLogin() {
		username.sendKeys("kiran@gmail.com");
		pwdFiled.sendKeys("123456");
		loginBtn.click();
		return new DashBoardPage(driver);
	}
	
	
	public void loginApplication(String uname,String pwd) {
		textDisplay.isDisplayed();
		username.sendKeys(uname);
		pwdFiled.sendKeys(pwd);
		loginBtn.click();
	}
	
	
}
