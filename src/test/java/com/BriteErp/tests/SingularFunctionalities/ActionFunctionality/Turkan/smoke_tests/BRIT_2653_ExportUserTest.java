package com.BriteErp.tests.SingularFunctionalities.ActionFunctionality.Turkan.smoke_tests;


import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_2653_ExportUserTest extends TestBase {

    @Test
    public void BRIT_2659(){
        extentLogger = report.createTest("BRIT_2659 Unarchive Test");

        extentLogger.info("preconditions");
        pages.login().open();
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("login to the application with valid credentials");
        extentLogger.info("Should be able to login.");
        pages.login().userLogin();

        extentLogger.info("click the calendar tab");
        extentLogger.info("should be able to see the calendar page");
        pages.topNavigationBar().calendar_button.click();

        extentLogger.info("click the list view");
        extentLogger.info("should be able to see the list");
        pages.calendarListViewPage().list.click();

        extentLogger.info("click the subject check box");
        extentLogger.info("all subjects should be selected");
        pages.calendarListViewPage().subjectCheckbox.click();

        extentLogger.info("select export from the actions drop down");
        extentLogger.info("The requested operation cannot be completed due to security restrictions");
        pages.calendarListViewPage().action.click();
        pages.calendarListViewPage().export.click();
        System.out.println(pages.calendarListViewPage().export.getText());
        Assert.assertTrue(pages.calendarListViewPage().warning.isDisplayed());
        pages.calendarListViewPage().close.click();





}



}
