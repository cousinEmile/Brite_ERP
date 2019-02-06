package com.BriteErp.pages;

import com.BriteErp.identifiers.ImportPageIdentifier;
import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportPage {

    public ImportPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = ImportPageIdentifier.ImportLoadFileXpath )
    public WebElement loadFile;

    @FindBy(xpath = ImportPageIdentifier.ImportReloadFileXpath)
    public WebElement reloadFile;

    @FindBy(xpath = ImportPageIdentifier.ImportTheFirstRowLabelXpath)
    public WebElement theFirstRowLabel;

    @FindBy(id = ImportPageIdentifier.ImportShowFieldsID)
    public WebElement showFields;

    @FindBy(xpath = ImportPageIdentifier.ImportLoadFileImputLineXpath)
    public WebElement loadFileInputLine;

    @FindBy(xpath = ImportPageIdentifier.ImportMapYourColumnsToImportXpath)
    public WebElement mapYourColumnsToImport;

    @FindBy(xpath = ImportPageIdentifier.ImportDontImportFieldXpath)
    public WebElement dontImportField;

    @FindBy(xpath = ImportPageIdentifier.ImportSearchXpath)
    public WebElement search;

    @FindBy(xpath = ImportPageIdentifier.ImportXBUTTONXpath)
    public WebElement xButton;

    @FindBy(xpath = ImportPageIdentifier.ImportEncodingXpath)
    public WebElement encoding;

    @FindBy(xpath = ImportPageIdentifier.ImportEncodingFieldXpath)
    public WebElement encodingField;

    @FindBy(xpath = ImportPageIdentifier.ImportSeperatorXpath)
    public WebElement separator;

    @FindBy(xpath = ImportPageIdentifier.ImportSeperatorFieldXpath)
    public WebElement separatorField;

    @FindBy(xpath = ImportPageIdentifier.ImportFileNameTopDontImportXpath)
    public WebElement fileNameTopDontImport;

    @FindBy(xpath = ImportPageIdentifier.ImportThousandsSeperatorXpath)
    public WebElement thousandsSeparator;

    @FindBy(xpath = ImportPageIdentifier.ImportThousandsSeperatorsFieldXpath)
    public WebElement thousandsSeparatorField;

    @FindBy(xpath = ImportPageIdentifier.ImportTestImportButtonXpath)
    public WebElement testImportButton;

    @FindBy(xpath = ImportPageIdentifier.ImportImportButtonXpath)
    public WebElement importButton;

    @FindBy(xpath = ImportPageIdentifier.ImportCancelButtonXpath)
    public WebElement cancelButton;

    @FindBy(xpath = ImportPageIdentifier.ImportYouMustConfigureAtLeastOneFieldToImportErrorMessageXpath)
    public WebElement youMustConfigureAtLeastOneFieldToImportErrorMessage;

    @FindBy(xpath = ImportPageIdentifier.ImportErrorMessageOddoXpath)
    public WebElement errorMessageOddo;

    @FindBy(xpath = ImportPageIdentifier.ImportErrorMessageOKButtonXpath)
    public WebElement errorMessageOkButton;

    @FindBy(xpath = ImportPageIdentifier.ImportPleaseUseCopyButtonMessageXpath)
    public WebElement pleasuUseCopyButtonMessage;

    @FindBy(xpath = ImportPageIdentifier.ImportCopyTheFullErrorToClipboardButtonXpath)
    public WebElement copyTheFullErrorToClipboardButton;

    @FindBy(xpath = ImportPageIdentifier.ImportSeeDetailsButtonXpath)
    public WebElement seeDetailsButton;

    @FindBy(css = ImportPageIdentifier.ImportUncaughtEventSettingsChangedCSS)
    public WebElement uncaughtEventSettingsChanged;

  //  (//div[@class='modal-content']/div)[2]/div/pre[1]




}