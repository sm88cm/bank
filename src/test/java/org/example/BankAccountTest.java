package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    ArrayList<Integer> accountList = new ArrayList<Integer>();

    // Deposit or Withdraw.
    // You can't withdraw more money than you have in the account.
    // You can't withdraw or deposit a negative number.

    @Test
    public void test_withdraw_500_from_account_with_1000() {

        BankAccount ba = new BankAccount();
        ba.setBalance(1000);
        double balance = 1000;
        double withdrawAmount = 500;
        double expected_amount = 500;

        double amount = ba.accountWithdraw(withdrawAmount);
        ba.setBalance(amount);

        assertEquals(expected_amount, amount);
    }

    @Test
    public void test_withdraw_500_from_account_with_200_return_IlleagAgException() {

        BankAccount ba = new BankAccount();
        ba.setBalance(200);
        double withdrawAmount = 500;
        assertThrows(IllegalArgumentException.class, () -> ba.accountWithdraw(withdrawAmount));
    }

    @Test
    public void test_deposit_negative_500_from_account_with_1000_print_error_and_keep_balance(){
        BankAccount ba = new BankAccount();
        ba.setBalance(1000);
        double deposit = -500;
        double expectedValue = 1000;

        double value = ba.putMoney(deposit);

        assertEquals(expectedValue, value);
    }

    @Test
    public void test_deposit_500_to_account_with_1000(){
        BankAccount ba = new BankAccount();
        ba.setBalance(1000);
        double deposit = 500;
        double expectedValue = 1500;

        double value = ba.putMoney(deposit);

        assertEquals(expectedValue, value);
    }
    /*public void test() {
        ArrayList<BankAccount> accountList = new ArrayList<>();
        BankAccount ba = new BankAccount("Stuart", "McMillan", (accountList.size())+1);
        accountList.add(ba);
        BankAccount bb = new BankAccount("Stuart", "McMillan", (accountList.size())+1);
        accountList.add(bb);
        BankAccount bc = new BankAccount("Stuart", "McMillan", (accountList.size())+1);
        accountList.add(bc);

        int b = ba.getAccountNumber();
        int a = bb.getAccountNumber();
        int c = bc.getAccountNumber();

        System.out.println(b + " " + a + " " + c);
    } */
}