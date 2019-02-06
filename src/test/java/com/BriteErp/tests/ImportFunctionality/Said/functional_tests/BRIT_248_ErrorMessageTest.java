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
        Assert.assertEquals(pages.importPage().errorMessageOddo.getText(),ODOO_CLIENT_ERROR);

        extentLogger.info("11. verify error message \"Please use the copy button to report the error to your support service.\" in pop-up window");
        extentLogger.info("Expected  Result: error message \"Please use the copy button to report the error to your support service.\" is displayed in pop-up window");
        Assert.assertEquals(pages.importPage().pleasuUseCopyButtonMessage.getText(),PLEASE_USE_COPY_BUTTON_TO_REPORT_MESSAGE );

        extentLogger.info("12. verify \"Copy the full error to clipboard\" button");
        extentLogger.info("Expected  Result: \"Copy the full error to clipboard\" button is displayed");
        Assert.assertEquals(pages.importPage().copyTheFullErrorToClipboardButton.getText(),COPY_THE_FULL_ERROR_TO_CLIPBOARD_BUTTON);

        extentLogger.info("13. click \"Copy the full error to clipboard\" ");
        extentLogger.info("Expected  Result: \"Copy the full error to clipboard\" button clicked");
        pages.importPage().copyTheFullErrorToClipboardButton.click();

        extentLogger.info("14. verify \"see details\" button");
        extentLogger.info("Expected  Result: \"see details\" button is displayed");
        Assert.assertEquals(pages.importPage().seeDetailsButton.getText(),SEE_DETAILS_BUTTON);

        extentLogger.info("15. click \"see details\" button ");
        extentLogger.info("Expected  Result: \"see details\" button clicked");
        pages.importPage().seeDetailsButton.click();

        extentLogger.info("16. verify \"Uncaught event settings_changed inappropriate in current state previewing\n\" message");
        extentLogger.info("Expected  Result: \"Uncaught event settings_changed inappropriate in current state previewing\ng\" message is displayed");
        Assert.assertEquals(pages.importPage().uncaughtEventSettingsChanged.getText(), UNCAUGHT_EVENT_SETTINGS_CHANGED_MESSAGE);

        extentLogger.info("17. verify \"Ok\" button");
        extentLogger.info("Expected  Result: \"Ok\" button is displayed");
        Assert.assertEquals(pages.importPage().errorMessageOkButton.getText(),OK_BUTTON);

        wait(2);
        extentLogger.info("18. Click \"Ok\" button ");
        extentLogger.info("Expected  Result: \"Ok\" button clicked");
        pages.importPage().errorMessageOkButton.click();

        extentLogger.info("19. Verify User in import page URL http://52.39.162.23/web?#model=calendar.event&action=import");
        extentLogger.info("Expected  Result: User in Import Page URL http://52.39.162.23/web?#model=calendar.event&action=import");
        Assert.assertEquals(driver.getCurrentUrl(),IMPORT_URL);


    }

}
