package com.BriteErp.tests.ImportFunctionality.Said.smoke_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_229_ReloadingFile extends TestBase {


    @Test
    public void BRIT_229(){
        extentLogger = report.createTest("BRIT_229_ReloadingFileNotWorking");

        extentLogger.info("1. Pre-Condition Environment is up and running.");

        extentLogger.info("2. Go to url");
        extentLogger.info("Expected  Result: Home page is displayed.");
        pages.login().open();

        extentLogger.info("3. Click Brite Erp Demo");
        extentLogger.info("Expected  Result: Clicked");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("4. Enter username and password for Inventory Manager 2 ");
        extentLogger.info("Expected  Result: Login successful");
        pages.login().managerLogin();

        extentLogger.info("5. Click Calendar ");
        extentLogger.info("Expected Result: Calendar page is displayed");
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("6. Click list");
        extentLogger.info("Expected  Result: List page is displayed");
        pages.calendar().listView.click();

        extentLogger.info("7. click Import button");
        extentLogger.info("Expected  Result: Import page is displayed");
        pages.calendarListViewPage().import_button.click();

        extentLogger.info("8. upload file \"Utility.xlsx\" ");
        extentLogger.info("Expected  Result: \"Utility.xlsx\" is displayed ");
        String path = "C:\\Users\\saidy\\Downloads\\Utility.xlsx";
        pages.importPage().loadFile.sendKeys(path);

        extentLogger.info("9. verify that the \"Reload File\" on the right side of Load File button ");
        extentLogger.info("Expected  Result: the Reload File is displayed ");
        Assert.assertEquals(pages.importPage().reloadFile.getText(),RELOAD_FILE_ICON);

        extentLogger.info("10. Click Reload File and verify that user as a Manager able to Reloaded new File");
        extentLogger.info("Expected  Result: user as a Manager should be able to chose new file to upload it");
        pages.importPage().reloadFile.click();

        extentLogger.info("11. verify that the \"Utility.xlsx\" on the Input Line");
        extentLogger.info("Expected  Result: \"Utility.xlsx\" displayed on the Input Line");
        Assert.assertEquals(pages.importPage().loadFileInputLine.getAttribute("value"), IMPORTED_FILE_UTILITY);

    }
}
