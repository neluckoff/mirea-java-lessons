package ru.luckoff.mirea.practice_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task 1
        List<Student> idNumber2 = new ArrayList<>();
        Student Student1 = new Student("INBO-02-20", "Tom Holland", 4);
        Student Student2 = new Student("INBO-02-20", "Isaac Anderson", 3);
        Student Student3 = new Student("INBO-02-20", "Hope Johnson", 5);

        idNumber2.add(Student1);
        idNumber2.add(Student2);
        idNumber2.add(Student3);
        Student[] iDNumber = new Student[]{Student1, Student2, Student3};

        System.out.println(Arrays.toString(iDNumber));
        Arrays.sort(iDNumber, new SortingStudentsByGPA());
        invertUsingFor(iDNumber);
        System.out.println(Arrays.toString(iDNumber));
//        System.out.println("Task 1\n" + "None sorting: \n" + idNumber2);
//        Collections.sort(idNumber2);
//        System.out.println("Sorting by Score: \n" + idNumber2);

        //Task 2
        List<Student> ListTaskTwo = new ArrayList<>();
        Student Student4 = new Student("INBO-02-20", "Manuel Barossa", 5);
        Student Student5 = new Student("INBO-02-20", "Slim Shady", 3);
        Student Student6 = new Student("INBO-02-20", "Pablo Escobar", 2);
        Student Student7 = new Student("INBO-02-20", "Miguel Morretti", 5);

        ListTaskTwo.add(Student4);
        ListTaskTwo.add(Student5);
        ListTaskTwo.add(Student6);
        ListTaskTwo.add(Student7);

        Comparator scoreComparator = new SortingStudentsByGPA();

        Collections.sort(ListTaskTwo, scoreComparator);
        System.out.println("Task 2\n" + ListTaskTwo);

        //Task 3
        List<Student> realList = new ArrayList<>();
        realList.addAll(idNumber2);
        realList.addAll(ListTaskTwo);

        Collections.sort(realList, scoreComparator);
        System.out.println("Task 3\n" + realList);
    }

    private static void invertUsingFor(Object[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            Object temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
