package org.example;

public class SavingAccount extends BankAccount {

    //
    private String accountType;
    private double interestRate;

    public SavingAccount (double rate) {
        super();
        this.accountType = "Savings Account";
        this.interestRate = rate;
    }
}
