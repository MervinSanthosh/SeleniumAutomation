package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profile {
	WebDriver driver;
	
	Profile(WebDriver driver){
		this.driver=driver;
	}
	
	By about=By.linkText("//a[.='About']");
	By addworkspace=By.xpath("//span[.='Add a workplace']");
	By companytextbox=By.id("u_x_8");
	By choosecompany=By.xpath("//span[.='CTS']");
	By save=By.name("__submit__");
	By close=By.className("img sp_fdXVLD42pod_1_5x sx_7a97aa");
	By companyname= By.id("js_206");
	
	public void clickAboutMenu() {
		driver.findElement(about).click();
	}
	public void clickAddWorkspace() {
		driver.findElement(addworkspace).click();
	}
	public void enterCompanyName(String company) {
		driver.findElement(companytextbox).sendKeys(company);
	}
	public void chooseCompanyName() {
		driver.findElement(choosecompany).click();
	}
	public void saveChanges() {
		driver.findElement(save).click();
	}
	public void closePopup() {
		driver.findElement(close).click();
	}
	public String checkCompanyName() {
		return driver.findElement(companyname).getText();
	}


}
