package com.oprotsen.JavaOOP.familyBudget.io;

import com.oprotsen.JavaOOP.familyBudget.CategoryMovements;

import java.io.IOException;

public class IOBudgetRunner {

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Elena\\JavaProjects\\src\\com\\oprotsen\\JavaOOP\\familyBudget\\io\\budgetIN.csv";
        String outputFile = "C:\\Users\\Elena\\JavaProjects\\src\\com\\oprotsen\\JavaOOP\\familyBudget\\io\\budgetOUT.dat";

        CategoryMovements category = readFromFile(inputFile);
        System.out.println(category);

        writeToFile(outputFile, category);
    }

    private static void writeToFile(String outputFile, CategoryMovements category) {
        try {
            BasicBudgetIO.writeIntoBinFile(outputFile,category);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static CategoryMovements readFromFile(String inputFile) {
        try {
            return BasicBudgetIO.readFromTextFile(inputFile);
        } catch (IOException e){
            e.getMessage();
            System.exit(0);
            return null;
        }
    }
}
