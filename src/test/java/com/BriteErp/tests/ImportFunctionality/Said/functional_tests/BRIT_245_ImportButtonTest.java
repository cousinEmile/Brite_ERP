package com.BriteErp.tests.ImportFunctionality.Said.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class BRIT_245_ImportButtonTest extends TestBase {
//said
    @Test
    public void BRIT_245() {

        extentLogger = report.createTest("BRIT_245_Import Button Test");

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

        wait(2);
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
        Assert.assertEquals(pages.importPage().loadFileInputLine.getAttribute("value"), "Utility.xlsx");

        extentLogger.info("9. verify that \"Import\" on the left top corner side under Meetings / Import a File");
        extentLogger.info("Expected  Result: Import page is displayed");
        Assert.assertEquals(pages.importPage().importButton.getText(),IMPORT_BUTTON);

        extentLogger.info("10. click \"Import\" ");
        extentLogger.info("Expected  Result: Import Clicked and not pass");
        wait(2);
        pages.importPage().importButton.click();

        extentLogger.info("11. verify error message \"You must configure at least one field to import\"");
        extentLogger.info("Expected  Result: error message \"You must configure at least one field to import\" is displayed");
        wait(2);
        Assert.assertEquals(pages.importPage().youMustConfigureAtLeastOneFieldToImportErrorMessage.getText(),YOU_MUST_CONFIGURE_FIELD_TO_IMPORT_MESSAGE);

        extentLogger.pass("BRIT_245_Import Button Test PASS");
    }

}
