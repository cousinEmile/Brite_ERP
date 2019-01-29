package com.BriteErp.pages;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='list-group']/a[2]")      //.click()
    public WebElement BriteErpDemo_button;



}
