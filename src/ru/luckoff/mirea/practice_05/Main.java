package ru.luckoff.mirea.practice_05;

import java.util.Scanner;

public class Main extends Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Input a number: ");
            int num = in.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Number 1");
                    System.out.println(recursion1(5));
                    break;
                case 2:
                    System.out.println("Number 2 \n" + recursion2(5));
                    break;
                case 3:
                    System.out.println("Number 3\n" + recursion3(10, 20));
                    break;
                case 4:
                    System.out.println("Number 4\n" + recursion4(0,0, 10,15));
                    break;
                case 5:
                    System.out.println("Number 5\n" + recursion5(100));
                    break;
                case 6:
                    System.out.println("Number 6\n" + recursion6(20, 5));
                    break;
                case 7:
                    System.out.println("Number 7\n");
                    recursion7(20, 15);
                    break;
                case 8:
                    System.out.println("Number 8\n" + recursion8("hello"));
                    break;
                case 9:
                    System.out.println("Number 9\n" + recursion9(5, 8));
                    break;
                case 10:
                    System.out.println("Number 10\n" + recursion10(10, 5));
                    break;
                case 11:
                    System.out.println("Number 11\n" + recursion11());
                    break;
                case 12:
                    System.out.println("Number 12\n");
                    recursion12();
                    break;
                case 13:
                    System.out.println("Number 13\n");
                    recursion13();
                    break;
                case 14:
                    System.out.println("Number 14\n" + recursion14(13));
                    break;
                case 15:
                    System.out.println("Number 15\n" + recursion15(13));
                    break;
                case 16:
                    System.out.println("Number 16\n");
                    recursion16(13, 20);
                    break;
                case 17:
                    System.out.println("Number 17\n" + recursion17());
                    break;

            }
        }
    }
}
