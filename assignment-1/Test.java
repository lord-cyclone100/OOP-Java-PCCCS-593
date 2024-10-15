// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;

class Bank{
    String depositorName;
    long accountNumber;
    String accountType;
    long balanceAmount;

    Bank(String depositorName, long accountNumber, String accountType, long balanceAmount){
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balanceAmount = balanceAmount;
        System.out.println("Account created");
    }

    void depositAmount(long amount){
        System.out.println("Current balance: "+balanceAmount);
        if(amount <= 0){
            System.out.println("Please enter a valid amount");
        }
        else{
            balanceAmount += amount;
            System.out.println(amount + " deposited successfully");
            System.out.println("New balance: "+ balanceAmount);
        }
    }

    void withdrawAmount(long amount){
        System.out.println("Current balance: "+balanceAmount);
        if(amount <= 0){
            System.out.println("Please enter a valid amount");
        }
        else if(amount > balanceAmount){
            System.out.println("Insufficient balance");
        }
        else{
            balanceAmount -= amount;
            System.out.println(amount + " withdrawn successfully");
            System.out.println("New balance: "+ balanceAmount);
        }
    }

    void checkBalance(){
        System.out.println("Name: "+depositorName);
        System.out.println("Current Balance: "+balanceAmount);
    }
}

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter account number:");
        long accNumber = scanner.nextLong();
        System.out.println("Enter account type:");
        String accType = scanner.next();
        System.out.println("Enter initial Deposit amount:");
        long depositAmt = scanner.nextLong();

        Bank bank = new Bank(name, accNumber, accType, depositAmt);
        int choice;
        do{
            System.out.println("What would you like to do");
            System.out.println("1.) Deposit");
            System.out.println("2.) Withdraw");
            System.out.println("3.) Check Balance");
            System.out.println("0.) Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter amount to deposit:");
                    long depoAmt = scanner.nextLong();
                    bank.depositAmount(depoAmt);
                    break;
                
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    long withAmt = scanner.nextLong();
                    bank.withdrawAmount(withAmt);
                    break;

                case 3:
                    bank.checkBalance();
                    break;

                case 0:
                    System.out.println("Thanks for using our service");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        while(choice != 0);
    }
}