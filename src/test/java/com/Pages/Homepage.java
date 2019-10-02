package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	WebDriver driver;
	//Finding Elements
	By username=By.id("email");
	By password=By.id("pass");
	By loginbtn= By.id("u_0_b");
	
	public Homepage(WebDriver driver){
		this.driver=driver;
	}
	
	//Creating Actions
	public void enterUsername(String email) {
		driver.findElement(username).sendKeys(email);
	}
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);	
	}
	public void clickLogin() {
		driver.findElement(loginbtn).click();
	}
	public void performLogin(String email, String pass) {
		this.enterUsername(email);
		this.enterPassword(pass);
		this.clickLogin();
	}
	

}


