package com.BriteErp.tests.SearchFunctionality.Albert.smoke_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_255 extends TestBase {


    /**
     * http://jira.cybertekschool.com/browse/BRIT-255
     * -Verify that User can save selected Advanced Searches by accessing the 'Favorites' drop down.
     * <p>
     * <p>
     * <p>
     * STEPS:
     * Step One: User should click on the Calendar tab in the header, on the left side of the screen.
     * <p>
     * Step Two: User should click on the Magnifying Glass icon in the Search Bar, on the far right side.
     * <p>
     * Step Seven: User should click on the Advanced Search icon titled 'Favorites
     * <p>
     * Step Eight: User should select 'Save current search' from the 'Favorites' drop down menu.
     * <p>
     * Step Nine: User should enter a name for the given Advanced Search settings.
     * <p>
     * Step Ten: If desired, User can choose to make the current search parameters their Default search, and/or Share the Search with all users.
     * <p>
     * Step Eleven: User should click on the 'Save' button.
     * <p>
     * EXPECTED RESULTS:
     * Step Two: The user should see the icon in the Magnifying Glass change from a plus-sign ('+') to a minus-sign ('-'), also, three new icons should be revealed below the Search Bar, 'Filters', 'Group By', and 'Favorites'
     * <p>
     * Step Seven: User's click should reveal a drop down menu extending from the 'Favorites' icon.
     * <p>
     * Step Eight: User should observe new options extending from 'Save current search' ; a text box in which to type the desired name for the current search, a check box labeled 'Use by default' , and a final check box labeled 'Share with all users.'
     * <p>
     * Step Nine: User should observe the title, as input to label current search.
     * <p>
     * Step Ten(optional): User can choose to check either box, though both options are not allowed to be selected, together.
     * <p>
     * Step Eleven: User will see the name of their search  at the top of the 'Favorites' drop down menu, in bold script with a check-mark to its left. Also a tag bearing the name of the search will be present in the left side of the Search Bar.
     **/

    @Test
    public void AdvancedSearchQueries_Favorites_SaveCurrentSearch() {
        extentLogger = report.createTest("Advanced Search Queries : Favorites : Save Current Search");
        driver.manage().window().maximize();

        extentLogger.info("Step One: Pre-Condition Environment is up and running.");

        extentLogger.info("Step Two: Go to URL.");
        extentLogger.info("Expected Result: Home page is displayed");
        extentLogger.info("Verifying landing page title");
        driver.get(ConfigurationReader.getProperties("url"));
        Assert.assertEquals(Driver.getDriver().getTitle(), LANDING_PAGE_TITLE);

        extentLogger.info("Step Three: Select 'BriteErpDemo' from given database options.");
        extentLogger.info("Expected Results: User should be directed to Login page.");
        pages.landing().BriteErpDemo_button.click();
        extentLogger.info("Verifying login page title");
        Assert.assertEquals(Driver.getDriver().getTitle(), LOGIN_PAGE_TITLE);

        extentLogger.info("Step Four: input valid user credentials");
        extentLogger.info("Expected Result: user should be directed to the 'Inbox' page of the application. ");
        pages.login().userLogin();
        extentLogger.info("Verifying login successful");
        waitUntilTitleEquals(10, DISCUSS_PAGE_TITLE);
        Assert.assertEquals(Driver.getDriver().getTitle(), DISCUSS_PAGE_TITLE);

        extentLogger.info("Step Five: Click on the Calendar tab in the header, on the left side of the screen.");
        extentLogger.info("Expected Result: User should be directed to main Calendar page.");
        pages.topNavigationBar().calendar_button.click();
        waitUntilTitleEquals(10, CALENDAR_PAGE_TITLE);
        Assert.assertEquals(driver.getTitle(), CALENDAR_PAGE_TITLE);

        extentLogger.info("Step Six: Click on the Magnifying Glass icon in the Search Bar, on the far right side.");
        extentLogger.info("Expected Results: user should see the icon in the Magnifying Glass change from a plus-sign ('+') to a minus-sign ('-'), also, three new icons should be revealed below the Search Bar, 'Filters', 'Group By', and 'Favorites");
        pages.searchPage().MgniffierIcone.click();

        extentLogger.info("Step Seven: Click on the Advanced Search icon titled 'Favorites.");
        extentLogger.info("Expected Results: User's click should reveal a drop down menu extending from the 'Favorites' icon.");
        pages.searchPage().ClickOnFavoritesDropDown.click();

        extentLogger.info("Step Eight: Select 'Save current search' from the 'Favorites' drop down menu.");
        extentLogger.info("Expected Results: User should observe new options extending from 'Save current search' ; a text box in which to type the desired name for the current search, a check box labeled 'Use by default' , and a final check box labeled 'Share with all users.");
        pages.searchPage().clickOnSaveCurrentSearch.click();

        extentLogger.info("Step Nine: Enter a name for the given Advanced Search settings.");
        extentLogger.info("Expected Results: User should observe the input given to label current search, as title.");
        pages.searchPage().SendTextOnSaveCurrentSearchBox.sendKeys(pages.searchPage().CustomSearchName());

        extentLogger.info("Step Ten: If desired, User can choose to make the current search parameters their Default search, and/or Share the Search with all users.");
        extentLogger.info("Expected Results: (optional): User can choose to check either box, though both options are not allowed to be selected, together.");

        extentLogger.info("Step Eleven: User should click on the 'Save' button.");
        extentLogger.info("Expected Results: User will see the name of their search  at the top of the 'Favorites' drop down menu, in bold script with a check-mark to its left. Also a tag bearing the name of the search will be present in the left side of the Search Bar.");
        pages.searchPage().CustomSavedSearch_SavedButton.click();
        Assert.assertTrue(pages.searchPage().CustomSavedSearch_button.isDisplayed());


    }
}
