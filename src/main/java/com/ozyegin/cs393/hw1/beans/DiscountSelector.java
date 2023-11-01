package com.ozyegin.cs393.hw1.beans;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DiscountSelector implements DailyDiscountSelector {
    @Override
    public int getDailyDiscountRate() {
        int[] discountRates = {15, 20, 25, 30};
        int rnd = new Random().nextInt(discountRates.length);
        return discountRates[rnd];
    }
}
