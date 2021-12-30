Feature: Registered user and non registered user navigate to application and login

  Scenario: Registered user open the application and login
    Given The user landed on login page
    And The user define username
    And The user define password
    And The user press on login button
    Then The user should be logoin
    When The user press on logout button
    Then The user should be logout
