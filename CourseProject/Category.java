package com.oprotsen.JavaOOP.CourseProject;

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

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", typeOfProducts=" + typeOfProducts +
                '}';
    }
}
