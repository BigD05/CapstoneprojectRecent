package com.company;
import java.util.Scanner;//import our scanner
public class Poised {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//initiate our scanner

        //ask user for they choice if they would like to start a new project
        System.out.print("would you like to create a project please enter yes if so otherwise enter no: ");
        String ans = input.nextLine();//reads the user input and stores it in the variable

        if (ans.equals("yes")) {//if the user input is equal to yes then the following code will run

            //line 15 to line 93 is basically the same thing besides the different variable names
            System.out.print("Please enter the name of the Contractor: ");//asks the user what they should input
            input = new Scanner(System.in);                              //creates scanner
            String contractorname = input.nextLine();                   //reads user variable

            System.out.print("Please enter the Contracto phone number: ");
            input = new Scanner(System.in);
            int contractorphoneNumber = input.nextInt();

            System.out.print("Please enter the email address of the Contractor: ");
            input = new Scanner(System.in);
            String contractoremail = input.nextLine();

            System.out.print("Please enter the Contractor address: ");
            input = new Scanner(System.in);
            String contractorapddress = input.nextLine();

            System.out.print("Please enter the name of the architect: ");
            input = new Scanner(System.in);
            String archiname = input.nextLine();

            System.out.print("Please enter the architect phone number: ");
            input = new Scanner(System.in);
            int archiphoneNumber = input.nextInt();

            System.out.print("Please enter the email address of the architect: ");
            input = new Scanner(System.in);
            String archiemail = input.nextLine();

            System.out.print("Please enter the architect address: ");
            input = new Scanner(System.in);
            String archiAddress = input.nextLine();

            System.out.println("\nPlease enter the name of the customer: ");
            input = new Scanner(System.in);
            String customername = input.nextLine();

            System.out.println("Please enter the customer phone number: ");
            input = new Scanner(System.in);
            int customerphoneNumber = input.nextInt();

            System.out.println("Please enter the email address of the customer: ");
            input = new Scanner(System.in);
            String customeremail = input.nextLine();

            System.out.println("Please enter the customer address: ");
            input = new Scanner(System.in);
            String customerAddress = input.nextLine();


            System.out.println("\nPlease enter the Project number:");
            int projectnum = input.nextInt();

            System.out.println("Please enter the name of the Project: ");
            String projectName = input.next();

            System.out.println("Please enter the building type: ");
            input = new Scanner(System.in);
            String buildName = input.nextLine();

            System.out.println("Please enter the full Address: ");
            input = new Scanner(System.in);
            String Address = input.nextLine();

            System.out.println("Please enter the ERF number: ");
            input = new Scanner(System.in);
            int erfNum = input.nextInt();

            System.out.print("Please enter the total amount: R");
            input = new Scanner(System.in);
            float totalAmount = input.nextFloat();

            System.out.print("Please enter the total amount that has been paid so far: R");
            input = new Scanner(System.in);
            float totalAmountpaid = input.nextFloat();

            System.out.print("Please enter the deadline date e.g 20 October 2021: ");
            input = new Scanner(System.in);
            String deadline = input.nextLine();


            //creates a new variable that asks the user if they would like to make some changes to some of the values in the classes
            System.out.println("Would you like to change or update anything if so enter yes other wise enter no: ");
            String update = input.nextLine();

            if(update.equals("yes")){//if statement that will run if the user input is == to yes
                System.out.println("What would you like to update 1-duedate,2-totalamount,3-contactdetails 3 changes number of contractor, enter" +
                        "1,2 or 3 to choose from these options"); // the following will run if it's true
                int completeupdate = input.nextInt();            //reads the user input

                if (completeupdate ==1){ //based on the user input the following code will run
                    System.out.print("Please enter the New deadline date e.g 20 October 2021: "); //explains to the user what to do
                    input = new Scanner(System.in);                                              //creates scanner
                    String newdeadline = input.nextLine();                                      // variable that reads the user input
                    deadline = newdeadline;                                                    //changes the old data with the new data


                }else if(completeupdate == 2){                                //else if statement that will run if the if statement is false
                    System.out.print("Please enter the New total amount: R"); // explains to the user what to change
                    input = new Scanner(System.in);                           // creates a scanner
                    float newtotalAmount = input.nextFloat();                 // reads the user input
                    totalAmount = newtotalAmount;                             // changes the original data to the new data


                }else if (completeupdate == 3){                                         //else if statement that will run if the above else if and if statement false
                    System.out.println("Please enter the New Contracto phone number: ");//explains to the user what to do
                    input = new Scanner(System.in);                                     //creates a scanner
                    int newContactdetail =input.nextInt();                              //creates a variable that will read the user input
                    contractorphoneNumber = newContactdetail;                           //replaces the old data with the new data

                }
            }else{                                                           // else statement that will run if the above is all false
                System.out.println("Congradulations on your new project!!!");//prints out the message if the past else if and if statement is false
            }

            projectStart newProject = new projectStart(projectnum,projectName,buildName,Address,erfNum,totalAmount,totalAmountpaid,deadline);//initalizes the the project
            System.out.println(newProject.toString());                                                                                       //prints out the projects using the method toString()

            customer newCustomer = new customer(customername,customerphoneNumber,customeremail,customerAddress);//initializes the customer
            System.out.println(newCustomer.toString());                                                         //prints out the customer details using toString() method

            architect newArchitect = new architect(archiname,archiphoneNumber,archiemail,archiAddress);//initializes the customer
            System.out.println(newArchitect.toString());                                              //prints out the architect details using the toString() method

            contractor newContractor = new contractor(contractorname,contractorphoneNumber,contractoremail,contractorapddress);//initializes the contractor
            System.out.println(newContractor.toString());                                                                      //prints out the contractors details using toString() method



        }else{
            System.out.println("Good bye!");//if the user selects no instead of no the following will happen

        }
    }

}
