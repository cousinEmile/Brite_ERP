package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.smoke_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_333_CreateAnEvent extends TestBase {

    @Test
    public void CreateAnEventTest() {

//         openCalenderMontlyView();
        pages.login().open();
        pages.landing().BriteErpDemo_button.click();
        pages.login().userLogin();
        pages.topNavigationBar().calendar_button.click();
        pages.calendar().viewMonth_button.click();

         extentLogger = report.createTest("BRIT_333_CreateAnEvent Test");

         extentLogger.info("1. Pre-Condition: The Calender page should be displayed in monthly view");
         Assert.assertTrue( pages.calendar().monthView.isDisplayed() );

         extentLogger.info("2. Select a month by clicking on right or left arrow.");
         extentLogger.info("Expected: Months should change in order");

         extentLogger.info("3. Come to the date May, 2019.");
         extentLogger.info("Expected: The days of May 2019 should be displayed");

         CurrentMonth =  goToThatMonth("May");
         Assert.assertTrue(CurrentMonth.contains("May"));

         extentLogger.info("4. Click on day 15th.");
         extentLogger.info("Expected: Create window should pop-up");
         pages.calendar().may15th.click();

         wait(2);
         extentLogger.info("5. Create an event named: test event May15 2019");
         extentLogger.info("Expected: The event should appear");
         pages.calendar().summaryInputBox.sendKeys(eventName);

         pages.calendar().popOutCreate_button.click();
         wait(4);

        Assert.assertEquals(pages.calendar().getEvent(eventName).getText().trim(),eventName.trim());


         extentLogger.pass("CreateAnEventTest");
    }

    private String eventName = "test event May15 2019";
    private String CurrentMonth;

    public String goToThatMonth( String targetMonth){

        String CurrentMonth;

        while (true) {
            wait(2);

            CurrentMonth = pages.calendar().theCurrentMonthText.getAttribute("innerText");

            if(CurrentMonth.contains(targetMonth))
                return CurrentMonth;

            pages.calendar().nextMonth.click();
        }
    }










}
