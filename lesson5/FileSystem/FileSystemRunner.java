package com.oprotsen.JavaOOP.lesson5.FileSystem;

public class FileSystemRunner {
    public static void main(String[] args) {
        File file = new File("hello.txt", 10);
        Symlink symlink = new Symlink("my-doc.txt", file);
        Directory library = new Directory("Library");
        System.out.println(symlink.getName());
    }
}

