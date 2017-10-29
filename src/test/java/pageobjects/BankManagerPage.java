package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by huethait. on 08/06/17.
 */
public class BankManagerPage extends BaseClass {

    public BankManagerPage(WebDriver driver) { super(driver);
    }

    @FindBy(css = "button[ng-click=\"addCust()\"]")
    public static WebElement addCustomer_btn;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[2]/div/div/form/div[1]/input")
    public static WebElement firstName;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[2]/div/div/form/div[2]/input")
    public static WebElement lastName;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[2]/div/div/form/div[3]/input")
    public static WebElement postCode;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[2]/div/div/form/button")
    public static WebElement addCustomSubmit_btn;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[1]/button[2]")
    public  static WebElement openAccount_btn;

    @FindBy(how = How.ID, using = "userSelect")
    public static WebElement custName_ddl;

    @FindBy(how = How.ID, using = "currency")
    public static WebElement currency_ddl;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[2]/div/div/form/button")
    public static WebElement process_btn;

    @FindBy(css = "button[ng-click=\"showCust()\"]")
    public static WebElement customers_btn;

    @FindBy(css = "input[ng-model=\"searchCustomer\"]")
    public static WebElement searchCust_txt;

    @FindBy(tagName = "tbody")
    public static WebElement custList_tbody;

    @FindBy(xpath = "//div[1]/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[5]/button")
    public static WebElement delete_btn;




}
