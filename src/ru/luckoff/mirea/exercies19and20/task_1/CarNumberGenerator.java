package ru.luckoff.mirea.exercies19and20.task_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CarNumberGenerator {
    public static void main(String[] args) {
        String[] bukvy = {"С", "М", "Т", "В", "А", "Р", "О", "Н", "Е", "У", "Х", "К"};
        Arrays.sort(bukvy);

        System.out.print("Введите регион (1..199): ");
        Scanner in = new Scanner(System.in);

        int region = in.nextInt();

        // одинаковые цифры и буквы без 00х
        String[] letter = {"A","B","E","K","M","H","O","P","C","T","Y","X"};
        Arrays.sort(letter);
        HashSet<String> arrNumber = new HashSet<>();
        //одинаковые буквы
        for(String a123: letter) {
            for(int reg = 1; reg <= 199; reg++) {
                for(int j = 1; j <= 999; j++) {
                    arrNumber.add(String.format("%s%03d%s%s%d",a123,j,a123,a123,reg));
                }
            }
        }
        //одинаковые цифры
        for(int i = 111; i <= 999; i += 111) {
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

        in.close();
    }
}
