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

    @FindBy(xpath = "//ul[@class='app-navigation__list']//ul//a")
    public List<WebElement> allBoards;

    @FindBy(css = ".controls>.board-title>h2")
    public WebElement selectedBoardName;

    @FindBy(xpath = "//div[@id='stack-add']//button")
    public WebElement addListBtn;

    @FindBy(css = ".controls>.board-actions>div#stack-add>form>input#new-stack-input-main")
    public WebElement listNameInput;

    @FindBy(css = ".controls>.board-actions>div#stack-add>form>input[type='submit']")
    public WebElement listAddArrow;

    @FindBy(xpath = "//div[@class='stack__header']//h3")
    public List<WebElement> allLists;

    @FindBy(xpath = "//div[@class='stack']//div//button[@icon='icon-add']")
    public List<WebElement> addCardBtns;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardNameInput;

    @FindBy(xpath = "//div[@class='stack__card-add']//input[@type='submit']")
    public WebElement cardAddArrow;

    @FindBy(xpath = "//div[@class='stack']//h3//span")
    public List<WebElement> allCards;


    public WebElement clickOnAddCardButton(String listName){
        int count = 0;
        for (WebElement eachList : allLists) {
            count++;
            if (eachList.getText().equals(listName)){
                break;
            }
        }
        WebElement listNamesAddCardBtn = addCardBtns.get(count-1);
        return listNamesAddCardBtn;
    }

    public int selectBoard(String boardName){
        int count = 0;
        for (WebElement eachBoard : allBoards) {
            count++;
            if (eachBoard.getText().equals(boardName)){
                break;
            }
        }
        return count-1;
    }

}
