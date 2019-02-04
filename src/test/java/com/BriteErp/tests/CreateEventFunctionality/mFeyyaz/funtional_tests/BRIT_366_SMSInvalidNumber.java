package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BRIT_366_SMSInvalidNumber extends TestBase {

    @Test
    public void SMSInvalidNumberTest() {

        extentLogger = report.createTest("SMSInvalidNumberTest Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password for Inventory Manager 2 ");
        pages.login().managerLogin();

        extentLogger.info("5. Click Calendar ");
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("6. Click list");
        pages.calendar().listView.click();

        extentLogger.info("7. Find the targeted event Edited test event May 2019");



    }
}
