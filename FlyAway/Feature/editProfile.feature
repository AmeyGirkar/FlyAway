Feature: a user Should edit their details

Scenario: Edit functionality Test

Given a user is on the home of FlyAway
And user should have click on Login-signup
And user should be redirect to LoginPage
And user should enter "<Email id>","<password>"
And user should click on login button
And  user should redirect to FLYAWAY - DASHBOARD page
And user should have clicked on EditProfile 
And user should able to redirect to FLYAWAY - EDIT PROFILE page
And user should enter "<password>","<Confirm Password>" ,"<Name>","Address","City"

Examples:
|Email id				|password		|Confirm Password		|Name		|Address		|City		|
|xyz@gmail.com	|1234				|1234								|xyz		|apna bazar	|Mum		|
|pqrst@gmail.com|1234				|1234								|pqrst	|big bazar	|Goa		|
|uvw@gmail.com	|1234				|1234								|uvw		|Jio Mart		|pune		|
|opqr@gmail.com	|1234				|1234								|opqr		|Park				|chennai|
|mnop@gmail.com	|1234				|1234								|mnop		|Taj				|Agra		|