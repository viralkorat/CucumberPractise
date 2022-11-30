Feature: Search feature for users This feature is very important because it will allow users to filter products

  @SanityTest @SmokeTest
  Scenario: user searches, without spelling mistake, for a product name present in inventory. All the products with similar name should be displayed
    Given User is on the main page of www.myshopingsite.com
    When User searches for laptops
    Then search page should be updated with the lists of laptops
