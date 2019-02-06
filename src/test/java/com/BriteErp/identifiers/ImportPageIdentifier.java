package com.BriteErp.identifiers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface ImportPageIdentifier {

    String ImportLoadFileXpath = "//label[@class='btn btn-primary']/input";
    String ImportReloadFileXpath = "//span[@class='input-group-btn']/button";
    String ImportTheFirstRowLabelXpath = "(//input[@checked = 'checked'])[2]";
    String ImportShowFieldsID = "oe_import_advanced_mode";
    String ImportUncaughtEventSettingsChangedCSS = "div#o_error_detail282>pre:first-of-type";
    String ImportLoadFileImputLineXpath = "//input[@class='oe_import_file_show form-control']";
    String ImportMapYourColumnsToImportXpath = "//div[@class='oe_import_with_file oe_padding col-sm-12']/h2";
    String ImportDontImportFieldXpath = "//div[@id='s2id_autogen5']/a";
    String ImportSearchXpath = "(//div[@class='select2-search'])[5]/input";
    String ImportXBUTTONXpath = "(//a[@class='select2-choice'])[5]/abbr";
    String ImportEncodingFieldXpath = "//label[@for='encoding_export233']";
    String ImportSeperatorXpath = "//label[@for='separator_export233']";
    String ImportSeperatorFieldXpath = "(//a[@class='select2-choice'])[2]";
    String ImportFileNameTopDontImportXpath = "//tr[@class='oe_import_grid-header']";
    String ImportThousandsSeperatorXpath = "//label[@for='float_thousand_separator_export233']";
    String ImportThousandsSeperatorsFieldXpath = "(//span[@class='select2-chosen'])[3]";
    String ImportTestImportButtonXpath = "(//div[@class='o_cp_buttons']/button)[1]";
    String ImportImportButtonXpath = "(//div[@class='o_cp_buttons']/button)[2]";
    String ImportCancelButtonXpath = "(//div[@class='o_cp_buttons']/button)[3]";
    String ImportYouMustConfigureAtLeastOneFieldToImportErrorMessageXpath = "(//div[@class='oe_import_error_report'])/ul/li/span";
    String ImportErrorMessageOddoXpath = "(//div[@class='modal-dialog modal-lg']//div//div)[1]//h4";
    String ImportErrorMessageOKButtonXpath = "(//div[@class='modal-dialog modal-lg']//div//div)[5]//button//span";
    String ImportPleaseUseCopyButtonMessageXpath = "//div[@class='o_dialog_error modal-body']/div/p[2]";
    String ImportCopyTheFullErrorToClipboardButtonXpath = "//div[@class='modal-content']/div/div/button";
    String ImportSeeDetailsButtonXpath = "(//div[@class='modal-content']/div/button)[2]";
    String ImportEncodingXpath = "//label[@for='encoding_export233']";





}


