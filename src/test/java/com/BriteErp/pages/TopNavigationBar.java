package com.BriteErp.pages;

import com.BriteErp.utilities.ApplicationConstants;
import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class TopNavigationBar {
    public TopNavigationBar(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li/a")
    public WebElement discuss_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[2]/a")
    public WebElement calendar_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[3]/a")
    public WebElement notes_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[4]/a")
    public WebElement contacts_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[5]/a")
    public WebElement website_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[6]/a")
    public WebElement inventory_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[7]/a")
    public WebElement repairs_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[8]/a")
    public WebElement invoicing_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[9]/a")
    public WebElement employees_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[10]/a")
    public WebElement leaves_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[11]/a")
    public WebElement expenses_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[12]/a")
    public WebElement maintenance_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[13]/a")
    public WebElement dashboards_button;


}
/*
clockToggle
li.o_mail_navbar_item.o_no_notification>a

 */













