package com.BriteErp.pages;

import com.BriteErp.identifiers.SearchPageIdentifier;
import com.BriteErp.utilities.Driver;
import com.BriteErp.utilities.TestBase;
//import com.github.javafaker.Faker;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends TestBase {
    public SearchPage ( ) {
        PageFactory.initElements ( Driver.getDriver ( ) , this );
    }


    @FindBy ( xpath = SearchPageIdentifier.SearchMgniffierIconeXpath )
    public WebElement MgniffierIcone;

    @FindBy ( xpath = SearchPageIdentifier.SearchCalanderModuleXpath )
    public WebElement CalanderModule;


    @FindBy ( xpath = SearchPageIdentifier.SearchFilterButtonXpath )
    public WebElement FilterButton;

    @FindBy ( xpath = SearchPageIdentifier.SearchFilterDropDownXpath )
    public WebElement FilterDropDown;

    @FindBy ( xpath = SearchPageIdentifier.SearchAddCustomFilterXpath )
    public WebElement AddCustomFilter;

    @FindBy ( xpath = SearchPageIdentifier.SearchSearchBoxXpath )
    public WebElement SearchBox;

    @FindBy ( xpath = SearchPageIdentifier.SearchSelectFromActionNeededButtonXpath )
    public WebElement SelectFromActionNeededButton;

    public void Select_List ( int index ) {
        Select list = new Select ( SelectFromActionNeededButton );
        list.selectByIndex ( index );

    }

    @FindBy ( xpath = SearchPageIdentifier.SearchApplyButtonXpath )
    public WebElement ApplyButton;

    @FindBy ( xpath = SearchPageIdentifier.SearchClickOnGroupByDropDownXpath )
    public WebElement ClickOnGroupByDropDown;

    @FindBy ( xpath = SearchPageIdentifier.SearchAddCustomDropDownGroupXpath )
    public WebElement AddCustomDropDownGroup;

    @FindBy ( xpath = SearchPageIdentifier.SearchDroupDownListUnderGroupByXpath )
    public WebElement DroupDownListUnderGroupBy;

    @FindBy ( xpath = SearchPageIdentifier.SearchApplyButtonInGroupXpath )
    public WebElement applyButtonInGroup;

    @FindBy ( xpath = SearchPageIdentifier.SearchClickOnFavoritesDropDownXpath )
    public WebElement ClickOnFavoritesDropDown;

    @FindBy ( xpath = SearchPageIdentifier.SearchClickOnSaveCurrentSearchXpath )
    public WebElement clickOnSaveCurrentSearch;

    @FindBy ( xpath = SearchPageIdentifier.SearchSendTextToSaveOnCurrentSearchBoxXpath )
    public WebElement SendTextOnSaveCurrentSearchBox;

    @FindBy ( xpath = SearchPageIdentifier.SearchSaveButtonOnFavoritesXpath )
    public WebElement SaveButtonOnFavorites;

    @FindBy ( xpath = SearchPageIdentifier.SearchClickToDashBoradIconeXpath )
    public WebElement ClickToDashBoradIcone;

    @FindBy ( xpath = SearchPageIdentifier.SearchSendTextToSaveToDashBoradXpath )
    public WebElement sendTextToSaveToDashBorad;

    @FindBy ( xpath = SearchPageIdentifier.SearchAddButtonUnderADDToMyDashXpath )
    public WebElement AddButtonUnderADDToMyDash;

    @FindBy ( xpath = SearchPageIdentifier.SearchFiltersButtonXpath )
    public WebElement filters_button;

    @FindBy ( xpath = SearchPageIdentifier.SearchMyEvents_FilterXpath )
    public WebElement MyEvents_filter;

    @FindBy ( css = SearchPageIdentifier.SearchMyEvents_SearchBarIconCSS )
    public WebElement MyEvents_SearchBarIcon;

    @FindBy ( css = SearchPageIdentifier.SearchMyEvents_Label_SearchBarIconCSS )
    public WebElement MyEvents_Label_SearchBarIcon;

    @FindBy ( xpath = SearchPageIdentifier.SearchMyMeetings_FilterXpath )
    public WebElement MyMeetings_filter;

    @FindBy ( css = SearchPageIdentifier.SearchMyMeetings_SearchBarIconCSS )
    public WebElement MyMeetings_SearchBarIcon;

    @FindBy ( css = SearchPageIdentifier.SearchMyMeetings_Label_SearchBarIconCSS )
    public WebElement MyMeetings_Label_SearchBarIcon;

    @FindBy ( xpath = SearchPageIdentifier.SearchUnreadMessages_FilterXpath )
    public WebElement UnreadMessages_filter;

    @FindBy ( css = SearchPageIdentifier.SearchUnreadMessages_Label_SearchBarIconCSS )
    public WebElement UnreadMessages_Label_SearchBarIcon;

    @FindBy ( css = SearchPageIdentifier.SearchUnreadMessages_SearchBarIconCSS )
    public WebElement UnreadMessages_SearchBarIcon;

    @FindBy ( css = SearchPageIdentifier.SearchRevealCustomFilter_ButtonCSS )
    public WebElement RevealCustomFilter_button;

    @FindBy ( css = SearchPageIdentifier.SearchCustomFilter_SelectElementCSS )
    public WebElement CustomFilter_SelectElement;

    @FindBy ( css = SearchPageIdentifier.SearchCustomFilterBoolean_SelectElementCSS )
    public WebElement CustomFilterBoolean_SelectElement;

    /**
     * This is just the frame of a select method. Keep in mind that which ever you choose will effect the boolean dropdown
     * Also note that when you add an additional custom filter, it duplicates an li node above
     * the filter menu buttons -- these are not dynamic enough selector paths to withstand that.
     * You must refactor selectors for both dropdowns before adding custom filters
     **/
    public void CustomFilter_DropDownMenu ( ) {
        Select select = new Select ( CustomFilter_SelectElement );
    }

    /**
     * Remember that the choice of the above custom filter will determine the boolean Options
     * Needs be tailored to suit
     **/
    public void CustomFilterDynamicBoolean_DropDown ( ) {
        Select select = new Select ( CustomFilterBoolean_SelectElement );
    }

    @FindBy ( css = SearchPageIdentifier.SearchApplyCustomFilter_ButtonCSS )
    public WebElement ApplyCustomFilter_Button;

    @FindBy ( css = SearchPageIdentifier.SearchAdditionalCustomFeature_ButtonCSS )
    public WebElement AdditionalCustomFeature_button;

    @FindBy ( xpath = SearchPageIdentifier.SearchGroupBy_ButtonXpath )
    public WebElement GroupBy_button;

    @FindBy ( xpath = SearchPageIdentifier.SearchGroupResponsible_ButtonXpath )
    public WebElement groupResponsible_button;

    @FindBy ( css = SearchPageIdentifier.SearchResponsible_SearchBarIconCSS )
    public WebElement Responsible_SearchBarIcon;

    @FindBy ( css = SearchPageIdentifier.SearchResponsible_Label_SearchBarIconCSS )
    public WebElement Responsible_Label_SearchBarIcon;

    @FindBy ( xpath = SearchPageIdentifier.SearchGroupAvailability_ButtonXpath )
    public WebElement groupAvailability_button;

    @FindBy ( css = SearchPageIdentifier.SearchAvailability_SearchBarIconCSS )
    public WebElement Availability_SearchBarIcon;

    @FindBy ( css = SearchPageIdentifier.SearchAvailability_label_SearchBarIconCSS )
    public WebElement Availability_Label_SearchBarIcon;

    @FindBy ( xpath = SearchPageIdentifier.SearchGroupPrivacy_ButtonXpath )
    public WebElement groupPrivacy_button;

    @FindBy ( css = SearchPageIdentifier.SearchPrivacy_SearchBarIconCSS )
    public WebElement Privacy_SearchBarIcon;

    @FindBy ( css = SearchPageIdentifier.SearchPrivacy_Label_SearchBarIconCSS )
    public WebElement Privacy_Label_SearchBarIcon;

    @FindBy ( css = SearchPageIdentifier.SearchAdditionalCustomGroup_ButtonCSS )
    public WebElement AdditionalCustomGroup_button;

    @FindBy ( css = SearchPageIdentifier.SearchCustomGroupSelectElementCSS )
    public WebElement CustomGroupSelectElement;

    @FindBy ( css = SearchPageIdentifier.SearchCustomSavedSearch_ButtonCSS )
    public WebElement CustomSavedSearch_button;

    @FindBy ( css = SearchPageIdentifier.SearchCustomSavedSearch_SavedButtonCSS )
    public WebElement CustomSavedSearch_SavedButton;

    public String CustomSearchName ( ) {
        Faker faker = new Faker ( );
        return faker.artist ( ).name ( );
    }


    /**
     * Just the bones, add meat and season as required
     * note : Static list.
     **/
    public void CustomGroup_DropDown ( ) {
        Select select = new Select ( CustomGroupSelectElement );
    }


}
