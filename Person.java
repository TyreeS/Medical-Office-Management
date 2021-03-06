/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsmith
 */
public class Person {
    
    //Declared variables
    private int count, phoneNumber;
    public static int countNum = 0;
    private String firstName = " ";
    private String lastName = " ";
    
    //No-argument constructor
    public Person(){
        this.count = ++countNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    
    //Constructor with arguments
    public Person(String firstName, String lastName, int phoneNumber){
        this.count = ++countNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    //Accessors and Mutators
    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    //Method for joining firstName and lastName
    public String name(){
        return String.format("%s %s \n", firstName, lastName);
    }
    
    //toString for name and phone number
    @Override
    public String toString(){
        return String.format(name(), "1(868)%d", phoneNumber);
    }
    
    //Equals method to compare count
    public boolean equals(Person c){
        return c.count == this.count;
    }
    
}
