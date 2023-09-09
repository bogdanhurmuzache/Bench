Feature: As a user I want to log into my account with valid credentials


  Scenario: Login to the web page
    Given I access OrangeHRM page_exercise02
    When I enter valid login credentials
    And I press the Login button to log into my account_exercise_02
    Then I verify that I am logged into my account by checking that the username is displayed in the navigation bar in the right corner of the application by using XPath selector