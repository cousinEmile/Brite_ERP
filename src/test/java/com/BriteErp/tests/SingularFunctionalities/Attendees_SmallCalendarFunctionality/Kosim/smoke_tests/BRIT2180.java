package com.BriteErp.tests.SingularFunctionalities.Attendees_SmallCalendarFunctionality.Kosim.functional_tests;


import com.BriteErp.utilities.BrowserUtils;
import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT2180 extends TestBase {

    @Test
    public void AdvancedSearchFilters_MyMeetings() {

        extentLogger = report.createTest("Advanced Search Filter : MyMeetings");
        driver.manage().window().maximize();

        extentLogger.info("Step One: Pre-Condition Environment is up and running.");

        extentLogger.info("Step Two: Go to URL.");
        extentLogger.info("Expected Result: Home page is displayed");
        extentLogger.info("Verifying landing page title");
        driver.get(ConfigurationReader.getProperties("url"));
        Assert.assertEquals(Driver.getDriver().getTitle(), LANDING_PAGE_TITLE);

        extentLogger.info("Step Three: Select 'BriteErpDemo' from given database options.");
        extentLogger.info("Expected Results: User should be directed to Login page.");
        pages.landing().BriteErpDemo_button.click();
        extentLogger.info("Verifying login page title");
        Assert.assertEquals(Driver.getDriver().getTitle(), LOGIN_PAGE_TITLE);

        extentLogger.info("Step Four: input valid user credentials");
        extentLogger.info("Expected Result: user should be directed to the 'Inbox' page of the application. ");
        pages.login().userLogin();
        extentLogger.info("Verifying login successful");
        waitUntilTitleEquals(10, DISCUSS_PAGE_TITLE);
        Assert.assertEquals(Driver.getDriver().getTitle(), DISCUSS_PAGE_TITLE);

        extentLogger.info("Step Five: Click on the Calendar tab in the header, on the left side of the screen.");
        extentLogger.info("Expected Result: User should be directed to main Calendar page.");
        pages.topNavigationBar().calendar_button.click();
        waitUntilTitleEquals(10, CALENDAR_PAGE_TITLE);
        Assert.assertEquals(driver.getTitle(), CALENDAR_PAGE_TITLE);

        extentLogger.info("Step Six: Click on the small Calendar tab in the right corner, make sure it's disapear after clicking on close button .");
        extentLogger.info("Expected Result: small.");

        BrowserUtils.hover(pages.calendar().removingFilter2);
        pages.calendar().removingFilter.click();
    }
}