package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.NewsFeed;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewsFeedTestCases {
	
	WebDriver driver;
	NewsFeed newsfeed;
	
	
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
	public void createPost() {
		newsfeed=new NewsFeed(driver);
		newsfeed.clickTextbox();
		newsfeed.enterText("Automatoin Testing");
		newsfeed.postButton();
		
	}
	

}
	
