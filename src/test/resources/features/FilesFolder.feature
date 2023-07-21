@B29G21-213
Feature: Default
	Background: User is already in the log in page
		Given the user is on the login page
		Given the user logged in with username as "User1" and password as "Userpass123"

	#{color:#de350b}*User Story :*{color} 
	#
	#As a user, I should be able to upload a file, move or delete any selected file under the *+Files+* module 
	# # User can upload a file
	@B29G21-209
	Scenario: User can create a new folder
		Given user is on MeetSky home page
		    When user click on the papa Files
		    Then user  on files page
		    When user click on plus icon
		    And  user select upload file
		    Then later uploading file can be seen in this file	

	#As a user, I should be able to upload a file, move or delete any selected file under the Files module
	# 
	#1.User can create a new folder
	@B29G21-210
	Scenario: User can create a new folder
		Given user  on MeetSky home page
		  When user  click on the papa Files
		  Then user  on  files page
		  When user click on plus icon
		  Then user click on New Folder button
		  Then after creating New Folder papa user can bee seem this list	

	#As a user, I should be able to upload a file, move or delete any selected file under the Files module
	# 
	#1.User can delete any selected item from its three dots menu
	@B29G21-211
	Scenario: User can delete any selected item from its three dots menu
		Given user  on MeetSky home page
		    When user  click on the papa Files
		    Then user  on files page
		    Then user click on three dots
		   And  user selected on Delete file	

	#As a user, I should be able to upload a file, move or delete any selected file under the Files module
	# 
	#1. User can see the total number of files and folders under the files list table
	@B29G21-212
	Scenario: User can see the total number of files and folders under the files list table
		Given user  on MeetSky home page
		    When user  click on the papa Files
		    Then user  on files page
		    Then user click on plus button
		    Then can see the total number of files