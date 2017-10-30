package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.DeleteCustomerAction;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BankManagerPage;


public class DeleteCustomerDefinition {

    @When("^I click on 'Customers' button$")
    public void i_click_on_customers_button() throws Throwable {

        PageFactory.initElements(SetUp.driver, BankManagerPage.class);
        DeleteCustomerAction.clickCustomersBtn(SetUp.driver, Common.datamap.get(0));
        Thread.sleep(2000);

    }

    @And("^I verify the Customers page$")
    public void i_verify_the_customers_page() throws Throwable {

        PageFactory.initElements(SetUp.driver, BankManagerPage.class);
        DeleteCustomerAction.verifyCustomersPage(SetUp.driver, Common.datamap.get(0));
        Thread.sleep(2000);
    }

    @Then("^I input value into 'Search' field as (.+)$")
    public void i_input_value_into_search_field_as(String keywork) throws Throwable {

        PageFactory.initElements(SetUp.driver, BankManagerPage.class);
        DeleteCustomerAction.inputSearchValue(SetUp.driver, Common.datamap.get(0), keywork);
        Thread.sleep(2000);
    }

    @Then("^I verify the return data as (.+)$")
    public void i_verify_the_return_data_as(Integer records) throws Throwable {

        PageFactory.initElements(SetUp.driver, BankManagerPage.class);
        DeleteCustomerAction.verifySearchResult(SetUp.driver, Common.datamap.get(0), records);
        Thread.sleep(2000);
    }


    @And("^I click on 'Delete' button to delete a customer$")
    public void i_click_on_delete_button_to_delete_a_customer() throws Throwable {

        PageFactory.initElements(SetUp.driver, BankManagerPage.class);
        DeleteCustomerAction.clickDeleteBtn(SetUp.driver, Common.datamap.get(0));
        Thread.sleep(2000);

    }

    @Then("^I verify the customer is deleted successfully$")
    public void i_verify_the_customer_is_deleted_successfully() throws Throwable {

        PageFactory.initElements(SetUp.driver, BankManagerPage.class);
        DeleteCustomerAction.verifyDeleteCustSuccessfully(SetUp.driver, Common.datamap.get(0));
        Thread.sleep(2000);

    }

}
