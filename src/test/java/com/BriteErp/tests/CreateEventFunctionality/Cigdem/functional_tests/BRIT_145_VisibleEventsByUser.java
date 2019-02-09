package com.BriteErp.tests.CreateEventFunctionality.Cigdem.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BRIT_145_VisibleEventsByUser extends TestBase {

    @Test
    public void BRIT_143() {
        extentLogger = report.createTest("BRIT_137_CancelEvent Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password for Inventory Manager 2");
        pages.login().managerLogin();

        extentLogger.info("5. Verify the Calendar sign on the left side of Top Navigation Bar");
        Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

        extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
        pages.topNavigationBar().calendar_button.click();

        wait(2);
        extentLogger.info("7. Click Weekly button option");
        pages.calendar().viewWeek_button.click();
        Assert.assertTrue(pages.calendar().view_table_weekly.isDisplayed());

        WebElement timeOfEvent = createEvent("18:00");
        timeOfEvent.click();

        extentLogger.info("8. Click table to create an event");
        extentLogger.info("Expected Result: Create popOut will be displayed");
        pages.calendar().click_table_weekly.click();
        Assert.assertTrue(pages.calendar().popOutCreate_button.isDisplayed());

        extentLogger.pass("ViewAllEventsOfWeekTest PASS");


    }


    public WebElement createEvent(String time){
        wait(1);
        List<WebElement> timem = driver.findElements(By.xpath("//div[@class='fc-slats']/table/tbody/tr"));


        WebElement clock1 = driver.findElement(By.xpath("(//div[@class='fc-slats']/table/tbody/tr)[1]"));
        for (WebElement clock : timem
        ) {

            String clockStr = clock.getText().trim();
            if( clockStr.equals(time)) {
                System.out.println(clock.getText());
                return clock;

            }

        }
        return clock1;

    }
    }
