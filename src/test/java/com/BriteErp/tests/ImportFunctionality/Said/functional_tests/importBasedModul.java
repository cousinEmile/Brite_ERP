package com.BriteErp.tests.ImportFunctionality.Said.functional_tests;

import com.BriteErp.pages.TopNavigationBar;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class importBasedModul extends TestBase {


    @Test
    public void BRIT_214(){
    extentLogger = report.createTest("BRIT_214 Test");
    waitForPageToLoad(2);

    extentLogger.info("1. Pre-Condition Environment is up and running.");

    extentLogger.info("2. Go to url");
    pages.login().open();

    extentLogger.info("3. Click Brite Erp Demo");
    pages.landing().BriteErpDemo_button.click();

    extentLogger.info("4. Enter username and password for Inventory Manager 2 ");
    pages.login().managerLogin();

    extentLogger.info("5. Verify the Calendar on the left side of Top Navigation Bar");
    Assert.assertTrue(pages.topNavigationBar().calendar_button.getAttribute("innerText").contains(CALENDAR_ICON));

    extentLogger.info("6. Clicking on Calendar on Top Navigation Bar on the left side");
    pages.topNavigationBar().calendar_button.click();

    extentLogger.info("7. Hovering to the list option on the right top corner");
    hover(pages.calendar().listView);

    extentLogger.info("7. Saving List name");
    String list = pages.calendar().listView.getAttribute("data-original-title");

    extentLogger.info("7. Checking the List name is displayed");
    Assert.assertEquals(LIST_ICON, list);

    extentLogger.info("8. list option must be clickable / Clicking on List");
    pages.calendar().listView.click();





    }










}
