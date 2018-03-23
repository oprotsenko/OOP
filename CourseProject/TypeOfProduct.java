package com.oprotsen.JavaOOP.CourseProject;

import java.time.LocalDate;

public class TypeOfProduct {
    private final String name;
    private final long cost;
    private final LocalDate date;
    private final CardOrCash type;

    public TypeOfProduct(String name, long cost, LocalDate date, CardOrCash type) {
        this.name = name;
        this.cost = cost;
        this.date = date;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public long getCost() {
        return cost;
    }

    public LocalDate getDate() {
        return date;
    }

    public CardOrCash getType() {
        return type;
    }

    @Override
    public String toString() {
        return "TypeOfProduct{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", date=" + date +
                '}';
    }
}
