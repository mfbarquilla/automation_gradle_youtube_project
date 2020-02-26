Feature: Search video in Youtube.com

Scenario: Verify the user is able search a video in youtube
Given I navigate to youtube.com
When I type the video in search box
And I click on search button
Then Video contents exist