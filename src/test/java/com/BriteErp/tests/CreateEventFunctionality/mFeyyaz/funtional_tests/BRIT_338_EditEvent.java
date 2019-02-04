package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.functional_tests;

import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BRIT_338_EditEvent extends TestBase {


    @Test
    public void EditEvent () {
        extentLogger = report.createTest("BRIT_338_EditEvent Test");

        pages.login().open();

        pages.landing().BriteErpDemo_button.click();

        pages.login().userLogin();
        wait(2);

        pages.topNavigationBar().calendar_button.click();

        wait(2);
        pages.calendar().viewMonth_button.click();
        wait(2);
        CurrentMonth =  goToThatMonth("May");
        wait(2);
        pages.calendar().may15th.click();

        wait(2);
        extentLogger.info("1. Click on Edit button");
        pages.calendar().editEventButton.click();

        extentLogger.info("2. Change the name of the event to “Edited test event May 2019”. ");
        pages.calendar().meetingSubject.clear();
        wait(2);
        pages.calendar().meetingSubject.sendKeys("Edited test event May 2019");


        extentLogger.info("3. Click on Options button");
        pages.calendar().optionsEditButton.click();

        extentLogger.info("Edit the privacy of the event as Only me");
        Select select = new Select(pages.calendar().selectClass);
        select.selectByIndex(2);

        extentLogger.info("Verifying the privacy is set as Only me");
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Only me");


        extentLogger.info("Click on Save");
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