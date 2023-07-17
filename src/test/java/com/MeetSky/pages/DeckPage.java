package com.MeetSky.pages;


import com.MeetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeckPage {

    public DeckPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@class, 'close')]")
    public WebElement closedNavigationBtn;

    @FindBy(xpath = "//button[@aria-controls='app-navigation-vue']")
    public WebElement threeLineNavigationBtn;

    @FindBy(xpath = "//span[normalize-space(text())='Add board']")
    public WebElement addBoardLink;

    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement boardNameInput;

    @FindBy(xpath = "//ul[@class='app-navigation-entry__children']//span[@title]")
    public List<WebElement> boards;

    @FindBy(xpath = "//button[@icon='icon-add']")
    public WebElement addListBtn;

    @FindBy(xpath = "//div[@id='stack-add']//input[@placeholder='List name']")
    public WebElement listNameInput;

    @FindBy(xpath = "//div[@id='stack-add']//input[@type='submit']")
    public WebElement listAddArrow;
}
