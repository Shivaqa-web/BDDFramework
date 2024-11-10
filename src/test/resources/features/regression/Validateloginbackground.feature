Feature: To Validate login functionality

Background:
Given user Start "Chrome" broswer 
And user launch app using Url "https://adactinhotelapp.com/"
Scenario: To Validate login using valid Credenatils

Scenario: To validate login using valid and valid


When user enters text "reyaz0806" username textbox by using xpath "//input[@id='username']"
And user enters text "reyaz123" Password textbox by using xpath "//input[@id='password']"
And User clicks  button using xpath "//input[@id='login']"
Then User Verifies tittle to be "Adactin.com - Search Hotel"
Scenario: To validate login using valid and invalid


When user enters text "reyaz0806" username textbox by using xpath "//input[@id='username']"
And user enters text "reyaz" Password textbox by using xpath "//input[@id='password']"
And User clicks  button using xpath "//input[@id='login']"
Then User Verifies tittle to be "Adactin.com - Hotel Reservation System"
Scenario: To validate login using invalid and valid


When user enters text "reyaz06" username textbox by using xpath "//input[@id='username']"
And user enters text "reyaz123" Password textbox by using xpath "//input[@id='password']"
And User clicks  button using xpath "//input[@id='login']"
Then User Verifies tittle to be "Adactin.com - Hotel Reservation System"
Scenario: To validate login using invalid and invalid


When user enters text "reyaz0ir6" username textbox by using xpath "//input[@id='username']"
And user enters text "reyaz183" Password textbox by using xpath "//input[@id='password']"
And User clicks  button using xpath "//input[@id='login']"
Then User Verifies tittle to be "Adactin.com - Hotel Reservation System"

