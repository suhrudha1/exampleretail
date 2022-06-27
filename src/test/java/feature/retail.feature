Feature: Retail login page

  Background: Background section
    Given User is on homepage

  Scenario Outline: Login with unauthorized user
    When user enter invalid Username "<username>" and password "<password>"
    Then validation message appears
    And user click shop admin button
    And user check the customers list
    And user add the customers list

    Examples: 
      | username | password  |
      | admin    | Admin@123 |
#
  #Scenario Outline: Customer list
    #When user click customers button
    #And user check the customers list
