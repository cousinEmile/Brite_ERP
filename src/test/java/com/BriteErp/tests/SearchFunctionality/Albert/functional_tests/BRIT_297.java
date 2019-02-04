package com.BriteErp.tests.SearchFunctionality.Albert.functional_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_297 extends TestBase {

    /**
     http://jira.cybertekschool.com/browse/BRIT-297

     --Verify that users' search results are limited to the configuration of the calendar at the time of search.
     Verify that users' search results react dynamically to any reconfiguration of the calendar without user
     having to resubmit the search.

     STEPS:
     Step One: User should click on the Calendar tab in the header, on the left side of the screen.

     Step Six: User should click on the Magnifying Glass icon in the Search Bar, on the far right side.

     Step Seven: User should enter a relevant search parameter into the Search Bar.

     Step Eight: User should select the 'Day' view of the three selections on the top right of the Calendar.

     Step Nine: User should then proceed to select the 'Week' view by selecting the button of the same name immediately to the right of the 'Day'.

     Step Ten: User should then select the final Calendar configuration of the three by clicking the 'Month' button.


     EXPECTED RESULTS:
     Step Six: The user should see the icon in the Magnifying Glass change from a plus-sign ('+') to a minus-sign ('-'), also,
     three new icons should be revealed below the Search Bar, 'Filters', 'Group By', and 'Favorites'

     Step Seven: User should see their input reflected as a tab in the far left side of the Search Bar,
     with the term entered in bold type in the center and an 'x' on the right side.

     Step Eight: User's Calendar view, if it were not already so, should become that of a single detailed day,
     with any matching results appearing within their designated time blocks.

     Step Nine: User should be met upon the selection of 'Week' with an expanded Calendar view that includes not on the 'Day' they came from,
     but also the seven days following it. Also, in addition to the initial results of the previous step, there should now be any additional results for
     the newly revealed days, provided automatically with out User needing, or being prompted to, resubmit the terms of the search or refresh the page.

     Step Ten: With the transition to the full 'Month's View User should now be afforded all results that match their given parameters over the course
     of not only the Month in question, but also any days that spill over from the pre-, and proceeding Months.

    **/

    @Test
    public void AdvancedSearchResults_ViewDynamicResults(){
        extentLogger = report.createTest("Advanced Search Results : View Dynamic Results");
        driver.manage().window().maximize();

        extentLogger.info("Step One: Pre-Condition Environment is up and running.");

        extentLogger.info("Step Two: Go to URL.");
        extentLogger.info("Expected Result: Home page is displayed");
        extentLogger.info("Verifying landing page title");
        driver.get(ConfigurationReader.getProperties("url"));
        Assert.assertEquals(Driver.getDriver().getTitle(),LANDING_PAGE_TITLE);

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
        Assert.assertEquals(Driver.getDriver().getTitle(),DISCUSS_PAGE_TITLE);

        extentLogger.info("Step Five: Click on the Calendar tab in the header, on the left side of the screen.");
        extentLogger.info("Expected Result: User should be directed to main Calendar page.");
        pages.topNavigationBar().calendar_button.click();
        waitUntilTitleEquals(10, CALENDAR_PAGE_TITLE);
        Assert.assertEquals(driver.getTitle(), CALENDAR_PAGE_TITLE);

        extentLogger.info("Step Six: Click on the Magnifying Glass icon in the Search Bar, on the far right side.");
        extentLogger.info("Expected Results: user should see the icon in the Magnifying Glass change from a plus-sign ('+') to a minus-sign ('-'), also, three new icons should be revealed below the Search Bar, 'Filters', 'Group By', and 'Favorites");
        pages.searchPage().MgniffierIcone.click();

    }


}
