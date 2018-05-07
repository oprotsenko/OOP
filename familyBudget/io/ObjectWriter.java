package com.oprotsen.JavaOOP.familyBudget.io;

import java.io.Closeable;
import java.io.IOException;

public interface ObjectWriter<T> extends Closeable {
    void write(T value) throws IOException;
}
