package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageobjects.CustomerPage;
import pageobjects.HomePage;
import java.util.HashMap;

/**
 * Created by huethait. on 9/1/17.
 */
public class CustomerLoginAction {

    public static void clickCustLoginbtn(WebDriver driver, HashMap<String, String> map) throws Exception {

        HomePage.customerLoginBtn.click();

    }

    public static void verifyCustLoginPage(WebDriver driver, HashMap<String, String> map) throws Exception {

        Assert.assertEquals("userSelect", CustomerPage.userSelect.getAttribute("name"));

    }

    public static void selectCustLogin(WebDriver driver, HashMap<String, String> map, String userLogin) throws Exception {


        WebElement nameList = CustomerPage.userSelect;
        Select listOt = new Select(nameList);
        listOt.selectByVisibleText(userLogin);

    }

    public static void clickLoginbtn(WebDriver driver, HashMap<String, String> map) throws Exception {

        CustomerPage.loginBtn.click();

    }

    public static void verifyLoginSuccessfully(WebDriver driver, HashMap<String, String> map, String userLogin) throws Exception {

        Assert.assertEquals(userLogin,CustomerPage.usernameLogin.getText());
    }
}
