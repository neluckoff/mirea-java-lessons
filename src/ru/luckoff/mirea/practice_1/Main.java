package ru.luckoff.mirea.practice_1;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball("basketball");
        Ball ball3 = new Ball("football", 500);
        ball3.setCost(800);

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);

        Book book1 = new Book();
        Book book2 = new Book("Gogol");
        Book book3 = new Book("Pushkin", 1000);
        Book book4 = new Book("Tolstoy", 1200, "Voyna & Mir");
        book3.setCost(900);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
    }
}
