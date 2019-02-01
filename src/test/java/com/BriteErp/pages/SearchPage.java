package com.BriteErp.pages;

import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends TestBase {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
    public WebElement MgniffierIcone;
    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[2]")
    public WebElement CalanderModule;

    //=======Filter button==========

    @FindBy(xpath = "(//div[@class='btn-group o_dropdown'])[1]")
    public WebElement FilterButton;
    @FindBy(xpath = "(//span[@class='caret'])[1]")
    public WebElement FilterDropDown;
    @FindBy(xpath = "//li[@class='o_add_filter o_closed_menu']")
    public WebElement AddCustomFilter;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement SearchBox;
    @FindBy(xpath = "//select[@class='o_input o_searchview_extended_prop_field']")
    public WebElement SelectFromActionNeededButton;

    public void Select_List(int index){
        Select list=new Select(SelectFromActionNeededButton);
     list.selectByIndex(index);

    }


 @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_apply_filter']")
    public WebElement ApplyButton;

    //========Group By==================


    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement ClickOnGroupByDropDown;
   @FindBy(xpath = "//li[@class='o_add_custom_group o_closed_menu']")
   public WebElement AddCustomDropDownGroup;
   @FindBy(xpath = "//select[@class='o_input o_add_group o_group_selector']")
    public WebElement DroupDownListUnderGroupBy;
   @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_add_group o_select_group']")
   public WebElement applyButtonInGroup;


//========Favorites================

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement ClickOnFavoritesDropDown;
    @FindBy(xpath = "//li[@class='o_save_search o_closed_menu']")
    public WebElement clickOnSaveCurrentSearch;
    @FindBy(xpath = "//li[@class='o_save_name']")
    public WebElement SendTextOnSaveCurrentSearchBox;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
    public WebElement SaveButtonOnFavorites;
    @FindBy(xpath = "//li[@class='o_add_to_dashboard_link o_closed_menu']")
    public WebElement ClickToDashBoradIcone;
    @FindBy(xpath = "//input[@class='o_add_to_dashboard_input']")
    public WebElement sendTextToSaveToDashBorad;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_add_to_dashboard_button']")
    public WebElement AddButtonUnderADDToMyDash;













}