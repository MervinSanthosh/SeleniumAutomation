package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.Header;
import com.Pages.Homepage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTestCases {
	
	WebDriver driver;
	Homepage homepage;
	Header header;
	
	
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void validateLogin() {
	homepage=new Homepage(driver);
	header=new Header(driver);
	homepage.performLogin("Selinium.testing123@gmail.com", "Daredevil@28");
	String username=header.getProfileName();
	Assert.assertTrue(username.contains("Selenium"));
	header.clickLogout();
		
	}
	

}
