Feature: User Login

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid username and password
    And clicks on the login button
    Then User should be redirected to the homepage
    And a welcome message should be displayed

  Scenario: Login with invalid credentials
    Given User is on the login page
    When User enters invalid username and password
    And clicks on the login button
    Then An error message should be displayed

  Scenario: Login with empty fields
    Given User is on the login page
    When User clicks on the login button without entering credentials
    Then Validation messages should be displayed for required fields

 

 