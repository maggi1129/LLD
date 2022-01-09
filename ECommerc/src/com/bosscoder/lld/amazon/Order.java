package com.bosscoder.lld.amazon;

import java.util.Date;
import java.util.List;

public class Order implements  NotificationType{
    private String orderNumber;
    OrderStatus status;
    Date orderDate;

    List<OrderHistory> orderHistoryList;

    // Apis for order history

    public List<OrderHistory> getOrderHistory(String orderNumber){

        return null;
    }

    public void sendOrderForShipment(String orderNumber){

    }

    public void cancelOrder(String orderNumber){

    }

    public void makePaymentForOrder(String orderNumber){

    }

}


// order --