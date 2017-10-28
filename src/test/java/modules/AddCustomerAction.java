package modules;

import helpers.Log;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.BankManagerPage;
import stepdefinition.SetUp;

import java.util.HashMap;
import java.util.List;


/**
 * Created by huethait. on 08/06/17.
 */
public class AddCustomerAction {

    public static String fullname = "";

    public static void Execute(WebDriver driver, HashMap<String, String> map) throws Exception {

    }

  public static void verifyDashboardManagerScreen(WebDriver driver, HashMap<String, String> map) throws Exception {

        Log.info("Click action is perfromed on My Account link");
        BankManagerPage.addCustomerBtn.isDisplayed();
    }

    public static void clickAddCustomerBtn(WebDriver driver, HashMap<String, String> map) throws Exception {

        Log.info("Click action is performed on Add Customer button");
        BankManagerPage.addCustomerBtn.click();

    }

    public static void verifyAddCustomerScreen(WebDriver driver, HashMap<String, String> map) {

        Log.info("Verify Add Customer Screen");
        Assert.assertEquals("First Name", BankManagerPage.firstName.getAttribute("placeholder"));

    }

    public static void inputCustomerInfo(WebDriver driver, HashMap<String, String> map, String firstname, String lastname, String postcode) throws Exception {

        Log.info("Input Customer information");

        if (firstname.equals("empty")) {
            firstname = "";
        }

        if (lastname.equals("empty")) {
            lastname = "";
        }

        if (postcode.equals("empty")) {
            postcode = "";
        }
        BankManagerPage.firstName.sendKeys(firstname);
        Thread.sleep(2000);
        BankManagerPage.lastName.sendKeys(lastname);
        Thread.sleep(2000);
        BankManagerPage.postCode.sendKeys(postcode);
        Thread.sleep(2000);
        fullname = firstname + " " + lastname;
    }

    public static void clickAddCustomerSubmitBtn(WebDriver driver, HashMap<String, String> map, Boolean status) throws Exception {

        Log.info("Click action is performed on Add Customer Submit");
        BankManagerPage.addCustomSubmit.click();
        Thread.sleep(3000);
        //click OK after add customer successfully
        if (status) {

            Alert alert = driver.switchTo().alert();
            Thread.sleep(5000);

           /* // Capturing alert message.
            String alertMessage = driver.switchTo().alert().getText();

            // Displaying alert message
            //System.out.println(alertMessage);
            Assert.assertTrue(alertMessage.equals(confirmmsg));*/

            // Accepting alert
            alert.accept();
        }

    }


    public static void verifyAddCusSuccessfully(WebDriver driver, HashMap<String, String> map) throws Exception {


        BankManagerPage.openAcctBtn.click();
        Thread.sleep(3000);
        //Check Customer Name has Hue Thai or not ; EXpected Hue Thai has customer drop down
        //get list option
        //List<WebElement> list = SetUp.driver.findElement(By.id("userSelect")).findElements(By.tagName("option"));
        List<WebElement> cusList = BankManagerPage.CusNameDdl.findElements(By.tagName("option"));
        Boolean add = false;
        // check full name is existed or not
        for (WebElement e : cusList) {
            if (fullname.equals(e.getText())) {
                add = true;
                break;
            }
        }


        // if add is true, the full name is existed and the check is sucessfully
        if (add) {
            Assert.assertEquals(1, 1);
        } else {
            Assert.assertEquals(1, 0);
        }

    }

    public static void verifyAddCusUnuccessfully(WebDriver driver, HashMap<String, String> map) throws Exception {


        BankManagerPage.openAcctBtn.click();
        Thread.sleep(3000);
        //Check Customer Name has Hue Thai or not ; EXpected Hue Thai has customer drop down
        //get list option
        //List<WebElement> list = SetUp.driver.findElement(By.id("userSelect")).findElements(By.tagName("option"));
        List<WebElement> cusList = BankManagerPage.CusNameDdl.findElements(By.tagName("option"));
        Boolean add = false;
        // check full name is existed or not
        for (WebElement e : cusList) {
            if (fullname.equals(e.getText())) {
                add = true;
                break;
            }
        }


        // if add is true, the full name is existed and the check is sucessfully
        if (add) {
            Assert.assertEquals(1, 0);
        } else {
            Assert.assertEquals(1, 1);
        }

    }

    public static void verifyErrorMSG(WebDriver driver, HashMap<String, String> map,String errormsg){


        // Switching to Alert
        Alert alert = SetUp.driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage = SetUp.driver.switchTo().alert().getText();

        // Displaying alert message
        //System.out.println(alertMessage);
        Assert.assertTrue(alertMessage.equals(errormsg));

        // Accepting alert
        alert.accept();
    }
}


