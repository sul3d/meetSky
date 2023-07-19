@deck
Feature: Users should be able to manage their work
  Agile Story: As a user, I should be able to manage my works by creating
  a new board/list/card and modifying them under Deck Module.

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in with username as "User1" and password as "Userpass123"
    Given the user is on the Deck Module page
    And user clicks on the three lines to open navigation

  Scenario Outline: Verify user can create a new board
    And user clicks on Add board
    And user types a board name "<board name>"
    Then user's newly created board "<board name>" is displayed under All boards

    Examples:
    |board name|
    |School Board|
    |Home Board|

  Scenario Outline: Verify user can create a new list of card/task under any board
    Given user selects a "<board name>" board
    And user clicks on Add list button
    And user types a list name "<list name>" and clicks on arrow
    Then user should be able to see "<list name>" list under "<board name>" board

    Examples:
      | list name   | board name |
      | School List | School Board    |
      | Home List   | Home Board      |

  Scenario Outline: Verify user can add a new card/task on any list on the current board
    Given user selects a "<board name>" board
    And user clicks on Add card button of "<list name>" list
    And user types a card name "<card name>" and clicks on arrow
    Then user should be able to see "<card name>" card under "<list name>" list

    Examples:
      | list name   | card name   | board name |
      | School List | School Card | School     |
      | Home List   | Home Card   | Home       |

  @deckwip



