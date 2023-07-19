@B29G21-184
Feature: Contacts Module Functionality


	Background: User is already in the log in page
		Given the user logged in as "<userType>"
		Given the user logged in with username as "User1" and password as "Userpass123"


	@B29G21-177
	Scenario: User can create a new contact
		Given User is on MeetSky home page
		When User clicks Contacts Module on Dashboard
		And User clicks New contact button
		And User write name on Company field of New contact
		And User write last name on Title field of New contact
		Then User should be see New contact in the All Contacts List


	@B29G21-180
	Scenario: User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
		Given User is on MeetSky home page
		When User clicks Contacts Module on Dashboard
		And User clicks New contact button
		And User write name on Company field of New contact
		And User write last name on Title field of New contact
		And Uer clicks All contacts button
		And User should be able to see the total number of the list 
		Then User should be able to see whole list on All contacts	


	@B29G21-182
	Scenario: User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
		Given User is on MeetSky home page
		When User clicks Contacts Module on Dashboard
		And User clicks New contact button
		And User write name on Company field of New contact
		And User write last name on Title field of New contact
		And User clicks on imagine icon New contact profile picture
		And User clicks Choose from files option
		And User clicks 435.jpg picture


	@B29G21-183
	Scenario: User can delete any selected contact
		Given User is on MeetSky home page
		When User clicks Contacts Module on Dashboard
		And User clicks New contact button
		And User write name on Company field of New contact
		And User write last name on Title field of New contact
		And User clicks 3dots button in New contact 
		Then User clicks Delete option