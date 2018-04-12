package com.oprotsen.JavaOOP.lesson5.FileSystem;

public class Symlink implements FileInterface{
    private String name;
    private FileInterface file;

    public Symlink(String name, FileInterface file) {
        this.name = name;
        this.file = file;
    }

    public String getName() {
        return name + " -> " + file.getName();
    }

    public int getKb() {
        return 1;
    }

    @Override
    public String toString() {
        return "Symlink{" +
                "name='" + name + '\'' +
                ", file=" + file +
                '}';
    }
}
