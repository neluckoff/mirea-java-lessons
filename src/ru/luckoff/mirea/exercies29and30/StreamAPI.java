package ru.luckoff.mirea.exercies29and30;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.BufferedReader;

public class StreamAPI {
    public void words() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines().map(line -> line.toLowerCase().replaceAll("\\p{Punct}", " ").split("\\s+"))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream().
                    sorted(Map.Entry.comparingByKey())
                    .sorted(Comparator.comparing((Function<Map.Entry<String, Long>, Long>) Map.Entry::getValue)
                            .reversed())
                    .map(n -> n.getKey()).limit(10)
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}