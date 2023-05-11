package com.luckuless.code.dependencyInversionPrinciple.after;

public class DebitCard implements BankCard {
    
    @Override
    public void doTransaction(int amount) {
        // logic
    }
}
