package com.MeetSky.step_definitions;

import com.MeetSky.pages.CalendarPage;
import com.MeetSky.utilities.BrowserUtils;
import com.MeetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class CalendarModuleStepDefinition {

    CalendarPage calendarPage = new CalendarPage();

    @Given("User is on Meetsky home page")
    public void user_is_on_meetsky_home_page() {

    }

    @When("User clicks {string} Module button on the Dashboard")
    public void user_clicks_module_button_on_the_dashboard(String calendar) {
        calendarPage.calendarModule.click();
    }

    @When("User clicks Hamburger menu button under Dashboard")
    public void user_clicks_hamburger_menu_button_under_dashboard() {
        calendarPage.hamburgerButton.click();
    }

    @When("User clicks Day icon")
    public void user_clicks_day_icon() {
        calendarPage.dayIcon.click();
    }

    @Then("User should be able to see daily calendar view")
    public void user_should_be_able_to_see_daily_calendar_view() {
        String expectedResult = "Day";
        String actualResult = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @When("User clicks Week icon")
    public void user_clicks_week_icon() {
        calendarPage.weekIcon.click();
    }

    @Then("User should be able to see weekly calendar view")
    public void user_should_be_able_to_see_weekly_calendar_view() {
        String expectedResult = "Week";
        String actualResult = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @When("User clicks Month icon")
    public void user_clicks_month_icon() {
        calendarPage.monthIcon.click();
    }

    @Then("User should be able to see monthly calendar view")
    public void user_should_be_able_to_see_monthly_calendar_view() {
        String expectedResult = "Month";
        String actualResult = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @When("User clicks {string} button under Dashboard")
    public void user_clicks_button_under_dashboard(String string) {
        calendarPage.newEvent.click();
    }

    @When("User prints event's title in Event title field")
    public void user_prints_event_title_in_event_title_field() {
        calendarPage.eventTitle.sendKeys("Lollapalooza");
    }

    @When("User selects event's start day and time in event's start day and time field")
    public void user_prints_event_s_start_day_and_time_in_event_s_start_day_and_time_field() {
        calendarPage.datePicker1.click();
        BrowserUtils.sleep(1);
        calendarPage.hourPick1.click();
        BrowserUtils.sleep(1);
        calendarPage.minutesPick1.click();
        BrowserUtils.sleep(1);
        calendarPage.pickAM.click();
        BrowserUtils.sleep(1);
        calendarPage.pickDateButton.click();
        BrowserUtils.sleep(1);
        calendarPage.yearButton.click();
        BrowserUtils.sleep(1);
        calendarPage.pickYear.click();
        BrowserUtils.sleep(1);
        calendarPage.pickMonth.click();
        BrowserUtils.sleep(1);
        calendarPage.pickDate1.click();
        BrowserUtils.sleep(1);
        calendarPage.buttonOK.click();
        BrowserUtils.sleep(1);


    }

    @When("User selects event's end day and time in event's end day and time field")
    public void user_prints_event_s_end_day_and_time_in_event_s_end_day_and_time_field() {
        calendarPage.datePicker2.click();
        BrowserUtils.sleep(1);
        calendarPage.hourPick2.click();
        BrowserUtils.sleep(1);
        calendarPage.minutesPick2.click();
        BrowserUtils.sleep(1);
        calendarPage.pickPM.click();
        BrowserUtils.sleep(1);
        calendarPage.pickDateButton.click();
        BrowserUtils.sleep(1);
        calendarPage.yearButton.click();
        BrowserUtils.sleep(1);
        calendarPage.pickYear.click();
        BrowserUtils.sleep(1);
        calendarPage.pickMonth.click();
        BrowserUtils.sleep(1);
        calendarPage.pickDate2.click();
        BrowserUtils.sleep(1);
        calendarPage.buttonOK.click();
        BrowserUtils.sleep(1);


    }

    @Then("User clicks {string} button")
    public void user_clicks_button(String string) {
        calendarPage.saveButton.click();
        BrowserUtils.sleep(1);

    }


    @Then("User should be able to see a new event on related day through the Monthly Calendar view")
    public void user_should_be_able_to_see_a_new_event_on_related_day_through_the_monthly_calendar_view() {

        calendarPage.nextMonth.click();

        String expectedResult = "Lollapalooza";
        String actualResult = calendarPage.event.getText();
        Assert.assertEquals(actualResult,expectedResult);
       // Assert.assertTrue(calendarPage.event.isDisplayed());



    }


}
