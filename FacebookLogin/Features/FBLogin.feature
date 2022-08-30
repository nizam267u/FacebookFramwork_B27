Feature: User able to use zoopla application, login the application, searching the property, buy the property 

@Smoke
@Sanity
@Regression
Scenario:  User able to login the application & verfy the users informations on the grid

Given User able to open a any browser 
And  User able to enter "https://www.facebook.com/login/" url
When User able to enter valid userName & password
And User able to click on login button
Then User can verify the user information "Group conversations" on the grid 
