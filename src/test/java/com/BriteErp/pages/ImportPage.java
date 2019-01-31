package com.BriteErp.pages;

import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportPage {

    public ImportPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@class='btn btn-primary']/input")
    public WebElement loadFile;

    @FindBy(id = "oe_import_has_header")
    public WebElement theFirstRowLabel;

    @FindBy(id = "oe_import_advanced_mode")
    public WebElement showFields;



}