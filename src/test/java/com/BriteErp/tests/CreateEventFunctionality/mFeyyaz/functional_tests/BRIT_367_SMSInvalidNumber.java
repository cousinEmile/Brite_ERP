package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BRIT_367_SMSInvalidNumber extends TestBase {

    @Test
    public void SMSInvalidNumberTest() {

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

        extentLogger.info("8. Click on Action dropdown menu");
        wait(2);
        pages.calendar().actionDropdownButton.click();

        extentLogger.info("9. Click on send SMS button");
        pages.calendar().sendSMSbutton.click();

        extentLogger.info("9. Enter a valid phone number in the U.S but not in a format expected");
        pages.calendar().phoneNumber.sendKeys("9152329932");

        extentLogger.info("10. Enter a message");
        pages.calendar().enterText.sendKeys("Hello dear employee");

        extentLogger.info("11. Click on send button");
        pages.calendar().sendButton.click();

        extentLogger.info("12. Verify the error message displayed");
        Assert.assertTrue(pages.calendar().phoneNumberError.isDisplayed());



    }








}


