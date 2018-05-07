package com.oprotsen.JavaOOP.familyBudget.io;

import com.oprotsen.JavaOOP.familyBudget.CategoryMovements;
import com.oprotsen.JavaOOP.familyBudget.MoneyMovement;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class BudgetTextWriter implements ObjectWriter<CategoryMovements> {
    private final PrintWriter printWriter;
    private final ToStringConverter<MoneyMovement> strOfMove;

    public BudgetTextWriter(PrintWriter printWriter, ToStringConverter<MoneyMovement> strOfMove) {
        this.printWriter = printWriter;
        this.strOfMove = strOfMove;
    }

    public BudgetTextWriter(Writer writer, ToStringConverter<MoneyMovement> strOfMove) {
        this(new PrintWriter(writer), strOfMove);
    }

    @Override
    public void write(CategoryMovements value) throws IOException {
        for (MoneyMovement elem : value){
            String move = strOfMove.toString(elem);
            printWriter.println(move);
        }
    }

    @Override
    public void close() throws IOException {
        if (printWriter != null)
            printWriter.close();
    }
}
