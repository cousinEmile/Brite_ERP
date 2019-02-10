package com.BriteErp.tests.SearchFunctionality.Merry.functional_tests;

import com.BriteErp.utilities.BrowserUtils;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_588 extends TestBase {
    @Test
    public void TestCase_588() {

        extentLogger = report.createTest("Verify Add Custom drop down menu under the Group By is in Alphabteical Order");
        extentLogger.info("Opening the website");
        pages.login().open();

        extentLogger.info("Clicking into Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("sending user Credentials");
        pages.login().userLogin();

        extentLogger.info("Clicking into Calander Module");
        waitForPageToLoad(5);
        pages.searchPage().CalanderModule.click();

        extentLogger.info("Clicking onto Magnifier Icone");
        pages.searchPage().MgniffierIcone.click();

        wait(5);
        extentLogger.info("clicking into Group By Button");
        pages.searchPage().ClickOnGroupByDropDown.click();

        extentLogger.info("Clicking on Add custom Group");
        pages.searchPage().AddCustomDropDownGroup.click();

        extentLogger.info("Click on the actions button");
       pages.searchPage().ClickOnactions.click();

       extentLogger.info("Verifying that the drop down list is alphabetical order");
        waitForPageToLoad(5);
        Select allList = new Select(pages.searchPage().DroupDownListUnderGroupBy);
        String allList1 = allList.getFirstSelectedOption().getText();
        for (int i = 0; i < allList.getOptions().size() - 1; i++) {
            String firstOrder = allList.getOptions().get(i).getText();
            String secondOrder = allList.getOptions().get(i + 1).getText();
            Assert.assertTrue(firstOrder.compareTo(secondOrder) < 0);
            extentLogger.info("the test case has passed");
        }

    }
}
