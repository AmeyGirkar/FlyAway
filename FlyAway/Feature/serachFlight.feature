Feature: a user Should see a available flight

Scenario: serching Flight Test

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
Then user should have seen a Book Flight option
