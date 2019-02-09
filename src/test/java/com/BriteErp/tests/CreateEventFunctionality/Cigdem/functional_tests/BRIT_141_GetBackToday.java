package com.BriteErp.tests.CreateEventFunctionality.Cigdem.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_141_GetBackToday extends TestBase {

    @Test
    public void BRIT_141() {
        extentLogger = report.createTest("BRIT_141_GetBackToday Test");

        pages.login().open();

        pages.landing().BriteErpDemo_button.click();

        pages.login().userLogin();
        wait(2);

        pages.topNavigationBar().calendar_button.click();
        wait(2);

        extentLogger.info("Click on the Week button");
        pages.calendar().viewWeek_button.click();

        extentLogger.info("Remember the current week");
        String currentWeek = getCurrentWeek();
        System.out.println(currentWeek);
        extentLogger.info("Click on right arrow to go to next week");

        extentLogger.info("Click on the today button");
        pages.calendar().today_button.click();
        wait(1);
        String isCurrentWeek = getCurrentWeek();
        System.out.println(isCurrentWeek);

        extentLogger.info("Verify that the calendar shows the current calendar");
        Assert.assertEquals(currentWeek,isCurrentWeek);

        extentLogger.pass(" getBackToTodayTest Pass");
    }

    public String getCurrentWeek() {
        String currentWeek = pages.calendar().theCurrentMonthText.getText();
        return currentWeek;
    }

}
