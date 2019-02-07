package com.BriteErp.tests.ImportFunctionality.Said.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_240_TestImportButtonTest extends TestBase {

    @Test
    public void Brit_240(){

        extentLogger = report.createTest("BRIT_240_TestImport Button Test");

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

        extentLogger.info("9. verify that \"Test Import\" on the left top corner side under Meetings / Import a File");
        extentLogger.info("Expected  Result: Test Import is displayed");
        Assert.assertEquals(pages.importPage().testImportButton.getText(),TESTIMPORT_BUTTON);


        extentLogger.info("10. click \"Test import\" button");
        extentLogger.info("Expected  Result: Test import Clicked and not pass (Negative test)");
        wait(2);
        pages.importPage().testImportButton.click();

        extentLogger.info("11. verify error message \"You must configure at least one field to import\"");
        extentLogger.info("Expected  Result: error message \"You must configure at least one field to import\" is displayed");
        wait(2);
        Assert.assertEquals(pages.importPage().youMustConfigureAtLeastOneFieldToImportErrorMessage.getText(),YOU_MUST_CONFIGURE_FIELD_TO_IMPORT_MESSAGE);

        extentLogger.pass("BRIT_240_TestImport Button Test PASS");

    }

}
