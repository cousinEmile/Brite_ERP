package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.smoke_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.annotations.Test;


public class BRIT_338_EditEvent extends TestBase {



    @Test
    public void EditEvent () {

        pages.login().open();

        pages.landing().BriteErpDemo_button.click();

        pages.login().userLogin();
        wait(2);

        pages.topNavigationBar().calendar_button.click();

        wait(2);
        pages.calendar().viewMonth_button.click();

        CurrentMonth =  goToThatMonth("May");
        wait(2);
        pages.calendar().may15th.click();
        wait(2);

        extentLogger = report.createTest("BRIT_338_EditEvent Test");


        extentLogger.info("Click on Edit button");
        extentLogger.info("Expected: Edit window should pop-up.");
        pages.calendar().editEventButton.click();

        extentLogger.info("Change the name of the event to “Edited test event May 2019”. ");
        pages.calendar().meetingSubject.clear();
        wait(2);
        pages.calendar().meetingSubject.sendKeys("Edited test event May 2019");

        extentLogger.info("Click on Save");
        extentLogger.info("Expected : The event name should appear on calendar as edited" );

        pages.calendar().saveEditEvent.click();









    }




    String CurrentMonth;
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