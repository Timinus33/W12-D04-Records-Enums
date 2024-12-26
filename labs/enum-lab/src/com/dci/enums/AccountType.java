package com.dci.enums;

public enum AccountType {
    SILVER(1_500, 1_000), GOLD(15_000, 10_000), PLATINUM(30_000, 20_000);

    private final double depositLimit;
    private final double withdrawLimit;

    AccountType(double depositLimit, double withdrawLimit) {
        this.depositLimit = depositLimit;
        this.withdrawLimit = withdrawLimit;
    }

    public double getDepositLimit() {
        return depositLimit;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }
}
