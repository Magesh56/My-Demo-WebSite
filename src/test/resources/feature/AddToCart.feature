Feature: Shopping Cart

  Scenario: Add product to cart
    Given User is on the product details page
    When User clicks Add to Cart
    Then Product should be added to the cart
    And Cart count should increase

  Scenario: Remove product from cart
    Given User has items in the cart
    When User removes a product
    Then Product should no longer appear in the cart