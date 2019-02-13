package com.BriteErp.tests.CreateEventFunctionality.Cigdem.smoke_tests;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BRIT_133_ViewAllEventsOfWeek extends TestBase {

    @Test
    public void BRIT_133() {
        extentLogger = report.createTest("BRIT_133_ListIcon Test");

        extentLogger.info("1. Pre-Condition Environment is up and running.");


        extentLogger.info("2. Go to url");
        extentLogger.info("Expected  Result: Home page is displayed.");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        extentLogger.info("Expected  Result: Clicked");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password for Inventory Manager 2");
        extentLogger.info("Expected  Result: Login successful");
        pages.login().managerLogin();

        extentLogger.info("5. Verify the Calendar sign on the left side of Top Navigation Bar");
        extentLogger.info("Expected  Result: Calendar sign is displayed");
        Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

        extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
        extentLogger.info("Expected Result: clicked");
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("7. Click Weekly button option");
        extentLogger.info("Expected Result: Table is displayed as weekly based");
        pages.calendar().viewWeek_button.click();
        Assert.assertTrue(pages.calendar().view_table_weekly.isDisplayed());



//        List<WebElement> listDays = driver.findElements(By.xpath("//div[@class='fc-row fc-widget-header']/table/thead/tr/th"));
//
//
//        for (WebElement x  : listDays
//             ) {
//            wait(1);
//            String day = x.getText().trim();
//
//            System.out.println( x.getText());
//        }


        WebElement timeOfEvent = createEvent("18:00");
        timeOfEvent.click();





//        extentLogger.info("8. Click table to create an event");
//        extentLogger.info("Expected Result: Create popOut will be displayed");
//        pages.calendar().click_table_weekly.click();
//        Assert.assertTrue(pages.calendar().popOutCreate_button.isDisplayed());
//
//        extentLogger.pass("ViewAllEventsOfWeekTest PASS");

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