package com.testes;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pageobject.DashBoardPage;
import com.pageobject.Download;
import com.pageobject.LoginPage;
import com.pageobject.Logoutpage;
import com.pageobject.OperatorPage;
import com.pageobject.UsefulLink;
import com.pageobject.UserPage;



public class LoginTest {
	WebDriver driver=null;
	LoginPage lp = null;
	DashBoardPage dp = null;
	UserPage up = null;
	OperatorPage op =null;
	UsefulLink ul = null;
	Download dl = null;
	Logoutpage lo = null;
	
	@BeforeSuite //open a browser and launch application
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dp = new DashBoardPage(driver);
		up= new UserPage(driver);
		op = new OperatorPage(driver);
		ul = new UsefulLink(driver);
		dl = new Download(driver);
		lo = new Logoutpage(driver);
	}
	@Test(priority=1)
	public void testA() throws InterruptedException {
		lp = new LoginPage(driver);  //login page driver initialization
		dp=lp.validLogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void testB() throws Exception {
		ArrayList<String> expectedCoyrses = new ArrayList<String>();
		expectedCoyrses.add("Selenium");
		expectedCoyrses.add("Java / J2EE");
		expectedCoyrses.add("Python");
		expectedCoyrses.add("Php");
		System.out.println(expectedCoyrses);
		ArrayList<String> actualCourses = dp.verifyCourse();
		System.out.println(actualCourses);
		Assert.assertEquals(actualCourses,expectedCoyrses);
		dp.clickUser();	
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void testC() throws InterruptedException {
	 up.clickOperator();
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void testD() throws Exception {
	op.clickusefulLink();
	Thread.sleep(3000);
	}
	
	@Test(priority=5)
	public void testE() throws Exception {
    ul.clickDownloadBtn();
	Thread.sleep(3000);
	}
	
	@Test(priority=6)
	public void testF() {
    dl.clickLogout();
	}
	

}
