Feature: Trello board creation

Scenario: creation of board

Given user sends key, token and name
When user calls api by hitting post request
Then user validate success response with status code 200
And user validate success response with "scope" "APP"


