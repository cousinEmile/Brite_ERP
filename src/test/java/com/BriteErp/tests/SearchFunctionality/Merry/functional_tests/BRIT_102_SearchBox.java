package com.BriteErp.tests.SearchFunctionality.Merry.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_102_SearchBox extends TestBase {
    @Test
    public void TestCase_102(){

        extentLogger = report.createTest("User should be able to input text into the search box and receive results");
        extentLogger.info("Opening the website");
        pages.login().open();

        extentLogger.info("Clicking into Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("Login into the home page");
        pages.login().userLogin();

        extentLogger.info("Clicking ito Calander Module");
        waitForPageToLoad(10);
        pages.searchPage().CalanderModule.click();

        extentLogger.info("Sending text to search box");
        pages.searchPage().SearchBox.sendKeys("Availabilty" +Keys.ENTER);

        extentLogger.info("Verifying that customer could text and recive results related to his search");
        Assert.assertEquals(pages.searchPage().FilterSearchTextConfirmation.getText(),"Availabilty");
        extentLogger.info("Customer could recive relavant results for his search!!!Test Passed");


    }
}
