package com.e2eTests.automation.authentication.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPage {

	/* locators */
	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSWORD_ID = "txtPassword";
	final static String BTN_LOGIN_ID = "btnLogin";
	final static String MESSAGE_TEXT = "welcome";

	/* @FindBy */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSWORD_ID)
	public static WebElement userPassword;
	@FindBy(how = How.ID, using = BTN_LOGIN_ID)
	public static WebElement btnLogin;
	@FindBy(how = How.ID, using = MESSAGE_TEXT)
	public static WebElement message;

	/* Methods */
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}

	public void fillUserPassword(String password) {
		userPassword.sendKeys(password);
	}

	public void btnLogin() {
		btnLogin.click();
	}

}
