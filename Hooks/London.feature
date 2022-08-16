Feature: Hotel Sunshine In London

@London
Scenario: Booking Deluxe Type Room At Hotel Sunshine In London 

Given   user Selects The Location "London" In scenario One
When    user Selects The Hotel "Hotel Sunshine" In scenario One
And    user Selects The Room Type "Deluxe" In scenario One
And    user Selects The Number Of Rooms "2 - Two" In scenario One
And    user Enters Check In Date "26/08/2022" In scenario One
And    user Enters Check Out Date "29/08/2022" In scenario One
And    user Enters Adults per Room "2 - Two" In scenario One
And    user Children per Room "2 - Two" In scenario One
Then   user Clicks The Search Button And It Navigates To  "Adactin.com - Select Hotel" In scenario One

