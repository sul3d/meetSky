@B29G21-192
Feature: Default

	Background: User is already in the log in page
		Given the user is on the login page
		Given the user logged in with username as "User143" and password as "Userpass123"
    	#Given the user logged in with username as "Employee60" and password as "Employee123"

	@B29G21-188
	Scenario: Verify user can create a new board
		Given the user is on the Deck Module page
		    When user clicks on the three lines to open navigation
		    And user clicks on Add board
		    And user types a board name "School"
		    Then user's newly created board "School" is displayed under All boards	

	
	@B29G21-189
	Scenario: Verify user can create a new list of card/task under any board
		Given the user is on the Deck Module page
		    When user clicks on the three lines to open navigation
		    When user selects a "School" board
		    And user clicks on Add list button
		    And user types a list name "List 1" and clicks on arrow
		    Then user should be able to see "List 1" list under "School" board	

	
	@B29G21-190
	Scenario: Verify user can add a new card/task on any list on the current board
		Given the user is on the Deck Module page
		    When user clicks on the three lines to open navigation
		    When user selects a "School" board
		    And user clicks on Add card button of "List 1"
		    And user types a card name "New Card" and clicks on arrow
		    Then user should be able to see "New Card" card under "List 1"	

	
	@B29G21-191
	Scenario: Verify user can assign any card/task to himself/herself by using the three dots on the related card
		Given the user is on the Deck Module page
		    When user clicks on the three lines to open navigation
		    When user selects a "School" board
		    And user clicks on the three dot button of the New Card
		    And user selects Assign to me
		    Then user should see users profile icon next to three dot icon