package com.oprotsen.JavaOOP.lesson12.fileLineNumerator;

public class FileLineNumeratorRunner {
    public static void main(String[] args) {
        String inFileName = "C:\\Users\\Elena\\JavaProjects\\src\\com\\oprotsen\\JavaOOP\\lesson12\\fileLineNumerator\\hamlet.txt";
        String outFileName = "C:\\Users\\Elena\\JavaProjects\\src\\com\\oprotsen\\JavaOOP\\lesson12\\fileLineNumerator\\hamlet-with-line-nums.txt";
        new FileLineNumerator(inFileName, outFileName).runLineNumeration();
    }
}
