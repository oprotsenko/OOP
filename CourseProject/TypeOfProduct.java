package com.oprotsen.JavaOOP.courseProject;

import java.time.LocalDate;

public class TypeOfProduct {
    private final String name;
    private final Category category;
    private final long cost;
    private final LocalDate date;
    private final CardOrCash type;

    public TypeOfProduct(String name, Category category, long cost, LocalDate date, CardOrCash type) {
        this.name = name;
        this.category = category;
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

    public Category getCategory() {
        return category;
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
