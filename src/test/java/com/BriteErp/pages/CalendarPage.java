package com.BriteErp.pages;

import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "//button[@class='o_calendar_button_day btn btn-sm btn-default active']")
    public WebElement dayButton;

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

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div/table/tbody/tr/td/div[1]/div/div[1]/table/tbody/tr/td[2]")
    public WebElement allDayBox;

    @FindBy(xpath = "//div[@class='modal-content']/div/div/input")
    public WebElement addMeetingBox_popOut;

    @FindBy(xpath = "//div[@class='modal-footer']/button")
    public WebElement popOutCreate_button;

    @FindBy(xpath="//input[@class='o_input']")
    public WebElement summaryInputBox;

    @FindBy(xpath = "//*[@id=\"modal_20\"]/div/div/div[3]/button[2]")
    public WebElement editButton;

    @FindBy(xpath = "//div[@class='fc-view fc-month-view fc-basic-view']")
    public WebElement monthView;

    @FindBy(xpath =  "(//li[@class='active'])[2]" )
    public WebElement theCurrentMonthText;  // getAttribute

    @FindBy(xpath = "//span[@class='fa fa-arrow-right']")
    public WebElement nextMonth;

    @FindBy(xpath = "((//div[@class='fc-content-skeleton'])[3]/table/tbody/tr/td)[5]")
    public WebElement may15th;

    @FindBy(xpath = "(//div[@class='o_field_name o_field_type_char'])")
    public List<WebElement> events;

    @FindBy(xpath="//*[@id=\'o_field_input_157\']")
    public WebElement attendeesBox;

    @FindBy(xpath="//button[@class='btn btn-sm btn-primary']")
    public WebElement saveButton;

    public WebElement getEvent(String text){
        for (WebElement event: events) {
            if(event.getText().toLowerCase().contains(text.toLowerCase()))
                return event;
        }
        return null;
    }

    @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[3]")
    public WebElement nextDayButton;





}
