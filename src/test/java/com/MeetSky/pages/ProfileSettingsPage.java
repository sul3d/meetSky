package com.MeetSky.pages;

import com.MeetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage {


    public ProfileSettingsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "html > body > div:nth-of-type(3) > div:nth-of-type(1) > ul > li:nth-of-type(2) > a")
    public WebElement securityButton;

    @FindBy(css = "li[class='active'] a")
    public WebElement personalInfoButton;

    @FindBy(xpath = "//h3//label[@for='displayname']")
    public WebElement userName;

    @FindBy(xpath = "//h3//label[@for='email']")
    public WebElement email;

    @FindBy(xpath = "//h3//label[@for='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='displayname']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneNumberBox;

    public void phoneNumberSend(String phoneNumber){
        phoneNumberBox.click();
        if (!phoneNumber.matches("[0-9]+")){
            System.exit(1);
        }else {
            phoneNumberBox.sendKeys(phoneNumber);
        }
    }

}
