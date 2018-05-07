package com.oprotsen.JavaOOP.familyBudget.io;

import com.oprotsen.JavaOOP.familyBudget.CategoryMovements;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class BudgetBinReader implements ObjectReader<CategoryMovements> {
    private final ObjectInput obInput;

    public BudgetBinReader(ObjectInput obInput) {
        this.obInput = obInput;
    }

    public BudgetBinReader(InputStream stInput) throws IOException{
        this((ObjectInput)new ObjectInputStream(stInput));
    }

    @Override
    public CategoryMovements read() throws IOException {
        try{
            return (CategoryMovements) obInput.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("...........");
        }
    }

    @Override
    public void close() throws IOException {
        if (obInput != null)
            obInput.close();
    }
}
