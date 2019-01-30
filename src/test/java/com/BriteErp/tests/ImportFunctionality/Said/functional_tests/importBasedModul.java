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
    extentLogger = report.createTest("clickListIconBRIT_214 Test");
    waitForPageToLoad(2);

    extentLogger.info("1. Pre-Condition Environment is up and running.");

    extentLogger.info("2. Go to url");
    extentLogger.info("expected Result: Homepage will be displayed.");
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

    extentLogger.info("expected Result: list name must be displayed");
    Assert.assertEquals(LIST_ICON, list);

    extentLogger.info("8. list option must be clickable / Clicking on List");
    extentLogger.info("expected Result: list page must be opened ");
    pages.calendar().listView.click();

    extentLogger.pass("BRIT_214 Test PASS");
    }







    @Test
    public void BRIT_217 (){

    }














    @Test
    public void BRIT_222 (){

    }
    @Test
    public void BRIT_226 (){

    }
    @Test
    public void BRIT_229 (){

    }
    @Test
    public void BRIT_233 (){
    }
    @Test
    public void BRIT_240 (){
    }
    @Test
    public void BRIT_245 (){

    }
    @Test
    public void BRIT_246 (){

    }
    @Test
    public void BRIT_248 (){

    }









}
