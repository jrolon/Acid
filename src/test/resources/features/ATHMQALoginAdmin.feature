@Login
Feature: KliperLogin
  Description: this feature file contains the scenario related to Web Login

  @LoginExitoso
  Scenario Outline: As a user member I want to Login as user on web
    Given The user needs to login
      | <userName> |
    When The user enters user name and password
    Then The user can see the welcome page
  #  And Login as administrator

    Examples:
      | userName                    |
      | aleatorio1001@gmail.com     |

  @LoginFallido
  Scenario: As a user member I want to Login verify msg error
    Given The user needs verify msg error
    When The user enter de botton
    Then Validate msg


