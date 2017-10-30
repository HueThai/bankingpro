Feature: Transactions feature of customer.
  Scenario Outline: TC_006_Customer made deposit successfully.
    Given I open the website <website>
    Then I check the correct 'Customer Account' website
    When I select Account Number
    Then I click on 'Deposit' button
    And I input amount as <amount>
    Then I click on 'Deposit' button to deposit
    And I check the confirm message as <confirmMesg>
    Then I click on 'Transactions' button
    And I verify Transactions page
    Then I check the transactions data with date, <amount> and <transtype>

    Examples:
      |website                                                                | amount | confirmMesg        | transtype  |
      |http://www.globalsqa.com/angularJs-protractor/BankingProject/#/account | 500    | Deposit Successful | Credit     |


  Scenario Outline: TC_007_Customer made withdrawl successfully.
    Given I open the website <website>
    Then I check the correct 'Customer Account' website
    When I select Account Number
    Then I click on 'Withdrawl' button
    And I input amount as <amount>
    Then I click on 'Withdraw' button to withdraw
    And I check the confirm message as <confirmMesg>
    Then I click on 'Transactions' button
    And I verify Transactions page
    Then I check the transactions data with date, <amount> and <transtype>

    Examples:
      |website                                                                | amount | confirmMesg            | transtype |
      |http://www.globalsqa.com/angularJs-protractor/BankingProject/#/account | 200    | Transaction successful | Debit     |

