package com.oprotsen.JavaOOP.lesson9.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapProductStorage <T extends Entity<ID>, ID> implements Storage<T, ID> {

    private final Map<ID, T> productStorage = new HashMap();

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(productStorage.get(id));
    }

    @Override
    public void save(T entity) {
        productStorage.put(entity.getId(), entity);
    }

    @Override
    public void deleteById(ID id) {
        productStorage.remove(id);
    }

    @Override
    public String toString() {
        return "MapProductStorage{" +
                "productStorage=" + productStorage +
                '}';
    }
}
