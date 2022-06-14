package com.PageFactory;

import org.openqa.selenium.By;

import com.Generic.Pojo;

public class HomePage {
	
	private Pojo objPojo;
	
	public HomePage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	
	By loc_txtPortfolioProducts = By.xpath("//div[text()='Portfolio Products']");
	By loc_icnDashboardReports = By.xpath("//a[@id='executivedashBoard']");
	By loc_tabWorkQueue = By.xpath("(//a[@href='#workQueueTab'])[1]");
	By loc_tabWatchList = By.xpath("(//a[@href='#watchListTab'])[1]");
	By loc_btnNextModulesArrow = By.xpath("(//span[@class='glyphicon glyphicon-chevron-right icons-rightarrow'])[1]");
	By loc_txtQuotes = By.xpath("(//div[text()='Quotes'])[1]");
	By loc_imgUser = By.xpath("//div[@class='pull-right dropdownclick']");
	By loc_txtLogOffLink = By.xpath("//a[@id='confirm']/span");
	By loc_btnConfirmLogOffYes = By.xpath("(//button[text()='Yes'])[1]");
	
	
	public void clickOnPortfolioProducts() {
		objPojo.getDriver().findElement(loc_txtPortfolioProducts).click();
	}
	
	public void clickOnDashboardReports() {
		objPojo.getDriver().findElement(loc_icnDashboardReports).click();
	}
	
	public void clickOnNextModulesArrow() {
		objPojo.getDriver().findElement(loc_btnNextModulesArrow).click();
	}
	
	public void clickOnQuotesText() {
		objPojo.getDriver().findElement(loc_txtQuotes).click();
	}
	
	public void clickOnWatchListTab() {
		objPojo.getDriver().findElement(loc_tabWatchList).click();
	}
	
	public void clickOnWorkQueueTab() {
		objPojo.getDriver().findElement(loc_tabWorkQueue).click();
	}
	
	public void clickOnDashboardIcon() {
		objPojo.getDriver().findElement(loc_icnDashboardReports).click();
	}
	
	public void clickOnUserImage() {
		objPojo.getDriver().findElement(loc_imgUser).click();
	}
	
	public void clickOnLogOffLink() {
		objPojo.getDriver().findElement(loc_txtLogOffLink).click();
	}
	
	public void clickYesOnConfirmLogOffWindow() {
		objPojo.getDriver().findElement(loc_btnConfirmLogOffYes).click();
	}

}
