package com.BriteErp.tests.CreateEventFunctionality.Cigdem.functional_tests;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class BRIT_138_Edit_Event extends TestBase {

    @Test
    public void BRIT_138() {
        extentLogger = report.createTest("BRIT_133_ListIcon Test");

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
        extentLogger.info("Expected Result: clicked");
        pages.topNavigationBar().calendar_button.click();

        wait(2);
        extentLogger.info("7. Click Weekly button option");
        extentLogger.info("Expected Result: Table is displayed as weekly based");
        pages.calendar().viewWeek_button.click();
        Assert.assertTrue(pages.calendar().view_table_weekly.isDisplayed());

        extentLogger.info("8. Click 8 am on 01/11/2019 to be able to see edit button");
        extentLogger.info("Expected Result: Popup is displayed and edit button is clickable");
        pages.calendar().createEventbyhour.click();
        Assert.assertTrue(pages.calendar().popOutCreate_button.isDisplayed());

        extentLogger.info("9. Click edit button");
        extentLogger.info("Expected Result: Edit button is clickable");
        pages.calendar().editButtonEvent.click();
        Assert.assertTrue(pages.calendar().createDetailPage.isDisplayed());

        wait(5);
        extentLogger.info("10. Write a subject to the meeting subject box");
        extentLogger.info("Expected Result: Verify to write a text");
        pages.calendar().inputMeeting.sendKeys("cd" + Keys.ENTER);

        extentLogger.info("11. Click save button");
        extentLogger.info("Expected Result: Save button is clickable");
        pages.calendar().saveButton.click();
        Assert.assertTrue(pages.calendar().view_table_weekly.isDisplayed());
        extentLogger.pass("ViewAllEventsOfWeekTest PASS");

    }
}