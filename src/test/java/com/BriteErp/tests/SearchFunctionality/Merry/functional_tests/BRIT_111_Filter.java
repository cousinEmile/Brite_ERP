package com.BriteErp.tests.SearchFunctionality.Merry.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class BRIT_111_Filter extends TestBase {



    @Test
    public void TestCase_111(){
        extentLogger = report.createTest("User should be able to filter search's by adding custom filter");
        extentLogger.info("Opening the website");
        waitForPageToLoad(5);
        pages.login().open();

        extentLogger.info("Clicking into Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("Login into the home page");
        pages.login().userLogin();

        extentLogger.info("Clicking ito Calander Module");
        waitForPageToLoad(10);
        pages.searchPage().CalanderModule.click();

        extentLogger.info("Clicking onto Magnifier Icone");
        pages.searchPage().MgniffierIcone.click();

        extentLogger.info("Clicking on Filter drop down button");
        pages.searchPage().FilterDropDown.click();

        extentLogger.info("Clicking on Add Custom Filter Button");
        pages.searchPage().AddCustomFilter.click();

        extentLogger.info("select any  from the list in the Actions needed");
        Random random=new Random();
        int k=random.nextInt(20);
        pages.searchPage().Select_List(k);

        extentLogger.info("save the selected one by clicking Apply");
        pages.searchPage().ApplyButton.click();

        Assert.assertTrue(pages.searchPage().FilterIsSelected.isDisplayed());
        extentLogger.info("Customer can search what ever he wants!!!!Test Case Passed");


    }





}
