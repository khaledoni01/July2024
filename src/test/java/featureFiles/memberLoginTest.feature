Feature: Test Member login page

  @smoke
  Scenario: invalid member login test
    Given user should be in the login page
    When user provides invalid username and password
    Then user should get error message

  @regression
  Scenario Outline: invalid member login test
    Given user should be in the login page
    When user provides invalid "<username>" and "<password>"
    Then user should get error message
    Examples:
      | username | password |
      | abc123   | test123  |

  @regression
  Scenario Outline: valid member login test
    Given user should be in the login page
    When user provides invalid "<username>" and "<password>"
    Then user should not get error message
    Examples:
      | username | password |
      | abc123   | test123  |