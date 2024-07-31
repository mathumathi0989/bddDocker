#Author: mathumathi


Feature: Login Functionality for an ecommerce application

 
  Scenario: Verify if user able to login 
    Given Go to login page
    When I enter username and password
    And click on login button
    Then dashboard page appears


