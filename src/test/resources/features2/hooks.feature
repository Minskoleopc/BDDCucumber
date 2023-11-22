Feature: Login to SauceDemo

  @regression
  Scenario: User logs in with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be logged in successfully

  @smoke
  Scenario: User logs in with invalid credentials
    Given the user is on the login page
    When the user enters invalid username and password
    Then the user should see an error message
