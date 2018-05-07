package com.oprotsen.JavaOOP.lesson12.cloner;

import java.io.*;

public class Cloner implements Serializable{
    /**
     * @throws CloningException
     */

    public static <T> T clone(T value) {
        T clonedObject;
        try {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            ObjectOutputStream obOutput = new ObjectOutputStream(output);
            obOutput.writeObject(value);
            byte[] outByte = output.toByteArray();

            ByteArrayInputStream input = new ByteArrayInputStream(outByte);
            ObjectInputStream obInput = new ObjectInputStream(input);
            clonedObject = (T)obInput.readObject();
            output.close();
            obOutput.close();
            System.out.println("Cloning is done!");
        }catch (IOException | ClassNotFoundException e){
            throw new CloningException("Cloning is failed!");
        }
        return clonedObject;
    }

}
