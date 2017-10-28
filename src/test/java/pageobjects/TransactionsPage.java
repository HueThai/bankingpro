package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TransactionsPage {

    @FindBy(css ="button[ng-click=\"transactions()\"]")
    public static WebElement trans_Btn;

    @FindBy(id ="accountSelect")
    public static WebElement accountNumbeer_list;

    @FindBy(css = "button[ng-click=\"deposit()\"]")
    public static WebElement deposit_btn;

    @FindBy(css = "input[placeholder=\"amount\"]")
    public static WebElement amount_txt;

    @FindBy(css = "button[type=\"submit\"]")
    public static WebElement deposit_submit_btn;

    @FindBy(css = "span[ng-show=\"message\"]")
    public static WebElement confirm_msg;

    @FindBy(tagName = "tbody")
    public static WebElement trans_tist;

    @FindBy(css = "button[ng-click=\"withdrawl()\"]")
    public static WebElement withdrawl_btn;

    @FindBy(tagName = "tbody")
    public static WebElement trans_List;






}
