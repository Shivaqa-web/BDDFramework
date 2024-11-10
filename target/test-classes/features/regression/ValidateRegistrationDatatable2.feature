Feature:
registartion functionality
@reg7898
Scenario:  validate filling registartion for with valid details

Given user Start "Chrome" broswer
And user launch app using Url "https://adactinhotelapp.com/"
When user clicks on link using xpath "//a[normalize-space()='New User Register Here']"
Then User Verifies tittle to be "Adactin.com - New User Registration"
When  user enters details in Reg forms
|Username|Password|ConfirMpass|fullname|gamail|Capctch|
|shiva|Shiva123|Shiva123|ShivaP|Shiva@gmail.com|India|
