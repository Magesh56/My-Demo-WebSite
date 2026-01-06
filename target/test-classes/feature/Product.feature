Feature: Product Search and Browsing

  Scenario: Search for a product by name
    Given User is on the homepage
    When User searches for Laptop
    Then Relevant products should be displayed

  Scenario: Filter products by category
    Given User is on the product listing page
    When User applies filter Electronics
    Then Only electronic products should be displayed

  Scenario: Sort products by price
    Given User is on the product listing page
    When User sorts products by Price Low to High
    Then Products should be displayed in ascending order of price