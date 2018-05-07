package com.oprotsen.JavaOOP.lesson12.babyStatistics;

import java.io.*;

public class BabyStatistics {
    public static void main(String[] args) {
        new WriteFile("C:\\Users\\Elena\\JavaProjects\\src\\com\\oprotsen\\JavaOOP\\lesson12\\babyStatistics\\births.csv",
                "C:\\Users\\Elena\\JavaProjects\\src\\com\\oprotsen\\JavaOOP\\lesson12\\babyStatistics\\births_y_b.csv",
                ",").filteredFile();
    }
}
