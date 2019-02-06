package com.BriteErp.utilities;

import com.BriteErp.pages.*;

public class PageObjectManager {

    private CalendarListViewPage calendarListViewPage;
    private CalendarPage calendarPage;
    private SearchPage searchPage;
    private TopNavigationBar topNavigationBar;
    private LoginPage loginPage;
    private  HelpPage helpPage;
    private ImportPage importPage;
    private LandingPage landingPage;


    public LandingPage getLandingPage(){
      return ( landingPage == null) ? landingPage = new LandingPage () : landingPage;
    }

    public ImportPage getImportPage(){
        return ( importPage==null) ? importPage = new ImportPage () : importPage;
    }

    public HelpPage getHelpPage(){
        return (helpPage==null) ? helpPage = new HelpPage () : helpPage;
    }

    public LoginPage getLoginPage(){
        return (loginPage==null) ? loginPage= new LoginPage () : loginPage;
    }

    public TopNavigationBar getTopNavigationBar(){
        return (topNavigationBar==null) ? topNavigationBar = new TopNavigationBar() : topNavigationBar;
    }

    public SearchPage getSearchPage(){
        return (searchPage == null) ? searchPage = new SearchPage() : searchPage;
    }


    public CalendarPage getCalendarPage(){
        return (calendarPage == null) ? calendarPage = new CalendarPage() : calendarPage;
    }

    public CalendarListViewPage getCalendarListViewPage(){
        return (calendarListViewPage==null) ? calendarListViewPage = new CalendarListViewPage() : calendarListViewPage;
    }


}

