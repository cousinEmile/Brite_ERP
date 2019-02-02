package com.BriteErp.tests.SearchFunctionality.Merry.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.testng.annotations.Test;

public class BRIT_534_AddToDashBordFvaorite  extends TestBase {


    @Test
    public void TestCase_534() {

        extentLogger = report.createTest("User Should be able to Add to DashBoard from his favorite search" );
        extentLogger.info("Opening the website");
        pages.login().open();

        extentLogger.info("Clicking into Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("sending user Credentials");
        pages.login().userLogin();
        wait(5);
        extentLogger.info("Clicking into Calander Module");
        waitForPageToLoad(5);
        pages.searchPage().CalanderModule.click();

        wait(5);
        extentLogger.info("Clicking onto Magnifier Icone");
        pages.searchPage().MgniffierIcone.click();

        extentLogger.info("Clicking on Favorites Button");
        pages.searchPage().ClickOnFavoritesDropDown.click();

        extentLogger.info("Clicking to Add Dash board button");
        pages.searchPage().ClickToDashBoradIcone.click();

        extentLogger.info("Clearing the default text which is in the Add Dash board box");
        pages.searchPage().sendTextToSaveToDashBorad.clear();

        extentLogger.info("Sending text that user wants to add in to his dash borad");
        pages.searchPage().sendTextToSaveToDashBorad.sendKeys("meetings");

        extentLogger.info("Clicking on Add Icone to save the Favorite to Dash Board");
        pages.searchPage().AddButtonUnderADDToMyDash.click();

    }
}