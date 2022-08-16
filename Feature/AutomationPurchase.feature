Feature: Dress Purchase In Automation Practice Website

Background: Login to Automation Practice Account

Given  user Launches The Url

When   user Enters Their EmailId

And    user Enters Their Password

And   user Clicks The Login Button
@EveningDress
Scenario: User Purchase Evening Dresses 

When   user Mouseover On The Dresses

Then   user Clicks On Evening Dresses And It Navigates To "Evening Dresses - My Store"

And    user Clicks Size  L Checkbox

And    user Clicks Color  Begie Checkbox

And    user Clicks Compositions Viscose Checkbox 

And    user Clicks Condition New Checkbox 

And    user Clicks Properties Short Dress Checkbox

And    user Clicks Avalilability In Stock Checkbox 

And    user Clicks Manufacturer Fashion Manufacturer Checkbox

And    user Mouseover the Printed Dress Image 

And    user Clicks On Quick View 

And    user Clicks On Quantity + Button

And    user Clicks On Add To Cart  

Then   user Clicks on Proceeds To Checkout Button And It Navigates To "Order - My Store" 

And    in Summary User clicks on ProceedToCheckout

And     in Address User Enters "Aley Illa Bellu" In Add Comment Text Box

And    in Address User clicks on ProceedToCheckout

And    in Shiping User Clicks On Terms Of Service Checkbox 

Then   in Shiping User clicks on ProceedToCheckout And It Navigates To "http://automationpractice.com/index.php?controller=order&multi-shipping=" 

And    user clicks On Pay by bank wire 

Then   user clicks On I Confrim My Order Button And It Navigates To "Order confirmation - My Store"

Then   user Clicks The Logout Button And It Navigates To "Login - My Store"@SummerDress
@SummerDress
Scenario: User Purchase Summer Dresses 

When   user Mouseover The Dresses

Then   user Clicks On Summer Dresses And It Navigates To "Summer Dresses - My Store"

And    user Clicks The Size  L Checkbox

And    user Clicks The Color  Yellow Checkbox

And    user Clicks The Compositions Viscose Checkbox 

And    user Clicks The Condition New Checkbox 

And    user Clicks The Properties Short Dress Checkbox

And    user Clicks The Avalilability In Stock Checkbox 

And    user Clicks The Manufacturer Fashion Manufacturer Checkbox

And    user Mouseover to Printed Summer Dress Image 

And    user Clicks Quick View Button

And    user Clicks The Quantity + Button

And    user Clicks The Add To Cart Button 

Then   user Clicks The Proceeds To Checkout Button And It Navigates To "Order - My Store" 

And    in Summary User clicks The ProceedToCheckout

And    in Address User Enters "Aley Illa Bellu P" In  The Add Comment Text Box

And    in Address User clicks The ProceedToCheckout

And    in Shiping User Clicks The Terms Of Service Checkbox 

Then   in Shiping User clicks The ProceedToCheckout And It Navigates To "http://automationpractice.com/index.php?controller=order&multi-shipping=" 

And    user clicks The Pay by bank wire 

Then   user clicks The I Confrim My Order Button And It Navigates To "Order confirmation - My Store"

Then   user Clicks on The Logout Button And It Navigates To "Login - My Store"