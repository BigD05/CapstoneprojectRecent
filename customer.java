package com.company;

public class customer {//creating our variables
    String name;
    int phoneNumber;
    String email;
    String Address;

    //invokes our current class constructor
    public customer(String name, int phoneNUmber, String email, String Address){
        this.name = name;
        this.phoneNumber = phoneNUmber;
        this.email = email;
        this.Address = Address;
    }
    // our method toString() that prints out the details and returns them all
    public String toString(){
        String output = "Name: " + name;
        output += "Phone number: " + phoneNumber;
        output += "Email: " + email;
        output += "Address: " + Address;
        return output;
    }
}
