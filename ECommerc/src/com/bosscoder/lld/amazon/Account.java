package com.bosscoder.lld.amazon;

import java.util.List;

public class Account {

    String userName;
    String password;
    AccountStatus accountStatus;
    Address shippingAddress;
    String email;
    String phone ;

    List<BankTransferDetails> bankTransferDetailsList;
    List<CreditCardDetails> creditCardDetailsList;

    public Address getShippingAddress() {
        return shippingAddress;
    }

    // if this account belongs to seller
    public void addProduct(Product product){
        // add product
    }

    public void resetPassword(String password){

    }
}
