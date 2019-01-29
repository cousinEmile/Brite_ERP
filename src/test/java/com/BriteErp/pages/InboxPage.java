package com.BriteErp.pages;

import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPage extends TopNavigationBar{

    public InboxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




}
