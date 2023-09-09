Feature: As a user I am able to add an attachment into my Contact Details

@
  Scenario:
    Given I access OrangeHRM page
    When I enter valid login credentials
    And I press the Login button to log into my account
    And I click the My Info option from the menu for exercise 04
    And I click on the Contact Details link which will redirect me to the contactDetails page for exercise 04
    And I click the Add Attachments button
    And I select to upload a file
    And I add a comment for this document uploaded in the comment field
    And I press the Save button for this attachment added
    Then I am able to see my document added in the record found section by using css selector