package com.oprotsen.JavaOOP.lesson5.FileSystem;

public abstract class FileForExtending implements FileInterface {

    private final String name;

    public FileForExtending(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
