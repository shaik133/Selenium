Feature: Library API

Scenario: AddBook to the Library API
Given: new Book is adding to the library API
When: user calls "AddBook API" with "Post" method
Then: API call should be 200
And: book is successfully added with "Msg" returning "successfully added"