package com.BriteErp.tests.SearchFunctionality.Merry.functional_tests;


import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;



public class BRIT_607_ShareFavoriteSearch extends TestBase {



    @Test
    public void BRIT_607_ShareFavoriteSearch(){
        extentLogger = report.createTest("User Should be able to save Default Current Search as favorite");
        extentLogger.info("Opening the website");
        pages.login().open();

        extentLogger.info("Clicking into Demo");
        pages.landing().BriteErpDemo_button.click();
        waitForPageToLoad(5);
        extentLogger.info("sending user Credentials");
        pages.login().userLogin();

        extentLogger.info("Clicking into Calander Module");
        waitForPageToLoad(5);
        pages.searchPage().CalanderModule.click();


        extentLogger.info("Clicking onto Magnifier Icone");
        pages.searchPage().MgniffierIcone.click();


        extentLogger.info("Clicking on Favorites Button");
       waitForClickablility( pages.searchPage().ClickOnFavoritesDropDown,5).click();

        extentLogger.info("Clicking to save the current search ");
        pages.searchPage().clickOnSaveCurrentSearch.click();

        pages.searchPage().SendTextOnSaveCurrentSearchBox.clear();

        waitForPageToLoad(10);
        extentLogger.info("Sending Text On Save Current Search Box ");
        pages.searchPage().SendTextOnSaveCurrentSearchBox.sendKeys("Heloo");

       waitForClickablility( pages.searchPage().clickShareWithAllUsersCheckBox,5).click();

        extentLogger.info("Clicking to save the text under save current search");
        pages.searchPage().SaveButtonOnFavorites.click();

        Assert.assertTrue(pages.searchPage().getTextConfirmationOnFavoriteButton.isDisplayed());
        extentLogger.info("Customer can save any search!!!!!Test Case Passed");

    }


}
