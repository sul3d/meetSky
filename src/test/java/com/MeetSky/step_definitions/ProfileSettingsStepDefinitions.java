package com.MeetSky.step_definitions;

import com.MeetSky.pages.BasePage;
import com.MeetSky.pages.ProfileSettingsPage;
import com.MeetSky.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProfileSettingsStepDefinitions extends BasePage {

    ProfileSettingsPage page = new ProfileSettingsPage();

    @Given("user clicks to profile button on the dashboard page")
    public void user_clicks_to_profile_button_on_the_dashboard_page() {
        profileSettings.click();
    }
    @Given("user clicks to settings button")
    public void user_clicks_to_settings_button() {
        settingsLink.click();
    }
    @Given("user clicks to personal info button")
    public void user_clicks_to_personal_info_button() {
        /*BrowserUtils.waitForVisibility(page.securityButton,3);
         page.securityButton.click();*/

        page.personalInfoButton.click();
    }
    @Then("user should be able to see Full Name, Email and Phone Number")
    public void user_should_be_able_to_see_full_name_email_and_phone_number() {
       page.userName.isDisplayed();
       page.email.isDisplayed();
       page.phoneNumber.isDisplayed();
    }

    @Given("user clicks to profile button")
    public void userClicksToProfileButton() {
        profileSettings.click();
    }

    @Then("username in the personal info page and under the profile button full name are the same")
    public void usernameInThePersonalInfoPageAndUnderTheProfileButtonFullNameAreTheSame() {
        Assert.assertTrue(page.userNameBox.getAttribute("value").equals(fullName.getText()));

    }

    @Given("user clicks to phone number box and writes their phone number {string}")
    public void userClicksToPhoneNumberBoxAndWritesTheirPhoneNumber(String phoneNumber) {
        page.phoneNumberSend(phoneNumber);




    }
}
