Feature: Access on k6sy HomePage
  Scenario: Check google website availability
    Given Open the Chrome and launch the application
    When Check the homePage
    Then Seen the logo

  Scenario: Login in