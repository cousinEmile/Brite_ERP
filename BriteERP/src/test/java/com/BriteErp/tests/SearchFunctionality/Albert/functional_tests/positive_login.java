package com.BriteErp.tests.SearchFunctionality.Albert.functional_tests;

import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.BriteErp.utilities.ApplicationConstants.*;
import static com.BriteErp.utilities.BrowserUtils.waitForPageToLoad;
import static java.lang.Thread.*;

public class positive_login extends TestBase {

    @Test
    public void managerLogin(){
        extentLogger = report.createTest("Positive login test - User");
        extentLogger.info("Verifying landing page title");
        Assert.assertEquals(Driver.getDriver().getTitle(),LANDING_PAGE_TITLE);
        pages.landing().BriteErpDemo_button.click();
        extentLogger.info("Verifying login page title");
        Assert.assertEquals(Driver.getDriver().getTitle(), LOGIN_PAGE_TITLE);
        pages.login().managerLogin();
        extentLogger.info("Verifying login successful");
        try {                                               //Only shortTerm workAround. Need devise better solution
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(Driver.getDriver().getTitle(),DISCUSS_PAGE_TITLE);
    }

    @Test
    public void userLogin(){
        extentLogger = report.createTest("Positive login test - User");
        extentLogger.info("Verifying landing page title");
        Assert.assertEquals(Driver.getDriver().getTitle(),LANDING_PAGE_TITLE);
        pages.landing().BriteErpDemo_button.click();
        extentLogger.info("Verifying login page title");
        Assert.assertEquals(Driver.getDriver().getTitle(), LOGIN_PAGE_TITLE);
        pages.login().userLogin();
        extentLogger.info("Verifying login successful");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(Driver.getDriver().getTitle(),DISCUSS_PAGE_TITLE);


    }

/*






 */


}
