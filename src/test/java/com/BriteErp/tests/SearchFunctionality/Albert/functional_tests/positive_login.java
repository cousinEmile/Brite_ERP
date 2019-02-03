package com.BriteErp.tests.SearchFunctionality.Albert.functional_tests;

import com.BriteErp.utilities.ConfigurationReader;
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
        driver.get(ConfigurationReader.getProperties("url"));
        extentLogger.info("Verifying landing page title");
        Assert.assertEquals(Driver.getDriver().getTitle(),LANDING_PAGE_TITLE);

        pages.landing().BriteErpDemo_button.click();

        extentLogger.info("Verifying login page title");
        Assert.assertEquals(Driver.getDriver().getTitle(), LOGIN_PAGE_TITLE);

        pages.login().managerLogin();

        extentLogger.info("Verifying login successful");
        waitUntilTitleEquals(10, DISCUSS_PAGE_TITLE);
        Assert.assertEquals(Driver.getDriver().getTitle(),DISCUSS_PAGE_TITLE);
    }

    @Test
    public void userLogin()throws Exception{
        extentLogger = report.createTest("Positive login test - User");
        driver.get(ConfigurationReader.getProperties("url"));
        extentLogger.info("Verifying landing page title");
        waitUntilTitleEquals(10, LANDING_PAGE_TITLE);
        Assert.assertEquals(Driver.getDriver().getTitle(),LANDING_PAGE_TITLE);
        pages.landing().BriteErpDemo_button.click();
        extentLogger.info("Verifying login page title");
        Assert.assertEquals(Driver.getDriver().getTitle(), LOGIN_PAGE_TITLE);
        pages.login().userLogin();
        extentLogger.info("Verifying login successful");
        waitUntilTitleEquals(10,DISCUSS_PAGE_TITLE);
        Assert.assertEquals(Driver.getDriver().getTitle(),DISCUSS_PAGE_TITLE);
    }

/*






 */


}
