package com.luckuless.code.dependencyInversionPrinciple.before;


/*
 * This class will need modification if a new a payment type is added
 */
public class Payment {

    void doPayment(DebitCard debitCard, int amount) {
        debitCard.doTransaction(amount);
    }

    void doPayment(CreditCard creditCard, int amount) {
        creditCard.doTransaction(amount);
    }
    
}
