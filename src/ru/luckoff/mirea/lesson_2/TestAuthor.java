package ru.luckoff.mirea.lesson_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Miguel Morretti", "miguel4562@icloud.com", 'M');
        Author author2 = new Author("Vanessa Anderson", "vanessa.and@gmail.com", 'F');
        System.out.println(author1);
        System.out.println(author2);

        author1.setEmail("miguel.morretti@gmail.com");
        System.out.println("\n" + author1);

    }
}
