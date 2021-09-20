package ru.luckoff.mirea.practice_7;

import java.util.Stack;

public class Main {
    public static Stack<Integer> arr1;
    public static Stack<Integer> arr2;

    public static void main(String[] args) {
        arr1 = new Stack<>();
        arr2 = new Stack<>();
        int[] a1 = new int[5];
        int[] a2 = new int[5];
//        int[] a11 = new int[]{1, 2, 5, 7, 9};
//        int[] a12 = new int[]{2, 4, 6, 8, 0};

        for (int i = 0; i < 5; i++) {
            a1[i] = ((int) (Math.random() * 9));
            a2[i] = ((int) (Math.random() * 9));
            arr2.add(a1[i]);
            arr1.add(a2[i]);
        }

//        for (int i = 0; i < 5; i++) {
//            arr2.add(a11[i]);
//            arr1.add(a12[i]);
//        }

        System.out.println(arr1);
        System.out.println(arr2);

        int maxSteps = 106;
        int i;
        for (i = 0; !arr1.isEmpty() && !arr2.isEmpty() && i < maxSteps; i++) {

            Integer first = arr1.pop();
            Integer second = arr2.pop();

            if ((first == 0 && second == 9) || first > second && (first != 9 && second != 0)) {
                arr1.add(0, first);
                arr1.add(0, second);
            } else if (first < second || (first == 9 && second == 0)) {
                arr2.add(0, first);
                arr2.add(0, second);
            }
        }

        if(maxSteps == i) {
            System.out.println("botva");
        } else {
            System.out.println(arr1.isEmpty() ? ("second " + i) : ("first " + i));
        }
    }
}
