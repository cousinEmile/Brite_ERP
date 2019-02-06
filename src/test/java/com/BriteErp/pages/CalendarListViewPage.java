package com.BriteErp.pages;

import com.BriteErp.identifiers.CalendarListViewPageIdentifier;
import com.BriteErp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CalendarListViewPage{

    public CalendarListViewPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = CalendarListViewPageIdentifier.CalendarListViewCreate_ButtonXpath)
    public WebElement create_button;

    @FindBy(css = CalendarListViewPageIdentifier.CalendarListViewImport_ButtonCSS)
    public WebElement import_button;

    @FindBy(css = CalendarListViewPageIdentifier.CalendarListViewPreviousPage_ButtonCSS)
    public WebElement previousPage_button;

    @FindBy(css = CalendarListViewPageIdentifier.CalendarListViewNextPage_ButtonCSS)
    public WebElement nextPage_button;

    @FindBy(xpath =CalendarListViewPageIdentifier.CalendarListViewHelpButtonXpath )
    public WebElement helpButton;

    @FindBy(xpath =CalendarListViewPageIdentifier.CalendarListViewListXpath )
    public WebElement list;

    @FindBy(xpath =CalendarListViewPageIdentifier.CalendarListViewSubjectCheckBoxXpath)
    public WebElement subjectCheckbox;

    @FindBy(xpath =CalendarListViewPageIdentifier.CalendarListViewArchiveXpath)
    public WebElement action;

    @FindBy(xpath =CalendarListViewPageIdentifier.CalendarListViewUnarchiveXpath)
    public WebElement unarchive;

    @FindBy(xpath =CalendarListViewPageIdentifier.CalendarListViewExportXpath)
    public WebElement export;

    @FindBy(xpath =CalendarListViewPageIdentifier.CalendarListViewArchiveXpath)
    public WebElement archive;

    @FindBy(xpath =CalendarListViewPageIdentifier.CalendarListViewWarningXpath)
    public WebElement warning;

    @FindBy(xpath =CalendarListViewPageIdentifier.CalendarListViewCloseXpath)
    public WebElement close;









}