package com.dci.enums;

public class BankAccount {
    private final String accountNumber;
    private final AccountType accountType;
    private double balance;

    public BankAccount(String accountNumber, AccountType accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    protected void deposit(double amount) {
        if (amount > 0 && amount <= getAccountType().getDepositLimit()) {
            this.balance += amount;
        } else {
            System.out.println("Failed to deposit!");
        }
    }

    protected boolean withdraw(double amount) {
        if (amount > 0 && amount <= getAccountType().getWithdrawLimit() && amount <= getBalance()) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Failed to withdraw!");
            return false;
        }
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountType=" + accountType +
                ", balance=" + balance +
                '}';
    }
}
