/*
 * Written By: Curtis Hempstead
 * Project 01 
 * Date Written: 6/13/2017
 * 
 * Purpose: To be provided for CIS 3145 Project 01 - Summer 2017

 * Description; CustomerDB.java contains static method that initializes cNum as 
 * the customer identification number variable as an integer. Uses Customer 
 * class constructor and setters to set customer data to the corresponding cNum.
 * Returns null if no valid cNum is found.  Then returns the customer
 * object with the newly set variables.
 */
package Project01.database;

import Project01.business.Customer;


public class CustomerDB {
    //public static method initialiing cNum, Customer number as an integer.
    public static Customer getCustomer(int cNum){
        
        //customer object
        Customer customer = new Customer();
        
        //sets customer object with data
        if (cNum == 123) {
            customer.setName("Michael Martin");
            customer.setAddy("1376 Hill Street");
            customer.setCity("Luckey");
            customer.setState("OH");
            customer.setZip("43443");
        } else if (cNum == 124) {
            customer.setName("Marjorie Galvan");
            customer.setAddy("3144 Hillcrest Avenue");
            customer.setCity("Cambridge");
            customer.setState("MA");
            customer.setZip("02141");
        } else if (cNum == 125) {
            customer.setName("Rebecca Cain");
            customer.setAddy("3572 New Street");
            customer.setCity("Jefferson");
            customer.setState("OR");
            customer.setZip("97352");
        } else if (cNum == 126) {
            customer.setName("Curtis Hempstead");
            customer.setAddy("W. 57th Street");
            customer.setCity("New New York");
            customer.setState("WI");
            customer.setZip("52375");
        } else {
            //returns null if invalid
            return null;
        }
        //returns customer object
        return customer;
    }
}