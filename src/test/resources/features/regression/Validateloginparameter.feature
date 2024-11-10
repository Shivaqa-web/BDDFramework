Feature: To Validate login functionality

@Smoke
Scenario Outline: To Validate login using different combination of Credenatils


Given user Start "Chrome" broswer 
And user launch app using Url "https://adactinhotelapp.com/"
When user enters text '<username>' username textbox by using xpath "//input[@id='username']"
And user enters text '<password>' Password textbox by using xpath "//input[@id='password']"
And User clicks  button using xpath "//input[@id='login']"
Then User Verifies tittle to be '<Exp Title>'

Examples:
|username|password|Exp Title|
|reyaz0806|reyaz123|Adactin.com - Search Hotel|
|reyaz0806|reyaz893|Adactin.com - Hotel Reservation System|
|reyaz06|reyaz123|Adactin.com - Hotel Reservation System|
|reyaz08|reyaz893|Adactin.com - Hotel Reservation System|
