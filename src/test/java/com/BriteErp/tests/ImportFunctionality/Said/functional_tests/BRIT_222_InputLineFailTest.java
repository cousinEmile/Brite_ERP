package com.BriteErp.tests.ImportFunctionality.Said.functional_tests;

import com.BriteErp.utilities.TestBase;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class BRIT_222_InputLineFailTest extends TestBase {

    @Test
    public void BRIT_222(){
    extentLogger = report.createTest("BRIT_222_Input Line Fail Test");

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

    extentLogger.info("8. verify that near to Load File button there is sign \"No file chosen...\" by default");
    extentLogger.info("Expected  Result: The sign \"No file chosen...\" should be seen");
    Assert.assertEquals(pages.importPage().loadFileInputLine.getAttribute("placeholder"), LOAD_FILE_INPUT_LINE);

    extentLogger.info("9. type \"C:\\Users\\saidy\\IdeaProjects\\Brite_ERP\\uploaded_files\\utility.xlsx\" to a Input line near Load File");
    extentLogger.info("Expected  Result: the \"Utility.xlsx\" should be seen on Input Line near to Load File");
    pages.importPage().loadFileInputLine.sendKeys( UPLOADED_FILE_UTILITY_SAID + Keys.ENTER);
    Assert.assertEquals(pages.importPage().loadFileInputLine.getAttribute("value"), EXPECTED_FILE_UTILITY_SAID);

    extentLogger.info("10. verify that\"C:\\Users\\saidy\\IdeaProjects\\Brite_ERP\\uploaded_files\\utility.xlsx\" file uploaded after typing  ");
    extentLogger.info("Expected  Result: the file does not uploaded. Fail");
    Assert.assertNotEquals(pages.importPage().loadFileInputLine.getAttribute("value"), UPLOADED_FILE_UTILITY_SAID);

    extentLogger.pass("BRIT_222_Input Line Fail Test FAIL");

    }
}
