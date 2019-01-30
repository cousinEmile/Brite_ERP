package com.BriteErp.tests.ImportFunctionality.Said.functional_tests;

import com.BriteErp.pages.TopNavigationBar;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.testng.annotations.Test;

public class importBasedModul extends TestBase {


    @Test
    public void BRIT_214(){
    extentLogger = report.createTest("BRIT_214 Test");

    extentLogger.info("1. Pre-Condition Environment is up and running.");

    extentLogger.info("2. Go to url");
    pages.login().open();

    extentLogger.info("3. Click Brite Erp Demo");
    pages.landing().BriteErpDemo_button.click();

    extentLogger.info("4. Enter username and password for Inventory Manager 2 ");
    pages.login().managerLogin();

    extentLogger.info("Verify the Calendar on the left side of Top Navigation Bar");

    extentLogger.info("6. Click on Calendar on Top Navigation Bar on the left side");
    pages.topNavigationBar().calendar_button.click();

    extentLogger.info("");
    pages.calendar().listView.getAttribute("data-original-title");




    }










}
