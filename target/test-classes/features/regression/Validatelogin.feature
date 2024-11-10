Feature: To Validate login functionality

Scenario: To Validate login using valid Credenatils


Given user Start "Chrome" broswer 
And user launch app using Url "https://adactinhotelapp.com/"
When user enters text "reyaz0806" username textbox by using xpath "//input[@id='username']"
And user enters text "reyaz123" Password textbox by using xpath "//input[@id='password']"
And User clicks  button using xpath "//input[@id='login']"
Then User Verifies tittle to be "Adactin.com - Search Hotel"

