package com.BriteErp.pages;

import com.BriteErp.identifiers.LoginPageIdentifier;
import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    public LoginPage ( ) {
        PageFactory.initElements ( Driver.getDriver ( ) , this );
    }

    @FindBy ( xpath = LoginPageIdentifier.LoginEmailBoxXpath )
    public WebElement emailBox;

    @FindBy ( xpath = LoginPageIdentifier.LoginPasswordBoxXpath )
    public WebElement passwordBox;

    @FindBy ( xpath = LoginPageIdentifier.LoginLogin_ButtonXpath )
    public WebElement login_button;


    public void userLogin ( ) {
        emailBox.sendKeys ( ConfigurationReader.getProperties ( "user" ) );
        passwordBox.sendKeys ( ConfigurationReader.getProperties ( "userpass" ) );
        login_button.click ( );
    }


    public void managerLogin ( ) {

        emailBox.sendKeys ( ConfigurationReader.getProperties ( "manager" ) );
        passwordBox.sendKeys ( ConfigurationReader.getProperties ( "managerpass" ) );
        login_button.click ();
    }

    public void open ( ) {
        Driver.getDriver ( ).manage ( ).window ( ).maximize ( );
        Driver.getDriver ( ).get ( ConfigurationReader.getProperties ( "url" ) );
        waitForPageToLoad ( 5 );
    }



}
