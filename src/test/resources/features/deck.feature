@deck
Feature: Users should be able to manage their work
  Agile Story: As a user, I should be able to manage my works by creating
  a new board/list/card and modifying them under Deck Module.

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in with username as "User143" and password as "Userpass123"
    #Given the user logged in with username as "Employee60" and password as "Employee123"
    Given the user is on the Deck Module page
    When user clicks on the three lines to open navigation

  Scenario: Verify user can create a new board
    And user clicks on Add board
    And user types a board name "School"
    Then user's newly created board "School" is displayed under All boards


  Scenario: Verify user can create a new list of card/task under any board
    When user selects a "School" board
    And user clicks on Add list button
    And user types a list name "List 1" and clicks on arrow
    Then user should be able to see "List 1" list under "School" board

  Scenario: Verify user can add a new card/task on any list on the current board
    When user selects a "School" board
    And user clicks on Add card button of "List 1"
    And user types a card name "New Card" and clicks on arrow
    Then user should be able to see "New Card" card under "List 1"

  Scenario: Verify user can assign any card/task to himself/herself by using the three dots on the related card
    When user selects a "School" board
    And user clicks on the three dot button of the New Card
    And user selects Assign to me
    #And user selects "Assign to me"
    Then user should see users profile icon next to three dot icon