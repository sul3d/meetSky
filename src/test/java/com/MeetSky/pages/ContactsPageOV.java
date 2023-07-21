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
    public WebElement appContactList;


    @FindBy(xpath = "//div[@role='group']")
    public WebElement  groupContact;

    @FindBy(xpath = "//div[@class='contacts-list']")
    public List<WebElement> contactList;


    @FindBy(xpath = "//span[text()='New contact']")
    public WebElement name1NewContact;

    @FindBy(xpath = "//span[text()='Olek']")
    public WebElement name2Olek;

    @FindBy(xpath = "//span[@class='app-navigation-entry__title']")
    public WebElement allContactsButton;

    @FindBy(xpath = "//button[@class='icon vue-button action-item__menutoggle icon-picture-force-white']")
    public WebElement pictureProfileButton;

    @FindBy(xpath = "//span[text()='Choose from Files']")
    public WebElement chooseFromFilesButton;


    @FindBy(xpath = "//span[text()='435.jpg']")
    public WebElement fileNamePicture;

    @FindBy(xpath = "//button[text()='Choose']")
    public WebElement chooseButton;

    @FindBy(xpath = "//div[@class='avatardiv popovermenu-wrapper contact-header-avatar__photo']")
    public WebElement avatarActualResult;

    @FindBy(xpath = "//div[@class='contact-header__actions']//div")
    public WebElement icon3Dot;

    @FindBy(xpath = "//span[@class='action-button__icon icon-delete']")
    public WebElement deleteButton;



    @FindBy(xpath = "//li[@id='notgrouped']")
    public WebElement notGroupedIcon;

    @FindBy(xpath = "//li[@id='everyone']")
    public WebElement allGroupIcon;
    @FindBy(xpath = "//span[@class='option__lineone']")
    public WebElement contactCount;






}
