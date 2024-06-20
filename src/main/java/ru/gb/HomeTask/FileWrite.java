package ru.gb.HomeTask;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileWrite {
    public FileWrite(HashMap<Integer, String> result) {
        String fileName = "src/main/resources/result.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Map.Entry<Integer, String> entry : result.entrySet()) {

                writer.write(String.valueOf(entry));
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
