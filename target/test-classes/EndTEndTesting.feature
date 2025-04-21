
@checkout
Feature: Verify checkout functionality on Urban Ladder

  @tag1
  Scenario: Verify end-to-end checkout feature

    Given I open the Urban Ladder website
    Then I should see the homepage displayed correctly

    When I enter "Sofa" in the search bar and submit
    Then I should see search results related to "Sofa"

    When I apply a filter on the search results
    Then I should see filtered results updated accordingly

    When I click on a product from the filtered results
    And I add the product to the cart
    Then the product should be added successfully to the cart

    When I navigate to the cart
    And I click on the checkout button
    And I enter  shipping details
    Then I should be navigated to the payment page
