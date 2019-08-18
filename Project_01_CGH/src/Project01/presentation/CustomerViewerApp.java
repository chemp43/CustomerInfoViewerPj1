/*
 * Written By: Curtis Hempstead
 * Project 01 
 * Date Written: 6/13/2017
 * 
 * Purpose: To be provided for CIS 3145 Project 01 - Summer 2017

 * Description; CustomerViewerApp.java is the main method for the Project01
 * program.  Imports all classes used with in the package.  This class provides
 * output to the user, also allowing the user input to be checked if they want 
 * to check additional accounts and check desired customer numbers (cNum).  If
 * the no valid number is input, then an output is displayed informing user that
 * thier input is invalid.  If a valid cNum is input, then the program will
 * print out the customer's infrormation using the getNameAndAddress method, 
 * which formats the customers information into a single string from the
 * customer class, after being set in the CustomerDB class.  Finally, prompts
 * user if they wish to display another report.  If "y" is not input, then
 * program ends.
 */

package Project01.presentation;
import Project01.business.Customer;
import Project01.database.CustomerDB;
import java.util.Scanner;

public class CustomerViewerApp {
    
    public static void main(String args[]) {
        
        //output to user
        System.out.println("Customer Viewer: Version 1.0\n");
        Scanner sc = new Scanner(System.in);
        //sets decision prompt to yes for first output
        String displayAnother = "y";
        //prints out while "y" input for decision
        while (displayAnother.equalsIgnoreCase ("y")){
            //input from user
            System.out.print("Enter a customer number: ");
            //initializes getCustomer cNum var, sets input to var
            int cNum = Integer.parseInt(sc.nextLine());
            Customer customer = CustomerDB.getCustomer(cNum);
            
            //check number and display outpuy
            if (cNum == 123) {
                System.out.println(customer.getNameAndAddress());
            }
                else if (cNum == 124) {
                System.out.println(customer.getNameAndAddress());
            }
                else if (cNum == 125) {
                System.out.println(customer.getNameAndAddress());
            }
                else if (cNum == 126) {
                System.out.println(customer.getNameAndAddress());
            }
            //outputs message if no number is valid
            else{
                System.out.println("\nThere is no customer number " +cNum +" to display.\n");
            }
             
            //display another customer prompt and input decision
            System.out.print("Display another customer? (y/n): ");
            displayAnother = sc.nextLine();
             System.out.println();
        }        
    }
}