package com.BriteErp.pages;

import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportPage {

    public ImportPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement LoadFile;
}