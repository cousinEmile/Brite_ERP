package com.BriteErp.tests.SearchFunctionality.Merry.smoke_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_223_FilterAlphabetical extends TestBase {

    @Test
    public void TestCase_223() {

        extentLogger = report.createTest("Verify Add Custom drop down menu is in Alphabteical Order");
        extentLogger.info("Opening the website");
        pages.login().open();

        extentLogger.info("Clicking into Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("sending user Credentials");
        pages.login().userLogin();

        extentLogger.info("Clicking into Calander Module");
        waitForPageToLoad(10);
        pages.searchPage().CalanderModule.click();

        extentLogger.info("Clicking onto Magnifier Icone");
        pages.searchPage().MgniffierIcone.click();

        extentLogger.info("clicking on to Filter Icone");
        pages.searchPage().FilterDropDown.click();

        extentLogger.info("Clicking on Add Custom Filter Button");
        pages.searchPage().AddCustomFilter.click();

        extentLogger.info("cliking on the Action needed drop down list");
        pages.searchPage().SelectFromActionNeededButton.click();

        waitForPageToLoad(5);
        Select allList = new Select(pages.searchPage().SelectFromActionNeededButton);
        String allList1 = allList.getFirstSelectedOption().getText();
        for (int i = 0; i < allList.getOptions().size() - 1; i++) {
            String firstOrder = allList.getOptions().get(i).getText();
            String secondOrder = allList.getOptions().get(i + 1).getText();
            Assert.assertTrue(firstOrder.compareTo(secondOrder) < 0);
        }

    }
}