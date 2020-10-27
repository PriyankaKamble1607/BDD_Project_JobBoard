@Activity4
Feature: posting Job
  I want to use this template for my feature file

@tag1
  Scenario Outline: posting Job
    Given Before posting a job
    When Post a job "<Post>" and "<Location>" and "<Description>" and "<email>" and "<companyName>"   	
    Then Validate the job with "<Post>"
    
 Examples:
     |Post|Location|Description|email|companyName|
    |Associate System Engineer|Pune|Interact with the customers and users to develop design requirements.|pk@gmail.com|IBM INDIA Pvt Ltd|
   