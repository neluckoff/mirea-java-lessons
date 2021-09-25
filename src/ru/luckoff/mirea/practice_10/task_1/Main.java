package ru.luckoff.mirea.practice_10.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int real;
        int image;

        ConcreteFactory factory = new ConcreteFactory();
        Complex complex = factory.CreateComplex();
        System.out.println(complex.toString());
        System.out.println("\nChoose the <real> and <image>: ");
        real = in.nextInt();
        image = in.nextInt();
        Complex complex2 = factory.CreateComplex(real, image);
        System.out.println(complex2.toString());
    }


}
