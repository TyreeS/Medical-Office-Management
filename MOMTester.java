/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsmith
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MOMTester {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Declared variables
        char menuOption, optionN, optionS;
        String firstName = " ", lastName = " ";
        int size = 3, employeeNum = 0, phoneNumber = 0, day = 0, month = 0, year = 0, count = 0;
        double annualSalary = 0, amount, balance = 0, salaries = 0;
        
//USE ARRAYLIST***
        //ArraysList for employee, patient and date
        ArrayList <Person> person = new ArrayList();
        

//RETREIVED DATA SHOULD GO TO THE SAME LIST
        /*Instances for employee, patient and date
        for loop used to create specified number of accounts
        date instance created to record date of births*/
        
            Employee e = new Employee(firstName, lastName, phoneNumber, employeeNum, annualSalary);
            Date dateOfBirth = new Date(day, month, year);
            Patient p = new Patient(firstName, lastName, phoneNumber, dateOfBirth, balance);
        
        /*Menu options for user input
        charAt input used for character input*/
        System.out.println("MAIN MENU \nN - Create a new record \nS - Select a patient account \nP - Payments \nX - Exit program \n");
        menuOption = input.next().charAt(0);
        
        /*while loop used to run menu an indefinite number of times 
        terminated when user inputs X*/
        while(menuOption != 'X'){
            
            //switch statement for menu functionality 
            switch(menuOption){
                case 'N' : System.out.println("e - New employee \np - New patient");
                           optionN = input.next().charAt(0);
                           
                           //line break
                           System.out.println(" ");

                            /*switch statement used to show N cases
                            e stores information for employee p stores information for patient*/
                            switch(optionN){
                                case 'e' : System.out.print("Enter employee's first name: ");
                                           firstName = input.next();
                                           e.setFirstName(firstName);
                                           System.out.print("Enter employee's last name: ");
                                           lastName = input.next();
                                           e.setLastName(lastName);
                                           System.out.print("Enter employee number: ");
                                           employeeNum = input.nextInt();
                                           e.setEmployeeNum(employeeNum);
                                           System.out.print("Enter employee phone number: ");
                                           phoneNumber = input.nextInt();
                                           e.setPhoneNumber(phoneNumber);
                                           System.out.print("Enter employee's annual salary: ");
                                           annualSalary = input.nextDouble();
                                           e.setAnnualSalary(annualSalary);

                                           person.add(e);

                                break;
                           
                                case 'p' : System.out.print("Enter patient's first name: ");
                                           firstName = input.next();
                                           p.setFirstName(firstName);
                                           System.out.print("Enter patient's last name: ");
                                           lastName = input.next();
                                           p.setLastName(lastName);
                                           System.out.print("Enter patient's day of birth: ");
                                           day = input.nextInt();
                                           p.setDateOfBirth(dateOfBirth);
                                           System.out.print("Enter patient's month of birth: ");
                                           month = input.nextInt();
                                           p.setDateOfBirth(dateOfBirth);
                                           System.out.print("Enter patient's year of birth: ");
                                           year = input.nextInt();
                                           p.setDateOfBirth(dateOfBirth);
                                           System.out.print("Enter patient's phone number: ");
                                           phoneNumber = input.nextInt();
                                           p.setPhoneNumber(phoneNumber);

                                           person.add(p);

                                break;
                                
                                default : System.out.println("Enter correct option!");
                            }
                break;

//USE ARRAYLIST METHODS TO EXTRACT INFORMATION get(), indexof()                           
                /*Prompts for patient name and phone number and 
                retrieve that object from the array*/
                case 'S' : System.out.print("Enter patient's first name: ");
                           firstName = input.next();
                           System.out.print("Enter phone number: ");
                           phoneNumber = input.nextInt();
                           
                           person.indexOf(firstName); //pulls the index value that matches patients first name
                           person.indexOf(phoneNumber);//pulls the index value that matches the patients phone number 

                           //line break
                           System.out.println(" ");

                           //Menu options for user input for patient
                           System.out.println("Q - query \nB - bill \nP - payment \nX - exit \n");
                           optionS = input.next().charAt(0);
                           
                           //switch statement used to show S cases
                           switch(optionS){
                               //print patient's full name date of birth and balance 
                               case 'Q' : System.out.println(p.query());
                               break;
                               
                               //request a transaction amount and add value to patient's balance
                               case 'B' : System.out.println("Enter transaction amount: ");
                                          amount = input.nextInt();
                                          p.bill(amount);
                               break;
                               
                               //request a transaction amount and subtract value from patient's balance
                               case 'P' : System.out.println("Enter payment amount: ");
                                          amount = input.nextInt();
                                          p.payment(amount);
                               break;          
                               
                               //return to main menu
                               case 'X' : System.out.println("Return to Main Menu");
                               break;
                               
                               default : System.out.println("Enter correct option!");
                           }
                
                //Pays employee salaries
                case 'P' : for(int i = 0; i < size; i++){
                                salaries = e.getAnnualSalary() + balance * 0.10;
                            }
                break;
                
                //Exits program
                case 'X' : System.out.print("Exit Program");
                break;
                
                default : System.out.println("Enter correct option!");
            }
                           
           System.out.println(" ");
                           
           System.out.println("MAIN MENU \nN - Create a new record \nS - Select a patient account \nP - Payments \nX - Exit program \n");
           menuOption = input.next().charAt(0);    

        }
        
    }
    
}
