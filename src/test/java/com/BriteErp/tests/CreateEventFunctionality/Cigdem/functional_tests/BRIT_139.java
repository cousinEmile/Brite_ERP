package com.BriteErp.tests.CreateEventFunctionality.Cigdem.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_139 extends TestBase {

    @Test
    public void BRIT_139() {
        extentLogger = report.createTest("BRIT_139_ListIcon Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url");
        extentLogger.info("Expected  Result: Home page is displayed.");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        extentLogger.info("Expected  Result: Clicked");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password for Inventory Manager 2");
        extentLogger.info("Expected  Result: Login successful");
        pages.login().managerLogin();

        extentLogger.info("5. Verify the Calendar sign on the left side of Top Navigation Bar");
        extentLogger.info("Expected  Result: Calendar sign is displayed");
        Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

        extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
        extentLogger.info("Expected  Result: clicked");
        pages.topNavigationBar().calendar_button.click();



    }
}
