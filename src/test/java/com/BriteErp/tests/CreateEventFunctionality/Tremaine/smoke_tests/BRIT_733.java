package com.BriteErp.tests.CreateEventFunctionality.Tremaine.smoke_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.TestBase;
import org.testng.annotations.Test;

public class BRIT_733 extends TestBase {

    @Test
    public void Brit_733(){
        extentLogger = report.createTest("User can change the current day BRIT_733 test");
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
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("5.User click on the Day button for main Calendar.");
        extentLogger.info("Expected Result: Calendar is refreshed to its Day format.");
        pages.calendar().viewDay_button.click();

        extentLogger.info("6.User clicks on the right arrow");
        extentLogger.info("Expected Result: The current day should be shifted to next day");
        pages.calendar().nextDayButton.click();


    }
}
