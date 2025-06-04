
Feature: Trello Board creation

Scenario: Create Trello Board
Given user sends key token and name of the board
When user calls create board api by sending post request
Then api call is success with "status" code "200"
And  api call is success with "board name" 

