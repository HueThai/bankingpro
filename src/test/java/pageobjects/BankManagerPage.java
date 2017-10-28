package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ByAll;

/**
 * Created by huethait. on 08/06/17.
 */
public class BankManagerPage extends BaseClass {

    public BankManagerPage(WebDriver driver) { super(driver);
    }

    @FindBy(css = "button[ng-click=\"addCust()\"]")
    public static WebElement addCustomerBtn;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[2]/div/div/form/div[1]/input")
    public static WebElement firstName;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[2]/div/div/form/div[2]/input")
    public static WebElement lastName;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[2]/div/div/form/div[3]/input")
    public static WebElement postCode;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[2]/div/div/form/button")
    public static WebElement addCustomSubmit;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[1]/button[2]")
    public  static WebElement openAcctBtn;


    @FindBy(how = How.ID, using = "userSelect")
    public static WebElement CusNameDdl;


    @FindBy(how = How.ID, using = "currency")
    public static WebElement CurrencyDdl;

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[2]/div/div/form/button")
    public static WebElement processBtn;



}
