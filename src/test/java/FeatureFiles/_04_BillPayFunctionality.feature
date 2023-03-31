Feature: Bill Pay Functionality

  Background:
    Given Navigate to ParaBank
    And User sending the keys in Dialog Content
      | id   | gruop14TestFinit0 |
      | pass | crazyboysTR    |
    And Click on the element in Dialog
      | login |

  Scenario Outline:
    And Click on the element in Dialog
      | bill |
    And User sending the keys in Dialog Content
      | payeeName     | <payeeName>     |
      | billaddres    | <billaddres>    |
      | billcity      | <billcity>      |
      | billstate     | <billstate>     |
      | billZip       | <billZip>       |
      | billgsm       | <billgsm>       |
      | accountNumber | <accountNumber> |
      | verifyAccount | <verifyAccount> |
      | amount        | <amount>        |

    And Click on the element in Dialog
      | sendPayment |

    Then Success payment bill

    Examples:
      | payeeName | billaddres | billcity | billstate       | billZip | billgsm       | accountNumber | verifyAccount | amount |
      | mert      | america    | techno   | bagcilar        | 12345   | +905444444441 | 10000         | 10000         | 85     |
      | korcan    | kusadasi   | techno   | zeytinburnu     | 54321   | +905444444442 | 10000         | 10000         | 45     |
      | berkay    | istanbul   | techno   | cincinmahallesi | 98745   | +905444444443 | 10000         | 10000         | 120    |
