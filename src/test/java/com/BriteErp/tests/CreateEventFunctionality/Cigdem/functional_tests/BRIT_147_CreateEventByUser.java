package com.BriteErp.tests.CreateEventFunctionality.Cigdem.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_147_CreateEventByUser extends TestBase {

    @Test
    public void BRIT_143() {
        extentLogger = report.createTest("BRIT_137_CancelEvent Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password for Inventory Manager 2");
        pages.login().userLogin();

        extentLogger.info("5. Verify the Calendar sign on the left side of Top Navigation Bar");
        Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

        extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
        pages.topNavigationBar().calendar_button.click();

        wait(2);
        extentLogger.info("7. Click Weekly button option");
        pages.calendar().viewWeek_button.click();
        Assert.assertTrue(pages.calendar().view_table_weekly.isDisplayed());

        extentLogger.info("8. Click 1 pm on 04/09/2019 to be able to see edit button");
        pages.calendar().createEventByHour.click();
        Assert.assertTrue(pages.calendar().popOutCreate_button.isDisplayed());

        extentLogger.info("9. Click edit button");
        pages.calendar().editButtonEvent.click();
        Assert.assertTrue(pages.calendar().createDetailPage.isDisplayed());

        wait(5);
        extentLogger.info("10. Write a subject to the meeting subject box");
        pages.calendar().inputMeeting.sendKeys("cd" + Keys.ENTER);

        extentLogger.info("11. Click save button");
        pages.calendar().saveButton.click();
        Assert.assertTrue(pages.calendar().view_table_weekly.isDisplayed());

    }
}
