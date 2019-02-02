package com.BriteErp.utilities;

import com.BriteErp.pages.*;

public class Pages {

    private LoginPage login;
    private CalendarPage calendar;
    private InboxPage inbox;
    private LandingPage landing;
    private CalendarListViewPage calendarListViewPage;
    private TopNavigationBar topNavigationBar;
    private ImportPage importPage;
    private SearchPage searchPage;
    private HelpPage helpPage;

    //-------------------------------------------------------

    public LoginPage login(){
        if(login==null){
            login = new LoginPage();
        }
        return login;
    }

    public CalendarPage calendar(){
        if(calendar==null){
            calendar = new CalendarPage();
        }
        return calendar;
    }

    public InboxPage inbox(){
        if(inbox==null){
            inbox = new InboxPage();
        }
        return inbox;
    }

    public LandingPage landing(){
        if(landing==null){
            landing = new LandingPage();
        }
        return landing;
    }

    public CalendarListViewPage calendarListViewPage(){
        if(calendarListViewPage==null){
            calendarListViewPage = new CalendarListViewPage();
        }
        return calendarListViewPage;
    }

    public TopNavigationBar topNavigationBar(){
        if(topNavigationBar==null){
            topNavigationBar = new TopNavigationBar();
        }
        return topNavigationBar;
    }

    public ImportPage importPage(){
        if(importPage==null){
            importPage= new ImportPage ();
        }
        return importPage;
    }
public SearchPage searchPage(){
        if(searchPage==null){
            searchPage=new SearchPage();
        }
        return searchPage;
}

public HelpPage helpPage(){
        if(helpPage==null){
            helpPage=new HelpPage();
        }
        return helpPage;
}

}
