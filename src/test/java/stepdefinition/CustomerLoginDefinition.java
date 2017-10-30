package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.AddCustomerAction;
import modules.CustomerLoginAction;
import org.openqa.selenium.support.PageFactory;
import pageobjects.CustomerPage;
import pageobjects.HomePage;

/**
 * Created by huethait. on 9/1/17.
 */

public class CustomerLoginDefinition {

    String UserLogin = AddCustomerAction.fullname;

    @And("^I click 'Customer Login' button$")
    public void i_click_customer_login_button() throws Throwable {

        PageFactory.initElements(SetUp.driver, HomePage.class);
        CustomerLoginAction.clickCustLoginbtn(SetUp.driver, Common.datamap.get(0));
        Thread.sleep(3000);

    }

    @Then("^I verify the correct 'Customer Login' website$")
    public void i_verify_the_correct_customer_login_website() throws Throwable {

        PageFactory.initElements(SetUp.driver, CustomerPage.class);
        CustomerLoginAction.verifyCustLoginPage(SetUp.driver, Common.datamap.get(0));
        Thread.sleep(3000);

    }

    @When("^I select value as fullnameAdded$")
    public void i_select_value_as_fullnameadded() throws Throwable {
        PageFactory.initElements(SetUp.driver, CustomerPage.class);
        CustomerLoginAction.selectCustLogin(SetUp.driver, Common.datamap.get(0), UserLogin);
        Thread.sleep(3000);


    }


    @And("^I click on 'Login' button$")
    public void i_click_on_login_button() throws Throwable {

        PageFactory.initElements(SetUp.driver, CustomerPage.class);
        CustomerLoginAction.clickLoginbtn(SetUp.driver, Common.datamap.get(0));
        Thread.sleep(3000);
    }


    @Then("^I verify Customer Login successfully$")
    public void i_verify_customer_login_successfully() throws Throwable {

        PageFactory.initElements(SetUp.driver, CustomerPage.class);
        CustomerLoginAction.verifyLoginSuccessfully(SetUp.driver,Common.datamap.get(0),UserLogin);
        Thread.sleep(3000);
    }

}
