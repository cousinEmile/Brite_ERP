package com.BriteErp.tests.ImportFunctionality.Aiman.functional_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_314 extends TestBase {
    @Test
    public void Separator() {
        extentLogger = report.createTest("Separator");
        driver.manage().window().maximize();

        extentLogger.info("1.Go to the URL");
        driver.get(ConfigurationReader.getProperties("url"));

        extentLogger.info("2.Click on BriteErpDemo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("3.Enter email and password for Inventory User 4 and click Log in");
        pages.login().userLogin();

        waitForPageToLoad(3);
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

        extentLogger.info("8. Verify 'Separator' is displayed");
        String separator = pages.importPage().separator.getText();
        Assert.assertTrue(separator.contains("Separator"));

        extentLogger.info("9. Select 'Comma' on the selective panel");
        pages.importPage().separatorField.click();
        WebElement search = pages.importPage().search;
        search.sendKeys("Comma" + Keys.ENTER);

        extentLogger.pass("Separator");


    }
}
