package com.BriteErp.tests.CreateEventFunctionality.Cigdem.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_137_CancelEvent extends TestBase {

    @Test
    public void BRIT_137() {
        extentLogger = report.createTest("BRIT_137_CancelEvent Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password for Inventory Manager 2");
        pages.login().managerLogin();

        extentLogger.info("5. Verify the Calendar sign on the left side of Top Navigation Bar");
        Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

        extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
        pages.topNavigationBar().calendar_button.click();

        wait(2);
        extentLogger.info("7. Click Weekly button option");
        pages.calendar().viewWeek_button.click();
        Assert.assertTrue(pages.calendar().view_table_weekly.isDisplayed());

        extentLogger.info("8. Click 8 am on 01/11/2019 to be able to see edit button");
        pages.calendar().createEventbyhour.click();
        Assert.assertTrue(pages.calendar().popOutCreate_button.isDisplayed());

        extentLogger.info("9. Click cancel to create or edit options");
        pages.calendar().cancelEventButton.click();
        Assert.assertTrue(pages.calendar().view_table_weekly.isDisplayed());


    }
}
