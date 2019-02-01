package com.BriteErp.tests.SearchFunctionality.Merry.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BRIT_529_SaveFavorites extends TestBase {

    @Test
    public void TestCase_529() {

        extentLogger = report.createTest("User Should be able to save Default Current Search as favorite");
        extentLogger.info("Opening the website");
        pages.login().open();

        extentLogger.info("Clicking into Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("sending user Credentials");
        pages.login().userLogin();

        extentLogger.info("Clicking into Calander Module");
        waitForPageToLoad(5);
        pages.searchPage().CalanderModule.click();

        wait(5);
        extentLogger.info("Clicking onto Magnifier Icone");
        pages.searchPage().MgniffierIcone.click();

        extentLogger.info("Clicking on Favorites Button");
        pages.searchPage().ClickOnFavoritesDropDown.click();

        extentLogger.info("Clicking to save the current search ");
        pages.searchPage().clickOnSaveCurrentSearch.click();



        extentLogger.info("Sending Text On Save Current Search Box ");
        pages.searchPage().SendTextOnSaveCurrentSearchBox.sendKeys("Heloo");

        extentLogger.info("Clicking to save the text under save current search");
        pages.searchPage().SaveButtonOnFavorites.click();

    }
}