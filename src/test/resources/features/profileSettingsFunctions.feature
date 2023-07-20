@B29G21-206
Feature:  User should be able to change profile info settings under the Profile module.



	Background: User is already in the log in page
		Given the user is on the login page
		Given the user logged in with username as "User2" and password as "Userpass123"
		Given user clicks to profile button on the dashboard page
		And user clicks to settings button
		And  user clicks to personal info button

	
	@B29G21-203
	Scenario: User can see at least following titles inside “Personal Info” under Profile Settings page;     => Full name/Email/Phone Number
		Then user should be able to see Full Name, Email and Phone Number	

	
	@B29G21-204
	Scenario: Name of the user in the Settings field should be the same with Full Name input box
		Given user clicks to profile button
		      Then username in the personal info page and under the profile button full name are the same	

	
	@B29G21-205
	Scenario: User cannot pass any characters except numbers into the "Phone Number" input box.
		Given user clicks to phone number box and writes their phone number "512756879"