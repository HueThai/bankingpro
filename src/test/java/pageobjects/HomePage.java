package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by huethait. on 07/06/17.
 */
public class HomePage extends BaseClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[1]/div/div[2]/div/div[1]/div[2]/button")
    public static WebElement bankManagerLoginBtn;

    @FindBy(css = "button[ng-click=\"customer()\"]")
    public static WebElement customerLoginBtn;


}
