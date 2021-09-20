package ru.luckoff.mirea.practice_7;

import java.util.ArrayList;

public class NoneMain {
    public static void main(String[] args) {
        int[] a1;
        int[] a2;
        a1 = new int[5];
        a2 = new int[5];

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            a1[i] = ((int) (Math.random() * 9));
            a2[i] = ((int) (Math.random() * 9));
            arr1.add(a1[i]);
            arr2.add(a2[i]);
        }

        System.out.println(arr1);
        System.out.println(arr2);

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if (arr1.get(0) > arr2.get(0) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                arr1.add(arr1.get(0));
                arr1.add(arr2.get(0));
            } else if (arr1.get(0) < arr2.get(0) || ((arr1.get(0) == 9) && (arr2.get(0) == 0))) {
                arr2.add(arr2.get(0));
                arr2.add(arr1.get(0));
            }
            arr1.remove(0);
            arr2.remove(0);

            if (arr1.size() == 0) {
                System.out.println("second " + count);
                res = true;
                break;
            } else if (arr2.size() == 0) {
                System.out.println("first " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("botva");
    }
}
