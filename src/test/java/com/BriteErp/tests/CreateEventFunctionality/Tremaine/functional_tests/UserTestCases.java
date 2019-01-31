package com.BriteErp.tests.CreateEventFunctionality.Tremaine.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.annotations.Test;

public class UserTestCases extends TestBase {

    @Test
    public void BRIT_109() {
        extentLogger = report.createTest("Create Event_BRIT_109 Test-User");
        waitForPageToLoad(2);

        extentLogger.info("1.Precondition: Environment is ready.");

        extentLogger.info("2.Go to landing page.");
        extentLogger.info("Expected Result: User is taken to landing page");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("3.Login as a User.");
        extentLogger.info("Expected Result: User enters correct credentials and is taken to homepage");
        pages.login().userLogin();

        extentLogger.info("4.User then clicks on Calendar tab");
        extentLogger.info("Expected Result: User is taken to the Calendar page.");
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("5.User click on the Day button for main Calendar.");
        extentLogger.info("Expected Result: Calendar is refreshed to its Day format.");
        pages.calendar().viewDay_button.click();

        extentLogger.info("6.User clicks on All-Day box");
        extentLogger.info("Expected Result: User should be presented with a pop-up box");
        pages.calendar()._011618_allDay.click();

        extentLogger.info("7.User enters text to the summary input box");
        pages.calendar().summaryInputBox.sendKeys("Testing Purposes");

        extentLogger.info("8.User then clicks on create button");
        extentLogger.info("Expected Result: User should have successfully created an event");
        pages.calendar().popOutCreate_button.click();

        //verify that user has successfully created an event
    }

    public void BRIT_201(){}


    }
