Feature: Hotel Hervey In Paris 
@Paris
Scenario: Booking Standard Type Room At Hotel Hervey In Paris

Given   user Selects The Location "Paris" In scenario Three
And    user Selects The Hotel "Hotel Hervey" In scenario Three
And    user Selects The Room Type "Standard" In scenario Three
And    user Selects The Number Of Rooms "4 - Four" In scenario Three
And    user Enters Check In Date "31/08/2022" In scenario Three
And    user Enters Check Out Date "01/09/2022" In scenario Three
And    user Enters Adults per Room "1 - One" In scenario Three
And    user Children per Room "2 - Two" In scenario Three
Then   user Clicks The Search Button And It Navigates To  "Adactin.com - Select Hotel" In scenario Three

