package com.BriteErp.tests.ImportFunctionality.Said.smoke_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_214_ListIconTest extends TestBase {

    @Test
    public void BRIT_214(){
        extentLogger = report.createTest("BRIT_214_ListIcon Test");

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

        extentLogger.info("5. Verify the Calendar sign on the left side of Top Navigation Bar");
        extentLogger.info("Expected  Result: Calendar sign is displayed");
        Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

        extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
        extentLogger.info("Expected  Result: clicked");
        pages.topNavigationBar().calendar_button.click();

        wait(2);
        extentLogger.info("7. Hovering to the list option on the right top corner");
        hover(pages.calendar().listView);

        extentLogger.info("7. Saving List name");
        String list = pages.calendar().listView.getAttribute("data-original-title");

        extentLogger.info("Expected  Result: list name should be displayed");
        Assert.assertEquals(LIST_ICON, list);

        extentLogger.info("8. click list button");
        extentLogger.info("Expected  Result: list page should be opened ");
        pages.calendar().listView.click();

        extentLogger.pass("BRIT_214_ListIcon Test PASS");
    }

}
