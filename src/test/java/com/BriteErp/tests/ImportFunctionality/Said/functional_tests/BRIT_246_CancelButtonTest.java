package com.BriteErp.tests.ImportFunctionality.Said.functional_tests;

import com.BriteErp.utilities.BrowserUtils;
import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class BRIT_246_CancelButtonTest extends TestBase {

    @Test
    public void BRIT_246() {

        extentLogger = report.createTest("BRIT_246_Import Button Test");

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

        extentLogger.info("9. verify that \"Cancel\" on the left top corner side under Meetings / Import a File");
        extentLogger.info("Expected  Result: Cancel is displayed");
        Assert.assertEquals(pages.importPage().cancelButton.getText(),CANCEL_BUTTON);

        extentLogger.info("10. click \"Cancel\" ");
        extentLogger.info("Expected  Result: Cancel Clicked ");
        pages.importPage().cancelButton.click();

        extentLogger.info("11. verify that user sent back to the List page");
        extentLogger.info("Expected  Result: The user in the List page");
        wait(2);
        Assert.assertEquals(driver.getCurrentUrl(),LIST_URL);

        extentLogger.pass("BRIT_246_Import Button Test PASS");
    }
}