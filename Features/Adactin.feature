Feature: Hotel Booking in Adactin Application

Scenario: Login Page

Given  user Launch The Application

When   user Enters The Username 

And    user Enters The Password

Then   user Clicks The Login Button And It Navigates To "Adactin.com - Search Hotel"



Scenario: Search Hotel Page

When   user Selects The Location "London"

And    user Selects The Hotel "Hotel Sunshine"

And    user Selects The Room Type "Deluxe"

And    user Selects The Number Of Rooms "2 - Two"

And    user Enters Check In Date "26/08/2022"

And    user Enters Check Out Date "29/08/2022"

And    user Enters Adults per Room "2 - Two"

And    user Children per Room "2 - Two"

Then   user Clicks The Search Button And It Navigates To  "Adactin.com - Select Hotel"
 
Scenario: Select Hotel

When   user Click On Radio Button Of The Hotel They Want To Book 

Then   user Clicks The Continue Button And It Navigates To  "Adactin.com - Book A Hotel"


Scenario: Book A Hotel

When   user Enters Their First Name "Ranjith"

And    user Enters Their Last Name "R"

And    user Enters The Billing Address "Nasamaniponiya theru,Cuddalore"

And    user Enters Their Cerdit Card No "1234567890123456"

And    user Enters Their Cerdit Card Type "VISA"

And    user Select Their Cerdit Expriy Month "April"

And    user Select Their Cerdit Expriy Year "2022"

And    user Enters Their CCV Number "663"


Then   user Clicks The Book Now Button And It Navigates To "Adactin.com - Hotel Booking Confirmation"


Scenario: Booked Itinerary

Then   user Clicks My Itinerary Button And It Navigates to  "Adactin.com - Select Hotel"


Scenario: Log Out

Then   user Clicks Logout Button And It Navigates to  "Adactin.com - Logout"



 



 











