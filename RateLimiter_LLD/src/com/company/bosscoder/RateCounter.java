package com.company.bosscoder;

public class RateCounter {

    private int customerId;
    private int currentRate;
    private long firstReqTimestamp;

    public RateCounter(int customerId, long firstReqTimestamp) {
        this.customerId = customerId;
        this.currentRate = 0;
        this.firstReqTimestamp = firstReqTimestamp;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(int currentRate) {
        this.currentRate = currentRate;
    }

    public long getFirstReqTimestamp() {
        return firstReqTimestamp;
    }

    public void setFirstReqTimestamp(long firstReqTimestamp) {
        this.firstReqTimestamp = firstReqTimestamp;
    }
}
