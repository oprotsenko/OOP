package com.oprotsen.JavaOOP.familyBudget.io;

import com.oprotsen.JavaOOP.familyBudget.CategoryMovements;

import java.io.*;

public class BasicBudgetIO {
    private BasicBudgetIO(){}

    public static CategoryMovements readFromTextFile(String name) throws IOException {
        MoneyMovementParser moneyMovementParser = new MoneyMovementParser(",");
        try(ObjectReader<CategoryMovements> reader = new BudgetTextReader(new FileReader(name), moneyMovementParser)) {
            return reader.read();
        }
    }

    public static void writeIntoTextFile(String name, CategoryMovements moves) throws IOException {
        MMStringConverter mmStringConverter = new MMStringConverter();
        try(ObjectWriter<CategoryMovements> writer = new BudgetTextWriter(new FileWriter(name), mmStringConverter)) {
            writer.write(moves);
        }
    }

    public static CategoryMovements readFromBinFile(String name) throws IOException{
        try(ObjectReader<CategoryMovements> reader = new BudgetBinReader(new FileInputStream(name))) {
           return reader.read();
        }
    }

    public static void writeIntoBinFile (String name, CategoryMovements moves) throws IOException{
        try(ObjectWriter<CategoryMovements> writer = new BudgetBinWriter(new FileOutputStream(name))) {
            writer.write(moves);
        }
    }
}
