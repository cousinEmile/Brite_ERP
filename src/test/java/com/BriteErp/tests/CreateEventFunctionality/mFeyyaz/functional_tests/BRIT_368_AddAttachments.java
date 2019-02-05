package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BRIT_368_AddAttachments extends TestBase {

    @Test
    public void AddAttachmentsTest () {

        extentLogger = report.createTest("SMSInvalidNumberTest Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password for Inventory Manager 2 ");
        pages.login().managerLogin();
        wait(2);

        extentLogger.info("5. Click Calendar ");
        pages.topNavigationBar().calendar_button.click();
        wait(2);
        extentLogger.info("6. Click list");
        pages.calendar().listView.click();
        wait(2);

        extentLogger.info("7. Click on the targeted event Edited test event May 2019");

        for (WebElement x : pages.calendar().allMeetings
        ) {
            if(x.getText().contains("May")){
                x.click();
                break;
            }
        }

        extentLogger.info("8. Click on attachments dropdown button");
        wait(2);
        pages.calendar().attachmentButton.click();

        extentLogger.info("9. Click on Add button");
        pages.calendar().addAttachmentButton.click();


    }



}
