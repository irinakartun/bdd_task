Feature: Add item to cart and select colour


  Scenario Outline: Add item to cart and select colour
    Given I perform search of "<search>"
    When I open item with title "<title>"
    And I select "<colour>"
    And I add item to cart
    Then Item "<title>" is added to the cart
    And Item color is "<colour>"

    Examples:
      | search            | title                                                                       | colour  |
      | samsung galaxy s5 | Unlocked - Samsung Galaxy S5 SM-G900P - 16GB - Charcoal Black WHITE GOLD 4G | black   |
