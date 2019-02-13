package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BRIT_333_CreateAnEvent extends TestBase {

    @Test
    public void CreateAnEventTest() {
        extentLogger = report.createTest("BRIT_333_CreateAnEvent Test");
        pages.login().open();

        pages.landing().BriteErpDemo_button.click();

        pages.login().userLogin();
        wait(4);

        pages.topNavigationBar().calendar_button.click();

        wait(2);
        pages.calendar().viewMonth_button.click();

        extentLogger.info("1. Pre-Condition: The Calender page should be displayed in monthly view");
        Assert.assertTrue( pages.calendar().monthView.isDisplayed() );

        extentLogger.info("2. Select a month by clicking on right or left arrow.");
        extentLogger.info("3. Come to the date May, 2019.");
        CurrentMonth =  goToThatMonth("May");
        Assert.assertTrue(CurrentMonth.contains("May"));

        extentLogger.info("4. Click on day 15th.");
        pages.calendar().may15th.click();
        wait(3);


        extentLogger.info("5. Create an event named: test event May15 2019");
        pages.calendar().summaryInputBox.sendKeys(eventName);

        pages.calendar().popOutCreate_button.click();
        wait(4);


        Assert.assertEquals(pages.calendar().getEvent(eventName).getText().trim(),eventName.trim());

        extentLogger.pass("CreateAnEventTest Pass");
    }

    private String eventName = "test event May15 2019";
    public String CurrentMonth;

    public String goToThatMonth( String targetMonth){

        while (true) {
            wait(2);

            CurrentMonth = pages.calendar().theCurrentMonthText.getAttribute("innerText");

            if(CurrentMonth.contains(targetMonth))
                return CurrentMonth;

            pages.calendar().nextMonth.click();
        }
    }



















}
