package com.BriteErp.tests.ImportFunctionality.Said.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_248_ErrorMessageTest extends TestBase {

    @Test
    public void BRIT_248 (){
        extentLogger = report.createTest("BRIT_248_Error Message Test");


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
        Assert.assertEquals(pages.importPage().loadFileInputLine.getAttribute("value"), "Utility.xlsx");

        extentLogger.info("9. click  \"The first row contains the label of the column\"");
        extentLogger.info("Expected  Result: clicked");
        pages.importPage().theFirstRowLabel.click();

        extentLogger.info("10. verify pop-up window with \"Odoo Client Error\" error message");
        extentLogger.info("Expected  Result: \"Odoo Client Error\" error message window pop-uped");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");

        extentLogger.info("");
        extentLogger.info("Expected  Result:");




        pages.importPage().errorMessageOkButton.click();



    }

}
