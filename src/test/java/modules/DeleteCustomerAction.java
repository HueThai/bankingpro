package modules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.BankManagerPage;
import java.util.HashMap;
import java.util.List;

public class DeleteCustomerAction {

    public static String key = "";

    public static void clickCustomersBtn(WebDriver driver, HashMap<String, String> map) throws Exception {

        BankManagerPage.customers_btn.click();
        Thread.sleep(2000);

    }

    public static void verifyCustomersPage(WebDriver driver, HashMap<String, String> map) throws Exception {

       Assert.assertEquals("Search Customer", BankManagerPage.searchCust_txt.getAttribute("placeholder"));
        Thread.sleep(2000);

    }

    public static void inputSearchValue(WebDriver driver, HashMap<String, String> map, String keyword) throws Exception {

        BankManagerPage.searchCust_txt.sendKeys(keyword);
        key = keyword;
        Thread.sleep(2000);

    }

    public static void verifySearchResult(WebDriver driver, HashMap<String, String> map, Integer records) throws Exception {

        Integer count = 0;
        String text = "";
        List<WebElement> trList = BankManagerPage.custList_tbody.findElements(By.tagName("tr"));
        if (trList.size() == 0) {
            count = 0;
            Assert.assertTrue(count.equals(records));
        } else {
            for (WebElement tr : trList
                    ) {
                List<WebElement> tdList = tr.findElements(By.tagName("td"));
                Integer countresult = 0;
                for (WebElement td : tdList
                        ) {
                    if (td.getText().contains(key)) {
                        countresult++;
                        break;
                    }
                }
                if (countresult != 0) {
                    count++;
                }
            }
            if (count != 0) {
                Assert.assertTrue(count.equals(records));
            }

        }


        Thread.sleep(3000);

    }

    public static void clickDeleteBtn(WebDriver driver, HashMap<String, String> map) throws Exception {

        BankManagerPage.delete_btn.click();
        Thread.sleep(2000);

    }

    public static void verifyDeleteCustSuccessfully(WebDriver driver, HashMap<String, String> map) throws Exception {

        BankManagerPage.openAccount_btn.click();
        Thread.sleep(3000);
        //Check Customer Name has Hue Thai or not ; Expected Hue Thai has customer drop down
        //get list option
        List<WebElement> list = BankManagerPage.custName_ddl.findElements(By.tagName("option"));
        Boolean add = false;
        // check full name is existed or not
        for (WebElement e : list) {
            if (key.contains(e.getText())) {
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

        Thread.sleep(2000);

    }

}
