package com.oprotsen.JavaOOP.familyBudget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CategoryMovements implements Iterable<MoneyMovement> {
    private final String name;
    private List<MoneyMovement> categories = new ArrayList<>();

    public CategoryMovements(String name) {
        this.name = name;
    }

    public void addCategory(MoneyMovement movements) {
        categories.add(movements);
    }

    public MoneyMovement getMove(int moves) {
        for (MoneyMovement move : categories) {
            if (categories.size() == 1)
                return move;
            moves--;
            if (moves == 0)
            return move;
        }
        return null;
    }

    public MoneyMovement getCategory(int moves){
        for (MoneyMovement move : categories){
            if (categories.size() == 1)
                return move;
         if (moves == 0)
             return move;
            moves--;
        }
        return null;
    }

    public List<MoneyMovement> getCategories() {
        return categories;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<MoneyMovement> iterator() {
        return categories.iterator();
    }
}
