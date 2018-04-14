package com.oprotsen.JavaOOP.lesson2.Menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu implements Iterable<Dish> {
    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void getCheapestDish() {
        long lowest = 100000000;
        Dish cheapestDish = null;
        for (Dish price : dishes) {
            if (lowest > price.getPrice()) {
                lowest = price.getPrice();
                cheapestDish = price;
            }
        }
        System.out.println("The cheapest variety: " + cheapestDish);
    }

    public String getName() {
        return name;
    }

    public String toPrint() {
        return name + dishes;
    }

    @Override
    public Iterator<Dish> iterator() {
        return new DishIterator();
    }
    class DishIterator implements Iterator<Dish> {
        private final Iterator<Dish> dishIterator = dishes.iterator();

        @Override
        public boolean hasNext() {
            return dishIterator.hasNext();
        }

        @Override
        public Dish next() {
            return dishIterator.next();
        }
    }
}
