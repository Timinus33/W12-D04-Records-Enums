package com.dci.enums;

public class Main {
    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();
        for (AccountType type : AccountType.values()) {
            System.out.println(type.name().charAt(0) + type.name().substring(1).toLowerCase() + " [depositLimit: " + type.getDepositLimit() + ", withdrawLimit: " + type.getWithdrawLimit() + "]");
        }

        system.createAccount("1", AccountType.SILVER, 5000);
        system.createAccount("2", AccountType.GOLD, 15000);
        system.createAccount("3", AccountType.PLATINUM, 35000);
        System.out.println(system.getMap());

        system.transferFunds("1", "2", 100);
        System.out.println(system.getMap());

        system.transferFunds("2", "3", 100);
        System.out.println(system.getMap());

        system.transferFunds("3", "1", 100);
        System.out.println(system.getMap());
    }
}
