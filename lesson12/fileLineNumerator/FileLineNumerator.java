package com.oprotsen.JavaOOP.lesson12.fileLineNumerator;

import java.io.*;

public class FileLineNumerator implements Serializable{

    private final String inFileName;
    private final String outFileName;

    public FileLineNumerator(String inFileName, String outFileName) {
        this.inFileName = inFileName;
        this.outFileName = outFileName;
    }

    public void runLineNumeration() {
        int n = 1;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFileName));
            while (reader.ready()) {
                writer.write(n + ": " + reader.readLine() + "\n");
                n++;
            }
            reader.close();
            writer.close();
        }catch (IOException e) {

        }
    }
}
