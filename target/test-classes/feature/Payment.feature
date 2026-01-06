Feature: Checkout and Payment

  Scenario: Successful checkout with valid details
    Given User has into items in the cart
    When User proceeds to checkout
    And enters valid shipping address and payment details
    Then Order confirmation page should be displayed

  Scenario: Checkout with invalid card details
    Given User has into items in the cart
    When User enters invalid card details
    Then An error message should be displayed