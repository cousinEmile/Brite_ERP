package com.BriteErp.tests.ImportFunctionality.Said.functional_tests;

import com.BriteErp.pages.CalendarListViewPage;
import com.BriteErp.pages.TopNavigationBar;
import com.BriteErp.tests.ImportFunctionality.Aiman.regression_tests.FunFun;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class importBasedModul extends TestBase {



    @Test
    public void BRIT_217 (){
        extentLogger = report.createTest("ListIconBRIT_214 Test");
        driver.manage().window().maximize();
        waitForPageToLoad(5);

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url");
        extentLogger.info("expected Result: Homepage is displayed.");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        extentLogger.info("expected Result: Clicked");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password for Inventory Manager 2 ");
        extentLogger.info("expected Result: Login successful");
        pages.login().managerLogin();

        extentLogger.info("5. Verify the Calendar on the left side of Top Navigation Bar");
        extentLogger.info("expected Result: Calendar is displayed");
        Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

        extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
        extentLogger.info("expected Result: clicked");
        pages.topNavigationBar().calendar_button.click();

        wait(2);
        extentLogger.info("7. Hovering to the list option on the right top corner");
        hover(pages.calendar().listView);

        extentLogger.info("7. Saving List name");
        String list = pages.calendar().listView.getAttribute("data-original-title");

        extentLogger.info("expected Result: list name should be displayed");
        Assert.assertEquals(LIST_ICON, list);

        extentLogger.info("8. click list button");
        extentLogger.info("expected Result: list page should be opened ");
        pages.calendar().listView.click();

        pages.calendarListViewPage().import_button.click();

        String userFolder = System.getProperty("user.home");

        String path = "C:\\Users\\saidy\\Downloads\\Utility.xlsx";
        pages.importPage().loadFile.sendKeys(path);

    }







}
