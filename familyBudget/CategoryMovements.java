package com.oprotsen.JavaOOP.familyBudget;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CategoryMovements implements Iterable<MoneyMovement> {
    private final String name;
    private final List<MoneyMovement> movements = new ArrayList<>();

    public CategoryMovements(String name) {
        this.name = name;
    }

    public void addCategory(MoneyMovement movements) {
        this.movements.add(movements);
    }

    public MoneyMovement getMove(int moves) {
        for (MoneyMovement move : movements) {
            if (movements.size() == 1)
                return move;
            moves--;
            if (moves == 0)
                return move;
        }
        return null;
    }

    public MoneyMovement getCategory(int moves) {
        for (MoneyMovement move : movements) {
            if (movements.size() == 1)
                return move;
            if (moves == 0)
                return move;
            moves--;
        }
        return null;
    }

    public void sort(Comparator<MoneyMovement> comparator) {
        for (int i = 0; i < movements.size(); i++) {
            movements.sort(comparator);
        }
    }

    public CategoryMovements filter(Predicate<MoneyMovement> predicate) {
        CategoryMovements filteredElem = new CategoryMovements("Filtered");
        for (MoneyMovement elem : movements) {
            if (predicate.test(elem))
                filteredElem.addCategory(elem);
        }
        return filteredElem;
    }

    public List<MoneyMovement> getMovements() {
        return movements;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<MoneyMovement> iterator() {
        return movements.iterator();
    }

    @Override
    public String toString() {
        return "CategoryMovements{" +
                "name='" + name + '\'' +
                ", movements=" + movements +
                '}';
    }
}
