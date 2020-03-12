Feature: Apply for CP application : user 
	In order to apply for CP application
	As a user
	I want to be able to run through an initial CP application
	
Scenario: User enter invalid username and password, click login and enters user homepage 
	Given I am on the homepage of the Oliveboard 
	Given I am on the loginpage of the Oliveboard 
	When I enter required information and login as CP user 
	Then I enter user homepage 
	
Scenario: User enter login credentials, click login and enters user homepage 
	Given I am on the homepage of the Oliveboard 
	Given I am on the loginpage of the Oliveboard 
	When I enter required information and login as CP user 
	Then I enter user homepage