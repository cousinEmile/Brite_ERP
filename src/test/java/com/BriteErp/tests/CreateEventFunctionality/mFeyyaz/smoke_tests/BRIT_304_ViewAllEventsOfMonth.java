package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.smoke_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_304_ViewAllEventsOfMonth extends TestBase {

    @Test
    public void ViewAllEventsOfMonthTest() {

        extentLogger = report.createTest("BRIT_303_MonthlyBasedEvents Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url.");
        extentLogger.info("Expected Result: Home Page is dispplayed.");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        extentLogger.info("Expected Result : Clicked");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password of Inventory User");
        extentLogger.info("Expected result: User's name displayed on the top right corner");
        pages.login().userLogin();

        extentLogger.info("5.Verify the Calendar button exists in the Top Navigator Bar");
        extentLogger.info("Expected Result: Calendar sign is displayed");
        Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

        extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
        extentLogger.info("Expected Result: clicked");
        pages.topNavigationBar().calendar_button.click();

        wait(2);

        extentLogger.info("8. Clicking on Month button");
        extentLogger.info("Expected Result:Weekly-based calendar should change to monthly-based.");
        pages.calendar().viewMonth_button.click();
        Assert.assertTrue( pages.calendar().monthView.isDisplayed() );
        extentLogger.pass("ViewAllEventsOfMonthTest PASS");












    }

}
