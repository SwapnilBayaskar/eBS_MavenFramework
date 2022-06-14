package com.PageFactory;

import org.openqa.selenium.By;

import com.Generic.Pojo;

public class LoginPage {
	
	private Pojo objPojo;
	
	public LoginPage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	
	By loc_inpUsername = By.xpath("//input[@id='UserName']");
	By loc_inpPassword = By.xpath("//input[@id='Password']");
	By loc_btnGetStarted = By.xpath("//button[@class='btn btn-lg btn-primary btn-block btn-signin']");
	
	
	public void setUserName(String strUsername) {
		objPojo.getDriver().findElement(loc_inpUsername).sendKeys(strUsername);
	}
	
	public void setPassword(String strPassword) {
		objPojo.getDriver().findElement(loc_inpPassword).sendKeys(strPassword);
	}
	
	public void clickOnGetStarted() {
		objPojo.getDriver().findElement(loc_btnGetStarted).click();
	}

}
