package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import modules.AddCustomerAction;
import modules.HomeAction;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BankManagerPage;
import pageobjects.HomePage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by huethait. on 15/05/17.
 */
public class Common {

    public static List<HashMap<String, String>> datamap = null;

    @Given("^I open the website (.+)$")
    public void i_open_the_website(String website) throws Throwable {
        SetUp setUp = new SetUp();
        setUp.setupDriver();
        /////////////////
        SetUp.driver.get(website);
        datamap = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> sampleData = new HashMap<String, String>();
        sampleData.put("website", website);
        datamap.add(sampleData);
        Thread.sleep(5000);
    }

    @Then("^I click bank manager login button$")
    public void i_click_bank_manager_login_button() throws Throwable {

        PageFactory.initElements(SetUp.driver, HomePage.class);
        HomeAction.clickBankManagerBtn(SetUp.driver, datamap.get(0));
        Thread.sleep(5000);
    }

    @And("^I verify the dashboard manage account in bank$")
    public void i_verify_the_dashboard_manage_account_in_bank() throws Throwable {

        //I check that the button Add Customer appear
        // SetUp.driver.findElements(By.className("center")).get(0).findElements(By.tagName("button")).get(0).isDisplayed();
        PageFactory.initElements(SetUp.driver, BankManagerPage.class);
        AddCustomerAction.verifyDashboardManagerScreen(SetUp.driver, datamap.get(0));
        Thread.sleep(3000);

    }

}
