package modules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageobjects.TransactionsPage;
import java.util.HashMap;
import java.util.List;

public class TransactionsAction {

    public static void verifyCustAccountPage(WebDriver driver, HashMap<String, String> map) throws Exception {

        Assert.assertEquals("Transactions", TransactionsPage.trans_btn.getText());
        Thread.sleep(3000);

    }

    public static void selectAccountNumber(WebDriver driver, HashMap<String, String> map) throws Exception {
        Select accounttList = new Select(TransactionsPage.accountNumber_list);
        accounttList.selectByIndex(0);
        Thread.sleep(3000);

    }

    public static void clickDepositBtn(WebDriver driver, HashMap<String, String> map) throws Exception {
        TransactionsPage.deposit_btn.click();
        Thread.sleep(3000);

        //Verify correct deposit form
        TransactionsPage.amount_txt.isDisplayed();
        Thread.sleep(3000);

    }

    public static void inputAmount(WebDriver driver, HashMap<String, String> map, String amount) throws Exception {

        TransactionsPage.amount_txt.sendKeys(amount);
        Thread.sleep(2000);

    }

    public static void submitDeposit(WebDriver driver, HashMap<String, String> map) throws Exception {

        TransactionsPage.deposit_submit_btn.submit();
        Thread.sleep(2000);

    }

    public static void verifyConfirmMsg (WebDriver driver, HashMap< String, String> map, String confirmMsg) throws Exception{

        Assert.assertEquals(confirmMsg, TransactionsPage.confirm_msg.getText());
        Thread.sleep(2000);

    }

    public static void clickTransBtn (WebDriver driver, HashMap< String, String> map) throws Exception{

        TransactionsPage.trans_btn.click();
        Thread.sleep(2000);

    }

    public static void verifyTransPage (WebDriver driver, HashMap <String, String> map) throws Exception{

        TransactionsPage.trans_list.isDisplayed();
        Thread.sleep(3000);

    }

    public static void verifyTransData (WebDriver driver, HashMap< String, String> map, String amount, String transtype) throws Exception{

        List<WebElement> trList = TransactionsPage.trans_list.findElements(By.tagName("tr"));
        for (WebElement tr : trList
                ) {
            List<WebElement> tdList = tr.findElements(By.tagName("td"));
            //  tdList.get(0).getText().equals(date);
            tdList.get(1).getText().equals(amount);
            tdList.get(2).getText().equals(transtype);
            break;
        }
        Thread.sleep(2000);

    }

    public static void clickWithdrawlBtn(WebDriver driver, HashMap<String, String> map) throws Exception {
        TransactionsPage.withdrawl_btn.click();
        Thread.sleep(3000);

        //Verify correct deposit form
        TransactionsPage.amount_txt.isDisplayed();
        Thread.sleep(3000);

    }

    public static void submitWithdraw(WebDriver driver, HashMap<String, String> map) throws Exception {

        TransactionsPage.withdrawl_submit_btn.submit();
        Thread.sleep(2000);

    }

}
