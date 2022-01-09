package com.company.bosscoder;

import java.util.HashMap;
import java.util.Map;

public class RateLimiter implements IRateLimiter{

    // Cache --> customer id, rate and first req time
    Map<Integer, RateCounter> rateCounterMap = new HashMap<>();

    /**
     *  no of requests + 1 <= X && current time - least recent request time for that difference < Y
     * @param customerId
     * @return
     */
    @Override
    public boolean rateLimit(int customerId) {

        long currentTimeMillis = System.currentTimeMillis();
        RateCounter initialRateCounter =  new RateCounter(customerId,currentTimeMillis);
        // only put a new object for that customer if not already there
        rateCounterMap.putIfAbsent(customerId,initialRateCounter);
        //get the ref from the map
        RateCounter rateCounter = rateCounterMap.get(customerId);
        int rate = rateCounter.getCurrentRate() + 1;
        if(rate <= Constants.THRESHOLD &&
        currentTimeMillis - rateCounter.getFirstReqTimestamp() < Constants.TIME_LIMIT){
            rateCounter.setCurrentRate(rate);
            return true;
        }else if(currentTimeMillis - rateCounter.getFirstReqTimestamp() >= Constants.TIME_LIMIT) {
            rate = 1;
            rateCounter.setCurrentRate(rate);
            rateCounter.setFirstReqTimestamp(currentTimeMillis);
            return true;
        }

        return false;
    }
}

// cache -- redis or memcache

// message Queues

// API gateway -> cloud capability

// Elastic search

