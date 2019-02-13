package com.BriteErp.tests.CreateEventFunctionality.Tremaine.smoke_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_769  extends TestBase {

    @Test
    public void Brit_769(){
        extentLogger = report.createTest("Managers can edit events BRIT_769,Manager-Test");
        waitForPageToLoad(2);

        extentLogger.info("1.Precondition: Environment is ready.");
        driver.get(ConfigurationReader.getProperties("url"));
        driver.manage().window().maximize();

        extentLogger.info("2.Go to landing page.");
        extentLogger.info("Expected Result: User is taken to landing page");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("3.Login as a Manager");
        extentLogger.info("Expected Result: Manager is able to login successfully with proper credentials");
        pages.login().managerLogin();

        extentLogger.info("4.Manager click on Calendar tab");
        extentLogger.info("Expected Result:Manager is taken to Calendar page");
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("5.Manager clicks on day button.");
        extentLogger.info("Expected Result:Manager should now see the calendar in its proper format");
        pages.calendar().dayButton.click();
        Assert.assertTrue(pages.calendar().dayButton.isEnabled());

        extentLogger.info("6.Click on the test case created by user.");
        extentLogger.info("Expected Result: Manager can click on the event created by user.");
        pages.calendar().sixAmBox.click();
        Assert.assertTrue(pages.calendar().sixAmBox.isEnabled());


    }
}
