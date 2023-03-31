Feature: Register functionality For ParaBank

  Scenario: Register Functionality
    Given Navigate to ParaBank
    And Click on the element in LeftNav
      | register |
    And User sending the keys in Dialog Content
      | firstname        | grup14testerl4r   |
      | lastname         | akbm              |
      | address          | technostudy       |
      | city             | newjersey         |
      | state            | sussex            |
      | zipcode          | 10000             |
      | phone            | +905444444444     |
      | ssn              | 1381381383838     |
      | username         | gruop14TestFinit0 |
      | password         | crazyboysTR       |
      | repeatedPassword | crazyboysTR       |
    And Click on the element in Dialog
      | confirm |

    Then Success message should be displayed