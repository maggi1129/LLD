package com.bosscoder.lld.factory;

public class CouponFactory {

    public static ICoupon getCoupon(String type){

        if("Jumbo".equals(type)){
            return new JumboCoupon();
        }
        else if("Party".equals(type)){
            return new PartyCoupon();
        }

        return null;
    }
}
