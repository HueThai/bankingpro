package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.TransactionsAction;
import org.openqa.selenium.support.PageFactory;
import pageobjects.TransactionsPage;

public class TransactionsDefinition {


    @Then("^I check the correct 'Customer Account' website$")
    public void i_check_the_correct_customer_account_website() throws Throwable {

        PageFactory.initElements(SetUp.driver, TransactionsPage.class);
        TransactionsAction.verifyCustAccountPage(SetUp.driver, Common.datamap.get(0));

    }

    @When("^I select Account Number$")
    public void i_select_account_number() throws Throwable {

        PageFactory.initElements(SetUp.driver, TransactionsPage.class);
        TransactionsAction.selectAccountNumber(SetUp.driver, Common.datamap.get(0));

    }

    @Then("^I click on 'Deposit' button$")
    public void i_click_on_deposit_button() throws Throwable {

        PageFactory.initElements(SetUp.driver, TransactionsPage.class);
        TransactionsAction.clickDepositBtn(SetUp.driver, Common.datamap.get(0));

    }

    @And("^I input amount as (.+)$")
    public void i_input_amount_as(String amount) throws Throwable {

        PageFactory.initElements(SetUp.driver, TransactionsPage.class);
        TransactionsAction.inputAmount(SetUp.driver, Common.datamap.get(0), amount);

    }

    @Then("^I click on 'Deposit' button to deposit$")
    public void i_click_on_deposit_button_to_deposit() throws Throwable {

        PageFactory.initElements(SetUp.driver, TransactionsPage.class);
        TransactionsAction.submitDeposit(SetUp.driver, Common.datamap.get(0));

    }

    @And("^I check the confirm message as (.+)$")
    public void i_check_the_confirm_message_as(String confirmmesg) throws Throwable {

        PageFactory.initElements(SetUp.driver, TransactionsPage.class);
        TransactionsAction.verifyConfirmMsg(SetUp.driver, Common.datamap.get(0), confirmmesg);

    }

    @Then("^I click on 'Transactions' button$")
    public void i_click_on_transactions_button() throws Throwable {

        PageFactory.initElements(SetUp.driver, TransactionsPage.class);
        TransactionsAction.clickTransBtn(SetUp.driver, Common.datamap.get(0));

    }

    @And("^I verify Transactions page$")
    public void i_verify_transactions_page() throws Throwable {

        PageFactory.initElements(SetUp.driver, TransactionsPage.class);
        TransactionsAction.verifyTransPage(SetUp.driver, Common.datamap.get(0));

    }

    @Then("^I check the transactions data with date, (.+) and (.+)$")
    public void i_check_the_transactions_data_with_date_and(String amount, String transtype) throws Throwable {

        PageFactory.initElements(SetUp.driver, TransactionsPage.class);
        TransactionsAction.verifyTransData(SetUp.driver, Common.datamap.get(0), amount, transtype);

    }

    @Then("^I click on 'Withdrawl' button$")
    public void i_click_on_withdrawl_button() throws Throwable {

        PageFactory.initElements(SetUp.driver, TransactionsPage.class);
        TransactionsAction.clickWithdrawlBtn(SetUp.driver, Common.datamap.get(0));

    }

    @Then("^I click on 'Withdraw' button to withdraw$")
    public void i_click_on_withdraw_button_to_withdraw() throws Throwable {

        PageFactory.initElements(SetUp.driver, TransactionsPage.class);
        TransactionsAction.submitWithdraw(SetUp.driver, Common.datamap.get(0));
    }

}
