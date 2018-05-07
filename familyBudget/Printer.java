package com.oprotsen.JavaOOP.familyBudget;

public interface Printer {
    void calendarViewEarnings();
    void calendarViewConsumptions();
    void categoryViewEarnings();
    void categoryViewConsumption();
    void cardView();
    void calendarViewEarnings(User user);
    void calendarViewConsumptions(User user);
    void categoryViewEarnings(User user);
    void categoryViewConsumption(User user);
    void cardView(User user);
}
