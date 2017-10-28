package modules;

import helpers.Log;
import org.junit.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageobjects.BankManagerPage;
import stepdefinition.SetUp;

import java.util.HashMap;

/**
 * Created by huethait. on 7/10/17.
 */
public class OpenCustomerAction {


    public static void clickOpenCustomerBtn(WebDriver driver, HashMap<String, String> map) throws Exception {

        BankManagerPage.openAcctBtn.click();
        Thread.sleep(5000);

    }

    public static void verifyOpenCustPage (WebDriver driver, HashMap<String,String> map) throws Throwable{


        Assert.assertEquals("userSelect", BankManagerPage.CusNameDdl.getAttribute("name"));


    }

    public static void chooseCustomer(WebDriver driver, HashMap<String,String> map, String Custname, String currency) throws Exception{

        Select custList = new Select(BankManagerPage.CusNameDdl);
        custList.selectByVisibleText(Custname);
        Thread.sleep(2000);

        Select currentcyList = new Select(BankManagerPage.CurrencyDdl);
        currentcyList.selectByVisibleText(currency);
        Thread.sleep(2000);

    }

    public static void clickProcessBtn(WebDriver driver, HashMap<String,String> map){

        BankManagerPage.processBtn.click();

    }

    public static void verifyOpenCustSuccessfully(WebDriver driver, HashMap<String,String> map, String confirmmsg){

        // Switching to Alert
        Alert alert = SetUp.driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage = SetUp.driver.switchTo().alert().getText();

        // Displaying alert message
        //System.out.println(alertMessage);
        Assert.assertTrue(alertMessage.equals(confirmmsg));

        // Accepting alert
        alert.accept();

    }

}
