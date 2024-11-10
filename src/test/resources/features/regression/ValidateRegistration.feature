Feature:
registartion functionality
@reg
Scenario:  validate filling registartion for with valid details

Given user Start "Chrome" broswer
And user launch app using Url "https://adactinhotelapp.com/"
When user clicks on link using xpath "//a[normalize-space()='New User Register Here']"
Then User Verifies tittle to be "Adactin.com - New User Registration"
When  user enters text "shiva" username textbox by using xpath "//input[@name='username']"
And user enters text "shiva123" username textbox by using xpath "//input[@name='password']"
And user enters text "shiva123" username textbox by using xpath "//input[@name='re_password']"
And user enters text "pshiva" username textbox by using xpath "//input[@name='full_name']"
And user enters text "shiva@gmail.com" username textbox by using xpath "//input[@name='email_add']"
And user enters text "shiva" username textbox by using xpath "//input[@name='captcha']"