Feature: Buy Back Packs Product

  @Android
  Scenario: User buy back packs product
    Given user choose the product
    And user choose the colour of product
    And user set the quantity
    And user click add to cart
    When user navigate to checkout page
    Then the product title should be "Sauce Labs Backpack"
    And the product quantity should be 2