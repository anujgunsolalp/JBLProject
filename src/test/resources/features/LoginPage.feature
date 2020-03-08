Feature: Apply for CP application : user
	In order to apply for CP application
	As a user
	I want to be able to run through an initial CP application

  Scenario: User enter login credentials, click login and enters user homepage
  	Given I am on the homepage of the SHRM
  	Given I am on the loginpage of the SHRM
  	When I enter required information and login as CP user
	Then I enter user homepage