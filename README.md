# Medical-Office-Management
You are required to create a “Medical Office Management” application (MOM) which - using inheritance
  - will create and manipulate both employee and patient objects. 
When your program is run it must display a main menu of options to the user as described below:

‘N’ – New – For this option the program must immediately prompt the user to enter ‘e’ or ‘p’ to indicate
whether they want to create a new patient or employee record.
 -  If the user selects ‘e’ they must then be prompted for the person’s first name, last name, employee
    number, phone number and annual salary.
 -  If they select ‘p’ then they must be prompted for the patient’s first name, last name, date of birth, and
    phone contact
This information is then used to create the appropriate object which is stored in an array of objects. If
the user enters a command other than ‘e’ or ‘p’, the program must display an appropriate error message
and continue to prompt for valid data.

‘S’ – Select a patient account – The program must prompt for a patient’s first name and phone number
and retrieve this object from the array. The user must then be prompted for transactions to be
performed on the account as follows:

  ‘Q’ – query – The program must print the patient’s full name, date of birth and balance.

  ‘B’ – bill – The program must request a transaction amount and add this value to the patient’s
  current balance

  ‘P’ – payment – The program must request a transaction amount and subtract this value from
  the patient’s current balance

  ‘X’ – exit – The program must return to the main menu.

‘P’ – Payments – The program must pay salaries to all employees and auto-deduct 10% of the
outstanding balance on all patients account from their respective credit cards to make payments on
their accounts. (Ignore the credit card processing; simply adjust patient’s balance accordingly)

‘X’ – exit – The program must display an appropriate parting message and quit when this command is
given.

To accomplish the tasks outlined in this assignment you must create three classes ‘Person’ (the abstract
super class), as well as Employee and Patient that extend the ‘Person’ class.

The Employee class – This class requires an employee number, first name, last name, phone number and
annual salary.

The Patient class – In addition to the first name, last name, phone number, date of birth this class must
have an instance variable ‘balance’ which is used to keep track of any outstanding monies due by the
patient.

The Person class must use a class variable ‘count’ to store how many person objects have been created. 
