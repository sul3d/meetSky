package com.MeetSky.pages;

import com.MeetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsPageOV {


    public ContactsPageOV(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button [@id='new-contact-button']")
    public WebElement newContactButton;


    @FindBy(xpath = "//input[@id='contact-org']")
    public WebElement companyName;

    @FindBy(xpath = "//input[@id='contact-title']")
    public WebElement titleName;


    @FindBy(xpath = "//div[@class='app-content-list']")
    public WebElement appContentList;


    @FindBy(xpath = "//div[@role='group']")
    public WebElement groupContact;

    @FindBy(xpath = "//div[@class='contacts-list']")
    public List<WebElement> contentList;


    @FindBy(xpath = "//span[text()='New contact']")
    public WebElement name1NewContact;

    @FindBy(xpath = "//span[text()='Olek']")
    public WebElement name2Olek;

    @FindBy(xpath = "//span[@class='app-navigation-entry__title']")
    public WebElement allContactsButton;









}
