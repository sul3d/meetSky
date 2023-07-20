package com.MeetSky.step_definitions;

import com.MeetSky.pages.BasePage;
import com.MeetSky.pages.CustomizePage;
import com.MeetSky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DashboardCustomizeStepDefinitions extends BasePage{

    CustomizePage customizePage = new CustomizePage();

    @Given("user can see username")
    public void user_can_see_username() {
        profileSettings.click();
        fullName.isDisplayed();
    }
    @Then("user can see all modules")
    public void user_can_see_all_modules() {
        customizePage.allModulesVisibility();
    }

    @Given("user clicks customize button")
    public void user_clicks_customize_button() {
        customizeLink.click();
    }
    @Given("user should be able to see all {int} widgets")
    public void user_should_be_able_to_see_all_widgets(Integer sumOfWidgets) {
        Assert.assertTrue(sumOfWidgets.equals(customizePage.allWidgets.size()));
        /*if (!(sumOfWidgets.equals(customizePage.allWidgets.size()))){
            System.exit(1);
        }*/
        customizePage.allModulesVisibility();

    }
    @Then("user should select any of the widgets")
    public void user_should_select_any_of_the_widgets() {
        customizePage.selectWidget("Status");
        customizePage.selectWidget("Weather");
        customizePage.selectWidget("Notes");
    }


    @Given("user clicks profile button")
    public void user_clicks_profile_button() {
        profileSettings.click();
    }
    @Given("user clicks Set Status button")
    public void user_clicks_set_status_button() {
        statusLink.click();
    }
    @Given("user should be able to see all {int} status options")
    public void user_should_be_able_to_see_status_options(Integer status) {

        if (!(status.equals(customizePage.allstatusWidgets.size()))){
            System.exit(1);
        }
       customizePage.allStatusVisibility();
    }
    @Then("user clicks any status option")
    public void user_clicks_any_status_option() {
        customizePage.selectStatus("Away");
        customizePage.selectStatus("disturb");
        customizePage.selectStatus("Invisible");
        customizePage.selectStatus("Online");

    }



}
