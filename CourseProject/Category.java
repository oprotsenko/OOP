package com.oprotsen.JavaOOP.courseProject;

import java.util.ArrayList;

public class Category {
    private final String name;
    private final ArrayList<TypeOfProduct> typeOfProducts = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void addType(TypeOfProduct type) {
        typeOfProducts.add(type);
    }

    public long getCost() {
        long cost = 0;
        for (TypeOfProduct elem: typeOfProducts) {
            cost += elem.getCost();
        }
        return cost;
    }

    public String getName() {
        return name;
    }

    public ArrayList<TypeOfProduct> getTypeOfProducts() {
        return typeOfProducts;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", typeOfProducts=" + typeOfProducts +
                '}';
    }
}
