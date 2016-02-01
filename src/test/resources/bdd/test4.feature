Feature: Add more items than available to cart


  Scenario: Add more items than available to cart
    Given I open the item with title "Apple iPhone 6 Plus - 64GB - Space Grey (Unlocked) Smartphone - Boxed"
    When I set amount more than available in stock
    Then Error message appears

