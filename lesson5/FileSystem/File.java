package com.oprotsen.JavaOOP.lesson5.FileSystem;

public class File extends FileForExtending{
    private final int kb;

    public File(String name, int kb) {
        super(name);
        this.kb = kb;
    }

    public int getKb() {
        return kb;
    }

    @Override
    public String toString() {
        return "File{" + getName() +
                "kb=" + kb;
    }
}
