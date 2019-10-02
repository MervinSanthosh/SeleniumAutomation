package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsFeed {
	
	WebDriver driver;
	
	public NewsFeed(WebDriver driver){
		this.driver=driver;
	}
	
	By writesomethingtextbox= By.id("js_b");
	By writesomethingtextboxpopup=By.className("_1mf _1mj");
	By post=By.xpath("//button[@data-testid='react-composer-post-button']");
	public void clickTextbox() {
		driver.findElement(writesomethingtextbox).click();
	}
	public void enterText(String text) {
		driver.findElement(writesomethingtextboxpopup).sendKeys(text);
	}
	public void postButton() {
		driver.findElement(post).click();
	}
	
}
