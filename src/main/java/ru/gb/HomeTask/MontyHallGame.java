package ru.gb.HomeTask;
/*
В качестве задачи предлагаю вам реализовать код для демонстрации парадокса Монти Холла (Парадокс Монти Холла — Википедия ) и наглядно убедиться в верности парадокса
(запустить игру в цикле на 1000 и вывести итоговый счет).
Необходимо:
Создать свой Java Maven или Gradle проект;
Подключить зависимость lombok.
Можно подумать о подключении какой-нибудь математической библиотеки для работы со статистикой
Самостоятельно реализовать прикладную задачу;
Сохранить результат в HashMap<шаг теста, результат>
Вывести на экран статистику по победам и поражениям

 */
import java.util.Random;

public class MontyHallGame {
    static Random random = new Random();
    static int userDoor, openDoor, otherDoor;

    public static String game() {
        String result;
        int prizeDoor = random.nextInt(1, 4);
        int goatDoor1 = prizeDoor;
        while (goatDoor1 == prizeDoor) {
            goatDoor1 = random.nextInt(1, 4);
        }
        int goatDoor2 = goatDoor1;
        while (goatDoor2 == goatDoor1 || goatDoor2 == prizeDoor) {
            goatDoor2 = random.nextInt(1, 4);
        }

        userDoor = random.nextInt(1, 4);

        if (userDoor == goatDoor1) {
            openDoor = goatDoor2;
            otherDoor = prizeDoor;
        } else if (userDoor == goatDoor2) {
            openDoor = goatDoor1;
            otherDoor = prizeDoor;
        } else {
            openDoor = goatDoor1;
            otherDoor = goatDoor2;
        }
        userDoor = otherDoor;
        if (userDoor == prizeDoor) {
            return result = "Victory";
        } else return result = "Loss";
    }

}