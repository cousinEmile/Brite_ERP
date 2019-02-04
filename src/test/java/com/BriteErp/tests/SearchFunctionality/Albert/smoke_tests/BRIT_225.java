package com.BriteErp.tests.SearchFunctionality.Albert.smoke_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_225 extends TestBase {

    /** http://jira.cybertekschool.com/browse/BRIT-225
     -Verify that User is able to apply all, or few, or none of the specified filters together.





     STEPS:
     Step One: User should click on the Calendar tab in the header, on the left side of the screen.

     Step Two: User should click on the Magnifying Glass icon in the Search Bar, on the far right side.

     Step Three: User should click on the Advanced Search icon titled 'Filters.'

     Step Four: User should select 'My Events', 'My Meetings', and/or 'Unread Messages' from the Filters drop down menu.


     EXPECTED RESULTS:
     Step Two: The user should see the icon in the Magnifying Glass change from a plus-sign ('+') to a minus-sign ('-'), also, three new icons should be revealed below the Search Bar, 'Filters', 'Group By', and 'Favorites'

     Step Three: User's click should reveal a drop down menu extending from the 'Filters' icon.

     Step Four: User should observe a tag(s) in the Search Bar labeled for their respective, enabled Filter(s).
     **/

    @Test
    public void AdvancedSearchFilters_AllFilters(){
        extentLogger = report.createTest("Advanced Search Filter : MyEvents");
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

        extentLogger.info("Step Seven: Click on the Advanced Search icon titled 'Filters.");
        extentLogger.info("Expected Results: User's click should reveal a drop down menu extending from the 'Filters' icon.");
        pages.searchPage().filters_button.click();

        extentLogger.info("select 'UnreadMessages' from the Filters drop down menu.");
        extentLogger.info("Expected Results: User should observe a new tag in the Search Bar labeled 'UnreadMessages'. ");
        pages.searchPage().UnreadMessages_filter.click();

        extentLogger.info("select 'My Meetings' from the Filters drop down menu.");
        extentLogger.info("Expected Results: User should observe a new tag in the Search Bar labeled 'My Meetings'. ");
        pages.searchPage().MyMeetings_filter.click();

        extentLogger.info("select 'My Events' from the Filters drop down menu.");
        extentLogger.info("Expected Results: User should observe a new tag in the Search Bar labeled 'My Events'. ");
        pages.searchPage().MyEvents_filter.click();

        Assert.assertTrue(pages.searchPage().UnreadMessages_SearchBarIcon.getAttribute("innerText").trim().contains(UNREADMESSAGES_SEARCHBARICON_LABEL+" or "+MYMEETINGS_SEARCHBARICON_LABEL+" or "+MYEVENTS_SEARCHBARICON_LABEL));
        extentLogger.pass("BRIT_112_AdvancedSearchFilter_UnreadMessages Test PASS");
    }


     }
//  Assert.assertTrue(pages.searchPage().UnreadMessages_SearchBarIcon.isDisplayed());
//  Assert.assertEquals(pages.searchPage().UnreadMessages_Label_SearchBarIcon.getAttribute("innerText").trim(),UNREADMESSAGES_SEARCHBARICON_LABEL);
//  Assert.assertTrue(pages.searchPage().MyMeetings_SearchBarIcon.isDisplayed());
//  Assert.assertEquals(pages.searchPage().MyMeetings_Label_SearchBarIcon.getAttribute("innerText").trim(),MYMEETINGS_SEARCHBARICON_LABEL);
//   Assert.assertTrue(pages.searchPage().MyEvents_SearchBarIcon.isDisplayed());
//   Assert.assertEquals(pages.searchPage().MyEvents_Label_SearchBarIcon.getAttribute("innerText").trim(),MYEVENTS_SEARCHBARICON_LABEL);