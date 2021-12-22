Feature: a user Should Book a flight 

Scenario: Booking a Flight

Given a user is on the home of FlyAway
And user should have click on Login-signup
And user should be redirect to LoginPage
Then user should enter "xyz@gmail.com","1234"
And user should click on login button
Then user should redirect to FLYAWAY - DASHBOARD page
And user should have clicked on Homepage
Then user should redirect to FLYAWAY HOMEPAGE page
And  user should select Mumbai as source and Bengalore as destination
And click on submit button
And user should have clicked Book Flight option
Then user should redirect to FLYAWAY - PAYMENT GATEWAY
Then User should have clicked on Click to complete Booking
And user should see flyway -booking Confirmation message
