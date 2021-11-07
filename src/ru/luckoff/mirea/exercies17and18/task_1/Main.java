package ru.luckoff.mirea.exercies17and18.task_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String testStr = "abcdefghijklmnopqrstuv340";
        System.out.println("Является строка в testStr строкой 'abcdefghijklmnopqrstuv18340': "
                + testStr.matches("abcdefghijklmnopqrstuv18340"));

        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher matcher = pattern.matcher(testStr);
        if(matcher.find()) {
            System.out.println("2 Является строка в testStr строкой 'abcdefghijklmnopqrstuv18340': да");
        }else
            System.out.println("2 Является строка в testStr строкой 'abcdefghijklmnopqrstuv18340': нет");
    }
}
