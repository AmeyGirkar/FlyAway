Feature: a user Should log into his account

Scenario: Login Functionality Test

Given a user is on the home of FlyAway
And user should have click on Login-signup
And user should be redirect to LoginPage
Then user should enter "<Email id>","<password>"
And user should click on login button
Then user should redirect to FLYAWAY - DASHBOARD page
Examples:
|Email id				|password		|
|xyz@gmail.com	|1234				|
|pqrst@gmail.com|1234				|
|uvw@gmail.com	|1234				|
|opqr@gmail.com	|1234				|
|mnop@gmail.com	|1234				|