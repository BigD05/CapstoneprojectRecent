package com.company;

public class projectStart {
    int projectNum;
    String projectName;
    String buildName;
    String Address;
    int erfNum;
    float totalAmount;
    float totalAmountpaid;
    String deadline;

  public projectStart(int projectNum, String projectName, String buildName, String Address,int erfNum,float totalAmount,
                      float totalAmountpaid, String deadline){
        this.projectNum = projectNum;
        this.projectName = projectName;
        this.buildName = buildName;
        this.Address = Address;
        this.erfNum = erfNum;
        this.totalAmount = totalAmount;
        this.totalAmountpaid = totalAmountpaid;
        this.deadline = deadline;
    }

    public String toString() {
        String output = " Project Name: " + projectName;
        output += "\nProject Number: " + projectNum;
        output += "\nBuilding Type: " + buildName;
        output += "\nAddress: " + Address;
        output += "\nERF number: " + erfNum;
        output += "\nTotal amount: R" + totalAmount;
        output += "\nTotal amount paid: R" + totalAmountpaid;
        output += "\nDeadline date: " + deadline;
        return output;

    }

}
