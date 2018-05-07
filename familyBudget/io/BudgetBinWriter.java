package com.oprotsen.JavaOOP.familyBudget.io;

import com.oprotsen.JavaOOP.familyBudget.CategoryMovements;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class BudgetBinWriter implements ObjectWriter<CategoryMovements> {
    private final ObjectOutput obOutput;

    public BudgetBinWriter(ObjectOutput obOutput) {
        this.obOutput = obOutput;
    }

    public BudgetBinWriter(OutputStream stOutput) throws IOException {
        this((ObjectOutput) new ObjectOutputStream(stOutput));
    }

    @Override
    public void write(CategoryMovements value) throws IOException {
        obOutput.writeObject(value);
    }

    @Override
    public void close() throws IOException {
        if (obOutput != null)
            obOutput.close();
    }
}
