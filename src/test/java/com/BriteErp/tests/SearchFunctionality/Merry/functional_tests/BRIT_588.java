package com.BriteErp.tests.SearchFunctionality.Merry.functional_tests;

import com.BriteErp.utilities.TestBase;
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

    }
}
