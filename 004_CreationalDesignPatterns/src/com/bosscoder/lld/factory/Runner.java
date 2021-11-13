package com.bosscoder.lld.factory;

public class Runner {

    public static void main(String[] args) {
        ICoupon coupon = CouponFactory.getCoupon("Jumbo");
        printCouponData(coupon);

        ICoupon couponParty = CouponFactory.getCoupon("Party");
        printCouponData(couponParty);
    }

    private static void printCouponData(ICoupon coupon){
        System.out.println(coupon.getCode() + " " +coupon.getCouponMsg()+ " "+coupon.getCouponDiscount());
    }
}
