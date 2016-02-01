Feature: Add different items to cart


  Scenario: Add different items to cart
    Given User adds "Standard Fun 108 UNO Playing Cards Game For Travel Family Friends Instruction" and "Monopoly Finance Board Game Boys & Girls 2015 Min 2 players" items to cart
    And User goes to home page
    When User opens the cart
    Then "Standard Fun 108 UNO Playing Cards Game For Travel Family Friends Instruction" and "Monopoly Finance Board Game Boys & Girls 2015 Min 2 players" items are in the cart



