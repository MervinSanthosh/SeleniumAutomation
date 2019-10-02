package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.Header;
import com.Pages.Profile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProfileTestCases {
	
	WebDriver driver;
	Profile profile;
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
	public void updateProfile() {
		header.clickMyProfile();
		profile.clickAboutMenu();
		profile.enterCompanyName("CTS");
		profile.chooseCompanyName();
		profile.saveChanges();
		profile.closePopup();
		String companyname=profile.checkCompanyName();
		Assert.assertTrue(companyname.contains("CTS"));
	}
		
	

}
