package com.BriteErp.tests.ImportFunctionality.Aiman.functional_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_235 extends TestBase {
    @Test
    public void ShowFieldsOfRelationFields() {
        extentLogger = report.createTest("Map your columns to import");
        driver.manage().window().maximize();

        extentLogger.info("1.Go to the URL");
        driver.get(ConfigurationReader.getProperties("url"));

        extentLogger.info("2.Click on BriteErpDemo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("3.Enter email and password for Inventory User 4 and click Log in");
        pages.login().userLogin();
        waitForPageToLoad(2);

        extentLogger.info("4.Click on Calendar tab on the top");
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("5.Click on List button on the right, at the top of the mini-Calendar");
        pages.calendar().listView.click();

        extentLogger.info("6.Click on Import icon");
        pages.calendarListViewPage().import_button.click();

        extentLogger.info("7.Click on Load File and select a CSV or Excel file to import");
        WebElement chooseFile = pages.importPage().loadFile;
        String file = "/Users/aimangainedenova/Downloads/Utility.xlsx";
        chooseFile.sendKeys(file);

        wait(2);
        extentLogger.info("8. Verify Checkbox 'Show fields of relation fields (advanced)' is selected by default");
        Assert.assertTrue(pages.importPage().showFields.isSelected());

        extentLogger.info("9. Click on Checkbox 'Show fields of relation fields (advanced)' ");
        pages.importPage().showFields.click();

    }
}