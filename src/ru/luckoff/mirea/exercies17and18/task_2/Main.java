package ru.luckoff.mirea.exercies17and18.task_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String testStr = "aE:dC:cA:56:76:54";

        Pattern pattern = Pattern.compile("^([a-zA-Z1-9]{2}[:]){5}([a-zA-Z1-9]{2})$");
        Matcher matcher = pattern.matcher(testStr);
        if (matcher.find()) {
            System.out.println("Является ли МАК адресом: Да");
        } else
            System.out.println("Является ли МАК адресом: Нет");
    }
}
