package ru.gb.HomeTask;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        HashMap<Integer, String> result = new HashMap<>();
        for (int i = 1; i <= 1000; i++) {
            result.put(i, MontyHallGame.game());
        }
        int win = 0;
        for (String value : result.values()) {
            if (value.equals("Victory")) {
                win++;
            }
        }
        new FileWrite(result);

        for (Map.Entry<Integer, String> entry : result.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("Количество побед: " + win + " раз из 1000 попыток.");
    }
}
