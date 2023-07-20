package com.MeetSky.pages;

import com.MeetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DeckPage {

    public DeckPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

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

    @FindBy(css = ".stack__header>h3")
    public List<WebElement> allLists;

    @FindBy(xpath = "//div[@class='stack']//button[@icon='icon-add']")
    public WebElement addCardBtn;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardNameInput;

    @FindBy(xpath = "//div[@class='stack__card-add']//input[@type='submit']")
    public WebElement cardAddArrow;

    @FindBy(xpath = "//div[@class='stack']//h3//span")
    public List<WebElement> allCards;

    @FindBy(xpath = "//div[@class='stack']//button[@icon='icon-add']/../following-sibling::div//button")
    public WebElement threeDotCardMenuBtn;

    @FindBy(xpath = "//div[contains(@id, 'popover')]//button")
    public List<WebElement> cardMenuOptions;

    @FindBy(xpath = "//div[contains(@id, 'popover')]//button//span[@class='action-button__text']")
    public List<WebElement> cardMenuOptionTexts;

    @FindBy(xpath = "//div[@class='avatar-list']//div[contains(@class, 'avatardiv')]//img")
    public WebElement profileIcon;

    @FindBy(xpath = "//span[.='Assign to me']")
    public WebElement assignToMe;

    public void chooseCardMenuOption(String menuOptionToSelect){
        int index = -1;
        for (WebElement each : cardMenuOptionTexts) {
            index++;
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id, 'popover')]//button//span[@class='action-button__text']")));
            if (each.getText().equals(menuOptionToSelect)){
                cardMenuOptions.get(index).click();
            }
        }
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

    public int selectList(String listName){
        int count = 0;
        for (WebElement eachList : allLists) {
            count++;
            if (eachList.getText().equals(listName)){
                break;
            }
        }
        return count-1;
    }

    public int selectCard(String listName, String cardName){
        int count = selectList(listName);

        return count-1;
    }


}
