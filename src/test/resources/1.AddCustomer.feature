
Feature: In order to add customer so that the system has the customer successfully.
  Scenario Outline: TC_001_Add the customer successfully.
    Given I open the website <website>
    Then I click bank manager login button
    And I verify the dashboard manage account in bank
    Then I click Add Customer button
    And I verify the add customer screen in bank
    When I type first name <firstname> , last name <lastname> , postcode <postcode>
    Then I click submit button <status>


    Examples:
    | website                                                              | firstname  | lastname | postcode | status | confirmmsg                                      |
    | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login | Hue        | Thai     | 084      | true   | Customer added successfully with customer id :6 |
    | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login | Anh        | Nguyen   | 084      | true   | Customer added successfully with customer id :7 |
    | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login | Thu        | Le       | 085      | true   | Customer added successfully with customer id :8 |


  Scenario Outline: TC_002_Add the customer unsuccessfully in case set empty into email and password.
    Given I open the website <website>
    Then I click bank manager login button
    And I verify the dashboard manage account in bank
    Then I click Add Customer button
    And I verify the add customer screen in bank
    When I type first name <firstname> , last name <lastname> , postcode <postcode>
    Then I click submit button <status>
    Then I check the customer has not yet added in the list

    Examples:
      | website                                                              | firstname | lastname | postcode | status |
      | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login | empty     | empty    | empty    | false  |

  Scenario Outline:TC_003_Adding the Customer unsuccessfully in case duplicate account.
    Given I open the website <website>
    Then I click bank manager login button
    And I verify the dashboard manage account in bank
    Then I click Add Customer button
    And I verify the add customer screen in bank
    When I type first name <firstname> , last name <lastname> , postcode <postcode>
    Then I click submit button <status>
    Then I check the confirm alert is unsuccessful as <errormsg>

    Examples:
      | website                                                                | firstname | lastname | postcode | status | errormsg                                             |
      | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login   | Hue       | Thai     | 084      | false  | Please check the details. Customer may be duplicate. |
