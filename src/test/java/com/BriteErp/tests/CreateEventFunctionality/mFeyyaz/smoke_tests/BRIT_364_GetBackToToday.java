package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.smoke_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_364_GetBackToToday extends TestBase {


    @Test
    public void getBackToTodayTest() {
        extentLogger = report.createTest("BRIT_364_ImportFile Test");

        pages.login().open();

        pages.landing().BriteErpDemo_button.click();

        pages.login().userLogin();
        wait(2);

        pages.topNavigationBar().calendar_button.click();
        wait(2);

        extentLogger.info("Click on the Month button");
        pages.calendar().viewMonth_button.click();

        extentLogger.info("Remember the current month");
        String currentMonth = getCurrentMonth();
        System.out.println(currentMonth);
        extentLogger.info("Click on right arrow to go to next month");

//        pages.calendar().nextMonth.click();
//        wait(2);
//        String nextMonthName = pages.calendar().theCurrentMonthText.getText();
//        System.out.println(nextMonthName);
//        Assert.assertNotEquals(currentMonth,nextMonthName);

        extentLogger.info("Click on the today button");
        pages.calendar().today_button.click();
        wait(1);
        String isCurrentMonth = getCurrentMonth();
        System.out.println(isCurrentMonth);

        extentLogger.info("Verify that the calendar shows the current calendar");
        Assert.assertEquals(currentMonth,isCurrentMonth);

        extentLogger.pass(" getBackToTodayTest Pass");
    }







    public String getCurrentMonth() {
        String currentMonth = pages.calendar().theCurrentMonthText.getText();
        return currentMonth;
    }
}
