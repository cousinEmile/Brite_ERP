package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.functional_tests;

import com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.smoke_tests.BRIT_333_CreateAnEvent;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_365_EditPrivateEvent extends TestBase {

    @Test
    public void EditPrivateEventTest() {

        extentLogger = report.createTest("BRIT_365_EditPrivateEvent Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url.");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password of Manager");
        pages.login().managerLogin();
        wait(2);

        extentLogger.info("5.Verify the Calendar button exists in the Top Navigator Bar");
        Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

        extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
        pages.topNavigationBar().calendar_button.click();

        wait(2);
        extentLogger.info("7. Clicking on Month button");
        wait(2);
        pages.calendar().viewMonth_button.click();
        wait(2);
        extentLogger.info("8. Go to the date May, 2019.");
        CurrentMonth = goToThatMonth("May");
        wait(2);
        extentLogger.info("9. Click on day 15th.");
        pages.calendar().may15th.click();

        extentLogger.info("10. Click on Edit button");
        pages.calendar().editEventButton.click();
        wait(2);
        extentLogger.info("11. Click on Options button");
        pages.calendar().optionsEditButton.click();
        wait(2);
        extentLogger.info("12. Edit the privacy of the event as Everyone");
        Select select = new Select(pages.calendar().selectClassManager);
        select.selectByIndex(1);

        extentLogger.info("13. Click on Save");
        pages.calendar().saveEditEvent.click();

        wait(2);

        extentLogger.info("14. Verify error Message (The following fields are invalid) should pop-up");
        Assert.assertTrue(pages.calendar().errorMessage.isDisplayed());

        extentLogger.pass("EditPrivateEventTest PASS");


    }


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
