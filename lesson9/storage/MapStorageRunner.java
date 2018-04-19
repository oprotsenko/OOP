package com.oprotsen.JavaOOP.lesson9.storage;

import java.util.Optional;

public class MapStorageRunner {

    public static void main(String[] args) {
        Storage<Product, Long> productStorage = new MapProductStorage<>();

        productStorage.save(new Product(11, "MacBook", "Apple's notebook", 2000));
        productStorage.save(new Product(15, "Lenovo", "Lenovo's notebook", 1500));

        System.out.println(productStorage);
        Optional<Product> product = productStorage.findById(11L);
        if (product.isPresent()) {
            System.out.println(product.get()); // Product{id=11, name='MacBook', description='Apple's notebook', price=2000}
        }
    }
}

