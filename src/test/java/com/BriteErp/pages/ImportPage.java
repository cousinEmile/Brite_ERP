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

    @FindBy(xpath = "//span[@class='input-group-btn']/button")
    public WebElement reloadFile;

    @FindBy(xpath = "(//input[@checked = 'checked'])[2]")
    public WebElement theFirstRowLabel;

    @FindBy(id = "oe_import_advanced_mode")
    public WebElement showFields;

    @FindBy(xpath = "//input[@class='oe_import_file_show form-control']")
    public WebElement loadFileInputLine;

    @FindBy(xpath = "//div[@class='oe_import_with_file oe_padding col-sm-12']/h2")
    public WebElement mapYourColumnsToImport;

    @FindBy(xpath = "//div[@id='s2id_autogen5']/a")
    public WebElement dontImportField;

    @FindBy(xpath = "(//div[@class='select2-search'])[5]/input")
    public WebElement search;

    @FindBy(xpath = "(//a[@class='select2-choice'])[5]/abbr")
    public WebElement xButton;

    @FindBy(xpath = "//label[@for='encoding_export233']")
    public WebElement encoding;

    @FindBy(xpath = "(//a[@class='select2-choice'])[1]")
    public WebElement encodingField;

    @FindBy(xpath = "//label[@for='separator_export233']")
    public WebElement separator;

    @FindBy(xpath = "(//a[@class='select2-choice'])[2]")
    public WebElement separatorField;

    @FindBy(xpath = "//tr[@class='oe_import_grid-header']")
    public WebElement fileNameTopDontImport;

    @FindBy(xpath = "//label[@for='float_thousand_separator_export233']")
    public WebElement thousandsSeparator;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[3]")
    public WebElement thousandsSeparatorField;

    @FindBy(xpath = "(//div[@class='o_cp_buttons']/button)[1]")
    public WebElement testImportButton;

    @FindBy(xpath = "(//div[@class='o_cp_buttons']/button)[2]")
    public WebElement importButton;

    @FindBy(xpath = "(//div[@class='o_cp_buttons']/button)[3]")
    public WebElement cancelButton;

    @FindBy(xpath = "(//div[@class='oe_import_error_report'])/ul/li/span")
    public WebElement youMustConfigureAtLeastOneFieldToImportErrorMessage;

}