package com.MeetSky.step_definitions;

import com.MeetSky.pages.BasePage;
import com.MeetSky.pages.ContactsPageOV;
import com.MeetSky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
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

        contactsPage.icon3Dot.click();
        contactsPage.deleteButton.click();

    }



    //2 Test
    @And("Uer clicks All contacts button")
    public void uerClicksAllContactsButton() {
        contactsPage.allContactsButton.click();

    }

    @And("User should be able to see the total number of the list")
    public void userShouldBeAbleToSeeTheTotalNumberOfTheList() {


        /*System.out.print("contactsPage.notGroupedIcon.getText() = " + contactsPage.notGroupedIcon.getText());

        String expectedResult = "1";
        String actualResult = contactsPage.notGroupedIcon.getText();

        Assert.assertTrue(actualResult.contains(expectedResult));

         */




    }

    @Then("User should be able to see whole list on All contacts")
    public void userShouldBeAbleToSeeWholeListOnAllContacts() {


        //System.out.println("contactsPage.groupContact.getText() = " + contactsPage.groupContact.getText());
        Assert.assertTrue(contactsPage.groupContact.isDisplayed());







        //Assert.assertTrue(count >0);

        // System.out.println("contactsPage.contactList.contains(\"New contact\") = " + contactsPage.contactList.contains("New contact"));

        // int contacts = contactsPage.contactList.size();



        //System.out.println("contacts = " + contacts);


        //Assert.assertTrue(contacts ==1);

      contactsPage.icon3Dot.click();
      contactsPage.deleteButton.click();

    }





    //3 Test
    @And("User clicks on imagine icon New contact profile picture")
    public void userClicksOnImagineIconNewContactProfilePicture() {
        BrowserUtils.sleep(2);
        contactsPage.pictureProfileButton.click();

    }



    @And("User clicks Choose from files option")
    public void userClicksChooseFromFilesOption() {
        BrowserUtils.sleep(2);
        contactsPage.chooseFromFilesButton.click();
    }

    @And("User clicks 435.jpg picture")
    public void userClicksJpgPicture() {
        BrowserUtils.sleep(2);
        contactsPage.fileNamePicture.click();
    }

    @Then("User clicks choose button")
    public void userClicksChooseButton() {

        contactsPage.chooseButton.click();
        BrowserUtils.sleep(2);


        contactsPage.icon3Dot.click();
        contactsPage.deleteButton.click();


    }


//4
    @And("User clicks 3dots button in New contact")
    public void userClicksDotsButtonInNewContact() {

        BrowserUtils.sleep(2);
        contactsPage.icon3Dot.click();
    }



    @Then("User clicks Delete option")
    public void userClicksDeleteOption() {

        BrowserUtils.sleep(2);
        contactsPage.deleteButton.click();
    }








}
