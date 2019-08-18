/*
 * Written By: Curtis Hempstead
 * Project 01 
 * Date Written: 6/13/2017
 * 
 * Purpose: To be provided for CIS 3145 Project 01 - Summer 2017

 * Description; Customer.java class provides instance variables containing
 * the name, address, city, state, and zip.  Also provides getters and setters
 * allowing public access to instance variables to other classes in the
 * corresponding constructors.  Final getter reformats all variables into a 
 * single string for output 
 */
package Project01.business;

public class Customer {
    
    private String name; //customer name
    private String addy; //customer address
    private String city; //customer city
    private String state; //customer state
    private String zip; //customer zip
    
    //default constructor sets instnaces to null
    public Customer(){
        this.name = null;
        this.addy = null;
        this.city = null;
        this.state = null;
        this.zip = null;
    }
    
    //constructor to allow access to instance vars
    public Customer(String cuN, String cuA, String cuC, String cuS, String cuZ){
        name = cuN;
        addy = cuA;
        city = cuC;
        state = cuS;
        zip = cuZ;
    }

    //getters for instance vars
    public String getName() {
        return name;
    }

    public String getAddy() {
        return addy;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    //setters for instance vars
    public void setName(String name) {
        this.name = name;
    }

    public void setAddy(String addy) {
        this.addy = addy;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    //getter for instances reformating all into single string
    public String getNameAndAddress(){
            return "\n" + this.name + "\n" + this.addy + "\n" + this.city + ",  " + this.state + " " + this.zip + "\n";
    }
}

