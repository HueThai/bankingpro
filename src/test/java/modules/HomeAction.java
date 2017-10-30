package modules;

import helpers.Log;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
import java.util.HashMap;

/**
 * Created by huethait. on 11/23/16.
 */
public class HomeAction {
    public static void Execute(WebDriver driver,HashMap<String,String> map) throws Exception{

        Log.info("Implement Add Customer Feature" );
        HomePage.bankManagerLoginBtn.click();
        Thread.sleep(3000);

    }


    public static void clickBankManagerBtn(WebDriver driver,HashMap<String,String> map) throws Exception{

        Log.info("Click action is perfromed on My Account link" );
        HomePage.bankManagerLoginBtn.click();

    }


}
