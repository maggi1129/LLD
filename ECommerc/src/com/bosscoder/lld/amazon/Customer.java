package com.bosscoder.lld.amazon;

public abstract class Customer {

    private ShoppingCart cart;
    private Order order;

    public ShoppingCart getCart() {
        return cart;
    }
    public boolean addItemToCart(Item i){
        // addition of item
        return true;
    }
    public boolean removeItemFromCart(Item i){
        // remove item
       return true;
    }

    // do some searching
}

class Guest extends Customer{
    public void registerAccount(){

    }
}

class Member extends Customer{
    private Account account;
    private OrderStatus placeOrder(Order order){

        return OrderStatus.READY_TO_SHIP;
    }
}