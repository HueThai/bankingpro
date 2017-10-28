
Feature: In order to open account to have the transaction successfully
  # Enter feature description here

  Scenario Outline: TC_OpenCust001_Open account successfully
    # Enter steps here
    Given I open the website <website>
    Then I click bank manager login button
    And I verify the dashboard manage account in bank
    Then I click Open Account button
    And I verify the open account screen in bank
    Then I choose customer name <customer>, currency <currency>
    And I click on 'Process' button
    Then I verify create customer account successfully <confirmmsg>
    Examples:
      | website                                                              | customer | currency | confirmmsg                                             |
      | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login | Hue Thai | Pound    | Account created successfully with account Number :1016 |