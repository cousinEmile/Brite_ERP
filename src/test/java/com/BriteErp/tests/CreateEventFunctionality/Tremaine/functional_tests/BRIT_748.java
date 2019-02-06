package com.BriteErp.tests.CreateEventFunctionality.Tremaine.functional_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.TestBase;
import org.testng.annotations.Test;

public class BRIT_748 extends TestBase {

    @Test
    public void Brit_748() {
        extentLogger = report.createTest("Create Event_BRIT_109 Test-User");
        waitForPageToLoad(2);

        extentLogger.info("1.Precondition: Environment is ready.");
        driver.get(ConfigurationReader.getProperties("url"));
        driver.manage().window().maximize();

        extentLogger.info("2.Go to landing page.");
        extentLogger.info("Expected Result: User is taken to landing page");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("3.Login as a User.");
        extentLogger.info("Expected Result: User enters correct credentials and is taken to homepage");
        pages.login().userLogin();

        extentLogger.info("4.User then clicks on Calendar tab");
        extentLogger.info("Expected Result: User is taken to the Calendar page.");
        wait(2);
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("5.User click on the Day button for main Calendar.");
        extentLogger.info("Expected Result: Calendar is refreshed to its Day format.");
        pages.calendar().viewDay_button.click();

        extentLogger.info("6.User clicks on All-Day box");
        extentLogger.info("Expected Result: User should be presented with a pop-up box");
        wait(8);
        pages.calendar().allDayBox.click();

        extentLogger.info("7.User clicks on edit button");
        extentLogger.info("Expected Result: User should be taken to another pop-up box with more options");
        pages.calendar().editButton.click();

//        extentLogger.info("8.User clicks on the box adjacent to the meeting detail All-day.");
//        extentLogger.info("Expected Result: User should see ");
    }

}