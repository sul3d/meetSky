@B29G21-187
Feature: Calendar Module Functionality

  Background: User is already in the log in page
	  Given the user logged in as "<userType>"
	  Given the user logged in with username as "User2" and password as "Userpass123"


  @B29G21-178
  Scenario: User can display daily calendar view
    When User clicks "Calendar" Module button on the Dashboard
    And User clicks Hamburger menu button under Dashboard
    And User clicks Day icon
    Then User should be able to see daily calendar view

  @B29G21-179
  Scenario: User can display weekly calendar view
    When User clicks "Calendar" Module button on the Dashboard
    And User clicks Hamburger menu button under Dashboard
    And User clicks Week icon
    Then User should be able to see weekly calendar view

  @B29G21-181
  Scenario: User can display monthly calendar view
    When User clicks "Calendar" Module button on the Dashboard
    And User clicks Hamburger menu button under Dashboard
    And User clicks Month icon
    Then User should be able to see monthly calendar view

  @B29G21-185
  Scenario: User can create a new event under the Calendar module
    When User clicks "Calendar" Module button on the Dashboard
    And User clicks "+ New event" button under Dashboard
    And User prints event's title in Event title field
    When User selects event's start day and time in event's start day and time field
    And User selects event's end day and time in event's end day and time field
    Then User clicks "Save" button

  @B29G21-186
  Scenario: User can see new event on the related day through the Monthly Calendar view
    When User clicks "Calendar" Module button on the Dashboard
    And User clicks Hamburger menu button under Dashboard
    And User clicks Month icon
    Then User should be able to see a new event on related day through the Monthly Calendar view