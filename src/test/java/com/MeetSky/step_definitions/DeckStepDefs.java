package com.MeetSky.step_definitions;

import com.MeetSky.pages.BasePage;
import com.MeetSky.pages.DeckPage;
import com.MeetSky.utilities.BrowserUtils;
import com.MeetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeckStepDefs extends BasePage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    DeckPage deckPage = new DeckPage();

    @Given("the user is on the Deck Module page")
    public void the_user_is_on_the_deck_module_page() {
        //moduleSelection("Deck");
        deckModule.click();
    }
    @Given("user clicks on the three lines to open navigation")
    public void user_clicks_on_the_three_lines_to_open_navigation() {
        deckPage.threeLineNavigationBtn.click();
        //if navigation is closed click
        //if not continue
        //wait.until(ExpectedConditions.visibilityOf(deckPage.closedNavigationBtn));
    }
    @Given("user clicks on Add board")
    public void user_clicks_on_add_board() {
        deckPage.addBoardLink.click();
    }
    @Given("user types a board name {string}")
    public void user_types_a_board_name(String boardName) {
        deckPage.boardNameInput.sendKeys(boardName + Keys.ENTER);
    }
    @Then("user's newly created board {string} is displayed under All boards")
    public void user_s_newly_created_board_is_displayed_under_all_boards(String expectedBoardName) {
        for (WebElement eachBoard : deckPage.allBoards) {
            String actualBoardName = eachBoard.getText();
            if(actualBoardName.equals(expectedBoardName)){
                Assert.assertEquals("Newly created board verification failed!", actualBoardName, expectedBoardName);
            }
        }
    }

    @Given("user selects a {string} board")
    public void user_selects_a_board(String boardNameToSelect) {
        //BrowserUtils.waitForVisibilityOf(deckPage.allBoards);
        int boardIndexToClick = deckPage.selectBoard(boardNameToSelect);
        deckPage.allBoards.get(boardIndexToClick).click();

    }

    @When("user clicks on Add list button")
    public void user_clicks_on_add_list_button() {
        BrowserUtils.waitForVisibility(deckPage.addListBtn, 5);
        deckPage.addListBtn.click();
    }
    @When("user types a list name {string} and clicks on arrow")
    public void user_types_a_list_name_and_clicks_on_arrow(String listName) {
        BrowserUtils.waitForVisibility(deckPage.listNameInput, 5);
        deckPage.listNameInput.sendKeys(listName);
        deckPage.listAddArrow.click();
    }
    @Then("user should be able to see {string} list under {string} board")
    public void user_should_be_able_to_see_list_under_board(String expectedListName, String expectedBoardName) {
        Assert.assertEquals(expectedBoardName, deckPage.selectedBoardName.getText());
        String actualListName = "";
        for (WebElement eachList : deckPage.allLists) {
            if (expectedListName.equals(eachList.getText())){
                Assert.assertTrue(eachList.isDisplayed());
            }
        }
    }

    @When("user clicks on Add card button of {string}")
    public void user_clicks_on_add_card_button_of(String listName) {
        deckPage.addCardBtn.click();
    }
    @When("user types a card name {string} and clicks on arrow")
    public void user_types_a_card_name_and_clicks_on_arrow(String cardName) {
        deckPage.cardNameInput.sendKeys(cardName);
        deckPage.cardAddArrow.click();
    }
    @Then("user should be able to see {string} card under {string}")
    public void user_should_be_able_to_see_card_under(String cardName, String listName) {
        for (WebElement eachList : deckPage.allLists) {
            if(listName.equals(eachList.getText())){
                for (WebElement eachCard : deckPage.allCards) {
                    if(cardName.equals(eachCard.getText())){
                        Assert.assertTrue(eachCard.isDisplayed());
                    }
                }
            }
        }
    }

    @When("user clicks on the three dot button of the New Card")
    public void user_clicks_on_the_three_dot_button_of_the_new_card() {
        deckPage.threeDotCardMenuBtn.click();
    }

//    @When("user selects {string}")
//    public void user_selects(String cardName) {
//        deckPage.chooseCardMenuOption(cardName);
//    }

    @When("user selects Assign to me")
    public void user_selects_assign_to_me() {
        deckPage.cardMenuOptions.get(0).click();
    }
    @Then("user should see users profile icon next to three dot icon")
    public void user_should_see_users_profile_icon_next_to_three_dot_icon() {
        BrowserUtils.waitForVisibility(deckPage.profileIcon, 3);
        Assert.assertTrue(deckPage.profileIcon.isDisplayed());
    }








}
