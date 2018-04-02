package com.oprotsen.JavaOOP.familyBudget;

import java.util.ArrayList;
import java.util.List;

public class CategoryOfMovements {
    private List<MoneyMovements> categories = new ArrayList<>();

    public void addCategory(MoneyMovements movements) {
        categories.add(movements);
    }

    public MoneyMovements getMove() {
        for (MoneyMovements move : categories)
        return move;
        return null;
    }
}
