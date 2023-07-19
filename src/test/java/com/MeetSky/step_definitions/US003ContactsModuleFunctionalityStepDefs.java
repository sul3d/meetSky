package com.MeetSky.step_definitions;

import com.MeetSky.pages.BasePage;
import com.MeetSky.pages.ContactsPageOV;
import com.MeetSky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US003ContactsModuleFunctionalityStepDefs extends BasePage {

    ContactsPageOV contactsPage = new ContactsPageOV();

    @Given("User is on MeetSky home page")
    public void user_is_on_meet_sky_home_page() {

    }
    @When("User clicks Contacts Module on Dashboard")
    public void user_clicks_contacts_module_on_dashboard() {
        BrowserUtils.sleep(2);

        contactsModule.click();
    }

    @When("User clicks New contact button")
    public void user_clicks_new_contact_button() {

        BrowserUtils.sleep(2);
        contactsPage.newContactButton.click();
    }


    @When("User write name on Company field of New contact")
    public void user_write_name_on_company_field_of_new_contact() {


        BrowserUtils.sleep(2);

        contactsPage.companyName.sendKeys("Jack");
    }

    @When("User write last name on Title field of New contact")
    public void user_write_last_name_on_title_field_of_new_contact() {

        BrowserUtils.sleep(2);
       contactsPage.titleName.sendKeys("Spoon");
    }


    @Then("User should be see New contact in the All Contacts List")
    public void user_should_be_see_new_contact_in_the_all_contacts_list() {


        String expectedResult = "New contact";
        String actualResult = contactsPage.name1NewContact.getText();

        System.out.println("contactsPage.newContact.getText() = " + contactsPage.name1NewContact.getText());

        Assert.assertTrue(actualResult.contains(expectedResult));


    }



    //2 Test
    @And("Uer clicks All contacts button")
    public void uerClicksAllContactsButton() {
        contactsPage.allContactsButton.click();

    }

    @And("User should be able to see the total number of the list")
    public void userShouldBeAbleToSeeTheTotalNumberOfTheList() {


    }

    @Then("User should be able to see whole list on All contacts")
    public void userShouldBeAbleToSeeWholeListOnAllContacts(List<WebElement> contacts, String cont ) {


        /*
        contactsPage.groupContact.isDisplayed();

        String expectedResult = "Jack";
        String actualResult = contactsPage.groupContact.getText();

        Assert.assertTrue(expectedResult.contains(expectedResult));

         */

        for (WebElement each : contacts) {
            if(contactsPage.groupContact.getText().contains(each.getAttribute("option__lineone"))){
                System.out.println("each = " + each);
            }
        }



    }

    @And("User clicks on imagine icon New contact profile picture")
    public void userClicksOnImagineIconNewContactProfilePicture() {
    }

    @And("User clicks Choose from files option")
    public void userClicksChooseFromFilesOption() {
    }

    @And("User clicks {int}.jpg picture")
    public void userClicksJpgPicture(int arg0) {
    }

    @And("User clicks {int}dots button in New contact")
    public void userClicksDotsButtonInNewContact(int arg0) {
    }

    @Then("User clicks Delete option")
    public void userClicksDeleteOption() {
    }
}
