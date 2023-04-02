package com.java;
class Account{
    int accountNo;
    String accountType;
    int accountBalance;
     void setAccountDetails(int accountNo,String accountType,int accountBalance){
        this.accountNo=accountNo;
        this.accountType=accountType;
        this.accountBalance=accountBalance;
    }
     void withdraw(int withdrawMoney){
        accountBalance=accountBalance-withdrawMoney;
    }
    void deposit(int depositMoney){
    accountBalance=accountBalance+depositMoney;
    }
    void displayDetails(){
        System.out.println("Account No: "+accountNo+
                          "\nAccount Type: "+accountType+
                          "\nAccount Balance: "+accountBalance);
    }
}
public class main1 {
    public static void main (String args[]){
        Account rakesh=new Account();
        rakesh.setAccountDetails(2630,"Saving",35000 );
        rakesh.withdraw(5000);
        rakesh.deposit(2500);
        rakesh.displayDetails();
        Account ramesh=new Account();
        ramesh.setAccountDetails(2632,"Current",45000 );
        ramesh.deposit(2500);
        ramesh.displayDetails();
        Account suresh=new Account();
        suresh.setAccountDetails(2633,"Saving",100000 );
        suresh.withdraw(50000);
        suresh.displayDetails();
    }
}
