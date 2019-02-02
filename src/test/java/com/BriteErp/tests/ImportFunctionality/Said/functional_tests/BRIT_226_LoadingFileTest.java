package com.BriteErp.tests.ImportFunctionality.Said.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_226_LoadingFileTest extends TestBase {


    @Test
    public void BRIT_226(){
        extentLogger = report.createTest("BRIT_222_Loading File Test");

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

        extentLogger.info("8. click Load File Button and input \"C:\\Users\\saidy\\Downloads\\Utility.xlsx\"");
        extentLogger.info("Expected  Result: Load file should open C:\\Users\\saidy\\Downloads\\Utility.xlsx file");
        extentLogger.info("9. click Open to import all information");
        extentLogger.info("Expected  Result: all information on the Excel file should be dispayed under search File");

        String path = "C:\\Users\\saidy\\Downloads\\Utility.xlsx";
        pages.importPage().loadFile.sendKeys(path);

        extentLogger.info("10. verify that \"Utility.xlsx\" displayed on the Input Line");
        extentLogger.info("Expected  Result: \"Utility.xlsx\" is displayed on the Input Line");
        Assert.assertEquals(pages.importPage().loadFileInputLine.getAttribute("value"), "Utility.xlsx");
        wait(2);

        extentLogger.info("11. Verify \"Map your columns to import\" message");
        extentLogger.info("Expected  Result: \"Map your columns to import\" should be displayed");
        Assert.assertEquals(MAP_YOUR_COULMS_TO_IMPORT, pages.importPage().mapYourColumnsToImport.getText());


        extentLogger.pass("BRIT_222_Loading File Test PASS");
    }
}
