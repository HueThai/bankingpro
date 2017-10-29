Feature: In order to Delete Customer successfully
  Scenario Outline: Checking the search feature successfully
    Given I open the website <website>
    Then I click bank manager login button
    And I verify the dashboard manage account in bank
    When I click on 'Customers' button
    And I verify the Customers page
    Then I input value into 'Search' field as <keywork>
    Then I verify the return data as <records>
    Examples:
      | website                                                              | keywork  | records |
      | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login | aaaaaaaa | 0       |
      | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login | Hermoine | 1       |
      | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login | ne       | 2       |

  Scenario Outline: Checking the deleting a customer successfully
  successfully
    Given I open the website <website>
    Then I click bank manager login button
    And I verify the dashboard manage account in bank
    When I click on 'Customers' button
    And I verify the Customers page
    Then I input value into 'Search' field as <keywork>
    And I click on 'Delete' button to delete a customer
    Then I verify the customer is deleted successfully
    Examples:
      | website                                                               | keywork  |
      | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/login  | Hue      |

