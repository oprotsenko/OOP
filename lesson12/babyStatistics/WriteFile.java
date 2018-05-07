package com.oprotsen.JavaOOP.lesson12.babyStatistics;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class WriteFile {
    private final String inFile;
    private final String outFile;
    private final String delimiter;

    public WriteFile(String inFile, String outFile, String delimiter) {
        this.inFile = inFile;
        this.outFile = outFile;
        this.delimiter = delimiter;
    }

    public void filteredFile() {
        try (BufferedReader readFile = new BufferedReader(new FileReader(inFile));
             BufferedWriter writeFile = new BufferedWriter(new FileWriter(outFile))) {

            Map<Integer, Integer> filteredTab = new TreeMap<>();
            String[] headerLine = readFile.readLine().split(delimiter);
            String cutHeader = headerLine[0] + delimiter + headerLine[3];

            try {
                writeFile.write(cutHeader + "\n");
            } catch (IOException e) {

            }
            String currentLine;
            while ((currentLine = readFile.readLine()) != null) {
                Integer[] cutTab = cutLine(currentLine);
                if (filteredTab.containsKey(cutTab[0])) {
                    filteredTab.replace(cutTab[0], cutTab[1] + filteredTab.get(cutTab[0]));
                } else
                    filteredTab.put(cutTab[0], cutTab[1]);
            }
            writeToFilteredFile(filteredTab, writeFile);
        } catch (IOException e) {

        }
    }

    private Integer[] cutLine(String line) {
        Integer[] intLine = new Integer[2];
        String[] strLine = line.split(delimiter);
        intLine[0] = Integer.parseInt(strLine[0]);
        intLine[1] = Integer.parseInt(strLine[3]);
        return intLine;
    }

    private void writeToFilteredFile(Map<Integer, Integer> filteredTab, BufferedWriter writeFile) {
        filteredTab.forEach((y, q) -> {
                    try {
                        writeFile.write(y + delimiter + q + "\n");
                    } catch (IOException e) {

                    }
                }
        );
        try {
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
