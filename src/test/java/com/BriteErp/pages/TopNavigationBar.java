package com.BriteErp.pages;

import com.BriteErp.identifiers.TopNavigationBarIdentifier;
import com.BriteErp.utilities.ApplicationConstants;
import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigationBar {
    public TopNavigationBar() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarDiscuss_ButtonXpath)
    public WebElement discuss_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarCalendar_ButtonXpath)
    public WebElement calendar_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarNotes_ButtonXpath)
    public WebElement notes_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarContacts_ButtonXpath)
    public WebElement contacts_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarWebsite_ButtonXpath)
    public WebElement website_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarInventory_ButtonXpath)
    public WebElement inventory_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarRepairs_ButtonXpath)
    public WebElement repairs_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarInvoicing_ButtonXpath)
    public WebElement invoicing_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarEmployees_ButtonXpath)
    public WebElement employees_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarLeaves_ButtonXpath)
    public WebElement leaves_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarExpenses_ButtonXpath)
    public WebElement expenses_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarMaintenance_ButtonXpath)
    public WebElement maintenance_button;

    @FindBy(xpath=TopNavigationBarIdentifier.TopNavigationBarDashboards_ButtonXpath)
    public WebElement dashboards_button;


}
/*
clockToggle
li.o_mail_navbar_item.o_no_notification>a

 */














