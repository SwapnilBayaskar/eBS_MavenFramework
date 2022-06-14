package com.Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Flows.LoginFlow;
import com.Generic.BaseTest;
import com.PageFactory.HomePage;

public class LoginLogoutTest extends BaseTest{
	
	private LoginFlow objLoginFlow;
	private HomePage objHomePage;
	
	public void initilizeWebPages() {
		objLoginFlow = new LoginFlow(this);
		objHomePage = new HomePage(this);
	}
	
	@BeforeClass
	public void initilizeWebEnv() {
		this.initilizeWebPages();
		this.initializeWebEnvironment();
	}
	
	@AfterClass
	public void tearDownEnv() {
		this.tearDown();
	}
	
	@Test
	public void TCID_101_VerifyLoginIsSuccessful() {
		objLoginFlow.doLogin();
		objLoginFlow.verifySuccessfulLoginUrl();
	}
	
	@Test
	public void TCID_102_VerifyLogOffIsSuccessful() {
		objLoginFlow.doLogin();
		this.waitFor(3);
		objHomePage.clickOnUserImage();
		this.waitFor(3);
		objHomePage.clickOnLogOffLink();
		this.waitFor(3);
		objHomePage.clickYesOnConfirmLogOffWindow();
		this.waitFor(3);
		objLoginFlow.verifySuccessfulLogOffUrl();
	}
	
	

}
