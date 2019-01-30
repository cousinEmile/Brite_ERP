package com.BriteErp.pages;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='form-group field-login']/input")
    public WebElement emailBox;

    @FindBy(xpath = "//div[@class='form-group field-password']/input")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[@class='clearfix oe_login_buttons']/button")
    public WebElement login_button;



    public void userLogin(){
        this.emailBox.sendKeys(ConfigurationReader.getProperties("user"));
        this.passwordBox.sendKeys(ConfigurationReader.getProperties("userpass"));
        this.login_button.click();
    }


    public void managerLogin(){

        emailBox.sendKeys(ConfigurationReader.getProperties("manager"));
        passwordBox.sendKeys(ConfigurationReader.getProperties("managerpass"));
        login_button.click();
    }

    public void open(){
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
    }

}
