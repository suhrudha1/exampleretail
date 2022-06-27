Feature: add customers

  Background: Background section
    Given User is on homepage
    When user enter invalid Username "admin" and password "Admin@123"
    Then validation message appears
    And user click shop admin button
    And user check the customers list
    And user add the customers list
    
  Scenario Outline: Add the customers details
    When add the customers FirstName"<FirstName>"
    And write your LastName "<LastName>"
    And write your E-Mail address"<E-Mail>"
    And write customers Telephone number "<Telephone>"
    And write your Password "<password>"
    And Write your Confirm password '<Confirm>'
    And Click the save button, It should navigate to the customer list page
    Then Click the back button ,it should navigate to the customers list page

    Examples: 
      | FirstName | LastName | E-Mail         | Telephone  | Password  | Confirm   |
      | Anju      | Anu      | anju@gmail.com | 9876543450 | Anjuanu89 | Anjuanu89 |
