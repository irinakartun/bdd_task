Feature: Add the same item to cart


  Scenario: Add the same item to cart
    Given User found an item "Apple iPad mini 1st Generation Wi-Fi, 7.9in (16GB, 32GB, 64GB)" with color and capacity attributes
    When User tries to add found item to cart
    Then two error messages appear




