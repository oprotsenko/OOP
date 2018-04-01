package com.oprotsen.JavaOOP.courseProject.countMoney;

import com.oprotsen.JavaOOP.courseProject.Category;
import com.oprotsen.JavaOOP.courseProject.TypeOfProduct;
import com.oprotsen.JavaOOP.courseProject.User;

public class PrintConsumptions implements Printer {
    private final User user;
    private Category category;

    public PrintConsumptions(User user) {
        this.user = user;
    }

    public void printCalendar() {
        for (TypeOfProduct elem : user.getConsumptions()) {
            System.out.print(elem.getDate() + ": ");
            System.out.println(elem.getCost() + " UAH");
        }
    }

    public void printByCategory() {
        String category;
        long cost;
        int i = 0;
        for (TypeOfProduct elem : user.getConsumptions()) {
            if (i == getCategoryName().length)
                break;
            if (elem.getCategory().getName().equals(getCategoryName()[i]) && i < getCategoryName().length) {
                category = elem.getCategory().getName();
                cost = elem.getCategory().getCost();
                System.out.print(category + ": ");
                System.out.println(cost + " UAH");
                i++;
            }
        }
    }

    public String[] getCategoryName() {
        String[] categoryNames = new String[user.getConsumptions().size()];
        int i = 0;
        for (TypeOfProduct elem : user.getConsumptions()) {
            String names = elem.getCategory().getName();
            categoryNames[i] = names;
            i++;
        }
        int count = 0;
        for (int j = 1; j < categoryNames.length; j++) {
            if (!categoryNames[j - 1].equals(categoryNames[j]))
                count++;
        }
        String[] filteredNames = new String[count];
        String name = categoryNames[0];
        for (int j = 0, k = 0; j < categoryNames.length; j++) {
            filteredNames[k] = name;
            if (name.equals(categoryNames[j]))
                j++;
            else {
                name = categoryNames[j];
                k++;
            }
        }
        return filteredNames;
    }
}
