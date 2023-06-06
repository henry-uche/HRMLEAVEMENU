Feature: My Leave sub-section

  Background:
    Given I am on the HRM application
    And I login

  Scenario: Verify that MY LEAVE sub- section is Responsive and Navigates users to the right page
    #Given I landed at the homepage
    When I click on the Leave Menu
    And  I click on MY-LEAVE button
    Then I should see the required my-leave-list page
    When I click on the from-date field
    When I repeat the above steps on To-date field
    When I click on the Show Leave with Status drop-down Arrow
    And  I click on the Leave-Type drop-down Arrow
    And   I click on the Leave-Type drop-down Arrow again
    When I click on the SEARCH button
    Then I should see a search results below search page
    When I click on RESET button
    Then it should reset search page to default
