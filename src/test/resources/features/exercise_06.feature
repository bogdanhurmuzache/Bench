Feature: As a user I am able to delete a record from my Contact Details

  @test
  Scenario: Delete a record from my Contact Details
    Given I access OrangeHRM page
    When I enter valid login credentials
    And I press the Login button to log into my account
    And I click the My Info option from the menu for exercise 04
    And I click on the Contact Details link which will redirect me to the contactDetails page for exercise 04
    And I click the checkbox to select one record saved in the Records Found section
    And I press the Delete button to delete that record
    And I press Yes to confirm this deletion
    Then I should receive a confirmation message that the record has been deleted successfully