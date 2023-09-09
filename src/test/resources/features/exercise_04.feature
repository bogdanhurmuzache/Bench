Feature: As a user I am able to update my street and country details


  Scenario: User update street and country
    Given I access OrangeHRM page for exercise 04
    When I enter valid login credentials for exercise 04
    And I click the My Info option from the menu for exercise 04
    And I click on the Contact Details link which will redirect me to the contactDetails page for exercise 04
    And I update the Street 1 field from contact details for exercise 04
    And I select Algeria as country
    And I press the Save button
    Then I should see the successfully updated confirmation message