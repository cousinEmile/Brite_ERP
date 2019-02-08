package com.BriteErp.pages;

import com.BriteErp.identifiers.CalendarPageIdentifier;
import com.BriteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;
import java.util.List;

public class CalendarPage{

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = CalendarPageIdentifier.CalendarChatCloseXpath)
    public WebElement chatClose;

    @FindBy(xpath = CalendarPageIdentifier.CalendarLastWeekButtonXpath)
    public WebElement lastWeek_button;

    @FindBy(xpath = CalendarPageIdentifier.CalendarToday_ButtonXpath)
    public WebElement today_button;

    @FindBy(xpath = CalendarPageIdentifier.CalendarNextWeek_ButtonXpath)
    public WebElement nextWeek_button;

    @FindBy(xpath = CalendarPageIdentifier.CalendarViewDay_ButtonXpath)
    public WebElement viewDay_button;

    @FindBy(xpath = CalendarPageIdentifier.CalendarDayButtonXpath)
    public WebElement dayButton;


    @FindBy(xpath = CalendarPageIdentifier.CalendarViewWeek_ButtonXpath)
    public WebElement viewWeek_button;

    @FindBy(xpath = CalendarPageIdentifier.CalendarViewMonth_ButtonXpath)
    public WebElement viewMonth_button;

    @FindBy(xpath = CalendarPageIdentifier.CalendarMiniCalendarCloseXpath)
    public WebElement miniCalendarClose;

    @FindBy(xpath = CalendarPageIdentifier.CalendarMiniCalendarOpenXpath)
    public WebElement miniCalendarOpen;

    @FindBy(xpath = CalendarPageIdentifier.CalendarMiniCalendarLastMonthXpath)
    public WebElement miniCalandarLastMonth;

    @FindBy(xpath = CalendarPageIdentifier.CalendarMiniCalendarNextMonthXpath)
    public WebElement miniCalandarNextMonth;

    @FindBy(xpath = CalendarPageIdentifier.CalendarCalendarViewXpath)
    public WebElement calandarView;

    @FindBy(xpath = CalendarPageIdentifier.CalendarListViewXpath)
    public WebElement listView;

    @FindBy(xpath = CalendarPageIdentifier.CalendarSearchBoxXpath)
    public WebElement searchBox;

    @FindBy(xpath = CalendarPageIdentifier.CalendarAdvancedSearch_ButtonXpath)
    public WebElement advancedSearch_button;

    @FindBy(xpath = CalendarPageIdentifier.Calendar_011618_AllDayXpath)
    public WebElement _011618_allDay;

    @FindBy(xpath=CalendarPageIdentifier.CalendarRecurrentCheckBox)
    public WebElement recurrentCheckBox;

    @FindBy(xpath=CalendarPageIdentifier.Calendar8AMBoxXpath)
    public WebElement eightAmBox;

    @FindBy(xpath = CalendarPageIdentifier.Calendar7AMBoxXpath)
    public WebElement sevenAmBox;

    @FindBy(xpath = CalendarPageIdentifier.Calendar6AMBoxXpath)
    public WebElement sixAmBox;

    @FindBy(xpath=CalendarPageIdentifier.CalendarTestingPurposes)
    public WebElement testingPurposes;

    @FindBy(xpath = CalendarPageIdentifier.CalendarAllDayBoxXpath)
    public WebElement allDayBox;

    @FindBy(xpath=CalendarPageIdentifier.CalendarAllDayCheckBox)
    public WebElement allDayCheckBox;

    @FindBy(xpath=CalendarPageIdentifier.CalendarCreateEvent_buttonXpath)
    public WebElement createEvent_button;

    @FindBy(xpath = CalendarPageIdentifier.CalendarAddMeetingBox_PopOutXpath)
    public WebElement addMeetingBox_popOut;

    @FindBy(xpath = CalendarPageIdentifier.CalendarPopOutCreate_ButtonXpath)
    public WebElement popOutCreate_button;

    @FindBy(xpath=CalendarPageIdentifier.CalendarSummaryInputBoxXpath)
    public WebElement summaryInputBox;

    @FindBy(xpath = CalendarPageIdentifier.CalendarEditButtonXpath)
    public WebElement editButton;

    @FindBy(xpath = CalendarPageIdentifier.CalendarMonthViewXpath)
    public WebElement monthView;

    @FindBy(xpath =  CalendarPageIdentifier.CalendarTheCurrentMonthTextXpath )
    public WebElement theCurrentMonthText;  // getAttribute

    @FindBy(xpath = CalendarPageIdentifier.CalendarNextMonthXpath)
    public WebElement nextMonth;

    @FindBy(xpath = CalendarPageIdentifier.CalendarMAy15thXpath)
    public WebElement may15th;

    @FindBy(xpath = CalendarPageIdentifier.CalendarEventsXpath)
    public List<WebElement> events;

    @FindBy(xpath=CalendarPageIdentifier.CalendarAttendeesBox)
    public WebElement attendeesBox;

    @FindBy(xpath= CalendarPageIdentifier.CalendarSaveButtonXpath)
    public WebElement saveButton;

    @FindBy(xpath="//input[@placeholder='e.g. Business Lunch']")
    public WebElement meetingSubjectBox;

    public WebElement getEvent(String text){
        for (WebElement event: events) {
            if(event.getText().toLowerCase().contains(text.toLowerCase()))
                return event;
        }
        return null;
    }

    @FindBy(xpath=CalendarPageIdentifier.CalendarNextDayButtonXpath)
    public WebElement nextDayButton;


    @FindBy(xpath = CalendarPageIdentifier.CalendarView_Table_WeeklyXpath)
    public WebElement view_table_weekly;

