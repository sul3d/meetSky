@B29G21-199
Feature: User should be able to modify Dashboard page

	Background: User is already in the log in page
		Given the user is on the login page
		Given the user logged in with username as "User150" and password as "Userpass123"


	@B29G21-194
	Scenario: Verify after login user can see all modules and username
		Given user can see username
		Then user can see all modules	

	
	@B29G21-197
	Scenario: User can click on Customize button and select any of the Widgets.
		Given user clicks customize button
		      And user should be able to see all 9 widgets
		      Then user should select any of the widgets	

	
	@B29G21-198
	Scenario: User can click on Set Status button and select any of the Status options.
		Given user clicks profile button
		      And user clicks Set Status button
		      And user should be able to see all 4 status options
		      Then user clicks any status option