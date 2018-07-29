Feature: Facebook1 login validation with DataTableMap
As a fb user, I want to enter username and pwd with DataTableMap
Scenario: validate fb login page
Given the user is on facebook login Page
When he enters following data 
	| Labels                 | Params                      | Params1  	|
	| First Name             | Suvarna                     |  A				  |
	| Last Name              | Mane                        |	B					|
	| Email Address          | suvarnamane.299@gmail.com	 |	C					|
	| Re-Enter Email Address | suvarnamane.299@gmail.com	 |	D					|
	| Password               | abcd1234			   		         |	E					|
	| Birthdate              | 1                           |	F					|
	| Birthmonth             | Dec                         |  G         |
	| Birthyear              | 2000                        |  H         |
	| Gender                 | Female                      |  I        |
Then check signup should failed

