package com.BriteErp.tests.CreateEventFunctionality.Tremaine.functional_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_927 extends TestBase {

    @Test
    public void Brit_927(){
        extentLogger = report.createTest("Manager can schedule events_BRIT_759 Test-Manager");
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

        extentLogger.info("6.Manager clicks on 8:00 box.");
        extentLogger.info("Expected Result: Manager should be presented with a pop-up box called create.");
        pages.calendar().eightAmBox.click();

        extentLogger.info("7.Click on edit button");
        extentLogger.info("Expected Result:Manager should see more options for their event");
        pages.calendar().editButton.click();

        extentLogger.info("8.Click on the options link");
        extentLogger.info("Expected Result:Manager should be in the options tab");
        pages.calendar().optionsEditButton.click();

        extentLogger.info("9.Click on the reccurent check box");
        extentLogger.info("Expected Result:Manager should see a check mark in the recurrent check box");
        pages.calendar().recurrentCheckBox.click();

        extentLogger.info("Verify recurrent check box was checked");
        Assert.assertTrue(pages.calendar().recurrentCheckBox.isSelected());
    }
}
