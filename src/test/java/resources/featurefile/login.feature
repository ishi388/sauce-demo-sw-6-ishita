Feature: Login Test
  As user I want to login into saucedemo website

  @sanity @regression
  Scenario: User should login successfully with valid credentials
    Given   I am on homepage
    When    I enter email "standard_user"
    And     I enter password "secret_sauce"
    And     I click on login Button
    Then    I should see Products message

  @smoke @regression
  Scenario: verify That Six Products Are Displayed On Page
    Given   I am on homepage
    When    I enter email "standard_user"
    And     I enter password "secret_sauce"
    And     I click on login Button
    Then    I should see six products on homepage