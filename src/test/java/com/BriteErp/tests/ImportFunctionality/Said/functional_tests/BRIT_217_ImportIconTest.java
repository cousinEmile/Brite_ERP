package com.BriteErp.tests.ImportFunctionality.Said.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_217_ImportIconTest extends TestBase {


    @Test
    public void BRIT_217(){
    extentLogger = report.createTest("BRIT_217_Import Icon Test");

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

    extentLogger.info("5. Click Calendar ");
    extentLogger.info("Expected Result: Calendar page is displayed");
    pages.topNavigationBar().calendar_button.click();

    extentLogger.info("6. Click list");
    extentLogger.info("Expected  Result: List page is displayed");
    pages.calendar().listView.click();

    extentLogger.info("7. verify Import on the top left corner under Meetings");
    extentLogger.info("Expected  Result: Import sign is displayed");
    Assert.assertEquals(pages.calendarListViewPage().import_button.getText(),IMPORT_ICON);

    extentLogger.info("8. click Import button");
    extentLogger.info("Expected  Result: Import page must be displayed");
    pages.calendarListViewPage().import_button.click();

    extentLogger.pass("BRIT_217_Import Icon Test PASS");
    }

}
