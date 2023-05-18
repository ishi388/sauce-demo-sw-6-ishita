package com.saucedemo.pages;

import com.saucedemo.Utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;


    /**
     * enter EmailId
     *
     * @param email
     */
    public void enterEmailId(String email) {
        log.info("enter EmailId");
        sendTextToElement(emailField, email);
    }

    /**
     * enter Password
     *
     * @param password
     */
    public void enterPassword(String password) {
        log.info("enter Password");
        sendTextToElement(passwordField, password);
    }

    /**
     * click On Login Button
     */
    public void clickOnLoginButton() {
        log.info("click On Login Button");
        clickOnElement(loginButton);
    }

}
