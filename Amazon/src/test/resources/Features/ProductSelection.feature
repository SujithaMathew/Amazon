Feature: To verify the product checkout functionality

@product
Scenario Outline: to verify the particular product and checkout

Given User has to navigate Amazon page
When Search for the product "<Product Name>"
And Select the three star rating 
And Select the lowest price for the product
And User has to add the product to trolly
And To verify the product price
And Proceed to checkout the product
Then To verify user navigated to signin page

Examples:
|Product Name|
|Iphone Max|
