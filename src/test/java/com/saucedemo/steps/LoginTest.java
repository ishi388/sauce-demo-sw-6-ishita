package com.saucedemo.steps;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginTest {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String emailId) {
        new LoginPage().enterEmailId(emailId);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should see Products message$")
    public void iShouldSeeProductsMessage() {
        String expectedText = "Products";
        String actualText = new HomePage().getProductMessage();
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("^I should see six products on homepage$")
    public void iShouldSeeSixProductsOnHomepage() {
        int expectedText = 6;
        int actualText = new HomePage().getNumberofProductOnHomePage();
        Assert.assertEquals(expectedText, actualText);
    }
}