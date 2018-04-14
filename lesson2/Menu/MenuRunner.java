package com.oprotsen.JavaOOP.lesson2.Menu;

public class MenuRunner {

    public static void main(String[] args) {
        Menu menuMeal = new Menu("Meal");
        Dish pasta = new Dish(
                "Pasta",
                "is an Italian dish made with egg, hard cheese and pepper.",
                260);
        menuMeal.addDish(pasta);
        Dish soup = new Dish(
                "Vegetable soup",
                "soup prepared using vegetables and leaf vegetables.",
                100);
        menuMeal.addDish(soup);
        Dish steak = new Dish(
                "Beef-steak",
                "juice medium fried beef-steak.",
                300);
        menuMeal.addDish(steak);

        for (Dish dish : menuMeal) {
            System.out.println(dish);
        }


//        System.out.println(menuMeal.toPrint());
//        menuMeal.getCheapestDish();
//        System.out.println();

        Menu menuDrinks = new Menu("Drinks");
        Dish redWine = new Dish(
                "Cianty",
                "red wine with fruit flavor.",
                99);
        menuDrinks.addDish(redWine);
        Dish whiteWine = new Dish(
                "Chardonney",
                "white wine with flower flavor.",
                89);
        menuDrinks.addDish(whiteWine);
        Dish whiskey = new Dish(
                "Deanston",
                "single malt whiskey, 10 years old.",
                149);
        menuDrinks.addDish(whiskey);

//        System.out.println(menuDrinks.toPrint());
//        menuDrinks.getCheapestDish();
//        System.out.println();
    }
}
