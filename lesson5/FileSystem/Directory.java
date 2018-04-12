package com.oprotsen.JavaOOP.lesson5.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileForExtending{

    private List<FileForExtending> directory = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addDocument(FileForExtending file) {
        directory.add(file);
    }

    public int getKb() {
        int kb = 0;
        for (FileForExtending elem: directory) {
            kb += elem.getKb();
        }
        return kb;
    }

    @Override
    public String toString() {
        return "Directory{" + "directory=" + directory + '}';
    }
}
