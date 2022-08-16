Feature: Hotel Cornice In Sydney
@Sydney
Scenario: Booking Double Type Room At Hotel Cornice In Sydney

Given   user Selects The Location "Sydney" In scenario Two
And    user Selects The Hotel "Hotel Cornice" In scenario Two
And    user Selects The Room Type "Double" In scenario Two
And    user Selects The Number Of Rooms "3 - Three" In scenario Two
And    user Enters Check In Date "29/08/2022" In scenario Two
And    user Enters Check Out Date "30/08/2022" In scenario Two
And    user Enters Adults per Room "3 - Three" In scenario Two
And    user Children per Room "1 - One" In scenario Two
Then   user Clicks The Search Button And It Navigates To  "Adactin.com - Select Hotel" In scenario Two

