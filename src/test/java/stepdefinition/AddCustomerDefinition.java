package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.AddCustomerAction;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BankManagerPage;

/**
 * Created by huethait. on 15/04/2017.
 */
public class AddCustomerDefinition {



    @Then("^I click Add Customer button$")
    public void i_click_add_customer_button() throws Throwable {

        PageFactory.initElements(SetUp.driver, BankManagerPage.class);

        AddCustomerAction.clickAddCustomerBtn(SetUp.driver, Common.datamap.get(0));
        Thread.sleep(5000);

    }


    @And("^I verify the add customer screen in bank$")
    public void i_verify_the_add_customer_screen_in_bank() throws Throwable {

        PageFactory.initElements(SetUp.driver,BankManagerPage.class);

        AddCustomerAction.verifyAddCustomerScreen(SetUp.driver, Common.datamap.get(0));
        Thread.sleep(3000);

    }

    @When("^I type first name (.+) , last name (.+) , postcode (.+)$")
    public void i_type_first_name_last_name_postcode(String firstname, String lastname, String postcode) throws Throwable {

        PageFactory.initElements(SetUp.driver,BankManagerPage.class);

        AddCustomerAction.inputCustomerInfo(SetUp.driver, Common.datamap.get(0), firstname, lastname, postcode);
        Thread.sleep(3000);
    }



    @Then("^I click submit button (.+)$")
    public void i_click_submit_button_with(Boolean status) throws Throwable {

        PageFactory.initElements(SetUp.driver,BankManagerPage.class);

        AddCustomerAction.clickAddCustomerSubmitBtn(SetUp.driver, Common.datamap.get(0), status);
        Thread.sleep(3000);

    }

    @Then("^I check the customer has added in the list$")
    public void i_check_the_customer_has_added_in_the_list() throws Throwable {

        Thread.sleep(5000);

        PageFactory.initElements(SetUp.driver,BankManagerPage.class);

        AddCustomerAction.verifyAddCusSuccessfully(SetUp.driver, Common.datamap.get(0));

    }


    @Then("^I check the customer has not yet added in the list$")
    public void i_check_the_customer_has_not_yet_added_in_the_list() throws Throwable {

        Thread.sleep(5000);

        PageFactory.initElements(SetUp.driver,BankManagerPage.class);

        AddCustomerAction.verifyAddCusUnuccessfully(SetUp.driver, Common.datamap.get(0));

    }

    @Then("^I check the confirm alert is unsuccessful as (.+)$")
    public void i_check_the_confirm_alert_is_unsuccessful_as(String errormsg) throws InterruptedException{


        Thread.sleep(5000);

        PageFactory.initElements(SetUp.driver,BankManagerPage.class);

        AddCustomerAction.verifyErrorMSG(SetUp.driver, Common.datamap.get(0), errormsg);

        }
    }
