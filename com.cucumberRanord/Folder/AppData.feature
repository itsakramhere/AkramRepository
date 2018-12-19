Feature:  login to Branchcreation
Scenario: validate the login functionality with valid data 
Given     launch site
When      Enter the username with "Admin" and password with "Admin" data and click on loin Btn
Then      Branches should be Displayed
Then      close site

Scenario Outline: Enter the Branchcreation with multiple data
Given     launch site
When      Enter the username with "Admin" and password with "Admin" data and click on loin Btn
Then      Branches should be Displayed
When      Enter the "<row_index>" data from excel
Then      close site

Examples:
				|row_index|
				|1|
				|2|
				|3|
				

