Feature: a user should be create a new account

Scenario: Signup for FlyAwayAccount

Given a user is on the home of FlyAway
And user should have click on Login-signup
And user should be redirect to LoginPage
And user should click on Not a member? Signup
And user should able to redirect to FLYAWAY - MEMBER REGISTRATION page
Then user should enter "<Email id>","<password>","<Confirm Password>" ,"<Name>"	
Then user should redirect to Fly Away - Registration Confirmation page

Examples:
|Email id				|password		|Confirm Password		|Name		|
|xyz@gmail.com	|1234				|1234								|xyz		|
|pqrst@gmail.com|1234				|1234								|pqrst	|
|uvw@gmail.com	|1234				|1234								|uvw		|
|opqr@gmail.com	|1234				|1234								|opqr		|
|mnop@gmail.com	|1234				|1234								|mnop		|