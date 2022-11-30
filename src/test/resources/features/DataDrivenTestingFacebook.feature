Feature: Test login functionality

  @DataDriven 
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    And <username> and <password> are entered by user
    When user click on login button
    Then user navigate to home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Viral    | test123  |
