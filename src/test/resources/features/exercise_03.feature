Feature: As a user I can verify that the Rejected status is correctly added to the leave records search


    Scenario: Rejected Status2
      Given I access OrangeHRM page for exercise 03
      When I enter valid login credentials for exercise 03
      And I press the Login button to log into my account for exercise 03
      And I click the Leave link from the menu
      And I select the Rejected status from the 'Show Leave with Status' section
      Then I check that the Rejected status is present as a selection by using XPath selector