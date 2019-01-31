package com.BriteErp.tests.ImportFunctionality.Aiman.functional_tests;
import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MapYourColumnsToImport extends TestBase {

    @Test
    public void MapYourColumnsToImport() {
        extentLogger = report.createTest("Map your columns to import");
        driver.manage().window().maximize();

        extentLogger.info("1.Go to the URL");
        driver.get(ConfigurationReader.getProperties("url"));

        extentLogger.info("2.Click on BriteErpDemo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("3.Enter email and password for Inventory User 4 and click Log in");
        pages.login().userLogin();

        extentLogger.info("4.Click on Calendar tab on the top");
        pages.topNavigationBar().calendar_button.click();
        wait(2);

        extentLogger.info("5.Click on List button on the right, at the top of the mini-Calendar");
        pages.calendar().listView.click();

        extentLogger.info("6.Click on Import icon");
        pages.calendarListViewPage().import_button.click();

        extentLogger.info("7.Click on Load File and select a CSV or Excel file to import");

        WebElement chooseFile = pages.importPage().loadFile;
        String file = "/Users/aimangainedenova/Downloads/Utility.xlsx";
        chooseFile.sendKeys(file);



        //extentLogger.info("8. Click on The first row contains the label of the column");


    }
}
