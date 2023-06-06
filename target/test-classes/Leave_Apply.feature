Feature: Apply

  //taken from the commonsteps1.feature
  Background:
    Given I am on the HRM application
    And I login

  Scenario: verify that Apply feature navigates correctly

    #Given I am on the home page
    When  I click on Leave Menu
    And I click the Apply feature
    Then I should see the Apply Leave page