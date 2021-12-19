package com.e2eTests.automation.authentication.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.authentication.pageObject.AuthenticationPage;
import com.e2eTests.automation.util.CommonMethods;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentcationStepDefinition extends CommonMethods {

	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	private CommonMethods commonMethods = new CommonMethods();

	public AuthentcationStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}

	@Given("^Je me connecte sur l'application Orange HRM$")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		logger.info("Je me connecte sur l'application Orange HRM");
		commonMethods.readFromFile("url");
		//driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Je saisie le username \"([^\"]*)\"$")
	public void jeSaisieLeUsername(String name) throws Throwable { 
		logger.info("Je saisie le username");
		authenticationPage.fillUserName(name);
	}

	@When("^je saisie le password \"([^\"]*)\"$")
	public void jeSaisieLePassword(String password) throws Throwable {
		logger.info("je saisie le password");
		authenticationPage.fillUserPassword(password);
	}

	@When("^Je clique sur le bouton Login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		logger.info("Je clique sur le bouton Login");
		authenticationPage.btnLogin();
	}

	@Then("^Je me dérige vers la page Home \"([^\"]*)\"$")
	public void jeMeDérigeVersLaPageHome(String text) throws Throwable {
		logger.info("Je me dérige vers la page Home");
		String messageToWelcome = AuthenticationPage.message.getText();
		Assert.assertTrue(messageToWelcome.contains(text));
	}

	/*Login with Outline scenario*/

	@When("^Je saisie le userName \"([^\"]*)\"$")
	public void jeSaisieLeUserName(String name) throws Throwable {
		authenticationPage.fillUserName(name);

	}

	@When("^Je saisie le password \"([^\"]*)\"$")
	public void jeSaisiePassword(String Password) throws Throwable {
		authenticationPage.fillUserPassword(Password);

	}


}
