package org.example;

public class BankAccount {
    private double balance;     // Balance on Account
    private double minBalance;  // Overdraft amount (1000 would be -1000)
    private String firstName;   // First name for customer
    private String lastName;    // Last name for customer
    private String sortCode;    // Sort code for account
    private int accountNumber;  // Account number for account
    private double max = Double.MAX_VALUE; // Max value to ensure exception is thrown for overload.

    // Constructor
    public BankAccount(String first, String second, int account) {
        this.balance = 0;
        this.minBalance = 0;
        this.firstName = first;
        this.lastName = second;
        this.sortCode = "123456";
        this.accountNumber = account;
        }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount() {

    }
    public double getBalance() {
        return balance;
    }
    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setSecondName(String secondName) {
        this.lastName = secondName;
    }


    // Account withdrawal
    public double accountWithdraw(double a) {
        if (((this.balance - a ) < 0) || ((this.balance - a ) < this.minBalance)) {
            throw new IllegalArgumentException("Input cannot be negative.");
        }
        else {
            double newBalance = (this.balance - a);
            this.balance = newBalance;
            return newBalance;
        }
    }

    // Account deposit
    public double putMoney(double a) {
        try {
            if (a < 0) {
                throw new IllegalArgumentException("You can't deposit a negative number");
            } else {
                if (this.balance + a <= max) {
                    this.balance += a;
                }
            }
        }
        catch(IllegalArgumentException e) {
                System.out.println(e);
            }
        return this.balance;
    }
}