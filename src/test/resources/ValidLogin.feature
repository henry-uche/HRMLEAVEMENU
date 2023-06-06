Feature: Login

  Scenario: Validate that users with valid credentials can successfully login

    Given I am on the landing page
    When  I enter a valid username in the username field
    And   I enter a valid password in the password field
    When  I click on the login button
    Then  I should be successfully logged in

