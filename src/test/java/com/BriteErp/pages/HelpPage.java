package com.BriteErp.pages;

import com.BriteErp.identifiers.HelpPageIdentifier;
import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {
    public HelpPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = HelpPageIdentifier.HelpHowToImportDataToOdoMessageXpath )
    public WebElement howToImportDataToOdoMessage;


}
