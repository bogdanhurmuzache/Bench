Feature: Login


  Scenario: Login and verify a message
    Given I access OrangeHRM page
    When I enter invalid login credentials
    And I press the Login button to log into my account
    Then I verify that an appropriate message is displayed for invalid credentials