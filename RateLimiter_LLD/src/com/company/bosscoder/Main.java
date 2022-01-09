package com.company.bosscoder;

public class Main {

    public static void main(String[] args) {
	// write your code here

        IRateLimiter rateLimiter = new RateLimiter();
        for(int i=0 ; i<Constants.THRESHOLD + 2 ; i++){
            System.out.println(rateLimiter.rateLimit(1234));
        }

    }
}

/**
 * // Perform rate limiting logic for provided customer ID.
 *
 *Return true if the
 * // request is allowed, and false if it is not.
 * boolean rateLimit(int customerId)
 *
 * Rate Limiter before hitting any API, the API will be hit if this rate limiter allows
 * Multi tenant --> different customerId --> lets have a constant thresholds for
 * X requests & Y seconds --> compile time
 *
 * Interface --> rateLimiter(customerId) ---> Service implementing interface -->
 * delta time = current time
 *
 * 100 req in 2 secs
 * 1  -> 1st sec
 * 99th -> 1st sec
 * 100 -> 1.2 sec
 *
 * 1.3 - 1.2 = 0.1 <2
 * X --> 100
 * Y --> 2 secs
 *
 * 100 req in 1st sec
 * -->
 * |     |      |    | |
 * 0     1      2    3 4
 *
 *   2nd sec --> 50 req
 *   2.05 sec --> 99th req
 *   3rd sec -> 100th req --> check on time
 *   has Y time already elapsed ??
 *   most recent req -> 2.05
 *   where it actually started --> 1st req time
 *   curr req time - first req time < Y --> time is not yet elapsed
 *   3.01 sec -> 101th req
 *
 * wait time = (curr time + Y) - last req time (when the req exceeded)
 *
 * no of requests already serviced + 1 <= X && current time - least recent request time for that difference < Y
 *
 * token algo
 * leaky bucket
 *
 * window algo
 *
 */