@FindBy(xpath = CalendarPageIdentifier.CalendarClick_Table_WeeklyXpath)
    public WebElement click_table_weekly;

    @FindBy(xpath = CalendarPageIdentifier.CalendarBack_WeekXpath)
    public WebElement back_week;

    @FindBy(xpath = CalendarPageIdentifier.CalendarForth_WeekXpath)
    public WebElement forth_week;

    @FindBy(xpath = CalendarPageIdentifier.CalendarEditDropDownXpath)
    public WebElement editDropDown;

    @FindBy(xpath = CalendarPageIdentifier.CalendarEditEventButtonXpath)
    public WebElement editEventButton;

    @FindBy(xpath = CalendarPageIdentifier.CalendarMeetingSubjectXpath)
    public WebElement meetingSubject;

    @FindBy(xpath = CalendarPageIdentifier.CalendarDeleteEventXpath)
    public WebElement deleteEvent;

    @FindBy(xpath = CalendarPageIdentifier.CalendarSaveEditEventXpath)
    public WebElement saveEditEvent;


    @FindBy(xpath = CalendarPageIdentifier.CalendarClose_Mini_CalendarXpath)
    public WebElement close_mini_calendar;

    @FindBy(xpath = CalendarPageIdentifier.CalendarOpenMiniCalendarXpath)
    public WebElement openMiniCalendar;

    @FindBy(xpath = CalendarPageIdentifier.CalendarRemovingFilterXpath)
    public WebElement removingFilter;

    @FindBy(xpath = CalendarPageIdentifier.CalendarRemovingFilter2Xpath)
    public WebElement removingFilter2;

    @FindBy(xpath = CalendarPageIdentifier.CalendarOptionsEditButtonXpath)
    public WebElement optionsEditButton;

    @FindBy (id = CalendarPageIdentifier.CalendarSelectClassID)
    public WebElement selectClass;

    @FindBy(xpath = CalendarPageIdentifier.CalendarErrorMessageXpath)
    public WebElement errorMessage;

    @FindBy (id = CalendarPageIdentifier.CalendarSelectClassManagerID)
    public  WebElement selectClassManager;

    @FindBy(xpath = CalendarPageIdentifier.CalendarAllMeetingsXpath)
    public List<WebElement> allMeetings;

    @FindBy (xpath = CalendarPageIdentifier.CalendarActionDropDownButtonXpath)
    public WebElement actionDropdownButton;

    @FindBy(xpath = CalendarPageIdentifier.CalendarSendSMSButtonXpath)
    public WebElement sendSMSbutton;

    @FindBy(id = CalendarPageIdentifier.CalendarPhoneNumberID)
    public WebElement phoneNumber;

    @FindBy(xpath = CalendarPageIdentifier.CalendarSendButtonXpath )
    public WebElement  sendButton;

    @FindBy(id = CalendarPageIdentifier.CalendarEnterTextID)
    public WebElement enterText;

    @FindBy(xpath = CalendarPageIdentifier.CalendarPhoneNumberErrorXpath)
    public WebElement phoneNumberError;

    @FindBy(xpath = CalendarPageIdentifier.CalendarAttachmentButtonXpath)
    public WebElement attachmentButton;

    @FindBy(xpath = CalendarPageIdentifier.CalendarAddAttachmentButtonXpath)
    public WebElement addAttachmentButton;

    @FindBy(xpath = CalendarPageIdentifier.CalendarDuplicateButtonXpath)
    public WebElement duplicateButton;

    @FindBy(xpath = CalendarPageIdentifier.CalendarDuplicateInputXpath)
    public WebElement duplicateInput;

    @FindBy(xpath = CalendarPageIdentifier.CalendarSaveDuplicateButtonXpath)
    public WebElement saveDuplicateButton;

    @FindBy(xpath = CalendarPageIdentifier.CalendarDuplicateMeetingNameXpath)
    public WebElement duplicatedMeetingName;

    @FindBy(xpath = CalendarPageIdentifier.CalendarMeetingButtonXpath)
    public WebElement meetingButton;

    @FindBy(xpath = CalendarPageIdentifier.CalendarEverybodysCalendarButtonXpath)
    public WebElement everybodysCalendarButton;

    @FindBy(xpath = CalendarPageIdentifier.CalendarDaysOfWeekXpath)
    public WebElement daysOfWeek;

    @FindBy(xpath = "//div[@class='fc-slats']//tr[17]/td[2]")
    public WebElement createEventbyhour;

    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement createDetailPage;

    @FindBy(xpath = "//div[@class='oe_title']//h1//input")
    public WebElement inputMeeting;

    @FindBy(xpath = "//div[@class='modal-footer']//button[2]/span")
    public WebElement editButtonEvent;

    @FindBy(xpath = "//div[@class='modal-footer']//button[3]//span")
    public WebElement cancelEventButton;


}
