package com.company.bosscoder;

public interface IRateLimiter {
    boolean rateLimit(int customerId);
}
