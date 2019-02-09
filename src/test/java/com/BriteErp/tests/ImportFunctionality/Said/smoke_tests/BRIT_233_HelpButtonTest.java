package com.BriteErp.tests.ImportFunctionality.Said.smoke_tests;

import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_233_HelpButtonTest extends TestBase {

    @Test(groups = "smoke")
    public void BRIT_233(){

        extentLogger = report.createTest("BRIT_233_Help Button Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url");
        extentLogger.info("Expected  Result: Home page is displayed.");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        extentLogger.info("Expected  Result: Clicked");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password for Inventory Manager 2 ");
        extentLogger.info("Expected  Result: Login successful");
        pages.login().managerLogin();

        wait(2);
        extentLogger.info("5. Click Calendar ");
        extentLogger.info("Expected Result: Calendar page is displayed");
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("6. Click list");
        extentLogger.info("Expected  Result: List page is displayed");
        pages.calendar().listView.click();

        extentLogger.info("7. click Import button");
        extentLogger.info("Expected  Result: Import page is displayed");
        pages.calendarListViewPage().import_button.click();

        extentLogger.info("8. Verify Help button");
        extentLogger.info("Expected  Result: Help button is displayed");
        Assert.assertEquals(pages.calendarListViewPage().helpButton.getText(),HELP_ICON);

        extentLogger.info("9. Click the Help button");
        extentLogger.info("Expected  Result: the new window opened");
        pages.calendarListViewPage().helpButton.click();

        extentLogger.info("10. Switch to the new Opened Help Window");
        extentLogger.info("Expected  Result: switched to the new window");
        String targetTitle = "How to import data into Odoo — Odoo 11.0 documentation";
        switchToWindow(targetTitle);

        extentLogger.info("11. Verify new URL: https://www.odoo.com/documentation/user/11.0/general/base_import/import_faq.html");
        extentLogger.info("Expected  Result: the new URL is displayed");
        Assert.assertEquals(driver.getCurrentUrl(),HELP_URL);

        extentLogger.info("12. Verify in the new URL window message How to import data into Odoo");
        extentLogger.info("Expected  Result: in the new URL window the message \"How to import data into Odoo is displayed\"");
        Assert.assertEquals(pages.helpPage().howToImportDataToOdoMessage.getText(),HELP_HOW_TO_IMPORT_DATA_INTO_ODOO_MESSAGE);

        extentLogger.pass("BRIT_233_Help Button Test PASS");

}
}