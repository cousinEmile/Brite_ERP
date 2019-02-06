package com.BriteErp.tests.CreateEventFunctionality.Tremaine.smoke_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.TestBase;
import org.testng.annotations.Test;

public class BRIT_762 extends TestBase {

    @Test
    public void Brit_762(){

        extentLogger = report.createTest("Manager can schedule events_BRIT_759 Test-Manager");
        waitForPageToLoad(2);

        extentLogger.info("1.Precondition: Environment is ready.");
        driver.get(ConfigurationReader.getProperties("url"));
        driver.manage().window().maximize();

        extentLogger.info("2.Go to landing page.");
        extentLogger.info("Expected Result: User is taken to landing page");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("3.Login as a Manager.");
        extentLogger.info("Expected Result: Manager enters correct credentials and is taken to homepage");
        pages.login().managerLogin();

        extentLogger.info("4.Manager then clicks on Calendar tab");
        extentLogger.info("Expected Result: Manager is taken to the Calendar page.");
        wait(2);
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("5.Manager click on the Day button for main Calendar.");
        extentLogger.info("Expected Result: Calendar is refreshed to its Day format.");
        pages.calendar().dayButton.click();

        extentLogger.info("6.Manager clicks on All-Day box");
        extentLogger.info("Expected Result: Manager should be presented with a pop-up box");
        wait(8);
        pages.calendar().allDayBox.click();

        extentLogger.info("7.");
    }

}
