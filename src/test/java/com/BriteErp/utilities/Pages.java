package com.BriteErp.utilities;

import com.BriteErp.pages.CalendarPage;
import com.BriteErp.pages.InboxPage;
import com.BriteErp.pages.LandingPage;
import com.BriteErp.pages.LoginPage;

public class Pages {

    private LoginPage login;
    private CalendarPage calendar;
    private InboxPage inbox;
    private LandingPage landing;


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






}
