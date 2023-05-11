package com.luckuless.code.dependencyInversionPrinciple.after;

public class CreditCard implements BankCard {

    @Override
    public void doTransaction(int amount) {
        // logic
    }

}
