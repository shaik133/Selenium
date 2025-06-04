Feature: Library Api

Scenario: Adding book name Api

Given addbook api hit
When user calls "addBookApi" with "POST" api
Then books is added in the library
And "Msg" should be "Successfully code"