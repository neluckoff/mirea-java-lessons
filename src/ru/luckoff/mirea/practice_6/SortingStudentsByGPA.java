package ru.luckoff.mirea.practice_6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAverageScore() - o1.getAverageScore();
    }
}
