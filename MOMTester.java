/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsmith
 */

import java.util.Scanner;

public class MOMTester {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Declared variables
        String firstName = " ", lastName = " ";
        int size = 3, employeeNum = 0, phoneNumber = 0, day = 0, month = 0, year = 0, count;
        double annualSalary = 0, amount, balance = 0;
        
        //Arrays for employee, patient and date
        Employee [] eRecord = new Employee [size];
        Patient [] pRecord = new Patient [size];
        Date [] dRecord = new Date [size];

        /*Instances for employee and patient
        for loop used to create specified number of accounts
        date instance created to record date of births*/
        for(int i = 0; i < size; i++){
            Employee e = new Employee(firstName, lastName, phoneNumber, employeeNum, annualSalary);
            eRecord[i] = e;
            Date dateOfBirth = new Date(day, month, year);
            dRecord[i] = dateOfBirth;
            Patient p = new Patient(firstName, lastName, phoneNumber, dateOfBirth, balance);
            pRecord[i] = p;
        }
        
        /*Menu options for user input
        charAt input used for character input*/
        System.out.println("MAIN MENU \nN - Create a new record \nS - Select a patient account \nP - Payments \nX - Exit program \n");
        char menuOption = input.next().charAt(0);
        
        /*while loop used to run menu an indefinite number of times 
        terminated when user inputs X*/
        while(menuOption != 'X'){
            
            //switch statement for menu functionality 
            switch(menuOption){
                case 'N' : System.out.println("e - New employee \np - New patient");
                           char optionN = input.next().charAt(0);
                            
                           /*switch statement used to show N cases
                           e stores information for employee p stores information for patient*/
                            switch(optionN){
                                case 'e' : System.out.print("Enter employee's first name: ");
                                           firstName = input.next();
                                           System.out.print("Enter employee's last name: ");
                                           lastName = input.next();
                                           System.out.print("Enter employee number: ");
                                           employeeNum = input.nextInt();
                                           System.out.print("Enter employee phone number: ");
                                           phoneNumber = input.nextInt();
                                           System.out.print("Enter employee's annual salary: ");
                                           annualSalary = input.nextDouble();
                                break;
                           
                                case 'p' : System.out.print("Enter patient's first name: ");
                                           firstName = input.next();
                                           System.out.print("Enter patient's last name: ");
                                           lastName = input.next();
                                           System.out.print("Enter patient's day of birth: ");
                                           day = input.nextInt();
                                           System.out.print("Enter patient's month of birth: ");
                                           month = input.nextInt();
                                           System.out.print("Enter patient's year of birth: ");
                                           year = input.nextInt();
                                           System.out.print("Enter patient's phone number: ");
                                           phoneNumber = input.nextInt();
                                break;
                                
                                default : System.out.println("Enter correct option!");
                            }
                break;
                           
                           //Prompts for patient name and phone number
                case 'S' : System.out.println("Enter patient's first name: ");
                           firstName = input.next();
                           System.out.println("Enter phone number: ");
                           phoneNumber = input.nextInt();
                    
                           //Menu options for user input for patient
                           System.out.println("Q - query \nB - bill \nP - payment \nX - exit \n");
                           char optionS = input.next().charAt(0);
                           
                           //switch statement used to show S cases
                           switch(optionS){
                               case 'Q' : System.out.println(pRecord[phoneNumber].query());
                               break;
                               
                               case 'B' : System.out.println("Enter transaction amount: ");
                                          amount = input.nextInt();
                                          pRecord[phoneNumber].bill(amount);
                               break;
                               
                               case 'P' : System.out.println("Enter payment amount: ");
                                          amount = input.nextInt();
                                          pRecord[phoneNumber].payment(amount);
                               break;          
                                
                               case 'X' : System.out.println("Return to Main Menu");
                               break;
                               
                               default : System.out.println("Enter correct option!");
                           }
                
                case 'P' : 
                break;
                
                //Exits program
                case 'X' : System.out.print("Exit Program");
                break;
                
                default : System.out.println("Enter correct option!");
            }
                           
           System.out.println(" ");
                           
           System.out.println("MAIN MENU \nN - Create a new record \nS - Select a patient account \nP - Payments \nX - Exit program \n");
           char menuOption = input.next().charAt(0);    
                       
        }
        
    }
    
}
