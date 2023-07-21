@files
Feature:users should be able to menage their files
  Agile Story:As a user, I should be able to upload a file, move or delete any selected file under the Files module

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in with username as "User1" and password as "Userpass123"

  Scenario: verify User can upload a file
    Given user is on MeetSky home page
    When user click on the papa Files
    Then user  on files page
    When user click on plus icon
    And  user select upload file
    Then later uploading file can be seen in this file


@folder
Scenario: User can create a new folder
  Given user  on MeetSky home page
  When user  click on the papa Files
  Then user  on  files page
  When user click on plus icon
  Then user click on New Folder button
  Then after creating New Folder papa user can bee seem this list

  @delete
  Scenario: User can delete any selected item from its three dots menu
    Given user  on MeetSky home page
    When user  click on the papa Files
    Then user  on files page
    Then user click on three dots
   And  user selected on Delete file

  @check
  Scenario: User can see the total number of files and folders under the files list table
    Given user  on MeetSky home page
    When user  click on the papa Files
    Then user  on files page
    Then user click on plus button
    Then can see the total number of files

