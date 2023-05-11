package com.luckuless.code.dependencyInversionPrinciple.after;


/*
 * This class will need NOT modification if a new payment type is added
 */
public class Payment {

    void doPayment(BankCard bankCard, int amount) {
        bankCard.doTransaction(amount);
    }
    
}
