package com.MeetSky.pages;

import com.MeetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Calendar']")
    public WebElement calendarModule;


    @FindBy(xpath = "//button[@class='icon vue-button action-item__menutoggle action-item__menutoggle--with-icon-slot']")
    public WebElement hamburgerButton;


    @FindBy(xpath = "//span[text()='Day']")
    public WebElement dayIcon;


    @FindBy(xpath = "//span[text()='Week']")
    public WebElement weekIcon;

    @FindBy(xpath = "//span[text()='Month']")
    public WebElement monthIcon;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEvent;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitle;

    @FindBy(xpath = "//div[@class='mx-datepicker'][1]")
    public WebElement datePicker1;

    @FindBy(xpath = "//ul[@data-type='hour']//li[@data-index='9']")
    public WebElement hourPick1;

    @FindBy(xpath = "//ul[@data-type='minute']//li[@data-index='0']")
    public WebElement minutesPick1;

    @FindBy(xpath = "//ul[@data-type='ampm']//li[@data-index='0']")
    public WebElement pickAM;

    @FindBy(xpath = "//button[@class='mx-btn mx-btn-text']")
    public WebElement pickDateButton;

    @FindBy(xpath = "//button[@class='mx-btn mx-btn-text mx-btn-current-year']")
    public WebElement yearButton;

    @FindBy(xpath = "//td[@data-year='2023']")
    public WebElement pickYear;

    @FindBy(xpath = "//td[@data-month='7']")
    public WebElement pickMonth;

    @FindBy(xpath = "//td[@data-row-col='0,4']")
    public WebElement pickDate1;

    @FindBy(xpath = "//button[@class='mx-btn mx-datepicker-btn-confirm']")
    public WebElement buttonOK;

    //--------------------------------------------------------------------------

    @FindBy(xpath = "//div[@class='mx-datepicker'][2]")
    public WebElement datePicker2;

    @FindBy(xpath = "//ul[@data-type='hour']//li[@data-index='11']")
    public WebElement hourPick2;

    @FindBy(xpath = "//ul[@data-type='minute']//li[@data-index='8']")
    public WebElement minutesPick2;

    @FindBy(xpath = "//ul[@data-type='ampm']//li[@data-index='1']")
    public WebElement pickPM;

    @FindBy(xpath = "//td[@data-row-col='1,0']")
    public WebElement pickDate2;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveButton;

    //---------------------------------------------------------------------------
    @FindBy(xpath = "//button[@aria-label='Next month']")
    public WebElement nextMonth;

    @FindBy(xpath = "//div[@class='fc-event-title fc-sticky']")
    public WebElement event;


}
