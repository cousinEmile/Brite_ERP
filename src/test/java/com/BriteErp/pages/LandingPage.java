package com.BriteErp.pages;

import com.BriteErp.identifiers.LandingPageIdentifier;
import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = LandingPageIdentifier.LandingBriteERPDemo_ButtonXpath )      //.click()
    public WebElement BriteErpDemo_button;



}
