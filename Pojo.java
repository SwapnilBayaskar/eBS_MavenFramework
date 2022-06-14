package com.Generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Pojo {
	
	private WebDriver driver;
	private String strBaseUrl;
	private int implicitWait=0;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getStrBaseUrl() {
		return strBaseUrl;
	}
	
	public void setStrBaseUrl(String strBaseUrl) {
		this.strBaseUrl = strBaseUrl;
	}

	public int getImplicitWait() {
		return implicitWait;
	}

	public void setImplicitWait(int implicitWait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		this.implicitWait = implicitWait;
	}
	
	

}
