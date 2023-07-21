package com.MeetSky.step_definitions;

import com.MeetSky.pages.BasePage;
import com.MeetSky.pages.FilePage;
import com.MeetSky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class FilesStepDefs extends BasePage {
    FilePage filePage = new FilePage();


    @Given("user is on MeetSky home page")
    public void user_is_on_meet_sky_home_page() {

    }

    @When("user click on the papa Files")
    public void user_click_on_the_papa_files() {
        BrowserUtils.sleep(2);
        filesModule.click();
    }

    @Then("user  on files page")
    public void user_on_files_page() {
       BrowserUtils.sleep(2);

    }

    @When("user click on plus icon")
    public void user_click_on_plus_icon() {
        filePage.plusIcon.click();
    }

    @When("user select upload file")
    public void user_select_upload_file() {
      BrowserUtils.sleep(2);
      filePage.uploadFile.click();
    }


    @Then("later uploading file can be seen in this file")
    public void later_uploading_file_can_be_seen_in_this_file() {
       BrowserUtils.sleep(2);
      // String expectedResult = "Download File";
     //  String actualResult = String.valueOf(filePage.downloadFile.isDisplayed());
      //  Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertTrue(filePage.downloadFile.isDisplayed());

      // filePage.downloadFile.click();
    }

    //2test
     @Then("user click on New Folder button")
    public void userClickOnNewFolderButton() {
        filePage.newFolder.click();
    }


    @Then("after creating New Folder papa user can bee seem this list")
    public void afterCreatingNewFolderPapaUserCanBeeSeemThisList() {
        Assert.assertTrue(filePage.papaFolder.isDisplayed());
    }

    @Given("user  on MeetSky home page")
    public void userOnMeetSkyHomePage() {
        BrowserUtils.sleep(2);

    }

    @When("user  click on the papa Files")
    public void userClickOnThePapaFiles() {
        BrowserUtils.sleep(2);
        filesModule.click();
    }

    @Then("user  on  files page")
    public void userOnFilesPage() {
        BrowserUtils.sleep(2);
    }


    @Then("user click on three dots")
    public void userClickOnThreeDots() {
        filePage.threeDot.click();
    }



    @And("user selected on Delete file")
    public void userSelectedOnDeleteFile() {
        Assert.assertTrue(filePage.deleteFile.isDisplayed());
    }

    @Then("user click on plus button")
    public void userClickOnPlusButton() {

        filePage.buttonPlus.click();
    }

    @Then("can see the total number of files")
    public void canSeeTheTotalNumberOfFiles() {
        Assert.assertTrue(filePage.spanFiles.isDisplayed());
    }
}


