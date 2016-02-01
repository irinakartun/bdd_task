Feature: Add item to cart


  Scenario Outline: Add item to cart
    Given User performs search of "<search>"
    When User opens item with title "<title>"
    And User adds item to cart
    Then Item with title "<title>" added to the cart

    Examples:
      | search               | title                                                                                       |
      |  hermes jardin       | Hermes Un Jardin Sur Le Toit Eau De Toilette Spray 100ml/3.3oz                              |
      |  kenzo perfume       | Kenzo Flower In The Air by Kenzo for Women Eau de Parfum Perfume 50ml 1.7 Oz                |

