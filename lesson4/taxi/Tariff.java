package com.oprotsen.JavaOOP.lesson4.taxi;

import com.oprotsen.JavaOOP.lesson4.taxi.Ride;

public interface Tariff {
    long calculatePrice(Ride ride);
}
