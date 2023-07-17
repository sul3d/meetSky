@deck
Feature: Users should be able to manage their work
  Agile Story: As a user, I should be able to manage my works by creating
                a new board/list/card and modifying them under Deck Module.

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in with username as "User1" and password as "Userpass123"

    Scenario: Verify user can create a new board
      Given the user is on the Deck Module page
      And user clicks on the three lines to open navigation
      And user clicks on Add board
      And user types a board name "School"
      Then user's newly created board "School" is displayed under All boards

    Scenario: Verify user can create a new list of card/task under any board
      Given user selects a board
      And user clicks on Add list button
      And user types a list name and clicks on arrow
      Then user should be able to see the created list
