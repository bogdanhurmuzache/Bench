Feature: Place new order

  Scenario: Place an order for the required product
    Given Customer navigates to the website
    And Customer login to his account
    When customer searches for laptop
    And clicks on add to cart button
    Then Customer is redirected to cart page
    And Customer is able to click the place order button