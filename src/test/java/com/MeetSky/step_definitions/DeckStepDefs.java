package com.MeetSky.step_definitions;

import com.MeetSky.pages.BasePage;
import com.MeetSky.pages.DeckPage;
import com.MeetSky.utilities.BrowserUtils;
import com.MeetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sql.rowset.BaseRowSet;
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
        deckPage.boardNameInput.sendKeys("School" + Keys.ENTER);
    }
    @Then("user's newly created board {string} is displayed under All boards")
    public void user_s_newly_created_board_is_displayed_under_all_boards(String expectedBoardName) {
        for (WebElement eachBoard : deckPage.boards) {
            String actualBoardName = eachBoard.getText();
            if(actualBoardName.equals(expectedBoardName)){
                Assert.assertEquals("Newly created board verification failed!", actualBoardName, expectedBoardName);
            }
        }
    }

    @Given("user selects a board")
    public void user_selects_a_board() {

    }
    @Given("user clicks on Add list button")
    public void user_clicks_on_add_list_button() {
        deckPage.addListBtn.click();
    }
    @Given("user types a list name and clicks on arrow")
    public void user_types_a_list_name_and_clicks_on_arrow() {
        deckPage.listNameInput.sendKeys("Home List");
        deckPage.listAddArrow.click();
    }
    @Then("user should be able to see the created list")
    public void user_should_be_able_to_see_the_created_list() {

    }

}
