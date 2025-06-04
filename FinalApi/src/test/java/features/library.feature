Feature: Library API

Scenario: AddBook to the Library

Given: AddBook to library using addbook payload
When: user calls "AddBook Api" with "Post" method
Then: book is added to the library with success code
And: user validates response "Msg" containing "successfully added"