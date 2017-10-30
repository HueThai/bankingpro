Feature: Customer login successfully.

  Scenario Outline: TC_005_Customer login successfully.
    Given I open the website <website>
    And I click 'Customer Login' button
    Then I verify the correct 'Customer Login' website
    When I select value as fullnameAdded
    And I click on 'Login' button
    Then I verify Customer Login successfully
    Examples:
      | website                                                              |
      | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login |

