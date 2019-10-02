package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
	WebDriver driver;
	
	public Header(WebDriver driver){
		this.driver=driver;
	}
	By myprofile=By.className("_2s25 _606w");
	By accountsettings=By.id("userNavigationLabel");
	By logout=By.xpath("//span[@class='_54nh'][.='Log Out']");
	By profilename=By.className("_1vp5");
	
	public void clickMyProfile() {
		driver.findElement(myprofile).click();
	}
	public void clickAccountSettings() {
		driver.findElement(accountsettings).click();;
	}
	public void clickLogout() {
		driver.findElement(logout).click();
	}
	public String getProfileName() {
		return driver.findElement(profilename).getText();
		
	}
	
}
