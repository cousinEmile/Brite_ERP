package com.BriteErp.tests.CreateEventFunctionality.Tremaine.smoke_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_759 extends TestBase {

    @Test
    public void Brit_759() {
        extentLogger = report.createTest("Manager can view Calendar in day-formet_BRIT_759 Test-Manager");
        waitForPageToLoad(2);

        extentLogger.info("1.Precondition: Environment is ready.");
        driver.get(ConfigurationReader.getProperties("url"));
        driver.manage().window().maximize();

        extentLogger.info("2.Go to landing page.");
        extentLogger.info("Expected Result: Manager is taken to landing page");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("3.Login as a manager");
        extentLogger.info("Expected Result: Manager is logged in successful with proper credentials");
        pages.login().managerLogin();

        extentLogger.info("4.Manager clicks on Calendar tab");
        extentLogger.info("Expected Result: Manager is taken to the Calendar page.");
        wait(2);
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("5.Manager clicks on day button");
        extentLogger.info("Expected Result:Manager can see the Calendar by its day format");
        pages.calendar().dayButton.click();
        Assert.assertTrue(pages.calendar().dayButton.isEnabled());
    }
}