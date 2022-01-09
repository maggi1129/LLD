package com.bosscoder;

import java.util.Date;

public abstract class Payment {
    String transactionId;
    double amount;
}

class WalletPayment extends Payment{
    String walletType;
}

class CreditCardPayment extends  Payment{
    long cardNumber;
    int cvv;
    Date expiry;
    String name;
}