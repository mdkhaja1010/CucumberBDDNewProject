Feature: Buying Product in online

   Scenario Outline: Creating second Order 
      Given the user launches the sauceDemo website
      And the user enters the "<username>"
      And the user enters the password as "<password>"
      And user click on the sign button
      And the user click on the bag
      And the user moving the proceed page
      And the user selecting checkout
      And the user enters the addressfirstname "<firstname>"
      And the user enters the addresslastname "<secondname>"
      And the user enters the postaddress "<postalcode>"
      And the user hits the continue button
      And the user click on the shoppingfinish
      Then user click on the menubutton
      And the user click on logoutbutton
      
      Examples:
      |username|      |password     ||firstname||secondname||postalcode|
      |standard_user||secret_sauce ||john      ||smith       ||521001|