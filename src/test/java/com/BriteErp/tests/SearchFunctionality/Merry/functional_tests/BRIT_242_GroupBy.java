package com.BriteErp.tests.SearchFunctionality.Merry.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.annotations.Test;

public class BRIT_242_GroupBy  extends TestBase {

    @Test
    public void TestCase_242() {

        extentLogger = report.createTest("Verify Add Custom drop down menu is in Alphabteical Order");
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
       pages.searchPage().ClickOnGroupByDropDown.click();

       pages.searchPage().AddCustomFilter.click();

    }
}