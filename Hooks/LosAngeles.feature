Feature: Hotel Creek In Los Angeles
@LosAngeles
Scenario: Booking Super Deluxe Type Room At Hotel Creek In Los Angeles

Given user Selects The Location "Los Angeles" In scenario Four
And    user Selects The Hotel "Hotel Creek" In scenario Four
And    user Selects The Room Type "Super Deluxe" In scenario Four
And    user Selects The Number Of Rooms "1 - One" In scenario Four
And    user Enters Check In Date "02/09/2022" In scenario Four
And    user Enters Check Out Date "05/09/2022" In scenario Four
And    user Enters Adults per Room "2 - Two" In scenario Four
And    user Children per Room "1 - One" In scenario Four
Then   user Clicks The Search Button And It Navigates To  "Adactin.com - Select Hotel" In scenario Four