package com.BriteErp.tests.CreateEventFunctionality.Tremaine.functional_tests;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.TestBase;
import org.testng.annotations.Test;

public class BRIT_323 extends TestBase {

    @Test
    public void BRIT_323_test(){
    extentLogger = report.createTest("User can edit events BRIT_323 test");
    waitForPageToLoad(2);

    extentLogger.info("1.Precondition: Environment is ready.");
    driver.get(ConfigurationReader.getProperties("url"));
    driver.manage().window().maximize();
}
}
