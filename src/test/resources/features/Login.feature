# src/test/resources/features/Login/Login.feature
Feature: Login functionality

  Background:
    Given I am on the login page

  @Login
  Scenario Outline: Successful login with valid credentials

    When I enter valid "<username>" and "<password>"
    And I click the login button
    Then I should see the dashboard page

    Examples:
      | username | password    |
      | student  | Password123 |

  @Login
  Scenario Outline: Successful login with invalid password credentials

    When I enter valid "<username>" and "<password>"
    And I click the login button
    Then Verify error message text is "Your password is invalid!"

    Examples:
      | username | password   |
      | student  | Password23 |

  @Login
  Scenario Outline: Successful login with invalid username credentials

    When I enter valid "<username>" and "<password>"
    And I click the login button
    Then Verify error message text is "Your username is invalid!"

    Examples:
      | username | password    |
      | studen   | Password123 |

  Scenario Outline: Successful login with invalid usernam

    When I enter valid "<username>" and "<password>"
    And I click the login button
    Then Verify error message text is "Your username is invalid!"

    Examples:
      | username | password    |
      | studen   | Password123 |