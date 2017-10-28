Feature: Transactions feature of customer
  Scenario Outline: Customer made deposit successfully
    Given I open the website <website>
    Then I check the correct 'Customer Account' website
    When I select Account Number
    Then I click on 'Deposit' button
    And I input amount as <amount>
    Then I click on 'Deposit' button to deposit
    And I check the confirm message as <confirmMesg>
    Examples:
      |website                                                                | amount | confirmMesg        |
      |http://www.globalsqa.com/angularJs-protractor/BankingProject/#/account | 500    | Deposit Successful |

  Scenario Outline: Customer checking transactions after depositing
    Given I open the website <website>
    Then I check the correct 'Customer Account' website
    When I select Account Number
    Then I click on 'Transactions' button
    And I see Transactions list in <listPage>
    Then I check the Transactions data with date, <amount> and <type>
    Examples:
      |website                                                                | listPage                                                              | amount | type   |
      |http://www.globalsqa.com/angularJs-protractor/BankingProject/#/account | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/listTx | 500    | Credit |

  Scenario Outline: Customer made withdrawl successfully
    Given I open the website <website>
    Then I check the correct 'Customer Account' website
    When I select Account Number
    Then I click on 'Withdraw' button
    And I input amount as <amount>
    Then I click on 'Withdraw' button to withdraw
    And I check the confirm message as <confirmMesg>
    Examples:
      |website                                                                | amount | confirmMesg            |
      |http://www.globalsqa.com/angularJs-protractor/BankingProject/#/account | 200    | Transaction successful |

  Scenario Outline: Customer checking transactions after withdrawing
    Given I open the website <website>
    Then I check the correct 'Customer Account' website
    When I select Account Number
    Then I click on 'Transactions' button
    And I see Transactions list in <listPage>
    Then I check the Transactions data with date, <amount> and <type>
    Examples:
      |website                                                                | listPage                                                              | amount | type  |
      |http://www.globalsqa.com/angularJs-protractor/BankingProject/#/account | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/listTx | 200    | Debit |