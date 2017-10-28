package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import modules.OpenCustomerAction;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BankManagerPage;

import java.util.HashMap;

/**
 * Created by huethait. on 7/10/17.
 */
public class OpenCustomerDefinition {
    @Then("^I click Open Account button$")
    public void i_click_open_account_button() throws Throwable {


        PageFactory.initElements(SetUp.driver, BankManagerPage.class);
        OpenCustomerAction.clickOpenCustomerBtn(SetUp.driver, new HashMap<String, String>());
       /* HashMap<String, String> sampleData = new HashMap<String, String>();*/
       /* sampleData.put("website1", SetUp.driver.getCurrentUrl());*/
       /* Common.datamap.add(sampleData);*/

        Thread.sleep(5000);
    }

    @Then("^I verify the open account screen in bank$")
    public void i_verify_the_open_account_screen_in_bank() throws Throwable {


        PageFactory.initElements(SetUp.driver, BankManagerPage.class);
        OpenCustomerAction.verifyOpenCustPage(SetUp.driver, Common.datamap.get(0));
        Thread.sleep(3000);

    }

    @Then("^I choose customer name (.+), currency (.+)$")
    public void i_choose_customer_name_currency(String customer, String currency) throws Throwable {

        PageFactory.initElements(SetUp.driver, BankManagerPage.class);
        OpenCustomerAction.chooseCustomer(SetUp.driver, new HashMap<String, String>(), customer, currency);
        Thread.sleep(3000);


    }

    @And("^I click on 'Process' button$")
    public void i_click_on_process_button() throws InterruptedException {

        OpenCustomerAction.clickProcessBtn(SetUp.driver, new HashMap<String, String>());
        Thread.sleep(3000);
    }

    @Then("^I verify create customer account successfully (.+)$")
    public void i_verify_create_customer_account_successfully(String confirmmsg) throws Throwable {

        OpenCustomerAction.verifyOpenCustSuccessfully(SetUp.driver, new HashMap<String, String>(), confirmmsg);

        Thread.sleep(3000);

    }
}
