Feature:
  Scenario: As an existing user, I want to login successfully
    Given the user is on the Home page
    When the user navigates to the Login page
    And the user can see the login form
    And the user enters username and password
    And the user is able to click on the Submit button
    Then the user is logged in successfully
    And the successful login message is displayed