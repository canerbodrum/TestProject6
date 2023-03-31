Feature: Login Functionality Test

  Background:
    Given Navigate to ParaBank

  Scenario Outline: We have to login with
    And User sending the keys in Dialog Content
      | id   | <name> |
      | pass | <pass> |
    And Click on the element in Dialog
      | login |

    Then if you see loguot then success login

    Examples:

      | name              | pass        |
      | gruop14TestFinit0 | crazyboysTR |