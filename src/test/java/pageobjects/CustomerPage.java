package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by huethait. on 9/22/17.
 */
public class CustomerPage extends BaseClass {

    public CustomerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userSelect")
    public static WebElement userSelect;

    @FindBy(css = "button[ng-show=\"custId != ''\"]")
    public static WebElement loginBtn;

    @FindBy(css = "span[class=\"fontBig ng-binding\"]")
    public static WebElement usernameLogin;



}
