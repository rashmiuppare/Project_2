Feature: Hotel Room Booking

@A
Scenario: Login page
		Given user can able to launch the url
		When  user can able to enter the username in the text box
		And   user can able to enter the password in the password field
		Then  user can able to click the login button and it will navigate to next page 
		
@A
Scenario: Search Hotel
		When user can able to select the location in the dropdown list
		And user can able to select the hotels name in the dropdown list
		And user can able to select the room type in the dropdown list
		And user can able to select the number of rooms in the dropdown list
		And user can able to enter the check in date in the text box
		And user can able to enter the check out date in the text box
		And user can able to select the number of adult per room in the dropdown list
		And user can able to select the number of children per room in the dropdown list
		Then user can able to click the search button and it will navigate to next page
		
@A
Scenario: Select Hotel
		When user can able to select the hotel in the radiobutton
		Then user can able to click the continue button and it will navigate to next page
		
@B
Scenario: Book A Hotel
		When user can able to enter the firstname in the text box
		And  user can able to enter the lastname in the textbox
		And  user can able to enter the billing address in the text box
		And  user can able to enter the credit card number details in the text box
		And  user can able to select the credit card type in the dropdown list
		And  user can able to select the expiry date of month and the year in the dropdown list
		And  user can able to enter the cvv number in the text box
		Then user can able to click the book now button and it will navigate to next page
		
@C
Scenario: Booking Confirmation
		Then once the confirmation the user can able to click the logout button from the page
		 