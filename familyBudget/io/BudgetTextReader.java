package com.oprotsen.JavaOOP.familyBudget.io;

import com.oprotsen.JavaOOP.familyBudget.CategoryMovements;
import com.oprotsen.JavaOOP.familyBudget.MoneyMovement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class BudgetTextReader implements ObjectReader<CategoryMovements>{
    private final BufferedReader reader;
    private final Parser<CategoryMovements> MmParser;

//    public BudgetTextReader(BufferedReader reader, Parser<MoneyMovement> MmParser) {
//        this.reader = reader;
//        this.MmParser = MmParser;
//    }
//
//    public BudgetTextReader(Reader reader, Parser<MoneyMovement> MmParser) {
//        this(new BufferedReader(reader), MmParser);
//    }
//
//    @Override
//    public CategoryMovements read() throws  IOException{
//        CategoryMovements category = new CategoryMovements("Readed");
//
//        String line;
//        while ((line = reader.readLine()) != null){
//            MoneyMovement move = MmParser.parse(line);
//            category.addCategory(move);
//        }
//        return category;
//    }
//
//    @Override
//    public void close() throws IOException {
//        if (reader != null)
//            reader.close();
//    }

    public BudgetTextReader(BufferedReader reader, Parser<CategoryMovements> MmParser) {
        this.reader = reader;
        this.MmParser = MmParser;
    }

    public BudgetTextReader(Reader reader, Parser<CategoryMovements> MmParser) {
        this(new BufferedReader(reader), MmParser);
    }

    @Override
    public CategoryMovements read() throws  IOException{
        CategoryMovements category = null;

        String line;
        while ((line = reader.readLine()) != null){
           category = MmParser.parse(line);
        }
        return category;
    }

    @Override
    public void close() throws IOException {
        if (reader != null)
            reader.close();
    }
}
