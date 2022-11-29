Feature: Test login functionality

  @SanityTest
  Scenario: Check login is successful with valid credentials
    Given user is already on login page
    And username and password are entered
    When user clicks on login button
    Then user should see home page
