package com.BriteErp.pages;

import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarListViewPage{

    public CalendarListViewPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_list_button_add")
    public WebElement create_button;

    @FindBy(css = "button.btn.btn-sm.btn-default.o_button_import")
    public WebElement import_button;

    @FindBy(css = "button.fa.fa-chevron-left.btn.btn-icon.o_pager_previous")
    public WebElement previousPage_button;

    @FindBy(css = "button.fa.fa-chevron-right.btn.btn-icon.o_pager_next")
    public WebElement nextPage_button;

    @FindBy(xpath ="//div[@class='col-sm-12']//a" )
    public WebElement helpButton;




}
