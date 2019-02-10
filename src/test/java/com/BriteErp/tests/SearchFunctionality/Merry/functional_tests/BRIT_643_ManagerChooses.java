package com.BriteErp.tests.SearchFunctionality.Merry.functional_tests;

import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT_643_ManagerChooses extends TestBase {


    @Test
    public void ManagerChoosesUnderGroupBy(){
        extentLogger = report.createTest("User should made only one choose under Group By button for one filter criteria ");
        extentLogger.info("Opening the website");
        pages.login().open();

        extentLogger.info("Clicking into Demo");
        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("sending user Credentials");
        pages.login().userLogin();

        extentLogger.info("Clicking into Calander Module");
        waitForPageToLoad(5);
        pages.searchPage().CalanderModule.click();

        extentLogger.info("Clicking onto Magnifier Icone");
       waitForClickablility( pages.searchPage().MgniffierIcone,5).click();

        wait(5);
        extentLogger.info("clicking into Group By Button");
        pages.searchPage().ClickOnGroupByDropDown.click();

        extentLogger.info("Click on add custom drop down Group");
        pages.searchPage().AddCustomDropDownGroup.click();

        extentLogger.info("clicking the drop down ");
        pages.searchPage().DropDownListUnderGroupBy.click();

        extentLogger.info("selecting from the drop down menu");
        Select list=new Select(pages.searchPage().DropDownListUnderGroupBy1);
        list.selectByIndex(4);
        pages.searchPage().SaveButton.click();

        extentLogger.info("Click on add custom drop down Group");
        pages.searchPage().AddCustomDropDownGroup.click();
        waitForClickablility( pages.searchPage().DropDownListUnderGroupBy1,5).click();
        list.selectByIndex(4);

        extentLogger.info("save the selected list");
        pages.searchPage().SaveButton.click();

        extentLogger.info("Click on add custom drop down Group");
        pages.searchPage().AddCustomDropDownGroup.click();
        waitForClickablility( pages.searchPage().DropDownListUnderGroupBy1,5).click();
        list.selectByIndex(4);

        extentLogger.info("Click on add custom drop down Group");
        pages.searchPage().SaveButton.click();

        extentLogger.info("Test Fail becuase i can choose for one element  three times");


    }
}
