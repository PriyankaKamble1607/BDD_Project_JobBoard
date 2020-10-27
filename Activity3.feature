@Activity3
Feature: posting job
  

  @tag1
  Scenario: posting job
    Given before posting a job
    When post a job    
  	|Associate System Engineer|
  	|Pune|
  	|Interact with the customers and users to develop design requirements, attend on the trouble shooting problems encountered during installation, maintenance and configuration. ... Commitment towards providing consistency in software systems to ensure they are user-friendly.|
  	|pk@rediffmail.com|
  	|IBM INDIA Pvt Ltd|
    Then validate the job
      |Associate System Engineer|
    	|Pune|
   

