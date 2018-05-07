package com.oprotsen.JavaOOP.familyBudget.io;

import java.io.Closeable;
import java.io.IOException;

public interface ObjectReader<T> extends Closeable {
    T read() throws IOException;
}
