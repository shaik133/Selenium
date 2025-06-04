@tag(addPlace)
Feature: Perform various action in google Api

Scenario Outline: AddPlace in google Api
Given user sends addPlace payload with "<name>"
When user calls "AddPlaceApi" with "Post" method
Then "status" should be "OK"
And "scope" should be "APP"
And user validates the place_id maps to the "<name>" by using "GetPlaceApi"

Examples: 
				|name				|
				|second name|
				
				
Scenario: validating deletApi is successfull
Given user sends deletePlace payload
When user calls "DeletePlaceApi" with "Post" method
Then "status" should be "OK"

Scenario Outline: Google map Put place API
Given user sends updatePlace payload with "<address>"
When user calls "PutPlaceApi" with "Post" method
Then "key" should be "qaclick123"


Examples:
		|address							 	      |
		|my new updated second address1|
