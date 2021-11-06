package ru.luckoff.mirea.exercies19and20;

import java.io.*;
import java.util.*;


public class CarNumberGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] letter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        Arrays.sort(letter);
        HashSet<String> arrNumber = new HashSet<>();

        int n = 1;
        //одинаковые буквы
        for (String a123 : letter) {
            for (int reg = 1; reg <= 199; reg++) {
                for (int j = 1; j <= n; j++) {
                    arrNumber.add(String.format("%s%03d%s%s%d", a123, j, a123, a123, reg));
                }
            }
        }

        //одинаковые цифры
        for (int i = 111; i <= 999; i += 111) {
            for (String a1 : letter) {
                for (String a2 : letter) {
                    for (String a3 : letter) {
                        for (int reg = 1; reg <= 199; reg++) {
                            arrNumber.add(String.format("%s%03d%s%s%d", a1, i, a2, a3, reg));
                        }
                    }
                }
            }
        }


        ArrayList<String> arrNum = new ArrayList<>(arrNumber);
        System.out.println(arrNum);

        System.out.print("Введите номер для поиска прямым перебором по ArrayList, (array.contains()) - ");
        String search = in.next();
        long m = System.currentTimeMillis();
        if (arrNum.contains(search) == true) {
            System.out.println("Поиск перебором: номер " + search + " найден, поиск занял " +
                    (double) (System.currentTimeMillis() - m) + "нс");
        } else System.out.println("Поиск перебором: номер " + search + " не найден, поиск занял " +
                (double) (System.currentTimeMillis() - m) + "нс");

        System.out.print("Введите номер для поиска бинарным поиском по сортированному ArrayList, (Collections.binarySearch()) - ");
        search = in.next();
        System.out.println(Collections.binarySearch(arrNum, search, Collections.reverseOrder()));

    }
}
