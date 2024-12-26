package com.dci.enums;

import java.util.HashMap;
import java.util.Map;

public class BankingSystem {
    private final Map<String, BankAccount> map = new HashMap<>();

    protected void createAccount(String accountNumber, AccountType accountType, double initialBalance) {
        map.put(accountNumber, new BankAccount(accountNumber, accountType, initialBalance));
    }

    protected BankAccount getAccount(String accountNumber) {
        return map.get(accountNumber);
    }

    protected void transferFunds(String fromAccountNumber, String toAccountNumber, double amount) {
        BankAccount sender = getAccount(fromAccountNumber);
        BankAccount receiver = getAccount(toAccountNumber);
        if (sender!= null && receiver != null) {
            if (sender.withdraw(amount)) {
                receiver.deposit(amount);
            }
        }
    }

    public Map<String, BankAccount> getMap() {
        return map;
    }
}
