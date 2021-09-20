package ru.luckoff.mirea.practice_8;

public class Main {
    public static void main(String[] args) {
        WaitList<Integer> list1 = new WaitList<>();
        System.out.println("add");
        for (int i = 0; i <= 5; i++) {
            list1.add(i);
        }
        System.out.println(list1);

        System.out.println("\nisEmpty");
        System.out.println(list1.isEmpty());


    }
}
