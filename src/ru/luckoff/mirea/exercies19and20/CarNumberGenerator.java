package ru.luckoff.mirea.exercies19and20;

import java.io.*;
import java.util.*;


public class CarNumberGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] letter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        Arrays.sort(letter);

        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet();

        //одинаковые буквы
        int n = 1; // по умолчанию - 999

        for (String a123 : letter) {
            for (int reg = 1; reg <= 199; reg++) {
                for (int j = 1; j <= n; j++) {
                    if (reg < 10) {
                        arrayList.add(String.format("%s%03d%s%s%02d", a123, j, a123, a123, reg));
                        hashSet.add(String.format("%s%03d%s%s%02d", a123, j, a123, a123, reg));
                        treeSet.add(String.format("%s%03d%s%s%02d", a123, j, a123, a123, reg));
                    } else {
                        arrayList.add(String.format("%s%03d%s%s%d", a123, j, a123, a123, reg));
                        hashSet.add(String.format("%s%03d%s%s%d", a123, j, a123, a123, reg));
                        treeSet.add(String.format("%s%03d%s%s%d", a123, j, a123, a123, reg));
                    }
                }
            }
        }

        //одинаковые цифры
        for (int i = 111; i <= 999; i += 111) {
            for (String a1 : letter) {
                for (String a2 : letter) {
                    for (String a3 : letter) {
                        for (int reg = 1; reg <= 199; reg++) {
                            if (reg < 10) {
                                arrayList.add(String.format("%s%03d%s%s%02d", a1, i, a2, a3, reg));
                                hashSet.add(String.format("%s%03d%s%s%02d", a1, i, a2, a3, reg));
                                treeSet.add(String.format("%s%03d%s%s%02d", a1, i, a2, a3, reg));
                            } else {
                                arrayList.add(String.format("%s%03d%s%s%d", a1, i, a2, a3, reg));
                                hashSet.add(String.format("%s%03d%s%s%d", a1, i, a2, a3, reg));
                                treeSet.add(String.format("%s%03d%s%s%d", a1, i, a2, a3, reg));
                            }
                        }
                    }
                }
            }
        }

        System.out.println(arrayList);

        System.out.print("Введите номер для поиска - ");
        String search = in.next();

        //Поиск перебором
        long m = System.nanoTime();
        if (arrayList.contains(search)) {
            System.out.println("Поиск перебором: номер " + search + " найден, поиск занял " +
                    (System.nanoTime() - m) + "нс");
        } else System.out.println("Поиск перебором: номер " + search + " не найден, поиск занял " +
                (System.nanoTime() - m) + "нс");


        //Бинарный поиск
        Collections.sort(arrayList);
        long m1 = System.nanoTime();
        boolean result = arrayList.contains(search);
        if (result) {
            System.out.println("Бинарный поиск: номер " + search + " найден, поиск занял " +
                    (System.nanoTime() - m1) + "нс");
        } else System.out.println("Бинарный поиск: номер " + search + " не найден, поиск занял " +
                (System.nanoTime() - m1) + "нс");


        //Поиск в HashSet
        long m2 = System.nanoTime();
        if (hashSet.contains(search)) {
            System.out.println("Поиск в HashSet: номер " + search + " найден, поиск занял " +
                    (System.nanoTime() - m2) + "нс");
        } else System.out.println("Поиск в HashSet: номер " + search + " не найден, поиск занял " +
                (System.nanoTime() - m2) + "нс");


        //Поиск в TreeSet
        long m3 = System.nanoTime();
        if (treeSet.contains(search)) {
            System.out.println("Поиск в TreeSet: номер " + search + " найден, поиск занял " +
                    (System.nanoTime() - m3) + "нс");
        } else System.out.println("Поиск в TreeSet: номер " + search + " не найден, поиск занял " +
                (System.nanoTime() - m3) + "нс");

    }
}
