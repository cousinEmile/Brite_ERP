package com.BriteErp.tests.CreateEventFunctionality.mFeyyaz.smoke_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BRIT_001_ViewDaysOfWeek extends TestBase {

    @Test
    public void ViewDaysOfWeekTest() {

        extentLogger = report.createTest("BRIT_303_MonthlyBasedEvents Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url.");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password of Inventory User");
        pages.login().userLogin();
        wait(2);

        extentLogger.info("5.Verify the Calendar button exists in the Top Navigator Bar");
        Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

        extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
        pages.topNavigationBar().calendar_button.click();

        wait(2);
        extentLogger.info("7. Clicking on Month button");
        wait(2);
        pages.calendar().viewMonth_button.click();

        extentLogger.info("8. Verify monthly view displayed");
        Assert.assertTrue(pages.calendar().monthView.isDisplayed());

        wait(1);
        List<WebElement> daysOfWeek = driver.findElements(By.xpath("//div[@class='fc-row fc-widget-header']/table/thead/tr/th"));

        for(int i=1; i<daysOfWeek.size(); i++){
            System.out.println(daysOfWeek.get(i).getText());
            Assert.assertEquals(daysOfWeek.get(1).getText(), "Sun");
            Assert.assertEquals(daysOfWeek.get(daysOfWeek.size()).getText(), "Sat");
        }




        extentLogger.pass("ViewAllEventsOfMonthTest PASS");

    }
}