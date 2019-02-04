package com.BriteErp.pages;

import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage{

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='o_chat_header']/span/a[2]")
    public WebElement chatClose;

    @FindBy(xpath = "//div[@class='o_calendar_buttons']/button")
    public WebElement lastWeek_button;

    @FindBy(xpath = "//div[@class='o_calendar_buttons']/button[2]")
    public WebElement today_button;

    @FindBy(xpath = "//div[@class='o_calendar_buttons']/button[3]")
    public WebElement nextWeek_button;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']/button")
    public WebElement viewDay_button;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']/button[2]")
    public WebElement viewWeek_button;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']/button[3]")
    public WebElement viewMonth_button;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar_container hidden-xs']/i")
    public WebElement miniCalendarClose;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar_container hidden-xs o_sidebar_hidden']/i")
    public WebElement miniCalendarOpen;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar']/div/div/div/a")
    public WebElement miniCalandarLastMonth;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar']/div/div/div/a[2]")
    public WebElement miniCalandarNextMonth;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button")
    public WebElement calandarView;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button[2]")
    public WebElement listView;

    @FindBy(xpath = "//div[@class='o_cp_searchview']/div/input")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='o_searchview']/span")
    public WebElement advancedSearch_button;

    @FindBy(xpath = "(//table)[3]/tbody/tr/td[5]")
    public WebElement _011618_allDay;

    @FindBy(xpath = "//div[@class='modal-content']/div/div/input")
    public WebElement addMeetingBox_popOut;

    @FindBy(xpath = "//div[@class='modal-footer']/button")
    public WebElement popOutCreate_button;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar_container hidden-xs']/i")
    public WebElement close_mini_calendar;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar_container hidden-xs o_sidebar_hidden']/i")
    public WebElement openMiniCalendar;

    @FindBy(xpath = "//div[@class='o_calendar_filter']/div/div[5]/span[2]")
    public WebElement removingFilter;

    @FindBy(xpath = "(//div[@class='o_calendar_filter_item'])[4]")
    public WebElement removingFilter2;




}
