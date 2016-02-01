$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bdd/test1.feature");
formatter.feature({
  "id": "add-item-to-cart",
  "description": "",
  "name": "Add item to cart",
  "keyword": "Feature",
  "line": 1
});
formatter.scenarioOutline({
  "id": "add-item-to-cart;add-item-to-cart",
  "description": "",
  "name": "Add item to cart",
  "keyword": "Scenario Outline",
  "line": 4,
  "type": "scenario_outline"
});
formatter.step({
  "name": "User performs search of \"\u003csearch\u003e\"",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "User opens item with title \"\u003ctitle\u003e\"",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "User adds item to cart",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "Item with title \"\u003ctitle\u003e\" added to the cart",
  "keyword": "Then ",
  "line": 8
});
formatter.examples({
  "id": "add-item-to-cart;add-item-to-cart;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 10,
  "rows": [
    {
      "id": "add-item-to-cart;add-item-to-cart;;1",
      "cells": [
        "search",
        "title"
      ],
      "line": 11
    },
    {
      "id": "add-item-to-cart;add-item-to-cart;;2",
      "cells": [
        "hermes jardin",
        "Hermes Un Jardin Sur Le Toit Eau De Toilette Spray 100ml/3.3oz"
      ],
      "line": 12
    },
    {
      "id": "add-item-to-cart;add-item-to-cart;;3",
      "cells": [
        "kenzo perfume",
        "Kenzo Flower In The Air by Kenzo for Women Eau de Parfum Perfume 50ml 1.7 Oz"
      ],
      "line": 13
    }
  ]
});
formatter.scenario({
  "id": "add-item-to-cart;add-item-to-cart;;2",
  "description": "",
  "name": "Add item to cart",
  "keyword": "Scenario Outline",
  "line": 12,
  "type": "scenario"
});
formatter.step({
  "name": "User performs search of \"hermes jardin\"",
  "keyword": "Given ",
  "line": 5,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "User opens item with title \"Hermes Un Jardin Sur Le Toit Eau De Toilette Spray 100ml/3.3oz\"",
  "keyword": "When ",
  "line": 6,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "User adds item to cart",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "Item with title \"Hermes Un Jardin Sur Le Toit Eau De Toilette Spray 100ml/3.3oz\" added to the cart",
  "keyword": "Then ",
  "line": 8,
  "matchedColumns": [
    1
  ]
});
formatter.match({
  "arguments": [
    {
      "val": "hermes jardin",
      "offset": 25
    }
  ],
  "location": "Test1.UserSetSearchRequest(String)"
});
formatter.result({
  "duration": 4714287868,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hermes Un Jardin Sur Le Toit Eau De Toilette Spray 100ml/3.3oz",
      "offset": 28
    }
  ],
  "location": "Test1.openDetailsPage(String)"
});
formatter.result({
  "duration": 785660332,
  "status": "passed"
});
formatter.match({
  "location": "Test1.userAddsItemToCart()"
});
formatter.result({
  "duration": 2439033433,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hermes Un Jardin Sur Le Toit Eau De Toilette Spray 100ml/3.3oz",
      "offset": 17
    }
  ],
  "location": "Test1.itemIsAddedToTheCart(String)"
});
formatter.result({
  "duration": 2410700305,
  "status": "passed"
});
formatter.scenario({
  "id": "add-item-to-cart;add-item-to-cart;;3",
  "description": "",
  "name": "Add item to cart",
  "keyword": "Scenario Outline",
  "line": 13,
  "type": "scenario"
});
formatter.step({
  "name": "User performs search of \"kenzo perfume\"",
  "keyword": "Given ",
  "line": 5,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "User opens item with title \"Kenzo Flower In The Air by Kenzo for Women Eau de Parfum Perfume 50ml 1.7 Oz\"",
  "keyword": "When ",
  "line": 6,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "User adds item to cart",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "Item with title \"Kenzo Flower In The Air by Kenzo for Women Eau de Parfum Perfume 50ml 1.7 Oz\" added to the cart",
  "keyword": "Then ",
  "line": 8,
  "matchedColumns": [
    1
  ]
});
formatter.match({
  "arguments": [
    {
      "val": "kenzo perfume",
      "offset": 25
    }
  ],
  "location": "Test1.UserSetSearchRequest(String)"
});
formatter.result({
  "duration": 2521573712,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kenzo Flower In The Air by Kenzo for Women Eau de Parfum Perfume 50ml 1.7 Oz",
      "offset": 28
    }
  ],
  "location": "Test1.openDetailsPage(String)"
});
formatter.result({
  "duration": 10536354011,
  "status": "passed"
});
formatter.match({
  "location": "Test1.userAddsItemToCart()"
});
formatter.result({
  "duration": 96443997,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kenzo Flower In The Air by Kenzo for Women Eau de Parfum Perfume 50ml 1.7 Oz",
      "offset": 17
    }
  ],
  "location": "Test1.itemIsAddedToTheCart(String)"
});
formatter.result({
  "duration": 1993350437,
  "status": "passed"
});
formatter.uri("bdd/test2.feature");
formatter.feature({
  "id": "add-item-to-cart-and-select-colour",
  "description": "",
  "name": "Add item to cart and select colour",
  "keyword": "Feature",
  "line": 1
});
formatter.scenarioOutline({
  "id": "add-item-to-cart-and-select-colour;add-item-to-cart-and-select-colour",
  "description": "",
  "name": "Add item to cart and select colour",
  "keyword": "Scenario Outline",
  "line": 4,
  "type": "scenario_outline"
});
formatter.step({
  "name": "I perform search of \"\u003csearch\u003e\"",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I open item with title \"\u003ctitle\u003e\"",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I select \"\u003ccolour\u003e\"",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "I add item to cart",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "Item \"\u003ctitle\u003e\" is added to the cart",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "Item color is \"\u003ccolour\u003e\"",
  "keyword": "And ",
  "line": 10
});
formatter.examples({
  "id": "add-item-to-cart-and-select-colour;add-item-to-cart-and-select-colour;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 12,
  "rows": [
    {
      "id": "add-item-to-cart-and-select-colour;add-item-to-cart-and-select-colour;;1",
      "cells": [
        "search",
        "title",
        "colour"
      ],
      "line": 13
    },
    {
      "id": "add-item-to-cart-and-select-colour;add-item-to-cart-and-select-colour;;2",
      "cells": [
        "samsung galaxy s5",
        "Unlocked - Samsung Galaxy S5 SM-G900P - 16GB - Charcoal Black WHITE GOLD 4G",
        "black"
      ],
      "line": 14
    }
  ]
});
formatter.scenario({
  "id": "add-item-to-cart-and-select-colour;add-item-to-cart-and-select-colour;;2",
  "description": "",
  "name": "Add item to cart and select colour",
  "keyword": "Scenario Outline",
  "line": 14,
  "type": "scenario"
});
formatter.step({
  "name": "I perform search of \"samsung galaxy s5\"",
  "keyword": "Given ",
  "line": 5,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I open item with title \"Unlocked - Samsung Galaxy S5 SM-G900P - 16GB - Charcoal Black WHITE GOLD 4G\"",
  "keyword": "When ",
  "line": 6,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "I select \"black\"",
  "keyword": "And ",
  "line": 7,
  "matchedColumns": [
    2
  ]
});
formatter.step({
  "name": "I add item to cart",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "Item \"Unlocked - Samsung Galaxy S5 SM-G900P - 16GB - Charcoal Black WHITE GOLD 4G\" is added to the cart",
  "keyword": "Then ",
  "line": 9,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "Item color is \"black\"",
  "keyword": "And ",
  "line": 10,
  "matchedColumns": [
    2
  ]
});
formatter.match({
  "arguments": [
    {
      "val": "samsung galaxy s5",
      "offset": 21
    }
  ],
  "location": "Test2.UserSetSearchRequest(String)"
});
formatter.result({
  "duration": 3051245446,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Unlocked - Samsung Galaxy S5 SM-G900P - 16GB - Charcoal Black WHITE GOLD 4G",
      "offset": 24
    }
  ],
  "location": "Test2.openDetailsPage(String)"
});
formatter.result({
  "duration": 250344875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "black",
      "offset": 10
    }
  ],
  "location": "Test2.userSelects(String)"
});
formatter.result({
  "duration": 16316099915,
  "status": "passed"
});
formatter.match({
  "location": "Test2.userAddsItemToCart()"
});
formatter.result({
  "duration": 96453620,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Unlocked - Samsung Galaxy S5 SM-G900P - 16GB - Charcoal Black WHITE GOLD 4G",
      "offset": 6
    }
  ],
  "location": "Test2.itemIsAddedToTheCart(String)"
});
formatter.result({
  "duration": 2424590552,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "black",
      "offset": 15
    }
  ],
  "location": "Test2.itemSColorIs(String)"
});
formatter.result({
  "duration": 31496258,
  "status": "passed"
});
formatter.uri("bdd/test3.feature");
formatter.feature({
  "id": "add-different-items-to-cart",
  "description": "",
  "name": "Add different items to cart",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "add-different-items-to-cart;add-different-items-to-cart",
  "description": "",
  "name": "Add different items to cart",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "User adds \"Standard Fun 108 UNO Playing Cards Game For Travel Family Friends Instruction\" and \"Monopoly Finance Board Game Boys \u0026 Girls 2015 Min 2 players\" items to cart",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "User goes to home page",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "User opens the cart",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "\"Standard Fun 108 UNO Playing Cards Game For Travel Family Friends Instruction\" and \"Monopoly Finance Board Game Boys \u0026 Girls 2015 Min 2 players\" items are in the cart",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "arguments": [
    {
      "val": "Standard Fun 108 UNO Playing Cards Game For Travel Family Friends Instruction",
      "offset": 11
    },
    {
      "val": "Monopoly Finance Board Game Boys \u0026 Girls 2015 Min 2 players",
      "offset": 95
    }
  ],
  "location": "Test3.UserAddItemsToCart(String,String)"
});
formatter.result({
  "duration": 16315079003,
  "status": "passed"
});
formatter.match({
  "location": "Test3.goToHomePage()"
});
formatter.result({
  "duration": 4638292270,
  "status": "passed"
});
formatter.match({
  "location": "Test3.openCart()"
});
formatter.result({
  "duration": 1965415025,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard Fun 108 UNO Playing Cards Game For Travel Family Friends Instruction",
      "offset": 1
    },
    {
      "val": "Monopoly Finance Board Game Boys \u0026 Girls 2015 Min 2 players",
      "offset": 85
    }
  ],
  "location": "Test3.itemsAddedToTheCart(String,String)"
});
formatter.result({
  "duration": 2050997836,
  "status": "passed"
});
formatter.uri("bdd/test4.feature");
formatter.feature({
  "id": "add-more-items-than-available-to-cart",
  "description": "",
  "name": "Add more items than available to cart",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "add-more-items-than-available-to-cart;add-more-items-than-available-to-cart",
  "description": "",
  "name": "Add more items than available to cart",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I open the item with title \"Apple iPhone 6 Plus - 64GB - Space Grey (Unlocked) Smartphone - Boxed\"",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I set amount more than available in stock",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "Error message appears",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "arguments": [
    {
      "val": "Apple iPhone 6 Plus - 64GB - Space Grey (Unlocked) Smartphone - Boxed",
      "offset": 28
    }
  ],
  "location": "Test4.FindAndOpenItem(String)"
});
formatter.result({
  "duration": 4649283036,
  "status": "passed"
});
formatter.match({
  "location": "Test4.setExcedeedAmount()"
});
formatter.result({
  "duration": 1715861734,
  "status": "passed"
});
formatter.match({
  "location": "Test4.verifyErrorMessage()"
});
formatter.result({
  "duration": 153522726,
  "status": "passed"
});
formatter.uri("bdd/test5.feature");
formatter.feature({
  "id": "add-the-same-item-to-cart",
  "description": "",
  "name": "Add the same item to cart",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "add-the-same-item-to-cart;add-the-same-item-to-cart",
  "description": "",
  "name": "Add the same item to cart",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "User found an item \"Apple iPad mini 1st Generation Wi-Fi, 7.9in (16GB, 32GB, 64GB)\" with color and capacity attributes",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "User tries to add found item to cart",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "two error messages appear",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "arguments": [
    {
      "val": "Apple iPad mini 1st Generation Wi-Fi, 7.9in (16GB, 32GB, 64GB)",
      "offset": 20
    }
  ],
  "location": "Test5.UserFindsItem(String)"
});
formatter.result({
  "duration": 3717967066,
  "status": "passed"
});
formatter.match({
  "location": "Test5.openCart()"
});
formatter.result({
  "duration": 93311019,
  "status": "passed"
});
formatter.match({
  "location": "Test5.itemsAddedToTheCart()"
});
formatter.result({
  "duration": 191637434,
  "status": "passed"
});
});