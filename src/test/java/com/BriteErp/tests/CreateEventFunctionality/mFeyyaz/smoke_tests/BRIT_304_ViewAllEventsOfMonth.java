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
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password of Inventory User");
        pages.login().userLogin();
        wait(2);

        extentLogger.info("5.Verify the Calendar button exists in the Top Navigator Bar");
        Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

        extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
        pages.topNavigationBar().calendar_button.click();

        wait(2);
        extentLogger.info("8. Clicking on Month button");
        wait(2);
        pages.calendar().viewMonth_button.click();

        extentLogger.info("Verify monthly view displayed");
        Assert.assertTrue(pages.calendar().monthView.isDisplayed());



        extentLogger.pass("ViewAllEventsOfMonthTest PASS");

    }
}